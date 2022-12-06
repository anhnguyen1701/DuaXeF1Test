/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import static dao.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ChangDua;
import model.DangKiThiDau;
import model.DiaDiem;
import model.DoiDua;
import model.MuaGiai;
import model.TayDua;

/**
 *
 * @author anhnguyen
 */
public class DangKiThiDauDAO extends DAO {

    public DangKiThiDauDAO() {
        super();
    }

    public ArrayList<DangKiThiDau> getDSDangKiThiDauByChangDua(int changDuaId) {
        boolean check = true; // true = co diem, false = ko co diem
        ArrayList<DangKiThiDau> dsDk = new ArrayList<>();

        //get thong tin dktd
        String sql
                = "SELECT tbldangkithidau.id, \n"
                + "tblChangDuaid, tblChangDua.ten, tblChangDua.sovongdua, tblChangDua.thoigianbatdau, tblChangDua.mota,\n"
                + "tblDiaDiemid, tbldiadiem.ten,\n"
                + "tblMuaGiaiid, tblmuagiai.ten,\n"
                + "tblTayDuaid, tbltaydua.ten, tbltaydua.ngaysinh, tbltaydua.tieusu, tbltaydua.quoctich, \n"
                + "tblDoiDuaid, tbldoidua.ten,  \n"
                + "tbldangkithidau.sovongduahoanthanh,\n"
                + "tbldangkithidau.thoigianvedich\n"
                + "FROM tbldangkithidau\n"
                + "JOIN tbltaydua ON tbltaydua.id = tbldangkithidau.tblTayduaid \n"
                + "JOIN tblchangdua ON tblchangdua.id = tbldangkithidau.tblChangDuaid\n"
                + "JOIN tbldoidua ON tbldoidua.id = tblDoiDuaid\n"
                + "JOIN tbldiadiem ON tbldiadiem.id = tblDiaDiemid\n"
                + "JOIN tblmuagiai ON tblmuagiai.id = tblMuaGiaiid\n"
                + "WHERE tblChangDuaid = ?";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, changDuaId + "");

            ResultSet result = stm.executeQuery();
            while (result.next()) {
                DangKiThiDau dktd = new DangKiThiDau();
                dktd.setId(result.getInt(1));

                ChangDua cd = new ChangDua();
                cd.setId(result.getInt(2));
                cd.setTen(result.getString(3));
                cd.setSovongdua(result.getInt(4));
                cd.setThoigianbatdau(result.getString(5));
                cd.setMota(result.getString(6));
                DiaDiem dd = new DiaDiem();
                dd.setId(result.getInt(7));
                dd.setTen(result.getString(8));
                MuaGiai mg = new MuaGiai();
                mg.setId(result.getInt(9));
                mg.setTen(result.getString(10));
                cd.setDiaDiem(dd);
                cd.setMuaGiai(mg);

                TayDua td = new TayDua();
                td.setId(result.getInt(11));
                td.setTen(result.getString(12));
                td.setNgaysinh(result.getDate(13));
                td.setTieusu(result.getString(14));
                td.setQuoctich(result.getString(15));
                DoiDua dd1 = new DoiDua();
                dd1.setId(result.getInt(16));
                dd1.setTen(result.getString(17));
                td.setDoiDua(dd1);
                dktd.setChangDua(cd);
                dktd.setTayDua(td);

                dktd.setSovongduahoanthanh(result.getInt(18));
                dktd.setThoigianvedich(result.getString(19));

                if (dktd.getThoigianvedich() == null) {
                    check = false;
                }

                dsDk.add(dktd);
            }

            //set diem
            if (check) {
                Collections.sort(dsDk, new Comparator<DangKiThiDau>() {
                    @Override
                    public int compare(DangKiThiDau o1, DangKiThiDau o2) {
                        String tgvd1 = o1.getThoigianvedich();
                        String tgvd2 = o2.getThoigianvedich();
                        if (tgvd1.equalsIgnoreCase("DNF")) {
                            return 1;
                        }
                        if (tgvd2.equalsIgnoreCase("DNF")) {
                            return -1;
                        }

                        //hh:mm:ss
                        //01234567
                        String hh1 = "" + tgvd1.charAt(0) + tgvd1.charAt(1);
                        String mm1 = "" + tgvd1.charAt(3) + tgvd1.charAt(4);
                        String ss1 = "" + tgvd1.charAt(6) + tgvd1.charAt(7);
                        int diem1 = Integer.parseInt(hh1) * 60 * 60 + Integer.parseInt(mm1) * 60 + Integer.parseInt(ss1);

                        String hh2 = "" + tgvd2.charAt(0) + tgvd2.charAt(1);
                        String mm2 = "" + tgvd2.charAt(3) + tgvd2.charAt(4);
                        String ss2 = "" + tgvd2.charAt(6) + tgvd2.charAt(7);
                        int diem2 = Integer.parseInt(hh2) * 60 * 60 + Integer.parseInt(mm2) * 60 + Integer.parseInt(ss2);

                        return diem1 - diem2;
                    }
                });

                for (int i = 0; i < dsDk.size(); i++) {
                    if (i + 1 <= 10 && !dsDk.get(i).getThoigianvedich().equalsIgnoreCase("DNF")) {
                        if (i + 1 == 1) {
                            dsDk.get(i).setDiem(25);
                        } else if (i + 1 == 2) {
                            dsDk.get(i).setDiem(18);
                        } else if (i + 1 == 3) {
                            dsDk.get(i).setDiem(15);
                        } else if (i + 1 == 4) {
                            dsDk.get(i).setDiem(12);
                        } else if (i + 1 == 5) {
                            dsDk.get(i).setDiem(10);
                        } else if (i + 1 == 6) {
                            dsDk.get(i).setDiem(8);
                        } else if (i + 1 == 7) {
                            dsDk.get(i).setDiem(6);
                        } else if (i + 1 == 8) {
                            dsDk.get(i).setDiem(4);
                        } else if (i + 1 == 9) {
                            dsDk.get(i).setDiem(2);
                        } else if (i + 1 == 10) {
                            dsDk.get(i).setDiem(1);
                        }
                    } else {
                        dsDk.get(i).setDiem(0);
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DangKiThiDauDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (Exception ex) {
            Logger.getLogger(DangKiThiDauDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dsDk;
    }

    public boolean luuKetQuaThiDau(ArrayList<DangKiThiDau> listDKTD) {
        if (listDKTD == null || listDKTD.size() == 0) {
            return false;
        }

        boolean check = false;

        String sql = "UPDATE `tbldangkithidau` SET sovongduahoanthanh = ?, thoigianvedich = ? \n"
                + "WHERE id = ?";

        try {
//            con.setAutoCommit(false);

            for (DangKiThiDau dktd : listDKTD) {
                PreparedStatement stm = con.prepareStatement(sql);
                stm.setInt(1, dktd.getSovongduahoanthanh());
                stm.setString(2, dktd.getThoigianvedich());
                stm.setInt(3, dktd.getId());

                if (stm.executeUpdate() <= 0) {
                    return false;
                }

//                con.commit();

                check = true;
            }
        } catch (SQLException ex) {
//            try {
//                con.rollback(); //cmt dong nay ney chay che do JUnit test
//            } catch (SQLException ex1) {
//                check = false;
//                Logger.getLogger(DangKiThiDauDAO.class.getName()).log(Level.SEVERE, null, ex1);
//            }
        } finally {
//            try {
//                con.setAutoCommit(true); //cmt dong nay ney chay che do JUnit test
//            } catch (SQLException ex) {
//                check = false;
//                Logger.getLogger(DangKiThiDauDAO.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }

        return check;
    }
}

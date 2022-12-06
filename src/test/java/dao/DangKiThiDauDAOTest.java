/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.ChangDua;
import model.DangKiThiDau;
import model.TayDua;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author anhnguyen
 */
public class DangKiThiDauDAOTest {
    // id chang dua = 2 => co 3 tay dua
    // id chang dua = -99 => chang dua ko ton tai
    // id chang dua = 3 => co 1 tay dua
    // id chang dua = 4 => co 0 tay dua

    DangKiThiDauDAO dao = new DangKiThiDauDAO();

    public DangKiThiDauDAOTest() {
    }

    @Test
    public void GetDSDangKiThiDauByChangDua_testchuan1() {
        //chang dua khong ton tai
        int id = -99;
        ArrayList<DangKiThiDau> lst = dao.getDSDangKiThiDauByChangDua(id);
        Assert.assertNotNull(lst);
    }

    @Test
    public void GetDSDangKiThiDauByChangDua_testchuan2() {
        //chang dua co 1 tay dua dang ki thi dau
        int id = 3;
        ArrayList<DangKiThiDau> lst = dao.getDSDangKiThiDauByChangDua(id);
        assertEquals(1, lst.size());
    }

    @Test
    public void GetDSDangKiThiDauByChangDua_testchuan3() {
        //chang dua co > 1 tay dua dang ki thi dau
        int id = 2;
        ArrayList<DangKiThiDau> lst = dao.getDSDangKiThiDauByChangDua(id);
        assertEquals(2, lst.size());
    }

    @Test
    public void GetDSDangKiThiDauByChangDua_testchuan4() {
        //chang dua co 0 tay dua dang ki thi dau
        int id = 4;
        ArrayList<DangKiThiDau> lst = dao.getDSDangKiThiDauByChangDua(id);
        Assert.assertNotNull(lst);
    }

    @Test
    public void LuuKetQuaThiDau_testChuan1() {
        // luu 1 ket qua dang ki thi dau, chua co Dang ki thi dau cu
        // test tren id co chang dua = 2
        // id dktd = 3

        ArrayList<DangKiThiDau> lst = new ArrayList<>();
        //tao 1 chang dua
        ChangDua cd = new ChangDua();
        cd.setId(2);
        //tao 1 tay dua
        TayDua td = new TayDua();
        td.setId(1);
        //tao 1 dktd
        DangKiThiDau dktd = new DangKiThiDau();
        dktd.setId(3);
        dktd.setChangDua(cd);
        dktd.setTayDua(td);
        dktd.setSovongduahoanthanh(0);
        dktd.setThoigianvedich("DNF");

        lst.add(dktd);

        try {
            DAO.con.setAutoCommit(false);
            boolean check = dao.luuKetQuaThiDau(lst);
            Assert.assertTrue(check);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                DAO.con.rollback();
                DAO.con.setAutoCommit(true);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void LuuKetQuaThiDau_testChuan2() {
        // luu > 1 ket qua dang ki thi dau, chua co Dang ki thi dau cu
        // test tren id co chang dua = 2
        // id dktd = 3, 4

        ArrayList<DangKiThiDau> lst = new ArrayList<>();
        //tao 1 chang dua
        ChangDua cd = new ChangDua();
        cd.setId(2);
        //tao 1 tay dua
        TayDua td = new TayDua();
        td.setId(1);
        //tao 1 dktd
        DangKiThiDau dktd = new DangKiThiDau();
        dktd.setId(3);
        dktd.setChangDua(cd);
        dktd.setTayDua(td);
        dktd.setSovongduahoanthanh(0);
        dktd.setThoigianvedich("DNF");
        lst.add(dktd); //add 1 dktd

        ChangDua cd2 = new ChangDua();
        cd2.setId(2);
        //tao 1 tay dua
        TayDua td2 = new TayDua();
        td2.setId(2);
        //tao 1 dktd
        DangKiThiDau dktd2 = new DangKiThiDau();
        dktd2.setId(4);
        dktd2.setChangDua(cd2);
        dktd2.setTayDua(td2);
        dktd2.setSovongduahoanthanh(0);
        dktd2.setThoigianvedich("DNF");
        lst.add(dktd2);//add 1 dktd

        try {
            DAO.con.setAutoCommit(false);
            boolean check = dao.luuKetQuaThiDau(lst);
            Assert.assertTrue(check);
            Assert.assertEquals(2, lst.size());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                DAO.con.rollback();
                DAO.con.setAutoCommit(true);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void LuuKetQuaThiDau_testChuan3() {
        // luu 1 ket qua dang ki thi dau, da co dang ky thi dau cu
        // test tren id co chang dua = 1
        // id dktd = 1

        ArrayList<DangKiThiDau> lst = new ArrayList<>();
        //tao 1 chang dua
        ChangDua cd = new ChangDua();
        cd.setId(1);
        //tao 1 tay dua
        TayDua td = new TayDua();
        td.setId(1);
        //tao 1 dktd
        DangKiThiDau dktd = new DangKiThiDau();
        dktd.setId(1);
        dktd.setChangDua(cd);
        dktd.setTayDua(td);
        dktd.setSovongduahoanthanh(0);
        dktd.setThoigianvedich("DNF");

        lst.add(dktd);

        try {
            DAO.con.setAutoCommit(false);
            boolean check = dao.luuKetQuaThiDau(lst);
            Assert.assertTrue(check);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                DAO.con.rollback();
                DAO.con.setAutoCommit(true);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void LuuKetQuaThiDau_testChuan4() {
        // luu > 1 ket qua dang ki thi dau, da co Dang ki thi dau cu
        // test tren id co chang dua = 1
        // id dktd = 1, 2

        ArrayList<DangKiThiDau> lst = new ArrayList<>();
        //tao 1 chang dua
        ChangDua cd = new ChangDua();
        cd.setId(1);
        //tao 1 tay dua
        TayDua td = new TayDua();
        td.setId(1);
        //tao 1 dktd
        DangKiThiDau dktd = new DangKiThiDau();
        dktd.setId(1);
        dktd.setChangDua(cd);
        dktd.setTayDua(td);
        dktd.setSovongduahoanthanh(0);
        dktd.setThoigianvedich("DNF");
        lst.add(dktd); //add 1 dktd

        ChangDua cd2 = new ChangDua();
        cd2.setId(1);
        //tao 1 tay dua
        TayDua td2 = new TayDua();
        td2.setId(2);
        //tao 1 dktd
        DangKiThiDau dktd2 = new DangKiThiDau();
        dktd2.setId(2);
        dktd2.setChangDua(cd2);
        dktd2.setTayDua(td2);
        dktd2.setSovongduahoanthanh(0);
        dktd2.setThoigianvedich("DNF");
        lst.add(dktd2);//add 1 dktd

        try {
            DAO.con.setAutoCommit(false);
            boolean check = dao.luuKetQuaThiDau(lst);
            Assert.assertTrue(check);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                DAO.con.rollback();
                DAO.con.setAutoCommit(true);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    @Test
    public void LuuKetQuaThiDau_testChuan5() {
        // luu 1 ket qua dang ki thi dau trung hoan toan Dang ki thi dau cu
        // test tren id co chang dua = 1
        // id dktd = 1

        ArrayList<DangKiThiDau> lst = new ArrayList<>();
        //tao 1 chang dua
        ChangDua cd = new ChangDua();
        cd.setId(1);
        //tao 1 tay dua
        TayDua td = new TayDua();
        td.setId(1);
        //tao 1 dktd
        DangKiThiDau dktd = new DangKiThiDau();
        dktd.setId(1);
        dktd.setChangDua(cd);
        dktd.setTayDua(td);
        dktd.setSovongduahoanthanh(3);
        dktd.setThoigianvedich("00:59:00");

        lst.add(dktd);

        try {
            DAO.con.setAutoCommit(false);
            boolean check = dao.luuKetQuaThiDau(lst);
            Assert.assertTrue(check);

            //lay ra kiem tra
            DangKiThiDau dktdd = new DangKiThiDau();
            for (int i = 0; i < dao.getDSDangKiThiDauByChangDua(1).size(); i++) {
                if (dao.getDSDangKiThiDauByChangDua(1).get(i).getId() == 1) {
                    dktdd = dao.getDSDangKiThiDauByChangDua(1).get(i); // lay dktd co id la 1
                    Assert.assertEquals(dktdd.getSovongduahoanthanh(), lst.get(0).getSovongduahoanthanh());
                    Assert.assertEquals(dktdd.getThoigianvedich(), lst.get(0).getThoigianvedich());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                DAO.con.rollback();
                DAO.con.setAutoCommit(true);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    @Test
    public void LuuKetQuaThiDau_testNgoaiLe1() {
        // luu 1 ket qua dang ki thi dau trung hoan toan Dang ki thi dau cu
        // test tren id co chang dua = 1
        // id dktd = 1

        ArrayList<DangKiThiDau> lst = new ArrayList<>();
        try {
            DAO.con.setAutoCommit(false);
            boolean check = dao.luuKetQuaThiDau(lst);
            Assert.assertFalse(check);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                DAO.con.rollback();
                DAO.con.setAutoCommit(true);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}

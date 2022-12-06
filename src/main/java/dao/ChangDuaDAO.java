/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ChangDua;
import model.DiaDiem;
import model.MuaGiai;

/**
 *
 * @author anhnguyen
 */
public class ChangDuaDAO extends DAO {

    public ChangDuaDAO() {
        super();
    }

    public ArrayList<ChangDua> getDSChangDua() {
        ArrayList<ChangDua> listChangDua = new ArrayList();

        String sql = "SELECT * FROM `tblchangdua`";
        try {
            PreparedStatement stm = con.prepareStatement(sql);

            ResultSet result = stm.executeQuery();
            while (result.next()) {
                ChangDua cd = new ChangDua();
                cd.setId(result.getInt("id"));
                cd.setTen(result.getString("ten"));
//                cd.setSovongdua(result.getFloat("sovongdua"));
//                cd.setThoigian(result.getInt("thoigian"));
//                cd.setMota(result.getString("mota"));
//
//                DiaDiem dd = new DiaDiem();
//                dd.setId(result.getInt("tblDiaDiemid"));
//                cd.setDiaDiem(dd);
//
//                MuaGiai mg = new MuaGiai();
//                mg.setId(result.getInt("tblMuaGiaiid"));
//                cd.setMuaGiai(mg);

                listChangDua.add(cd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChangDuaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return listChangDua;
    }
}

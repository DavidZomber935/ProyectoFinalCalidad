package com.itsqmet.modelo;

import com.itsqmet.controlador.ContactosControlador;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;

public class ContactosModelo {

    private ConexionBDD cbdd;
    private PreparedStatement stmt;
    private ResultSet resultado;
    private Connection c;

    public ContactosModelo() {
        cbdd = new ConexionBDD();
    }

    //CRUD
    public DefaultTableModel readContactos(ContactosControlador cc) {
        String consulta;
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("ID");
        dtm.addColumn("NOMBRES");
        dtm.addColumn("APELLIDOS");
        dtm.addColumn("TELF1");
        dtm.addColumn("TELF2");
        dtm.addColumn("DIRECCION");
        dtm.addColumn("CORREO");
        String[] datos = new String[7];
        try {
            c = cbdd.conectar();
            consulta = "SELECT * FROM `contactos`"
                    + "WHERE `nombres` like ?"
                    + "or `apellidos` like ?"
                    + "or `tel1` like ?"
                    + "or `tel2` like ?";
            stmt = c.prepareStatement(consulta);
            stmt.setString(1, "%" + cc.getBuscarContacto() + "%");
            stmt.setString(2, "%" + cc.getBuscarContacto() + "%");
            stmt.setString(3, "%" + cc.getBuscarContacto() + "%");
            stmt.setString(4, "%" + cc.getBuscarContacto() + "%");

            resultado = stmt.executeQuery();

            while (resultado.next()) {
                datos[0] = resultado.getInt("idcontacto") + "";
                datos[1] = resultado.getString("nombres");
                datos[2] = resultado.getString("apellidos");
                datos[3] = resultado.getString("tel1");
                datos[4] = resultado.getString("tel2");
                datos[5] = resultado.getString("dir");
                datos[6] = resultado.getString("email");
                dtm.addRow(datos);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dtm;
    }
    // Update

    public boolean updateContactos(ContactosControlador cc) {
        boolean devolver = false;
        String consulta;
        try {
            c = cbdd.conectar();
            consulta = "UPDATE `contactos` "
                    + "SET `nombres`=?,"
                    + "`apellidos`=?,"
                    + "`tel1`=?,"
                    + "`tel2`=?,"
                    + "`dir`=?,"
                    + "`email`=? "
                    + "WHERE `idcontacto`=?";
            stmt = c.prepareStatement(consulta);
            stmt.setString(1,cc.getNombres());
            stmt.setString(2,cc.getApellidos());
            stmt.setString(3,cc.getTel1());
            stmt.setString(4,cc.getTel2());
            stmt.setString(5,cc.getDir());
            stmt.setString(6,cc.getMail());
            stmt.setInt(7,cc.getIdcontacto());
            int resultado2 = stmt.executeUpdate();
            if (resultado2 == 1) {
                devolver = true;
            } else {
                devolver = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return devolver;
    }

    //Insert
    public boolean insertContactos(ContactosControlador cc) {
        boolean devolver = false;
        String consulta;
        try {
            c = cbdd.conectar();
            consulta = "INSERT INTO `contactos`(`nombres`, `apellidos`, `tel1`, `tel2`, `dir`, `email`) "
                    + "VALUES (?,"
                    + "        ?,"
                    + "        ?,"
                    + "        ?,"
                    + "        ?,"
                    + "        ?)";
            stmt = c.prepareStatement(consulta);
            stmt.setString(1,cc.getNombres());
            stmt.setString(2,cc.getApellidos());
            stmt.setString(3,cc.getTel1());
            stmt.setString(4,cc.getTel2());
            stmt.setString(5,cc.getDir());
            stmt.setString(6,cc.getMail());
            int resultado3 = stmt.executeUpdate();
            if (resultado3 == 1) {
                devolver = true;
            } else {
                devolver = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return devolver;
    }


    //delete
    public boolean deleteContactos(ContactosControlador cc) {
        boolean devolver = false;
        String consulta;
        try {
            c = cbdd.conectar();
            consulta = "DELETE FROM `contactos`"
                    + "WHERE `idcontacto` = ?";
            stmt= c.prepareStatement(consulta);
            stmt.setInt(1,cc.getIdcontacto());
            int resultado4 = stmt.executeUpdate();
            if (resultado4 == 1) {
                devolver = true;
            } else {
                devolver = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return devolver;
    }

}

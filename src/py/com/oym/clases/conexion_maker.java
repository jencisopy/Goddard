/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.oym.clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Cesar
 */
public class conexion_maker {

    public Connection con;
    public Statement stm;
    public ResultSet rs;

    public conexion_maker() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost\\oym08;databaseName=maker950;", "sa", "Oym1282873");
            stm = con.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(conexion_maker.class.getName()).log(Level.SEVERE, null, ex);
            showMessageDialog(null, "Error al Conectarse a la Base de Datos");
        }
//    showMessageDialog(null, "Error al Conectarse a la Base de Datos");
    }

    public Connection getConexion() {
        return con;
    }
//public static void cerrarConexion(){
//    try{
//        if(!conexion.isClosed()){
//            conexion.close();
//        }
//    }catch(SQLException ex){
//    }
//}

}

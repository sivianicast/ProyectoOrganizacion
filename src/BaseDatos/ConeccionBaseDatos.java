/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import java.awt.HeadlessException;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author siviany
 */
public class ConeccionBaseDatos {
    public ConeccionBaseDatos(){
    }
    Connection con = null;
    public static Statement sentencia = null; 
    public Connection conexion(){
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://bd.accdb");
            JOptionPane.showMessageDialog(null,"Coneccion exitosa base datos");
            sentencia = con.createStatement();
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"No conectado a base datos");
        }
        return con;
    }    
}        


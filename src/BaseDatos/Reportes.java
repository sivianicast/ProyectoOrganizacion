/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author siviany
 */
public class Reportes {

    public Reportes() {
        int contadorPeliculas = 0;
        int contadorSountracks = 0;
        int contadorBandas = 0;
        int totalOscarBandas = 0;
        int toralOscarCancion = 0;

        ConeccionBaseDatos con = new ConeccionBaseDatos();
        //Variable que almacena los datos de la consulta
        String sql = "Select Nombre_pelicula From Principal";
        try {
            ConeccionBaseDatos objConeccionBaseDatos = new ConeccionBaseDatos();
            ResultSet resultado = objConeccionBaseDatos.sentencia.executeQuery(sql);  //Linea que ejecuta la consulta sql y almacena los datos en resultado
            while (resultado.next()) {                                    //Bucle que recorre la consulta obtenida
                contadorPeliculas++;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con la consulta\n" + ex);
        }
        String sql2 = "Select Soundtranck From Principal Where Soundtranck <> ' '";
        try {
            ConeccionBaseDatos objConeccionBaseDatos = new ConeccionBaseDatos();
            ResultSet resultado = objConeccionBaseDatos.sentencia.executeQuery(sql2);  //Linea que ejecuta la consulta sql y almacena los datos en resultado
            while (resultado.next()) {                                    //Bucle que recorre la consulta obtenida
                contadorSountracks++;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con la consulta\n" + ex);
        }
        String sql3 = "Select Soundtranck Banda_Sonora From Principal Where Banda_Sonora <> ' '";
        try {
            ConeccionBaseDatos objConeccionBaseDatos = new ConeccionBaseDatos();
            ResultSet resultado = objConeccionBaseDatos.sentencia.executeQuery(sql3);  //Linea que ejecuta la consulta sql y almacena los datos en resultado
            while (resultado.next()) {                                    //Bucle que recorre la consulta obtenida
                contadorBandas++;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con la consulta\n" + ex);
        }
        String sql4 = "Select Soundtranck Oscar_Banda From Principal Where Oscar_Banda = 'SI'";
        try {
            ConeccionBaseDatos objConeccionBaseDatos = new ConeccionBaseDatos();
            ResultSet resultado = objConeccionBaseDatos.sentencia.executeQuery(sql4);  //Linea que ejecuta la consulta sql y almacena los datos en resultado
            while (resultado.next()) {                                    //Bucle que recorre la consulta obtenida
                totalOscarBandas++;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con la consulta\n" + ex);
        }
        String sql5 = "Select Soundtranck Oscar_Cancion From Principal Where Oscar_Cancion = 'SI'";
        try {
            ConeccionBaseDatos objConeccionBaseDatos = new ConeccionBaseDatos();
            ResultSet resultado = objConeccionBaseDatos.sentencia.executeQuery(sql5);  //Linea que ejecuta la consulta sql y almacena los datos en resultado
            while (resultado.next()) {                                    //Bucle que recorre la consulta obtenida
                toralOscarCancion++;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con la consulta\n" + ex);
        }
        JOptionPane.showMessageDialog(null, " numero peliculas = " + contadorPeliculas
                + "\n numero SoundTracks = " + contadorSountracks
                + "\n numero Bandas Sonoras = " + contadorBandas
                + "\n numero Bandas Ganaron Oscar = " + totalOscarBandas
                + "\n numero Canciones Ganaron Oscar = " + toralOscarCancion);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soundtrack;

import BaseDatos.ConeccionBaseDatos;
import presentacion.Login;
import presentacion.Menu;

/**
 *
 * @author siviany
 */
public class Soundtrack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConeccionBaseDatos objConeccionBaseDatos = new ConeccionBaseDatos();
        objConeccionBaseDatos.conexion();
        Menu menu = new Menu();
        menu.setVisible(true);
//        Login objLogin = new Login();
//        objLogin.setVisible(true);
    }
}

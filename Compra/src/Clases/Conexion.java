/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;





public class Conexion {
    Connection conectar = null;
     
        
        String usuario ="root";
        String contrasena = "12345678";
        String bd = "compra";
        String ip = "localhost";
        String puerto = "3306";
        String cadena ="jdbc:mysql://localhost:8081/compra";
        
        public Connection establecerConexion(){
                try{
                    Class.forName("com.mysql.jdb.Driver");
                    conectar = DriverManager.getConnection(cadena, usuario, contrasena);
                    JOptionPane.showMessageDialog(null,"Conexion a la base de datos: ");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"No se ha conectado"+ e.toString());
                }
                return conectar;
        }   
        
    }


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javaarduino.FormLogin;
import javaarduino.FormRegistro;
import javaarduino.Ventana;


/**
 *
 * @author jeffe
 */
public class Controlador {
    
    FormLogin login =new FormLogin(this);
    FormRegistro registro =new FormRegistro(this);
    Ventana  ventana=new Ventana(this);
    
     public void showFormLogin(){
        login.setVisible(true);
    }
    public void closeFormLogin(){
        login.setVisible(false);
     }    
     public void showFormRegistro(){
        registro.setVisible(true);
    }
     public void closeFormRegistro(){
        registro.setVisible(false);
    }
 public void showVentana(){
        ventana.setVisible(true);
    }
    public void closeVentana(){
        ventana.setVisible(false);
     }    
    
}

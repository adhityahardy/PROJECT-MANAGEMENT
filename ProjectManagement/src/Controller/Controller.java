/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ProjectManagement.DriverLogin;
import ProjectManagement.Client;
import ProjectManagement.ManajerProyek;
import ProjectManagement.Programmer;
import ProjectManagement.Proyek;
import ProjectManagement.Tugas;
import View_GUI.LoginGUI;
import View_GUI.MainMenu_GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Controller extends MouseAdapter implements ActionListener{
    
    LoginGUI viewlogin;
    MainMenu_GUI viewMenu= new MainMenu_GUI();
    
    public Controller(){
        viewlogin = new LoginGUI();
        viewlogin.addActionListener(this);
        viewlogin.setVisible(true);
        viewlogin.resetView();
    }
    
    public void actionPerformed(ActionEvent ae) {
        
        Object source = ae.getSource();
        if(source.equals(viewlogin.getBtnLogin())){
            if(viewlogin.getUsernameLogin().equals("admin") && viewlogin.getPasswordLogin().equals("12345")){
                viewMenu.setVisible(true);
                viewlogin.resetView();
            } else {
                JOptionPane.showMessageDialog(null,"Username / Password Salah","Login Error",2);
            }
        }
    }
}

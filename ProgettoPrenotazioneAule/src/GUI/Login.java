/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import PrenotareAula.Campus;
import Utenti.Account;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Aciredef
 */
public class Login extends JFrame {
    private JPanel main;
    private JPanel upperArea;
    private JPanel lowerArea;
    private JPanel borderEast;
    private JPanel borderWest;
    private JPanel borderNorth;
    private JLabel benvenuto;
    private JLabel email;
    private JLabel password;
    private JLabel errpassword;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton login;

    public Login() {
        Account a = Account.getInstance();
        Campus cp = Campus.getInstance();
        main = new JPanel(new BorderLayout());
        upperArea = new JPanel(new BorderLayout());
        lowerArea = new JPanel(new GridLayout(12,1));
        borderEast=new JPanel();
        borderWest=new JPanel();
        borderNorth=new JPanel();
        benvenuto = new JLabel("Benvenuto in XClassLive, inserisci e-mail e password");
        email = new JLabel("e-mail");
        password = new JLabel("password");
        errpassword=new JLabel("combinazione nome utente password errata!");
        emailField = new JTextField();
        passwordField = new JPasswordField();
        login = new JButton("Login");
        initComponents();
    }
    
    
    private void initComponents() {
        this.add(main);
        this.setLocationRelativeTo(null);
        Dimension d=new Dimension(100, 500);
        this.setSize(500, 500);
        main.add(upperArea, BorderLayout.NORTH);
        main.add(lowerArea, BorderLayout.CENTER);
        main.add(borderEast, BorderLayout.EAST);
        main.add(borderWest, BorderLayout.WEST);
        borderEast.setPreferredSize(d);
        borderWest.setPreferredSize(d);
        upperArea.add(benvenuto);
        lowerArea.add(borderNorth);
        lowerArea.add(email);
        lowerArea.add(emailField);
        lowerArea.add(password);
        lowerArea.add(passwordField);
        lowerArea.add(new JPanel());
        lowerArea.add(login);
        lowerArea.add(errpassword);
        errpassword.setHorizontalAlignment(JLabel.CENTER);
        errpassword.setForeground(Color.red);
        errpassword.setVisible(false);
        benvenuto.setHorizontalAlignment(JLabel.CENTER);
        
        
        ActionListener loginAl=new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String email=emailField.getText();
                String password=String.valueOf(passwordField.getPassword());
                switch (Account.getInstance().login(email, password)) {
                    case 0:
                        TeacherFrame tr=new TeacherFrame();
                        setVisible(false);
                        tr.setVisible(true);
                        break;
                    case 1:
                        SupervisorFrame sr=new SupervisorFrame(email);
                        setVisible(false);
                        sr.setVisible(true);
                        break;
                    case 2:
                        errpassword.setVisible(true);
                        break;
                    default:
                        break;                                           
                }
                
            }
        };
        login.addActionListener(loginAl);
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    }
    
    
    
    
    
    
    
}
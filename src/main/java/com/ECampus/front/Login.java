package com.ECampus.front;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JButton login, cancel;
    JTextField userName1, password1;
    Login(){

        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel userName = new JLabel("Username");
        userName.setBounds(40,20,100, 20);
        add(userName);

        userName1 =new JTextField();
        userName1.setBounds(150,20,150,20);
        add(userName1);

        JLabel password= new JLabel("Password");
        password.setBounds(40,70,100, 20);
        add(password);

        password1 =new JPasswordField();
        password1.setBounds(150,70,150,20);
        add(password1);

        login =new JButton("Login");
        login.setBounds(40,140,120,30);
        login.setBackground(Color.blue);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        login.setFont(new Font("Tahoma",Font.BOLD,15));
        add(login);

        cancel =new JButton("Cancel");
        cancel.setBounds(180,140,120,30);
        cancel.setBackground(Color.blue);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma",Font.BOLD,15));
        add(cancel);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/man.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,0,200,150);
        add(image);


        setSize(600, 300);
        setLocation(500, 250);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            String username = userName1.getText();
            String password = password1.getText();

            String query = "select * from login where username=' "+username+" and password=' "+password+"'";

            try {
                LoginCommand c =new LoginCommand();
               ResultSet rs = c.s.executeQuery(query);

               if (rs.next()){
                   setVisible(false);
                   new HomePage();
               }else {
                  JOptionPane.showMessageDialog(null, "Invalid username or password");
                  setVisible(false);
               }
            }catch (Exception e1){
                e1.printStackTrace();
            }
        }else if (e.getSource() == cancel) {
            setVisible(false);
        }

    }
    public static void main(String[] args){
        new Login();
    }


}

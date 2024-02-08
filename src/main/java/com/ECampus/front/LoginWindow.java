package com.ECampus.front;

import javax.swing.*;
import java.awt.*;

public class LoginWindow extends JFrame implements Runnable {
     Thread t;
    LoginWindow(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/fotoooooo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800,600,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        t=new Thread(this);
        t.start();
        setVisible(true);

        int x=1;

        for (int i = 1;i <= 600;i+=4, x+=1) {
            setLocation(600 - ((i + x)/2), 350 - (i/2));
            setSize(i , i );
            try {
                Thread.sleep(10);
            }catch (Exception e){}
        }
    }
    public void run(){
        try {
            Thread.sleep(7000);
            setVisible(false);
            new Login();
        }catch (Exception e){

        }
    }
    public static void main(String[] args){
        new LoginWindow();

    }
}

package com.company.naming;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {
    public MyWindow(String title){
        super(title);
        setSize(400,150);
        addWindowListener(new WindowAdapter() {

        public void windowClosed(WindowEvent e){
            System.exit(0);
        }
        });
    }
    public void paint(Graphics g){
        super.paint(g);
        Font sanSerifLarge=new Font("Sanserif",Font.BOLD,18);
        Font sanSerifsmall=new Font("Sanserif",Font.BOLD,12);
        g.setFont(sanSerifLarge);
        g.drawString("The Complete Java Developer Couse",60,60);
        g.setFont(sanSerifsmall);
        g.drawString("By Tim Buchalka",60,100);

    }
}

package com.company.InnerClass.intro;

import java.util.Scanner;

public class intro {
    private static  Scanner scanner=new Scanner(System.in);
    private static Button btnPrint=new Button("Print");
    public static void main(String[] args) {
        /// this is a class that implements the interface, which is part of button class;
        class ClickListener implements Button.IOnClickListener {

            public ClickListener() {
                System.out.println("I am attached!");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " Clicked");
            }
        }
        ///
        btnPrint.setOnClickListener((Button.IOnClickListener) new ClickListener());
        listen();
    }
        private static void listen() {
            boolean quit=false;
            int choice =scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:quit=true;
                case 1:btnPrint.onClick();
                // case one: btn's onClick method is equvalent to btn's ClickListen's class' onClick method
            }
        }


}

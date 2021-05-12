package com.company.Interface;

import java.util.LinkedList;

public class Interface {
    public static void main(String[] args) {
        ITelephone timsPhone=new DeskPhone(123456);
        DeskPhone ransPhone=new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.isRinging();
        timsPhone.answer();
        timsPhone.isRinging();

        ITelephone jerryPhone=new MobilePhone(23344);
        jerryPhone.callPhone(23344);
        jerryPhone.answer();




    }
}


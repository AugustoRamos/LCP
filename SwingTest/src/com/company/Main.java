package com.company;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {
	// write your code here
        FormListener myWindow = new FormListener("My first window");
        myWindow.setSize(350,100);
        myWindow.setVisible(true);
    }
}

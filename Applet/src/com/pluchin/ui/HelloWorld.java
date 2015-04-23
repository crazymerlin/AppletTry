package com.pluchin.ui;

import java.applet.Applet;
import java.awt.Label;

public class HelloWorld extends Applet {

    public void init() {
        Label label = new Label("Hello world!");
        add(label);
    }
}
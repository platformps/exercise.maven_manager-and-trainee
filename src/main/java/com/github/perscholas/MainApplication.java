package com.github.perscholas;

public class MainApplication {
    public static void main(String[] args) {
        Manager M = new Manager();
        Runnable myObject = new ApplicationRunner();
        myObject.run();
    }
}

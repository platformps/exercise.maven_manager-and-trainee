package com.github.perscholas;

public class ApplicationRunner implements Runnable {
    public void run() {
        Manager peter = new Manager(29846L, "Peter", "Chennai India", 237844L, 65000D);
        Trainee jack = new Trainee(29846L, "Jack", "Mumbai India", 442085L, 45000D);
        peter.calculateTransportAllowance();
        jack.calculateTransportAllowance();
    }
}

package com.github.perscholas;

/**
 * Created by leon on 6/10/2020.
 */
public class Trainee extends AbstractEmployee{
    public Trainee(Long id, String name, String address, Long phoneNumber, Double basicSalary) {
        super(id, name, address, phoneNumber, basicSalary, 250.80, 1000.50);
    }

    public Trainee() {
        super(null, null, null, null, null, 250.80, 1000.50);
    }

    @Override
    public void calculateSalary() {

    }
}

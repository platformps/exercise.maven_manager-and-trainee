package com.github.perscholas;

/**
 * Created by leon on 6/10/2020.
 */
public class Manager extends AbstractEmployee{
    public Manager(Long id, String name, String address, Long phoneNumber, Double basicSalary) {
        super(id, name, address, phoneNumber, basicSalary);


    }

    public Manager() {
        super(null, null, null, null, null, 250.80,1000.50);
    }

    public void calculateSalary(){
    }
}

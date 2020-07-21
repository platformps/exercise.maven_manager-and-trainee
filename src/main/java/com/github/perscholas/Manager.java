package com.github.perscholas;

/**
 * Created by leon on 6/10/2020.
 */
public class Manager extends AbstractEmployee {
    public Manager(Long id, String name, String address, Long phoneNumber, Double basicSalary) {
        super(id, name, address, phoneNumber, basicSalary);
    }

    public Manager() {
    }

    @Override
    public double calculateTransportAllowance() {
        double transportAllowance = 15 * this.getBasicSalary() / 100;
        System.out.printf("%s salary is $%.2f\n", this.getName(),this.getBasicSalary() + transportAllowance);
        return transportAllowance;
    }
}

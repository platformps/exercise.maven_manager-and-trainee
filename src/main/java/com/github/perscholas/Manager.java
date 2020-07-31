package com.github.perscholas;

/**
 * Created by leon on 6/10/2020.
 */
public class Manager extends AbstractEmployee {
    //    Double expectedSpecialAllowance = 250.80;
//    Double expectedHra = 1000.50;
    // TODO - Ensure that each of the arguments passed through the constructor are assigned to a respective instance variable
    private Long id;
    private String name;
    private String address;
    private Long phoneNumber;
    private Double basicSalary;
    private Double SpecialAllowance;
    private Double Hra;

     public Manager(Long id, String name, String address, Long phoneNumber, Double basicSalary) {
        super(id, name, address, phoneNumber, basicSalary,250.80,1000.50 );
    }

    public Manager() {
        super(null,null,null,null,null,250.80,1000.50);
    }

    @Override
    public void calculateSalary() {
    Double salary = this.getBasicSalary() + calculateTransportAllowance();
        System.out.println("Salary of Manager is =" + salary);
    }
    @Override
    public Double calculateTransportAllowance(){
        Double transportAllowance = (15 / 100) * this.getBasicSalary();
        return transportAllowance;
    }
}
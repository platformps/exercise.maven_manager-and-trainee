package com.github.perscholas;

/**
 * Created by leon on 6/10/2020.
 */
public class Manager extends AbstractEmployee {

    private  Long id;
    private  String name;
    private  String address;
    private  Long phoneNumber;
    private  Double baseSalary;


    // TODO - Ensure that each of the arguments passed through the constructor are assigned to a respective instance variable
    public Manager(Long id, String name, String address, Long phoneNumber, Double basicSalary) {
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        this.setPhoneNumber(phoneNumber);
        this.setBasicSalary(basicSalary);
    }


    // TODO - Modify to ensure the respective test case passes
    public Manager() {
        this.setSpecialAllowance(250.80);
        this.setHealthReimbursementAccount(1000.5);


    }
}

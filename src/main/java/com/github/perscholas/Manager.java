package com.github.perscholas;

/**
 * Created by leon on 6/10/2020.
 */
public class Manager extends AbstractEmployee implements EmployeeInterface {
    Long id;
    public String name = "";
    String address = "";
    Long phoneNumber = Long.MAX_VALUE;
    Double basicSalary = Double.MAX_VALUE;
    Double healthReimbursementAccount = 250.80;
    Double Salary = 1000.50;

    // TODO - Ensure that each of the arguments passed through the constructor are assigned to a respective instance variable
    public Manager(Long id, String name, String address, Long phoneNumber, Double basicSalary) {
        super();
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        this.setPhoneNumber(phoneNumber);
        this.setBasicSalary(basicSalary);

    }

    // TODO - Modify to ensure the respective test case passes
    public Manager() {
        super();

    }


    @Override
    public String setName(String name) {
       return this.name = name;
    }

    @Override
    public String setAddress(String address) {
        return this.address = address;
    }

    @Override
    public Long setPhoneNumber(Long phoneNumber) {
        return this.phoneNumber = phoneNumber;
    }

    @Override
    public Double setBasicSalary(Double basicSalary) {
        return this.basicSalary = basicSalary;
    }

    @Override
    public Double setSpecialAllowance(Double specialAllowance) {
        return specialAllowance;
    }

    @Override
    public Double setHealthReimbursementAccount(Double healthReimbursementAccount) {
        return this.healthReimbursementAccount = healthReimbursementAccount;
    }

    @Override
    public Double calculateSalary() {
        return null;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public Long getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public Double getBasicSalary() {
        return this.basicSalary;
    }

    @Override
    public Double getSpecialAllowance() {
        return null;
    }

    @Override
    public Double getHealthReimbursementAccount() {
        return null;
    }

    @Override
    public Long setId(Long id) {
        return this.id = id;
    }
}

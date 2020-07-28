package com.github.perscholas;

/**
 * Created by leon on 6/10/2020.
 */
public class Trainee extends AbstractEmployee implements EmployeeInterface {
    Long id;
    String name;
    String address;
    Long phoneNumber;
    Double basicSalary;

    // TODO - Ensure that each of the arguments passed through the constructor are assigned to a respective instance variable
    public Trainee(Long id, String name, String address, Long phoneNumber, Double basicSalary) {
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        this.setPhoneNumber(phoneNumber);
        this.setBasicSalary(basicSalary);
    }

    // TODO - Modify to ensure the respective test case passes
    public Trainee() {
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public Long getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public Double getBasicSalary() {
        return basicSalary;
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
        return this.basicSalary= basicSalary;
    }

    @Override
    public Double setSpecialAllowance(Double specialAllowance) {
        return null;
    }

    @Override
    public Double setHealthReimbursementAccount(Double healthReimbursementAccount) {
        return null;
    }

    @Override
    public Double calculateSalary() {
        return null;
    }
}

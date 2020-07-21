package com.github.perscholas;

/**
 * Created by leon on 6/10/2020.
 */
public abstract class AbstractEmployee implements EmployeeInterface{

    //Attributes
    private Long id;
    private String name;
    private String address;
    private Long phoneNumber;
    private Double basicSalary;
    private Double specialAllowance = 250.80;
    private Double healthReimbursementAccount = 1000.50;

    //Start Constructors
    public AbstractEmployee(Long id, String name, String address, Long phoneNumber, Double basicSalary, Double  specialAllowance, Double healthReimbursementAccount) {
        this(id, name, address, phoneNumber, basicSalary);
        this.specialAllowance = specialAllowance;
        this.healthReimbursementAccount = healthReimbursementAccount;
    }

    public AbstractEmployee(Long id, String name, String address, Long phoneNumber, Double basicSalary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.basicSalary = basicSalary;}

    public AbstractEmployee() {
    }
    //End Constructors

    //Start Methods
    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public Long getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public Double getBasicSalary() {
        return basicSalary;
    }

    @Override
    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public Double getSpecialAllowance() {
        return specialAllowance;
    }

    @Override
    public Double getHealthReimbursementAccount() {
        return healthReimbursementAccount;
    }

    @Override
    public void setSpecialAllowance(Double specialAllowance) {
        this.specialAllowance = specialAllowance;
    }

    @Override
    public void setHealthReimbursementAccount(Double healthReimbursementAccount) {
        this.healthReimbursementAccount = healthReimbursementAccount;
    }

    @Override
    public Double calculateSalary() {
        return basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * healthReimbursementAccount / 100);
    }
    //End Methods
}

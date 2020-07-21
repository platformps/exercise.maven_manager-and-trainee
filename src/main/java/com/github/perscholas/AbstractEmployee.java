package com.github.perscholas;

/**
 * Created by leon on 6/10/2020.
 */
// TODO - Ensure an `AbstractEmployee` implements the `EmployeeInterface`
// TODO - Ensure an `AbstractEmployee` is abstract
public class AbstractEmployee implements EmployeeInterface {
    private Object exampleOfInstanceVariable; // TODO - Replace with correct instance variable declarations

    // TODO - Ensure that each of the arguments passed through the constructor are assigned to a respective instance variable
    private AbstractEmployee(Long id, String name, String address, Long phoneNumber, Double basicSalary, Double specialAllowance, Double healthReimbursementAccount) {
    }

    // TODO - Ensure that each of the arguments passed through the constructor are assigned to a respective instance variable
    public AbstractEmployee(Long id, String name, String address, Long phoneNumber, Double basicSalary) {
    }

    public AbstractEmployee() {
    }
   private Long id;
    private String name;
   private String address;
   private Long phoneNumber;
   private Double basicSalary;
    private Double specialAllowance = 250.8;
  private  Double hra = 1000.5;

    @Override
    public Long getId() {
        return this.id;
    }


    @Override
    public String getName() {
        return this.name;
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
        return this.specialAllowance;
    }

    @Override
    public Double getHealthReimbursementAccount() {
        return this.hra;
    }

    @Override
    public Long setId(Long id) {
        return this.id=id;
    }

    @Override
    public String setName(String name) {
        return this.name=name;
    }

    @Override
    public String setAddress(String address) {
        return this.address=address;
    }

    @Override
    public Long setPhoneNumber(Long phoneNumber) {
        return this.phoneNumber=phoneNumber;
    }

    @Override
    public Double setBasicSalary(Double basicSalary) {
        return this.basicSalary=basicSalary;
    }

    @Override
    public Double setSpecialAllowance(Double specialAllowance) {
        return this.specialAllowance=specialAllowance;
    }

    @Override
    public Double setHealthReimbursementAccount(Double healthReimbursementAccount) {
        return this.hra=healthReimbursementAccount;
    }
    @Override
      public Double calculateTransportAllowance(){
            return (this.basicSalary*(1/10));
    }
    @Override
    public Double calculateSalary() {
        return null;
    }
}

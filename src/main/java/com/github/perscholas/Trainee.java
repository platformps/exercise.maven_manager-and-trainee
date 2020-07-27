package com.github.perscholas;

/**
 * Created by leon on 6/10/2020.
 */
//Trainee extends Abstract Employee
public class Trainee extends AbstractEmployee {
    // Instance variable declaration
    private Long id;
    private String name;
    private String address;
    private Long phoneNumber;
    private Double basicSalary;
    private Double specialAllowance;
    private Double healthReimbursementAccount;
    // Ensure that each of the arguments passed through the constructor are assigned to a respective instance variable
    public Trainee(Long id, String name, String address, Long phoneNumber, Double basicSalary) {
        super(id, name, address, phoneNumber, basicSalary);
    }

    // Modify to ensure the respective test case passes
    public Trainee() {
    }

    @Override
    public void calculateSalary() {
    }
}

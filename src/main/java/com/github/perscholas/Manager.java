package com.github.perscholas;

/**
 * Created by leon on 6/10/2020.
 */
public class Manager extends AbstractEmployee implements EmployeeInterface {
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
    }

}

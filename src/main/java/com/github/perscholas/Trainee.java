package com.github.perscholas;

/**
 * Created by leon on 6/10/2020.
 */
/**
 * Implemented By Monica Deshmukh
 * 07/21/2020
 */
public class Trainee extends AbstractEmployee{
    // TODO - Ensure that each of the arguments passed through the constructor are assigned to a respective instance variable
    public Trainee(Long id, String name, String address, Long phoneNumber, Double basicSalary) {
        super(id, name, address, phoneNumber, basicSalary);
    }

    // TODO - Modify to ensure the respective test case passes
    public Trainee() {
        super();
    }

    /**
     * For all the other employees except the manager, the travel allowance is 10% of the basic salary.
     * @return
     */
    @Override
    public Double calculateSalary() {
        Double salary = getBasicSalary() + .1 * getBasicSalary();
        return salary;
        //return null;
    }
}

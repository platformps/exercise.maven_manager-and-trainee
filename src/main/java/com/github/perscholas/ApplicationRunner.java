package com.github.perscholas;

public class ApplicationRunner implements Runnable {
    public void run() {
        /**
         * TODO - Create an instance of `Manager`.
         * Ensure the `Manager` instance is constructed with each of the following field-values:
         * -- id: 126534
         * -- name: "Peter"
         * -- address: "Chennai India"
         * -- phone: 237844
         * -- salary: 65000
         **/
        Manager manager = new Manager(126534l, "Peter", "Chennai India", 237844l, 6500d);

       /**
         * TODO - Create an instance of `Trainee`
         * Ensure the `Trainee` instance is constructed with each of the following field-values:
         * -- id: 29846
         * -- name: "Jack"
         * -- address: "Mumbai India"
         * -- phone: 442085
         * -- salary: 45000
         *
         *
         **/
        Trainee trainee = new Trainee(29846l, "Jack", "Mumbai India", 442085l,4500d);


       /**
         * TODO - Invoke `calculateSalary` method on `manager` instance
         * The salary calculated should be printed in the console
         *
        * */

        Double resultManager = manager.calculateTransportAllowance();
        System.out.println("Manager transportation allowance: " + resultManager);

       /**
         * TODO - Invoke `calculateSalary` method on `trainee` instance
         * The salary calculated should be printed in the console
         *
         **/
       Double result = trainee.calculateTransportAllowance();
        System.out.println("Trainee transportation allowance: " + result);

    }
}

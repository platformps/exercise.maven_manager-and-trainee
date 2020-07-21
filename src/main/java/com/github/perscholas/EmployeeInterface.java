package com.github.perscholas;

public interface EmployeeInterface {
    public Long getId();
    public String getName();
    public String getAddress();
    public Long getPhoneNumber();
    public Double getBasicSalary();
    public Double getSpecialAllowance();
    public Double getHealthReimbursementAccount();
    public void setId(Long id);
    public void setName(String name);
    public void setAddress(String address);
    public void setPhoneNumber(Long phoneNumber);
    public void setBasicSalary(Double basicSalary);
    public void setSpecialAllowance(Double specialAllowance);
    public void setHealthReimbursementAccount(Double healthReimbursementAccount);
    public Double calculateSalary();
}

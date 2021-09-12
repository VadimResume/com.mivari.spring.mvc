package com.mivari.spring.mvc;
import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "Name must be min 2 symbols")
    private String name;
//    @NotEmpty(message = "Surname is required field")
    @NotBlank(message = "Surname is required field")
    private String surname;
    @Min(value = 2000, message = "must by greater than 1999")
    @Max(value = 300_000, message = "must be less 300_001")
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String, String> carBrands;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XXX-XX-XX")
    private String phoneNumber;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("VW", "VW");
        carBrands.put("Kamaz", "Kamaz");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
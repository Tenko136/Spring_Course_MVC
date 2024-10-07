package kz.tenko.spring.mvc;


import kz.tenko.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {


    @Size(min = 2)
    private String name;

    //    @NotEmpty(message = "surname is required field")
    @NotBlank(message = "surname is required field")
    private String surname;

    @Min(value = 100, message = "mb > 100")
    @Max(value = 1000, message = "mb < 1000")
    private int salary;


    private String department;

    private Map<String, String> departments;
    private String role;
    private Map<String, String> roles;
    private String[] languages;
    private Map<String, String> langs;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XXX-XX-XX")
    private String phoneNumber;

    @CheckEmail
    private String email;

    public Employee() {
        departments = new HashMap<>();
        departments.put("Information Technology", "IT");   //<form:option value="Information Technology" label ="IT"/>
        departments.put("Human Resources", "HR");   //<form:option value="Human Resources" label ="HR"/>
        departments.put("Sales", "Sales");     //<form:option value="Sales" label ="Sales"/>

        roles = new HashMap<>();
        roles.put("Tank", "Tank");    // Tank <form:radiobutton path= "role" value = "Tank"/>
        roles.put("Heal", "Heal");    // Heal <form:radiobutton path= "role" value = "Heal"/>
        roles.put("Damage Dealer", "DD");    // DD <form:radiobutton path= "role" value = "DD"/>
        roles.put("Range Damage Dealer", "RDD"); // RDD <form:radiobutton path= "role" value = "RDD"/>

        langs = new HashMap<>();
        langs.put("English", "EN");    // EN <form:checkbox path="languages" value= "English"/>
        langs.put("Russian", "RU");    // RU <form:checkbox path="languages" value= "Russian"/>
        langs.put("French", "FR");    // FR <form:checkbox path="languages" value= "French"/>
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Map<String, String> getRoles() {
        return roles;
    }

    public void setRoles(Map<String, String> roles) {
        this.roles = roles;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLangs() {
        return langs;
    }

    public void setLangs(Map<String, String> langs) {
        this.langs = langs;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

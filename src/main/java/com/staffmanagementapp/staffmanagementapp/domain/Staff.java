package com.staffmanagementapp.staffmanagementapp.domain;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fist_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "salary")
    private Long salary;

    @Column(name = "entered")
    private Date entered;

    @Column(name = "salary_currency")
    @Enumerated(EnumType.STRING)
    private Currency currency;

    @Column(name = "department")
    @Enumerated(EnumType.STRING)
    private Departments department;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Date getEntered() {
        return entered;
    }

    public void setEntered(Date entered) {
        this.entered = entered;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Departments getDepartment() {
        return department;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }

    public String getPhotoFilePath() {
        return photoFilePath;
    }

    public void setPhotoFilePath(String photoFilePath) {
        this.photoFilePath = photoFilePath;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    @Column(name = "photo_file_path")
    public String photoFilePath;

    @Column(name = "created_by", columnDefinition = "varchar DEFAULT 'SYSTEM'")
    private String  createdBy;
    @Column(name = "created_at", columnDefinition = "timestamp without time zone DEFAULT now()")
    private Date createdAt;

    @Column(name = "modified_by", columnDefinition = "varchar DEFAULT 'SYSTEM'")
    private String modifiedBy;

    @Column(name = "modified_at", columnDefinition = "timestamp without time zone DEFAULT now()")
    private Date modifiedAt;


}

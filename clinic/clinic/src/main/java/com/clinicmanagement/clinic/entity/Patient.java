package com.clinicmanagement.clinic.entity;


import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.NotBlank;
import lombok.*;


import java.sql.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Transactional

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "pid")
    private int pid;
    @NotBlank
    @Column(name = "name")
    private String name;
    @NotBlank
    @Column(name = "phone_no")
    private String phone_no;
    @NotBlank
    @Column(name = "gender")
    private String gender;
    @NotBlank
    @Column(name = "address")
    private String address;

    @Column(name = "appointment_date")
    private Date appointment_date;

    @Column(name = "discharge_date")
    private Date discharge_date;
    @NotBlank
    @Column(name = "list_of_hospital")
    private String list_of_hospital;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getAppointment_date() {
        return appointment_date;
    }

    public void setAppointment_date(Date appointment_date) {
        this.appointment_date = appointment_date;
    }

    public Date getDischarge_date() {
        return discharge_date;
    }

    public void setDischarge_date(Date discharge_date) {
        this.discharge_date = discharge_date;
    }

    public String getList_of_hospital() {
        return list_of_hospital;
    }

    public void setList_of_hospital(String list_of_hospital) {
        this.list_of_hospital = list_of_hospital;
    }
}

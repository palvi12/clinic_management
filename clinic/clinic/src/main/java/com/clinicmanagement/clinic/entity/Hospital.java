package com.clinicmanagement.clinic.entity;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;


@Data
@AllArgsConstructor
@Transactional
@NoArgsConstructor
@ToString
@Entity

public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "hid")
    private int hid;
    @NotBlank
    @Column(name = "hname")
    private String hname;
    @NotBlank
    @Column(name = "haddress")
    private String haddress;
    @NotBlank
    @Column(name = "hgmail")
    private String hgmail;

    @Column(name = "hphoneno")
    private int hphoneno;


    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public String getHaddress() {
        return haddress;
    }

    public void setHaddress(String haddress) {
        this.haddress = haddress;
    }

    public String getHgmail() {
        return hgmail;
    }

    public void setHgmail(String hgmail) {
        this.hgmail = hgmail;
    }

    public int getHphoneno() {
        return hphoneno;
    }

    public void setHphoneno(int hphoneno) {
        this.hphoneno = hphoneno;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    @OneToMany(targetEntity = Patient.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "cp_fk",referencedColumnName = "hid")
    private List<Patient> patients;




}

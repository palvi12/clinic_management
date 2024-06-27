package com.clinicmanagement.clinic.dto;


import com.clinicmanagement.clinic.entity.City;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ClinicRequest {

    private City city;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}

package com.validation.test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Lead {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer leadId;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z]+$")
    private String firstName;

    @Pattern(regexp = "^[a-zA-Z]*$")
    private String middleName;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z]+$")
    private String lastName;

    @NotBlank
    @Pattern(regexp = "^[6-9]\\d{9}$")
    private String mobileNumber;

    @NotBlank
    private String gender;

    @NotBlank
    @Temporal(TemporalType.DATE)
    private Date dob;

    @NotBlank
    @Email
    private String email;

    public Integer getLeadId() {
        return leadId;
    }

    public void setLeadId(Integer leadId) {
        this.leadId = leadId;
    }
    

}


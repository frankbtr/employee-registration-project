package com.frank.employeeregistrationproject.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

 //   @NotNull  //accept everything except null  Ex: ""
 //   @NotEmpty //accept everything except null and empty  Ex: " "
    @NotBlank //accept everything except null and empty, blank Ex: " 1"
    @Size(max = 12, min=2)
    private String firstName;
    @Size(max = 15, min=2)
    private String lastName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDay;
    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;
}

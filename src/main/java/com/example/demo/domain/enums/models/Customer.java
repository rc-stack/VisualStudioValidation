package com.example.demo.domain.enums.models;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customers")
public class Customer {

    @Id
    private Integer id;
    
    @NotBlank(message = "Name is mandatory")
    @Size(min = 2, max = 30, message = "Name must be between 5 and 30 characters")
    private String name;
    
    @Email(message = "Should be a valid email")
    private String email;
    
    @NotBlank(message = "Phone is mandatory")
    
    @Size(min = 2, max = 30, message = "Let's make a rollback")
    private String phone;

}

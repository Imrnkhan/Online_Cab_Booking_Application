package com.example.online_cab_booking_application.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {

    @Embedded
    ModelUser user;

    @Id
    @SequenceGenerator(name="customer_generator", sequenceName = "customer_seq", allocationSize=50)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_generator")
    private Integer customerId;
}

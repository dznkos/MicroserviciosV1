package com.call.telco.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "redes")
public class Redes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private  String descripcion;
    private  String precio;

    private String beneficio;

    private String tiempo;
}

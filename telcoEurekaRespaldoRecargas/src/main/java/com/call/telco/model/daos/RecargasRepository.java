package com.call.telco.model.daos;

import com.call.telco.model.entidades.Recarga;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecargasRepository extends JpaRepository<Recarga, Integer> {
}

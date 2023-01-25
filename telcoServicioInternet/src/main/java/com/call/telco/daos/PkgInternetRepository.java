package com.call.telco.daos;

import com.call.telco.entities.PkgInternet;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PkgInternetRepository extends MongoRepository<PkgInternet, Long> {
}

package com.hiper.repository.crud;

import com.hiper.model.Supplement;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Grupo G15
 */
public interface SupplementCrudRepository extends MongoRepository<Supplement, String> {
    
}

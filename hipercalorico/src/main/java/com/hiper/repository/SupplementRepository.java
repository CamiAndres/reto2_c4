package com.hiper.repository;

import com.hiper.model.Supplement;
import com.hiper.repository.crud.SupplementCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Grupo G15
 */
@Repository
public class SupplementRepository {

    @Autowired
    private SupplementCrudRepository crudInterface;

    public List<Supplement> listAll() {
        return crudInterface.findAll();
    }

    public Optional<Supplement> getSupplement(String reference) {
        return crudInterface.findById(reference);
    }

    public Supplement create(Supplement clothe) {
        return crudInterface.save(clothe);
    }

    public void update(Supplement clothe) {
        crudInterface.save(clothe);
    }

    public void delete(Supplement clothe) {
        crudInterface.delete(clothe);
    }
}

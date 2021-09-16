package co.escuelaing.edu.app.ieti.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BillRepository extends MongoRepository<Bill,String>{
    
}

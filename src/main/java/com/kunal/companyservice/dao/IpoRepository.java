package com.kunal.companyservice.dao;

import java.util.Optional;

import com.kunal.companyservice.model.Ipo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface IpoRepository extends MongoRepository<Ipo, String>
{
    public Optional<Ipo> findById(String id);
    public void deleteById(String id);
}
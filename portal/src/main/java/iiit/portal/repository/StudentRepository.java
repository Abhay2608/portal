package iiit.portal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import iiit.portal.entity.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

}

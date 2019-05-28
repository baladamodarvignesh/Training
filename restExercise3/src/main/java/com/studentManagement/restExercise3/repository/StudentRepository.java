/**
 * 
 */
package com.studentManagement.restExercise3.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.studentManagement.restExercise3.bean.Student;

/**
 * @author balavign
 *
 */
@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

}

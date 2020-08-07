package com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.model.User;

/**Project: springUserApi
 * File: UserRepository.java
 * @author jaime
 * Em 06-08-2020 **/

@Repository
public interface UserRepository extends MongoRepository<User, String>{}

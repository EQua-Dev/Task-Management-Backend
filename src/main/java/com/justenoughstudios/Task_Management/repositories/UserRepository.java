package com.justenoughstudios.Task_Management.repositories;

import com.justenoughstudios.Task_Management.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

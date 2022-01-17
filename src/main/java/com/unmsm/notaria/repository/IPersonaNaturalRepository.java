package com.unmsm.notaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unmsm.notaria.model.PersonaNatural;

@Repository
public interface IPersonaNaturalRepository extends JpaRepository<PersonaNatural, Long>{

}

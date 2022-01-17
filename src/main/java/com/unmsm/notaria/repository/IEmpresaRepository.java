package com.unmsm.notaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unmsm.notaria.model.Empresa;

@Repository
public interface IEmpresaRepository extends JpaRepository<Empresa, Long>{

}

package com.idat.EC02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.idat.EC02.model.Bodega;

@Repository
public interface BodegaRepository extends JpaRepository<Bodega, Integer>{
}
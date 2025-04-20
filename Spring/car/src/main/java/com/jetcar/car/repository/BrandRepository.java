package com.jetcar.car.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jetcar.car.model.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {
}

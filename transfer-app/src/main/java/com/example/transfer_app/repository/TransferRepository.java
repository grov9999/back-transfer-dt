package com.example.transfer_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.transfer_app.entity.TransferEntity;

@Repository
public interface TransferRepository extends JpaRepository<TransferEntity, Long>{

}

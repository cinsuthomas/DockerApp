package com.ms.batchservice.repository;

import com.ms.batchservice.dto.BatchDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatchRepository extends JpaRepository <BatchDetails,Integer>{


}

package com.ms.batchservice.service;

import com.ms.batchservice.dto.BatchDetails;
import com.ms.batchservice.repository.BatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BatchDataService {

    @Autowired
    BatchRepository batchRepository;

    public Optional<BatchDetails> getBatchStatus(Integer batchId) {

        return batchRepository.findById (batchId);
    }
}

package com.ms.batchservice.controller;

import com.ms.batchservice.dto.BatchDetails;
import com.ms.batchservice.service.BatchDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/batch")
public class BatchController {

    String warningMessage = null;

    @Autowired
    BatchDataService batchDataService;

    @GetMapping("/{batchId}/status")
    public String getBatchStatus(@PathVariable("batchId") Integer batchId) {
        Optional<BatchDetails> batchDetails = batchDataService.getBatchStatus (batchId);
        return "Status is <b>" + batchDetails.get ().getBatchStatus () + "</b>";
    }
    @GetMapping("/")
    public String health() {
        return "Batch Service is running..";
    }
}

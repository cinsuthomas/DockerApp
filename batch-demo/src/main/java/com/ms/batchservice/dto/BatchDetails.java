package com.ms.batchservice.dto;

import javax.persistence.*;

@Entity
@Table(name = "ir_claim_batch_status")
public class BatchDetails {

    @Id
    @Column(name = "claim_batch_id")
    private Integer batchId;

    @Column(name = "status")
    private String batchStatus;

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public String getBatchStatus() {
        return batchStatus;
    }

    public void setBatchStatus(String batchStatus) {
        this.batchStatus = batchStatus;
    }
}


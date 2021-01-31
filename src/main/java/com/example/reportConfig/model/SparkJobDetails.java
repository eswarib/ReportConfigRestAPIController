//package com.example.reportConfig.model;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.vladmihalcea.hibernate.type.json.JsonStringType;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedDate;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//import javax.persistence.*;
//import javax.validation.constraints.NotBlank;
//
//import java.util.Date;
//
//import org.hibernate.annotations.Type;
//import org.hibernate.annotations.TypeDef;
//import org.hibernate.annotations.TypeDefs;
//import org.springframework.boot.configurationprocessor.json.JSONObject;
//import org.springframework.boot.configurationprocessor.json.JSONStringer;
//
//
//
////@EntityListeners(AuditingEntityListener.class)
////@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
//        allowGetters = true)
//
//
////enum EventType{NotReady_Offline,Ready_Ready,NotReady_Wrapup,NotReady_Busy};
////enum ReportObjectType{Agent,Queue,Call,EMail,WhatsApp};
//
//public class SparkJobDetails {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//
//    @NotBlank
//    @Column(nullable = false)
//    private Long ruleId;
//
//    @NotBlank
//    @Column(nullable = false)
//    private String jobId;
//
//
//    //@Column(nullable = false)
//    @Temporal(TemporalType.TIMESTAMP)
//    @LastModifiedDate
//    private Date changedAt;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getRuleId() {
//        return ruleId;
//    }
//
//    public void setRuleId(Long ruleId) {
//        this.ruleId = ruleId;
//    }
//
//    public String getJobId() {
//        return jobId;
//    }
//
//    public void setJobId(String environment) {
//        this.jobId = jobId;
//    }
//
//
//    public Date getChangedAt() {
//        return changedAt;
//    }
//
//    public void setChangedAt(Date changedAt) {
//        this.changedAt = changedAt;
//    }
//}
//

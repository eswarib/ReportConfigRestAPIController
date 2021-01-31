package com.example.reportConfig.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vladmihalcea.hibernate.type.json.JsonStringType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.util.Date;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.boot.configurationprocessor.json.JSONStringer;


@Entity
@Table(name = "Report")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, 
        allowGetters = true)

@TypeDef(name = "json", typeClass = JsonStringType.class)

//enum EventType{NotReady_Offline,Ready_Ready,NotReady_Wrapup,NotReady_Busy};
//enum ReportObjectType{Agent,Queue,Call,EMail,WhatsApp};

public class Report {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ReportId;

	
	@NotBlank
	@Column(nullable = false)
	private String Tenant;
	
	@NotBlank
	@Column(nullable = false)
	private String Environment;
	
	@NotBlank
	private String StartEvent;
	
	@NotBlank
	private String EndEvent;
	
	private String MetricType;                         // - Sum, Count, Max, Min, Avg

	private String ReportField;                        //- column name,                 // e.g duration
	
/*
    @Type(type="json")
    @Column(columnDefinition = "json")
	private String filter;
*/	
	private int TimeInterval;                              // aggregation interval, 15 min/30/24 hours/custom
	private String ObjectType;               //- Agent / Queue / Call / Email / WhatsApp

	//@Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
    private Date CreatedAt;

	//@Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
    private Date UpdatedAt;
	
	public Long getId() {
	   return ReportId;
	}
	
	public void setId(Long id) {
		this.ReportId = id;
	}
	
	public String getTenant() {
		return Tenant;
	}
	
	public void setTenant(String tenant) {
		this.Tenant = tenant;
	}
	
	public String getEnvironment() {
		return Environment;
	}
	
	public void setEnvironment(String environment) {
		this.Environment = environment;
	}
	
	public String getStartEvent() {
		return StartEvent;
	}
	
	public void setStartEvent(String startEvent) {
		this.StartEvent = startEvent;
	}
	
	public String getEndEvent() {
		return EndEvent;
	}
	
	public void setEndEvent(String endEvent) {
		this.EndEvent = endEvent;
	}
	
	public String getMetricType() {
		return MetricType;
	}
	
	public void setMetricType(String metricType) {
		this.MetricType = metricType;
	}
	
	public String getReportField() {
		return ReportField;
	}
	
	public void setReportField(String reportField) {
		this.ReportField = reportField;
	}
/*			
	public String getFilter() {
		return filter;
	}
	
	public void setFilter(String filter) {
		this.filter = filter;
	}
*/	
	public int getTimeInterval() {
		return TimeInterval;
	}
	
	public void setTimeInterval(int timeInterval) {
		this.TimeInterval = timeInterval;
	}
	
	public String getObjectType() {
		return ObjectType;
	}
	
	public void setObjectType(String objectType) {
		this.ObjectType = objectType;
	}
	
	public Date getCreatedAt() {
		return CreatedAt;
	}
	
	public void setCreatedAt(Date createdAt) {
		this.CreatedAt = createdAt;
	}
	
	public Date getUpdatedAt() {
		return UpdatedAt;
	}
	
	public void setUpdatedAt(Date updatedAt) {
		this.UpdatedAt = updatedAt;
	}
}


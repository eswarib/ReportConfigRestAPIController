package com.example.reportConfig.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reportConfig.model.Report;
import com.example.reportConfig.repository.ReportRepository;
import com.example.reportConfig.exception.*;

@RestController
@RequestMapping("/config")
public class ReportConfigController {
	
	@Autowired
    ReportRepository reportRepository;


	//create a new report
	@PostMapping("/reports")
	public Report createReport(@Valid @RequestBody Report reportConfig) {
		Report newReport = null;
		try {
			newReport = reportRepository.save(reportConfig);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return newReport;
	}
	//delete a report
	@DeleteMapping("/reports/{id}")
	public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long configId) {
	    Report reportconfig = reportRepository.findById(configId)
	            .orElseThrow(() -> new ResourceNotFoundException("report", "id", configId));

	    reportRepository.delete(reportconfig);

	    return ResponseEntity.ok().build();
	}

	//get a existing report configurations for the given report id
	@GetMapping("/report/{id}")
	public Report getReportConfig(@PathVariable(value = "id") Long configId) {

		return reportRepository.findById(configId).get();
	}

	//get all existing report configurations
	@GetMapping("/reports")
	public List<Report> getAllReportConfig() {
		return reportRepository.findAll();
	}
	

}

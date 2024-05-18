package com.jwt.springBoot.JWTEx.controller;


import com.jwt.springBoot.JWTEx.entity.Applicant;
import com.jwt.springBoot.JWTEx.repository.ApplicantRepository;
import com.jwt.springBoot.JWTEx.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applicant")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class ApplicantController {

	@Autowired
	ApplicantService applicantService;
	
	@Autowired
	ApplicantRepository applicantRepository;
	
	@PostMapping("/post")
	public Applicant post(@RequestBody Applicant applicant) {
		return applicantService.post(applicant);
	}
	
	@GetMapping("/get/{id}")
	public Applicant getById(@PathVariable int id) {
		return applicantService.getById(id);
	}
	
	@GetMapping("/getall")
	public List<Applicant> getAll() {
		return applicantService.getAll();
	}
	
//	@PutMapping("/update")
//	public Applicant update(@RequestBody Applicant applicant) {
//		return applicantService.update(applicant);
//	}
	
	@PutMapping("/update/{id}")
	Applicant update(@RequestBody Applicant applicant, @PathVariable int id) {
        return applicantRepository.findById(id)
                .map(appLICANT -> {
                	appLICANT.setApplicantName(applicant.getApplicantName());
                	appLICANT.setApplicantUsername(applicant.getApplicantUsername());
                	appLICANT.setApplicantPassword(applicant.getApplicantPassword());
                	appLICANT.setApplicantEmail(applicant.getApplicantEmail());
                	appLICANT.setApplicantPhone(applicant.getApplicantPhone());
                	appLICANT.setApplicantNid(applicant.getApplicantNid());
                	appLICANT.setApplicantDesignation(applicant.getApplicantDesignation());
                	appLICANT.setApplicantWorkplace(applicant.getApplicantWorkplace());
                    return applicantRepository.save(appLICANT);
                })
                .orElseGet(() -> {
                	applicant.setApplicant_id(id);
                    return applicantRepository.save(applicant);
                });
    }
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		return applicantService.delete(id);
	}
	
	@PostMapping("/postall")
	public List<Applicant> postAll(@RequestBody List<Applicant> list) {
		return applicantService.postAll(list);
	}
	
	@GetMapping("/getcount")
	public Integer getCount() {
		Integer count = applicantRepository.countAll();
		return  count;
	}
}

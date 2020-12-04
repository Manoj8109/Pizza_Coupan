package com.onlinepizza.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onlinepizza.model.Coupan;
import com.onlinepizza.service.ICoupanService;

@RestController
@RequestMapping("/coupans")
public class CoupanController {

	@Autowired
	ICoupanService service;

	@PostMapping("/create") // http://localhost:1205/coupans/create
	public ResponseEntity<Boolean> addCoupan(@Valid @RequestBody Coupan coupan) {
		service.addCoupan(coupan);
		ResponseEntity<Boolean> responseEntity = new ResponseEntity<Boolean>(true, HttpStatus.OK);
		return responseEntity;
	}

	@PutMapping("/update") // http://localhost:1205/coupans/update
	public ResponseEntity<Boolean> editCoupan(@Valid @RequestBody Coupan coupan) {
		coupan = service.editCoupan(coupan);
		ResponseEntity<Boolean> responseEntity = new ResponseEntity<Boolean>(true, HttpStatus.OK);
		return responseEntity;
	}

	@GetMapping("/find/{id}") // http://localhost:1205/coupans/find/
	public Optional<Coupan> getCoupanById(@PathVariable("id") Integer id) {
		Optional<Coupan> entity = service.getCoupanById(id);
		return entity;
	}

	@GetMapping("/all") // http://localhost:1205/coupans/all
	public ResponseEntity<List<Coupan>> viewCoupans() {
		List<Coupan> list = service.viewCoupans();
		return new ResponseEntity<List<Coupan>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/delete") // http://localhost:1205/coupans/delete?id=
	public String deleteCoupan(@RequestParam Integer id) {
		service.deleteCoupan(id);
		return "Deleted Coupan";
	}
}
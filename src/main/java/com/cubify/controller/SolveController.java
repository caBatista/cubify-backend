package com.cubify.controller;

import com.cubify.dto.SolveRequest;
import com.cubify.dto.SolveResponse;
import com.cubify.service.SolveService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/solve")
public class SolveController {
	@Autowired
	SolveService solveService;

	@GetMapping
	public String helloWorld(){
		return "Hello World!";
	}
	
	@PostMapping()
	public ResponseEntity<SolveResponse> saveSolve(@RequestBody @Valid SolveRequest solveDTO) {
		var response = solveService.create(solveDTO);
		
		return ResponseEntity.ok(response);
	}
}

package com.cubify.service;

import com.cubify.dto.SolveRequest;
import com.cubify.dto.SolveResponse;
import com.cubify.model.Solve;
import com.cubify.repository.SolveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SolveService {
	@Autowired
	SolveRepository solveRepository;
	
	public SolveResponse create(SolveRequest solveDTO) {
		var solve = Solve.builder()
				.userId(solveDTO.userId())
				.time(solveDTO.time())
				.scramble(solveDTO.scramble())
				.valid(solveDTO.valid())
				.build();
		
		solveRepository.save(solve);
		
		return new SolveResponse(solve);
	}
	
	public Page<SolveResponse> findAll(Pageable pageable) {
		var solves = solveRepository.findAll(pageable);
		
		return solves.map(SolveResponse :: new);
	}
}

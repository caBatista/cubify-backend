package com.cubify.dto;

import com.cubify.model.Solve;

import java.time.LocalTime;

public record  SolveResponse(
		long userId,
		LocalTime time,
		String scramble,
		boolean valid
) {
	public SolveResponse(Solve solve) {
		this(
				solve.getUserId(),
				solve.getTime(),
				solve.getScramble(),
				solve.isValid()
		);
	}
}

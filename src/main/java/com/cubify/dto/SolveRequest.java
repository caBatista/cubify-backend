package com.cubify.dto;

import com.cubify.config.LocalTimeDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalTime;

public record  SolveRequest(
	@NotNull
	long userId,
	
	@NotNull
	@JsonDeserialize(using = LocalTimeDeserializer.class)
	LocalTime time,
	
	@NotBlank
	String scramble,
	
	@NotNull
	boolean valid
) {
}

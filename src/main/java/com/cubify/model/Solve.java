package com.cubify.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;

@Entity
@Table(name="solves")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Solve {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private long userId;
	
	private LocalTime time;
	
	private String scramble;
	
	private boolean valid;
}

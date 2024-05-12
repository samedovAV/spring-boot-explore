package com.samedov.springbootexplore.dto;

import jakarta.validation.constraints.NotEmpty;

public record ReferenceDto(
		Integer id,
		@NotEmpty
		String name
) {
}

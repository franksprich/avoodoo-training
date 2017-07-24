package com.avoodoo.example.server.rest.error;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Representing an error from the bean validation how it will be delivered to the caller.
 * 
 * @author frank
 *
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class ValidationError extends AbstractError {
	
	private String messageTemplate;
	private String message;
	private String path;
	private String invalidValue;

}

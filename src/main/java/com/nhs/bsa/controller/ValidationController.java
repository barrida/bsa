package com.nhs.bsa.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.net.URI;

import com.nhs.bsa.entity.RegularAmount;
import com.nhs.bsa.repository.BSARepository;
import com.nhs.bsa.validator.AmountConstraintValidator;

/**
 * 
 * @author suleyman.yildirim
 *
 */

@RestController
@RequestMapping("/amount")
public class ValidationController {

	private BSARepository bsaRepository;

	public ValidationController(BSARepository bsaRepository) {
		this.bsaRepository = bsaRepository;
	}

	@PostMapping
	public ResponseEntity<?> validateAmount(@RequestBody @Valid RegularAmount income) {
        return ResponseEntity.created(URI.create("/amount/25000")).body("1");
	}
	
}

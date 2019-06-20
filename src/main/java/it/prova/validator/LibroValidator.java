package it.prova.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import it.prova.dto.AutoreDTO;
import it.prova.dto.LibroDTO;

public class LibroValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return LibroDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object arg0, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "titolo", "required", "Campo obbligatorio.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "genere", "required", "Campo obbligatorio.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dataPubblicazione", "required", "Campo obbligatorio.");
//		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nickname", "required", "Campo obbligatorio.");

	}
}

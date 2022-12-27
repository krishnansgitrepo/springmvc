package org.example.app.springvalidator;

import org.example.app.dto.ContactDto;
import org.example.app.dto.UserRegisterDto;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class EmailValidator implements Validator {


    @Override
    public boolean supports(Class<?> clazz) {
        return UserRegisterDto.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "contactDto.emailAddress", "emailaddress.empty");

        UserRegisterDto userRegisterDto = (UserRegisterDto) target;
        String email = userRegisterDto.getContactDto().getEmailAddress();
        if (!email.toUpperCase().endsWith("SELENIUMEXPRESS.COM")) {
           errors.rejectValue("contactDto.emailAddress", "emailAddress.invalid", "should be a selenium address");
        }
    }
}

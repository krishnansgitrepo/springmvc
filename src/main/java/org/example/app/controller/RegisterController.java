package org.example.app.controller;

import org.example.app.PropEditor.NamePropEditor;
import org.example.app.dto.UserRegisterDto;
import org.example.app.springvalidator.EmailValidator;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class RegisterController {

    @RequestMapping("/register")
    public String registerUser(@ModelAttribute("userRegistration") UserRegisterDto userRegisterDto) {
        userRegisterDto.setName("register name");
        userRegisterDto.setUserName("default_user");
        return "registerform";
    }

    @RequestMapping("/registerme")
    public String registerResult(@Valid @ModelAttribute("userRegistration")UserRegisterDto userRegisterDto, BindingResult bindingResult) {
        System.out.println(userRegisterDto.getUserName());
        if (bindingResult.hasErrors()) {
            System.out.println("errors found");
            List<ObjectError> errors = bindingResult.getAllErrors();
            for(ObjectError err: errors) {
                System.out.println(err);
            }
            return "registerform";
        }
        return "registerresult";
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, "name", stringTrimmerEditor);

        NamePropEditor namePropEditor = new NamePropEditor();
        webDataBinder.registerCustomEditor(String.class, "name", namePropEditor);

        //add the spring validator
        webDataBinder.addValidators(new EmailValidator());

    }
}

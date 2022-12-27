package org.example.app.controller;

import org.example.app.PropEditor.NamePropEditor;
import org.example.app.dto.UserInfoDto;
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

import javax.naming.NameAlreadyBoundException;
import javax.validation.Valid;
import java.util.List;

@Controller
public class LoveController {
    @RequestMapping("/test")
    public String getTested() {
        System.out.println("In home controller..");
        return "test";
    }

    @RequestMapping("/home")
    public String getHome(@ModelAttribute("userInfo") UserInfoDto userInfoDto) {
        return "home";
    }

    /*
    ModelAttribute creates the model object
    It also creates a UserInfoDto object and puts it in the model
    */

    @RequestMapping("/calculate")
    public String getLoveCalculated(@Valid @ModelAttribute("userInfo") UserInfoDto userInfoDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println("errors found");
            List<ObjectError> errors = bindingResult.getAllErrors();
            for(ObjectError err: errors) {
                System.out.println(err);
            }
            return "home";
        }
        return "loveresult";
    }








}

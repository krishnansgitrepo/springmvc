package org.example.app.controller;

import org.example.app.dto.UserInfoDto;
import org.example.app.dto.UserRegisterDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

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
            return "home";
        }
        return "loveresult";
    }

    @RequestMapping("/register")
    public String registerUser(@ModelAttribute("userRegistration") UserRegisterDto userRegisterDto) {
        userRegisterDto.setName("register name");
        userRegisterDto.setUserName("default_user");
        return "registerform";
    }

    @RequestMapping("/registerme")
    public String registerResult(@Valid  @ModelAttribute("userRegistration")UserRegisterDto userRegisterDto, BindingResult bindingResult) {
        System.out.println(userRegisterDto.getUserName());
        if (bindingResult.hasErrors()) {
            System.out.println("errors found");
        }
        return "registerresult";
    }


}

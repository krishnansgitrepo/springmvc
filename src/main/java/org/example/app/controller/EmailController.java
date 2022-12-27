package org.example.app.controller;

import org.example.app.dto.EmailDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmailController {

    @RequestMapping("/showemailshare/{userName}")
    public String showEmailShare(@PathVariable("userName") String userName, Model model) {
        model.addAttribute("userName", userName.toUpperCase());
        model.addAttribute("emailDto", new EmailDto());
        return "emailshareform";
    }

    @RequestMapping("/process-email")
    public String processEmailShare(@ModelAttribute("emailDto")EmailDto emailDto) {
        return "emailshareresult";
    }




}

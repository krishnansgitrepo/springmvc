package org.example.app.controller;

import org.example.app.dto.PaymentDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PaymentController {

    @RequestMapping("/showpaymentform")
    private String showPaymentForm(@ModelAttribute("paymentDto") PaymentDto paymentDto) {
        return "paymentform";
    }

    @RequestMapping("/processpayment")
    private String processPayment(@ModelAttribute("paymentDto") PaymentDto paymentDto) {
        System.out.println(paymentDto);
        return "paymentresult";
    }


}

package dev.sandeep.PaymentService.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RazorpayWebhookController {

//    @Value("${razorPay.webhook.secret}")
//    private String razorPayWebhookSecret;

    @PostMapping("/rzp/webhook")
    public ResponseEntity<String> webhook(){
        System.out.println("RazorPay Webhook URL is called successfully");
        return ResponseEntity.ok("OK");
    }
}

package dev.sandeep.PaymentService.controller;

import com.razorpay.RazorpayException;
import dev.sandeep.PaymentService.dto.PaymentRequestDTO;
import dev.sandeep.PaymentService.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;
    @PostMapping("/payment") //this api will be called from order service
    public ResponseEntity<String> doPayment(@RequestBody PaymentRequestDTO paymentRequestDTO) throws RazorpayException {
    //validation for DTO
        return ResponseEntity.ok(paymentService.generatePaymentLink(paymentRequestDTO));
    }

    @GetMapping("/hello/{name}")
    public ResponseEntity<String> helloFromLocalTunnel(@PathVariable("name") String name){
        System.out.println("Hello From Akash's Mac : " + name + " You keep on learning and growing.");
        return ResponseEntity.ok("Hello From Akash's Mac : " + name + " You keep on learning and growing.");
    }
}

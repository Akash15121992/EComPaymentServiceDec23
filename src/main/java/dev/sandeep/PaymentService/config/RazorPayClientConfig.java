package dev.sandeep.PaymentService.config;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RazorPayClientConfig {

    @Value("${razorpay.client.key}")
    private String razorPayClientKey;
    @Value("${razorpay.client.secret}")
    private String razorPayClientSecret;
    @Bean
    public RazorpayClient getRazorPayClient() throws RazorpayException {
        RazorpayClient razorpay = new RazorpayClient(razorPayClientKey, razorPayClientSecret);
        return razorpay;
    }
}

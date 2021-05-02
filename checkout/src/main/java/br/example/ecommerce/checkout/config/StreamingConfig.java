package br.example.ecommerce.checkout.config;

import br.example.ecommerce.checkout.stream.CheckoutCreatedSource;
import br.example.ecommerce.checkout.stream.PaymentPaidSink;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(value = {
        CheckoutCreatedSource.class,
        PaymentPaidSink.class
})
public class StreamingConfig {
}
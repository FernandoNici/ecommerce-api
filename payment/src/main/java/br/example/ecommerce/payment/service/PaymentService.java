package br.example.ecommerce.payment.service;

import br.example.ecommerce.payment.entity.PaymentEntity;
import com.hatanaka.ecommerce.checkout.event.CheckoutCreatedEvent;

import java.util.Optional;

public interface PaymentService {

    Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);
}

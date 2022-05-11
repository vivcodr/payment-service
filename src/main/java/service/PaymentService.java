package service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Payment;
import repository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	public PaymentRepository paymentRepo;
	
	public Payment doPayment(Payment payment) {
		payment.setTransactionId(UUID.randomUUID().toString());
		return paymentRepo.save(payment);
	}
}

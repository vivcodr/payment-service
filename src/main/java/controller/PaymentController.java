package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Payment;
import service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	public PaymentService paymentService;
	
	@PostMapping("/dopayment")
	public Payment doPayment(@RequestBody Payment payment) {
		return paymentService.doPayment(payment);
	}
}

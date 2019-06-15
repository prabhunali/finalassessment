/**
 * 
 */
package com.mentorondemand.payments.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mentorondemand.payments.repositorydao.PaymentRepositoryDao;

/**
 * @author javaibm04
 *
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	PaymentRepositoryDao paymentRepositoryDao;
	
	@GetMapping("/confirmUser")
	public List<PaymentRepositoryDao> makePayment(){
		
		return null; //TODO
	}

}

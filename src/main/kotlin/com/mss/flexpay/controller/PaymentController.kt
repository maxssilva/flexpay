package com.mss.flexpay.controller

import com.mss.flexpay.dtos.PaymentRequest
import com.mss.flexpay.dtos.PaymentResponse
import com.mss.flexpay.model.Payment
import com.mss.flexpay.service.PaymentService

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestBody
import java.lang.reflect.Parameter

@RestController
class PaymentController{
lateinit var paymentService: PaymentService

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createPayment(
        @RequestBody paymentRequest: PaymentRequest
    ): ResponseEntity<PaymentResponse> {
  /*implementação pausada para criação da entiddade Payer*/
        return  paymentService.createPayment(payment)

    }
}
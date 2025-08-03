package com.mss.flexpay.controller

import com.mss.flexpay.dtos.PaymentRequest
import com.mss.flexpay.model.Payment
import com.mss.flexpay.service.PaymentService

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.http.HttpStatus

@RestController
class PaymentController{
lateinit var paymentService: PaymentService

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createPayment(
        paymentRequest: PaymentRequest
    ): Payment{
        val payment = paymentRequest.paymentRequestToBO(
            id = paymentRequest.id,
            amount = paymentRequest.amount,
            payerId = paymentRequest.payerId
        )
  /*implementação pausada para criação da entiddade Payer*/
        return  paymentService.createPayment(payment)

    }
}
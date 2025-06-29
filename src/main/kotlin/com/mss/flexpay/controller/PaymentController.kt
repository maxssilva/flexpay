package com.mss.flexpay.controller

import com.mss.flexpay.dtos.PaymentRequest
import com.mss.flexpay.enums.PaymentStatus
import com.mss.flexpay.model.Payment
import com.mss.flexpay.service.PaymentService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.net.http.HttpResponse

@RestController
class PaymentController(
    val paymentService: PaymentService
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createPayment(
        paymentRequest: PaymentRequest
    ) {
        val payment = paymentRequest.paymentRequestToBO(
            id = paymentRequest.id,
            amount = paymentRequest.amount,
            payerId = paymentRequest.payerId
        )
  /*implementação pausada para criação da entiddade Payer*/
        return  null /*paymentService.createPayment(payment)*/

    }
}
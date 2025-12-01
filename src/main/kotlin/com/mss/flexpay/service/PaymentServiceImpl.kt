package com.mss.flexpay.service

import com.mss.flexpay.dtos.PaymentRequest
import com.mss.flexpay.model.Payment
import org.springframework.stereotype.Service

@Service
class PaymentServiceImpl: PaymentService {
    override fun createPayment(
        paymentRequest: PaymentRequest
    ): Payment {
        val payment: paymentRequest.toNewPayment()
    }

    override fun getPaymentById(id: String): Payment? {
        TODO("Not yet implemented")
    }

    override fun getAllPayments(): List<Payment> {
        TODO("Not yet implemented")
    }

    override fun updatePayment(
        id: String,
        payment: Payment
    ): Payment {
        TODO("Not yet implemented")
    }

    override fun deletePayment(id: String): Boolean {
        TODO("Not yet implemented")
    }
}
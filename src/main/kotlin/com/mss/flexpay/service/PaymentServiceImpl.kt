package com.mss.flexpay.service

import com.mss.flexpay.model.Payment

class PaymentServiceImpl: PaymentService {
    override fun createPayment(
        payment: Payment
    ): Payment {
        TODO("Not yet implemented")
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
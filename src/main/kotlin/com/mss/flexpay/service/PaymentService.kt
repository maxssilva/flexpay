package com.mss.flexpay.service

import com.mss.flexpay.model.Payment

interface PaymentService {
    fun createPayment(
        payment: Payment
    ): Payment

    fun getPaymentById(id: String): Payment?

    fun getAllPayments(): List<Payment>

    fun updatePayment(id: String, payment: Payment): Payment

    fun deletePayment(id: String): Boolean
}
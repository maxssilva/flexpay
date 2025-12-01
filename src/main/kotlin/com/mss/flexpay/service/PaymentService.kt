package com.mss.flexpay.service

import com.mss.flexpay.dtos.PaymentRequest
import com.mss.flexpay.model.Payment

interface PaymentService {
    fun createPayment(
       paymentRequest: PaymentRequest
    ): Payment

    fun getPaymentById(id: String): Payment?

    fun getAllPayments(): List<Payment>

    fun updatePayment(id: String, payment: Payment): Payment

    fun deletePayment(id: String): Boolean
}
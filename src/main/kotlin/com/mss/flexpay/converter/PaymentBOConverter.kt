package com.mss.flexpay.converter

import com.mss.flexpay.dtos.PaymentRequest
import com.mss.flexpay.enums.PaymentStatus
import com.mss.flexpay.model.Payment
import java.util.UUID

fun PaymentRequest.toNewPayment(
    id: UUID? = null,
    amount: Double,
    payerId: String?
): Payment {
    return Payment(
        id = (id ?: UUID.randomUUID().toString()) as String,
        amount = amount,
        payerId = payerId,
        status = PaymentStatus.PENDING,
        createdAt = java.time.LocalDateTime.now().toString()
    )
}
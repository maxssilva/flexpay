package com.mss.flexpay.dtos

import com.mss.flexpay.enums.PaymentStatus
import com.mss.flexpay.model.Payment
import java.time.LocalDateTime
import java.util.UUID

data class PaymentRequest(
    val id: String? = null,
    val amount: Double,
    val payerId: String?
) {
    fun paymentRequestToBO(
        id: String?,
        amount: Double?,
        payerId: String?,
    ): Payment {
        return Payment(
            id ?: UUID.randomUUID().toString(),
            amount,
            PaymentStatus.PENDING,
            payerId,
            LocalDateTime.now().toString()
        )
    }
}
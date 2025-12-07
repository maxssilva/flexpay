package com.mss.flexpay.dtos

import com.mss.flexpay.enums.PaymentStatus
import com.mss.flexpay.model.Payment
import java.time.LocalDateTime
import java.util.UUID

data class PaymentRequest(
    val amount: Double,
    val payerId: String?
)
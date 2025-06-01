package com.mss.flexpay.dtos

import com.mss.flexpay.enums.PaymentStatus
import com.mss.flexpay.model.Payment
import org.hibernate.id.uuid.UuidGenerator
import java.util.UUID

class PaymentRequest {
    private var id: String? = null
    private var amount: Double? = null
    private var status: PaymentStatus? = null
    private var payerId: String? = null
    private var createdAt: String? = null

    private fun paymentRequestToBO(  id: String?,
                                     amount: Double?,
                                     status: PaymentStatus?,
                                     payerId: String?,
                                     createdAt: String?): Payment {
        val payment = Payment()
        payment.id = id?.takeIf { it.isNotBlank() } ?: UUID.randomUUID().toString().toString() else id)
        payment.amount = amount
        payment.status = status
        payment.payerId = payerId
        payment.createdAt = createdAt
        return payment
    }
}
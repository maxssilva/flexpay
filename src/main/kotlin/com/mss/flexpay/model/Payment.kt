package com.mss.flexpay.model

import com.mss.flexpay.enums.PaymentStatus
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "payment")
class Payment(id: String, amount: Double?, status: PaymentStatus, payerId: String?, createdAt: String) {
    @Id
    var id: String? = null
    var amount: Double? = null
    var status: PaymentStatus? = null
    var payerId: String? = null
    var createdAt: String? = null
}
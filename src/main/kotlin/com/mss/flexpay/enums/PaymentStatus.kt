package com.mss.flexpay.enums

enum class PaymentStatus {
    PENDING,
    COMPLETED,
    FAILED,
    REFUNDED,
    CANCELLED;

    companion object {
        fun fromString(status: String): PaymentStatus? {
            return PaymentStatus.entries.find { it.name.equals(status, ignoreCase = true) }
        }
    }
}
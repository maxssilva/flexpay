package com.mss.flexpay.dtos

data class PaymentResponse(
    val id: String,
    val amount: Double,
    val status: String,
    val payerId: String?,
    val createdAt: String
) {

}
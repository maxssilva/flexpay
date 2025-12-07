package com.mss.flexpay.repository

import com.mss.flexpay.model.Payment
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.springframework.stereotype.Repository

@Repository
class PaymentJpaRepository(
    private val paymentJpaRepository: PaymentRepository
) {
    suspend fun save(payment: Payment): Payment = withContext(Dispatchers.IO) {
        paymentJpaRepository.save(payment)
    }
}
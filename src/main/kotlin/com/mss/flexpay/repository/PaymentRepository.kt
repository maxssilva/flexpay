package com.mss.flexpay.repository

import com.mss.flexpay.model.Payment
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface PaymentRepository: JpaRepository<Payment, UUID> {
}
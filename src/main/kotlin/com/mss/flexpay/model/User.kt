package com.mss.flexpay.model

import com.mss.flexpay.enums.UserType
import UUIDv7.UuidCreator
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table


@Entity
@Table(name = "users")
class User(
    @Id
    val id: String? = UuidCreator.getTimeOrderedEpoch().toString(),
    val name: String,
    val userType: UserType,
    val email: String
)

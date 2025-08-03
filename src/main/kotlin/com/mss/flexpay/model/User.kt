package com.mss.flexpay.model

import com.mss.flexpay.enums.UserType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.UUID


@Entity
@Table(name = "users")
class User(
    @Id
    @Column(columnDefinition = "uuid")
    val id: UUID? = null,
    val name: String,
    @Enumerated(EnumType.STRING)
    val userType: UserType,
    val email: String
)

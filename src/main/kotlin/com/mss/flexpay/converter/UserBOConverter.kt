package com.mss.flexpay.converter

import com.mss.flexpay.dtos.UserRequest
import com.mss.flexpay.enums.UserType
import com.mss.flexpay.model.User
import java.util.UUID

fun UserRequest.toNewUser(
    name: String? = null,
    userType: UserType,
    email: String? = null
): User {
    return User(
        id = UUID.randomUUID(),
        name = name ?: this.name,
        userType = userType,
        email = email ?: this.email
    )
}

fun UserRequest.toUpdateUser(
    id: UUID
): User {
    return User(
        id = id,
        name = this.name,
        userType = this.userType,
        email = this.email
    )
}
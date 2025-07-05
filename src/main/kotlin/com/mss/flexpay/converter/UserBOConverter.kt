package com.mss.flexpay.converter

import com.mss.flexpay.dtos.UserRequest
import com.mss.flexpay.enums.UserType
import com.mss.flexpay.model.User

fun UserRequest.toBO(
    id: Long? = null,
    name: String? = null,
    userType: UserType,
    email: String? = null
): User {
    return User(
        id = id ?: this.id,
        name = name ?: this.name,
        userType = userType,
        email = email ?: this.email
    )
}
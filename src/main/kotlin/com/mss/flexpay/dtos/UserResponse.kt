package com.mss.flexpay.dtos

import com.mss.flexpay.model.User

data class UserResponse (
    val id: String,
    val name: String,
    val userType: String,
    val email: String
)
fun User.toResponse(): UserResponse {
    return UserResponse(
        id = this.id.toString(),
        name = this.name,
        userType = this.userType.name,
        email = this.email
    )
}
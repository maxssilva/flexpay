package com.mss.flexpay.converter

import com.mss.flexpay.dtos.UserRequest
import com.mss.flexpay.model.User
import java.util.UUID

fun UserRequest.toNewUser(): User = User(
        id = UUID.randomUUID(),
        userType = this.userType,
        email = this.email,
        name = this.name,
    )

fun UserRequest.toUpdateUser(): User = User(
        id = this.id,
        userType = this.userType,
        email = this.email,
        name = this.name,
    )

package com.mss.flexpay.dtos

import com.mss.flexpay.enums.UserType
import com.mss.flexpay.model.User
import java.util.UUID

class UserRequest(
    val id: UUID?,
    val name: String,
    val userType: UserType,
    val email: String
)

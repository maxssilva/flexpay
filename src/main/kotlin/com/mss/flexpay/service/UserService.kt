package com.mss.flexpay.service

import com.mss.flexpay.dtos.UserRequest
import com.mss.flexpay.dtos.UserResponse
import com.mss.flexpay.model.User
import java.util.UUID

interface UserService {
    suspend fun createUser(userRequest: UserRequest): UserResponse
    suspend fun findById(id: UUID): User?
    suspend fun getAllUsers(): List<User>
    suspend fun updateUser(userRequest: UserRequest): User
    suspend fun deleteUser(id: UUID)
}
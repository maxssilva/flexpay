package com.mss.flexpay.service

import com.mss.flexpay.model.User
import java.util.UUID

interface UserService {
    suspend fun createUser(user: User): User
    suspend fun findById(id: UUID): User?
    suspend fun getAllUsers(): List<User>
    suspend fun updateUser(user: User): User
    suspend fun deleteUser(id: UUID)
}
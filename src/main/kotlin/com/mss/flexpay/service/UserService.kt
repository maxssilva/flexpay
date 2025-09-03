package com.mss.flexpay.service

import com.mss.flexpay.model.User
import java.util.UUID

interface UserService {
    fun createUser(user: User): User
    suspend fun findById(id: UUID): User?
    fun getAllUsers(): List<User>
    suspend fun updateUser(user: User): User
    fun deleteUser(id: String)
}
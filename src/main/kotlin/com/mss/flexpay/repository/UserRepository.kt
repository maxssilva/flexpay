package com.mss.flexpay.repository

import com.mss.flexpay.model.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
class UserRepository(
    private val jpaRepository: UserJpaRepository
) {
    suspend fun save(user: User): User = withContext(Dispatchers.IO) {
        jpaRepository.save(user)
    }
    suspend fun findById(id: UUID): User? = withContext(Dispatchers.IO) {
        jpaRepository.findById(id).orElse(null)
    }
    suspend fun findAll(): List<User> = withContext(Dispatchers.IO) {
        jpaRepository.findAll()
    }
    suspend fun deleteById(id: UUID) = withContext(Dispatchers.IO
    ) {
        jpaRepository.deleteById(id)
    }
    suspend fun updateUser(user: User): User = withContext(Dispatchers.IO) {
        jpaRepository.save(user)
    }
}
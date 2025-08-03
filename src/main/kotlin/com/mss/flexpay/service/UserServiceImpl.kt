package com.mss.flexpay.service

import com.mss.flexpay.model.User
import com.mss.flexpay.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService {

    @Autowired
    lateinit var userRepository: UserRepository

    override fun createUser(user: User): User {
        return userRepository.save(user)
    }

    override fun getUserById(id: String): User? {
        // Implementation for retrieving a user by ID
        TODO("Not yet implemented")
    }

    override fun getAllUsers(): List<User> {
        // Implementation for retrieving all users
        TODO("Not yet implemented")
    }

    override fun updateUser(id: String, name: String, userType: String, email: String): User {
        // Implementation for updating a user
        TODO("Not yet implemented")
    }

    override fun deleteUser(id: String) {
        // Implementation for deleting a user
        TODO("Not yet implemented")
    }
}
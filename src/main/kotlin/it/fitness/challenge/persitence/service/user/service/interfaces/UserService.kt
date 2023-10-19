package it.fitness.challenge.persitence.service.user.service.interfaces

import it.fitness.challenge.persitence.exception.UserNotFoundException
import it.fitness.challenge.persitence.service.user.dto.UserDto

interface UserService {

    @Throws(UserNotFoundException::class, Exception::class)
    fun findUserFromUsername(username: String): UserDto

}
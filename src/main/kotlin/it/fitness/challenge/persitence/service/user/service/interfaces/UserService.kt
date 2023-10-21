package it.fitness.challenge.persitence.service.user.service.interfaces

import it.fitness.challenge.persitence.exception.UserNotFoundException
import it.fitness.challenge.persitence.service.user.dto.UserPersistenceDto

interface UserService {

    @Throws(UserNotFoundException::class, Exception::class)
    fun findUserFromUsername(username: String): UserPersistenceDto

}
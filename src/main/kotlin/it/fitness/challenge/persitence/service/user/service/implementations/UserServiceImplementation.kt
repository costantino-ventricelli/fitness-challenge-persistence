package it.fitness.challenge.persitence.service.user.service.implementations

import it.fitness.challenge.persitence.repository.UserRepository
import it.fitness.challenge.persitence.exception.UserNotFoundException
import it.fitness.challenge.persitence.mapping.UserMapper
import it.fitness.challenge.persitence.service.user.dto.UserPersistenceDto
import it.fitness.challenge.persitence.service.user.service.interfaces.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImplementation @Autowired constructor(val userRepository: UserRepository,
                                                       val userMapper: UserMapper): UserService {

    override fun findUserFromUsername(username: String): UserPersistenceDto {

        return userMapper.entityToDto(userRepository.findByUsername(username)
            .orElseThrow{ UserNotFoundException() })
    }

}
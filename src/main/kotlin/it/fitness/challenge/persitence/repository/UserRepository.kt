package it.fitness.challenge.persistence.repository

import it.fitness.challenge.persitence.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository
import java.math.BigInteger
import java.util.*

@Repository
interface UserRepository: JpaRepository<UserEntity, BigInteger>, JpaSpecificationExecutor<UserEntity> {

    fun findByUsername(username: String): Optional<UserEntity>

}
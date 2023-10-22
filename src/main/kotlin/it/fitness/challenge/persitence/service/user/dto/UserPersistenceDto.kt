package it.fitness.challenge.persitence.service.user.dto

import it.fitness.challenge.persitence.commons.RuoloEnum
import java.math.BigInteger
import java.time.OffsetDateTime
import java.util.*

class UserPersistenceDto {
    
    private lateinit var id: BigInteger
    private lateinit var username: String
    private lateinit var email: String
    private lateinit var ruolo: RuoloEnum
    private lateinit var nome: String
    private lateinit var cognome: String
    private lateinit var password: String
    private lateinit var dataIscrizione: OffsetDateTime

    fun getId(): BigInteger {
        return this.id
    }

    fun setId(id: BigInteger): UserPersistenceDto {
        this.id = id
        return this;

    }

    fun getUsername(): String {
        return this.username
    }

    fun setUsername(username: String): UserPersistenceDto {
        this.username = username
        return this;
    }

    fun getEmail(): String {
        return this.email
    }

    fun setEmail(email: String): UserPersistenceDto {
        this.email = email
        return this;
    }

    fun getRuolo(): RuoloEnum {
        return this.ruolo
    }

    fun setRuolo(ruolo: RuoloEnum): UserPersistenceDto {
        this.ruolo = ruolo
        return this;
    }

    fun getNome(): String {
        return this.nome
    }

    fun setNome(nome: String): UserPersistenceDto {
        this.nome = nome
        return this;
    }

    fun getCognome(): String {
        return this.cognome
    }

    fun setCognome(cognome: String): UserPersistenceDto {
        this.cognome = cognome
        return this;
    }

    fun getPassword(): String {
        return this.password
    }

    fun setPassword(password: String): UserPersistenceDto {
        this.password = password
        return this;
    }

    fun getDataIscrizione(): OffsetDateTime {
        return this.dataIscrizione
    }

    fun setDataIscrizione(dataIscrizione: OffsetDateTime): UserPersistenceDto {
        this.dataIscrizione = dataIscrizione
        return this
    }
}
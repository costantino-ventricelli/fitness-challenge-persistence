package it.fitness.challenge.persitence.entity

import it.fitness.challenge.persitence.commons.RuoloEnum
import jakarta.persistence.*
import java.math.BigInteger
import java.time.OffsetDateTime
import java.util.*

@Entity
@Table(name = "utente")
class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "BIGINT")
    private lateinit var id: BigInteger

    @Column(name = "username", nullable = false, unique = true)
    private lateinit var username: String

    @Column(name = "email", nullable = false)
    private lateinit var email: String

    @Column(columnDefinition = "ENUM('ADMIN', 'USER', 'TRAINER')")
    @Enumerated(EnumType.STRING)
    private lateinit var ruolo: RuoloEnum

    @Column(name = "name", nullable = false)
    private lateinit var nome: String

    @Column(name = "cognome", nullable = false)
    private lateinit var cognome: String

    @Column(name = "password", nullable = false)
    private lateinit var password: String

    @Column(name = "data_iscrizione", nullable = false, columnDefinition = "DATETIME")
    private lateinit var dataIscrizione: OffsetDateTime

    fun getId(): BigInteger {
        return this.id
    }

    fun setId(id: BigInteger): UserEntity {
        this.id = id
        return this;

    }

    fun getUsername(): String {
        return this.username
    }

    fun setUsername(username: String): UserEntity {
        this.username = username
        return this;
    }

    fun getEmail(): String {
        return this.email
    }

    fun setEmail(email: String): UserEntity {
        this.email = email
        return this;
    }

    fun getRuolo(): RuoloEnum {
        return this.ruolo
    }

    fun setRuolo(ruolo: RuoloEnum): UserEntity {
        this.ruolo = ruolo
        return this;
    }

    fun getNome(): String {
        return this.nome
    }

    fun setNome(nome: String): UserEntity {
        this.nome = nome
        return this;
    }

    fun getCognome(): String {
        return this.cognome
    }

    fun setCognome(cognome: String): UserEntity {
        this.cognome = cognome
        return this;
    }

    fun getPassword(): String {
        return this.password
    }

    fun setPassword(password: String): UserEntity {
        this.password = password
        return this;
    }

    fun getDataIscrizione(): OffsetDateTime {
        return this.dataIscrizione
    }

    fun setDataIscrizione(dataIscrizione: OffsetDateTime): UserEntity {
        this.dataIscrizione = dataIscrizione
        return this
    }

}
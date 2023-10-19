package it.fitness.challenge.persitence.entity

import it.fitness.challenge.persitence.commons.RuoloBeanEnum
import jakarta.persistence.*
import java.math.BigInteger
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
    private lateinit var ruolo: RuoloBeanEnum

    @Column(name = "name", nullable = false)
    private lateinit var nome: String

    @Column(name = "cognome", nullable = false)
    private lateinit var cognome: String

    @Column(name = "password", nullable = false)
    private lateinit var password: String

    @Column(name = "data_iscrizione", nullable = false)
    private lateinit var dataIscrizione: Date

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

    fun getRuolo(): RuoloBeanEnum {
        return this.ruolo
    }

    fun setRuolo(ruolo: RuoloBeanEnum): UserEntity {
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

    fun getDataIscrizione(): Date {
        return this.dataIscrizione
    }

    fun setDataIscrizione(dataIscrizione: Date): UserEntity {
        this.dataIscrizione = dataIscrizione
        return this
    }

}
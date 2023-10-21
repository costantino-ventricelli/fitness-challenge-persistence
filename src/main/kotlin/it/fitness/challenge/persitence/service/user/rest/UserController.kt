package it.fitness.challenge.persitence.service.user.rest

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import it.fitness.challenge.persitence.exception.UserNotFoundException
import it.fitness.challenge.persitence.service.user.dto.UserPersistenceDto
import it.fitness.challenge.persitence.service.user.service.interfaces.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController @Autowired constructor(val userService: UserService) {

    @Operation(summary = "Api che restituisce le informazioni sull'utente richiesto",
        description = "Restituisce il DTO dell'utente richiesto")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "L'utente è stato individuato correttamente"),
        ApiResponse(responseCode = "404", description = "L'utente non è stato trovato all'interno del sistema"),
        ApiResponse(responseCode = "500", description = "Si è verificato un errore di natura generica")
    ])
    @GetMapping("/find/{username}", produces = [MediaType.APPLICATION_JSON_VALUE],
        consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun findByUsername(@PathVariable(name = "username") username: String): ResponseEntity<UserPersistenceDto> {
        val response: ResponseEntity<UserPersistenceDto> = try {
            ResponseEntity<UserPersistenceDto>(userService.findUserFromUsername(username), HttpStatus.OK)
        } catch (ex: UserNotFoundException) {
            ResponseEntity(HttpStatus.NOT_FOUND)
        } catch (ex: Exception) {
            ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR)
        }
        return response
    }

}
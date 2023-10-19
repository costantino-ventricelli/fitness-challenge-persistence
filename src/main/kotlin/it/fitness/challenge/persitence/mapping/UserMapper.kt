package it.fitness.challenge.persitence.mapping

import it.fitness.challenge.persitence.entity.UserEntity
import it.fitness.challenge.persitence.service.user.dto.UserDto
import org.mapstruct.Mapper
import org.mapstruct.Mappings

@Mapper
interface UserMapper {

    @Mappings
    fun entityToDto(entity: UserEntity): UserDto

    @Mappings
    fun dtoToEntity(bean: UserDto): UserEntity

}
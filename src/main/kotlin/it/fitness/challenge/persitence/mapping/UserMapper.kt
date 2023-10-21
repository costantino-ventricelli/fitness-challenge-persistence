package it.fitness.challenge.persitence.mapping

import it.fitness.challenge.persitence.entity.UserEntity
import it.fitness.challenge.persitence.service.user.dto.UserPersistenceDto
import org.mapstruct.Mapper
import org.mapstruct.Mappings
import org.mapstruct.Named

@Mapper(componentModel = "spring")
@Named("UserMapper")
interface UserMapper {

    @Mappings
    fun entityToDto(entity: UserEntity): UserPersistenceDto

    @Mappings
    fun dtoToEntity(bean: UserPersistenceDto): UserEntity

}
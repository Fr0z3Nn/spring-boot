package ru.project.springboot.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.project.springboot.DTO.UserDTO;
import ru.project.springboot.models.User;

@Mapper
public interface UserMapper {
    UserDTO toDTO(User user);
}

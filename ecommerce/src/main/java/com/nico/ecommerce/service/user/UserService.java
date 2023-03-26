package com.nico.ecommerce.service.user;

import com.nico.ecommerce.dto.UserDTO;

import java.util.List;

public interface UserService {

    /**
     * Retourne la liste des users en base sous forme de DTO
     *
     * @return Liste de {@link UserDTO}
     */
    public List<UserDTO> getAll();

    /**
     * Sauvegarde un nouvel User en base
     *
     * @param userDTO
     */
    void postUser(UserDTO userDTO);

}

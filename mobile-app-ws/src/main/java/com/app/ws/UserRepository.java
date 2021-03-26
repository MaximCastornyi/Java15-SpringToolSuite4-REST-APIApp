package com.app.ws;

import org.springframework.data.repository.CrudRepository;

import com.app.ws.io.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

}

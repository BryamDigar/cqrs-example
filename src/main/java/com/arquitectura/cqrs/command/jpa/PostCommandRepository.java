package com.arquitectura.cqrs.command.jpa;

import com.arquitectura.cqrs.command.orm.PostCommand;
import org.springframework.data.repository.CrudRepository;

public interface PostCommandRepository extends CrudRepository<PostCommand, Long> {

}

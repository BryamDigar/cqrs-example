package com.arquitectura.cqrs.command.jpa;

import com.arquitectura.cqrs.command.orm.CommentCommand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentCommandRepository extends CrudRepository<CommentCommand, Long> {

}

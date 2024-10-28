package com.arquitectura.cqrs.command.jpa;

import com.arquitectura.cqrs.command.orm.ReactionCommand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactionCommandRepository extends CrudRepository<ReactionCommand, Long> {

}

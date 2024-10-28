package com.arquitectura.cqrs.query.jpa;

import com.arquitectura.cqrs.query.orm.PostQuery;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostQueryRepository extends CrudRepository<PostQuery, Long> {
}

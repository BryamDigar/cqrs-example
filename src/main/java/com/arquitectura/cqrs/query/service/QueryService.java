package com.arquitectura.cqrs.query.service;

import com.arquitectura.cqrs.query.jpa.PostQueryRepository;
import com.arquitectura.cqrs.query.orm.PostQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class QueryService {

    @Autowired
    private PostQueryRepository postQueryRepository;

    public PostQuery getPost(Long id) {
        return postQueryRepository.findById(id).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND));
    }
}

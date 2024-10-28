package com.arquitectura.cqrs.query.controller;

import com.arquitectura.cqrs.query.orm.PostQuery;
import com.arquitectura.cqrs.query.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryController {

    @Autowired
    private QueryService queryService;

    @GetMapping("/post/{id}")
    public PostQuery getPost(@PathVariable Long id) {
        return queryService.getPost(id);
    }
}

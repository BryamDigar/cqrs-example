package com.arquitectura.cqrs.command.orm;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "post", schema = "cqrs")
public class PostCommand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

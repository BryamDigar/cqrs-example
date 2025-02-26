package com.arquitectura.cqrs.query.orm;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@Table(name = "comment_reaction", schema = "cqrs")
public class ReactionQuery {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comment_reaction_id_gen")
    @SequenceGenerator(name = "comment_reaction_id_gen", sequenceName = "comment_reaction_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "emoji", nullable = false, length = Integer.MAX_VALUE)
    private String emoji;

    @Column(name = "comment_id", nullable = false)
    @JsonIgnore
    private long commentId;

    public ReactionQuery() {

    }
}
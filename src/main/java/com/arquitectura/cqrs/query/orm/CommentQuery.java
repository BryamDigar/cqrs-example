package com.arquitectura.cqrs.query.orm;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.List;


@Data
@AllArgsConstructor
@Table(name = "comment", schema = "cqrs")
public class CommentQuery {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comment_id_gen")
    @SequenceGenerator(name = "comment_id_gen", sequenceName = "comment_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "content", nullable = false, length = Integer.MAX_VALUE)
    private String content;

    private long postId;

    @OneToMany(mappedBy = "commentId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ReactionQuery> reactions;

}
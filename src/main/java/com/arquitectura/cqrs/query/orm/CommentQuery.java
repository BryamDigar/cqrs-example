package com.arquitectura.cqrs.query.orm;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "comment", schema = "cqrs")
public class CommentQuery {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comment_id_gen")
    @SequenceGenerator(name = "comment_id_gen", sequenceName = "comment_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "content", nullable = false, length = Integer.MAX_VALUE)
    private String content;

    @Column(name = "post_id", nullable = false)
    @JsonIgnore
    private long postId;

    @OneToMany(mappedBy = "commentId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ReactionQuery> reactions;
}
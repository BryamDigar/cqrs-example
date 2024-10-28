package com.arquitectura.cqrs.command.orm;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "comment_reaction", schema = "cqrs")
@AllArgsConstructor
@NoArgsConstructor
public class ReactionCommand {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comment_reaction_id_gen")
    @SequenceGenerator(name = "comment_reaction_id_gen", sequenceName = "comment_reaction_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "emoji", nullable = false)
    private String emoji;

    @Column(name = "comment_id", nullable = false)
    private long commentId;
}

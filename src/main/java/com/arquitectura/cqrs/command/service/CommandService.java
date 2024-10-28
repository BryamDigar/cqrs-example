package com.arquitectura.cqrs.command.service;

import com.arquitectura.cqrs.command.jpa.CommentCommandRepository;
import com.arquitectura.cqrs.command.jpa.PostCommandRepository;
import com.arquitectura.cqrs.command.jpa.ReactionCommandRepository;
import com.arquitectura.cqrs.command.orm.CommentCommand;
import com.arquitectura.cqrs.command.orm.PostCommand;
import com.arquitectura.cqrs.command.orm.ReactionCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

@Service
public class CommandService {
    @Autowired
    PostCommandRepository postRepository;

    @Autowired
    CommentCommandRepository commentRepository;

    @Autowired
    ReactionCommandRepository reactionRepository;

    @Transactional
    public PostCommand addPost(PostCommand post) {
        return postRepository.save(post);
    }

    @Transactional
    public CommentCommand addComment(Long postId, CommentCommand comment) {
        comment.setPostId(postId);
        return commentRepository.save(comment);
    }

    @Transactional
    public ReactionCommand addReaction(Long postId, Long commentId, ReactionCommand reaction) {
        if (!StringUtils.hasText(reaction.getEmoji())) {
            throw new IllegalArgumentException("Emoji must not be null or empty");
        }
        reaction.setCommentId(commentId);
        return reactionRepository.save(reaction);
    }
}
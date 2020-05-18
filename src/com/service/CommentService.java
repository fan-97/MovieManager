package com.service;

import com.entity.Comment;
import com.util.StorageCache;

import java.util.List;

public class CommentService {

    public void add(Comment comment) {
        StorageCache.COMMENT_CACHE_LIST.add(comment);
    }

    public void delete(Integer id) {
        for (Comment comment : StorageCache.COMMENT_CACHE_LIST) {
            if (comment.getId().equals(id)) {
                StorageCache.COMMENT_CACHE_LIST.remove(comment);
                break;
            }
        }
    }

    public Comment findById(int id) {
        for (Comment comment : StorageCache.COMMENT_CACHE_LIST) {
            if (comment.getId().equals(id)) {
                return comment;
            }
        }
        return null;
    }

    public List<Comment> findAll() {
        return StorageCache.COMMENT_CACHE_LIST;
    }

    public void update(Comment newComment) {
        for (Comment comment : StorageCache.COMMENT_CACHE_LIST) {
            if (comment.getId().equals(newComment)) {
                comment = newComment;
                break;
            }
        }
    }

}

package com.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * 影评
 */
public class Comment implements Serializable {
    private Integer id;
    @Chinese("用户")
    private String user;
    @Chinese("影片")
    private String movie;
    @Chinese("评分")
    private double score;
    @Chinese("连接")
    private String url;
    @Chinese("影评数量")
    private long total;

    public Comment() {
    }

    public Comment(Integer id,String user, String movie, double score, String url, long total) {
        this.id = id;
        this.user = user;
        this.movie = movie;
        this.score = score;
        this.url = url;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return user + "\t" + movie + "\t" + score + "\t" + url + "\t" + total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return this.id.equals(comment.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, movie, score, url, total);
    }
}

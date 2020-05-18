package com.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * 影片
 */
public class Movie implements Serializable {
    @Chinese("电影名")
    private String name;
    @Chinese("上映年份")
    private String year;
    @Chinese("导演")
    private String author;
    @Chinese("主角")
    private String protagonist;//主角
    @Chinese("出品公司")
    private String company;
    @Chinese("影片等级")
    private String level;

    public Movie() {
    }

    public Movie(String name, String year, String author, String protagonist, String company, String level) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.protagonist = protagonist;
        this.company = company;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getProtagonist() {
        return protagonist;
    }

    public void setProtagonist(String protagonist) {
        this.protagonist = protagonist;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return name + "\t" + year + "\t" + author + "\t" + protagonist + "\t" + company + "\t" + level + "\t";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(name, movie.name) &&
                Objects.equals(year, movie.year) &&
                Objects.equals(author, movie.author) &&
                Objects.equals(protagonist, movie.protagonist) &&
                Objects.equals(company, movie.company) &&
                Objects.equals(level, movie.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, author, protagonist, company, level);
    }
}

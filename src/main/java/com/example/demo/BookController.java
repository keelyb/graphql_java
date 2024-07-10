package com.example.demo;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
class BookController {

    @QueryMapping
    public Book bookById(@Argument String id) {
        return Book.getById(id);
    }

    @QueryMapping
    public AudioBook audioBookById(@Argument String id) {
        return AudioBook.getById(id);
    }

    @QueryMapping
    public Video videoById(@Argument String id) {
        return Video.getById(id);
    }

    @SchemaMapping
    public Author author(Book book) {
        return Author.getById(book.authorId());
    }

    @SchemaMapping
    public Author author(AudioBook audioBook) {
        return Author.getById(audioBook.authorId());
    }

    @SchemaMapping
    public Author author(Video video) {
        return Author.getById(video.authorId());
    }

}
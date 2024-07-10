package com.example.demo;

import java.util.Arrays;
import java.util.List;

record AudioBook(
        String id, String name, String authorId,
        String listeningLength,
        String audibleComReleaseDate, String publisher, String programType, String language, String bestSellerRank) {

    private static List<AudioBook> audioBooks = Arrays.asList(
            new AudioBook("audiobook-1", "Harry Potter and the Philosopher's Stone", "author-1",
                    "8 hours and 25 minutes",
                    "April 18, 2024", "Pottermore Publishing", "AudioBook", "English", "#6"),
            new AudioBook("audiobook-2", "Moby Dick", "author-2", "16 hours and 17 minutes",
                    "May 01, 2006", "Simon & Schuster Audio", "AudioBook", "English", "#2"),
            new AudioBook("audiobook-3", "Interview with the vampire", "author-3", "16 hours and 17 minutes",
                    "May 01, 2006", "Simon & Schuster Audio", "AudioBook", "English", "#2"),
            new AudioBook("audiobook-4", "For Whom the Bell Tolls", "author-4", "16 hours and 17 minutes",
                    "May 01, 2006", "Simon & Schuster Audio", "AudioBook", "English", "#2"));

    public static AudioBook getById(String id) {
        return audioBooks.stream().filter(audioBook -> audioBook.id().equals(id)).findFirst().orElse(null);
    }

}
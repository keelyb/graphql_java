package com.example.demo;

import java.util.Arrays;
import java.util.List;

record Video(String id, String name, int durationMinutes, String authorId) {

    private static List<Video> videos = Arrays.asList(
            new Video("video-1", "Documentary video on Harry Potter and the Philosopher's Stone", 61, "author-1"),
            new Video("video-2", "Documentary video on Moby Dick", 62, "author-2"),
            new Video("video-3", "Documentary video on Interview with the vampire", 63, "author-3"));

    public static Video getById(String id) {
        return videos.stream().filter(video -> video.id().equals(id)).findFirst().orElse(null);
    }

}
package org.geekbrains.lessons.lesson3.tdd;

public class MoodAnalyser {
    public String analyseMood(String message) {
        message = message.toLowerCase();

        if (message.contains("прекрасн")) {
            return "GoodMood";
        } else if (message.contains("нормальн")) {
            return "NormalMood";
        } else if (message.contains("плох")) {
            return "BadMood";
        }

        return "";
    }
}
package org.geekbrains.lessons.lesson3.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class MoodAnalyserTest {
    MoodAnalyser moodAnalyser;

    @BeforeEach
    void setup() {
        moodAnalyser = new MoodAnalyser();
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "Какой прекрасное утро",
            "Какой прекрасный день",
            "Какой прекрасный вечер",
    })
    void analyseGoodMood(String s) {
        String result = moodAnalyser.analyseMood(s);
        assertThat(result).isEqualTo("GoodMood");
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "Какое нормальное утро",
            "Какое нормальный день",
            "Какое нормальный вечер",
    })
    void analyseNormalMood(String s) {
        String result = moodAnalyser.analyseMood(s);
        assertThat(result).isEqualTo("NormalMood");
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "Какое плохое утро",
            "Какой плохой день",
            "Какой плохой вечер",
    })
    void analyseBadMood(String s) {
        String result = moodAnalyser.analyseMood(s);
        assertThat(result).isEqualTo("BadMood");
    }
}
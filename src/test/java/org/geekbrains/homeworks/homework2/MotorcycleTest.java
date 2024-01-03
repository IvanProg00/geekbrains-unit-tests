package org.geekbrains.homeworks.homework2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MotorcycleTest {
    private Motorcycle motorcycle;

    @BeforeEach
    void setup() {
        motorcycle = new Motorcycle("Yamaha", "YZF-R1M", 2018);
    }

    /**
     * 2.3. Проверить, что объект Motorcycle создается с 2-мя колесами.
     */
    @Test
    void requiresWheels() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    /**
     * 2.5. Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового
     * вождения (используя метод testDrive()).
     */
    @Test
    void testDrive() {
        assertThat(motorcycle.getSpeed()).isEqualTo(0);

        motorcycle.testDrive();

        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }


    /**
     * 2.7. Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция
     * движения транспорта) мотоцикл останавливается (speed = 0).
     */
    @Test
    void park() {
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }

}
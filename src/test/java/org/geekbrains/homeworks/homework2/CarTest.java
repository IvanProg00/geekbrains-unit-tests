package org.geekbrains.homeworks.homework2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {
    private Car car;

    @BeforeEach
    void setup() {
        car = new Car("bmw", "X1", 2015);
    }

    /**
     * 2.1. Проверить, что экземпляр объекта Car также является экземпляром транспортного
     * средства (используя оператор instanceof).
     */
    @Test
    void isInstanceOfVehicle() {
        assertThat(car).isInstanceOf(Vehicle.class);
    }

    /**
     * 2.2. Проверить, что объект Car создается с 4-мя колесами.
     */
    @Test
    void requiresWheels() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }


    /**
     * 2.4. Проверить, что объект Car развивает скорость 60 в режиме тестового вождения
     * (используя метод testDrive()).
     */
    @Test
    void testDrive() {
        assertThat(car.getSpeed()).isEqualTo(0);

        car.testDrive();

        assertThat(car.getSpeed()).isEqualTo(60);
    }


    /**
     * 2.6. Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция
     * движения транспорта) машина останавливается (speed = 0).
     */
    @Test
    void park() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

}
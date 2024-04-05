package ru.oop.task2;

/**
 * Человек
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
interface Person extends Positioned {

    /**
     * Пройти до указанного места из текущего местоположения
     *
     * @param destination место назначения
     */
    Position walk(Position destination);

    /** Идет из своей позиции к транспорту
     * @param position
     */
    Position goToTransportPlace(Position position);
}

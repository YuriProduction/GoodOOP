package ru.oop.task2;

/**
 * Транспорт для человека
 */
public interface PersonTransport extends Positioned
{

    /** Везет человека к destination
     * @param person
     * @param destination
     * @return позиция после движения
     */
    Position go(Person person, Position destination);

}

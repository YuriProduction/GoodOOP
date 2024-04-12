package ru.oop.task3;

/**
 * Транспорт, предоставленный человеку
 */
public interface IPersonTransport extends Positioned
{
    /**
     * Везет человека к destination
     *
     * @param person
     * @param destination
     * @return позиция после движения
     */
    Position go(Person person, Position destination);
}

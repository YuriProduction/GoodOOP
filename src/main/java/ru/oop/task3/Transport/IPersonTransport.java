package ru.oop.task3.Transport;

import ru.oop.task3.Person;
import ru.oop.task3.Position;
import ru.oop.task3.Positioned;

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

package ru.oop.task3;

import ru.oop.task3.Transport.IPersonTransport;

import java.util.List;

/**
 * <b>Задача 3:</b><br>
 * То же самое, что и задача 2, но добраться нужно с пересадками<br>
 * Можно определить транспортные средства списком:<br>
 * {@code Arrays.asList(new Car(person), new Bus("43", person),
 * new Bus("50", person));}
 * <ul>
 *   <li>Код не должен превышать 12 строк</li>
 *   <li>Запрещено реализовывать конструкторы и методы, кроме moveTo(Person person, Position destination)</li>
 *   <li>Запрещено добавлять новые методы в класс Main</li>
 *   <li>Разрешено создавать новые классы и интерфейсы</li>
 * </ul>
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
public class MainTask3
{

    /**
     * Переехать из текущего места в заданную точку
     * на любом, заранее определённом транспорте
     */

    public static void moveTo(Person person, List<Position> destinations, List<IPersonTransport> ourTransport)
    {
        Position currentPersonPosition = person.getPosition();
        for (int i = 0; i < ourTransport.size(); i++)
        {
            IPersonTransport currentTransport = ourTransport.get(i);
            person.walk(currentTransport.getPosition()); //идем к транспорту
            currentTransport.go(person, destinations.get(i)); //перемещаем человека к след. пункту
        }
        if (!currentPersonPosition.equals(destinations.getLast())) //Если последний пункт не привез куда надо - идем куда надо
            person.walk(destinations.getLast());
        assert person.getPosition() == destinations.getLast();
    }
}

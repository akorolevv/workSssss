package prac21_ready.ex2;

// класс содержит общие поля и методы для классов LinkedQueue и ArrayQueue. Он содержит поля head и tail,
// которые используются для отслеживания начала и конца очереди.
// START_CAPACITY задает начальную емкость очереди.

public abstract class AbstractQueue implements Queue
{
    protected int head, tail;
    protected static final int START_CAPACITY = 16;

}

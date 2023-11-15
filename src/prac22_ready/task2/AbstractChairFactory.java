package prac22_ready.task2;

interface AbstractChairFactory
{
    VictorianChair createVictorianChair(int age);
    MagicChair createMagicChair();
    FunctionalChair createFunctionalChair();
}
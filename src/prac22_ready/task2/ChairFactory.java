package prac22_ready.task2;

class ChairFactory implements AbstractChairFactory
{
    @Override
    public VictorianChair createVictorianChair(int age)
    {
        return new VictorianChair(age);
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
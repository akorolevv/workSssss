package prac22_ready.task2;

class Client {
    private Chair chair;

    public void setChair(Chair chair)
    {
        this.chair = chair;
    }

    public void sit()
    {
        System.out.println("Клиент сидит на стуле.");
    }
}
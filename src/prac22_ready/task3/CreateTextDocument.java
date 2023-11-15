package prac22_ready.task3;
//  createNew и createOpen  реализации фабричных методов.
class CreateTextDocument implements ICreateDocument {
    // Реализация метода createNew, возвращающего новый экземпляр TextDocument
    @Override
    public IDocument createNew()
    {
        return new TextDocument();
    }

    // Реализация метода createOpen, возвращающего новый экземпляр TextDocument
    @Override
    public IDocument createOpen() {
        return new TextDocument();
    }
}
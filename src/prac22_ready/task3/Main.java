package prac22_ready.task3;

public class Main {
    public static void main(String[] args) {
        // объект CreateTextDocument является конкретной фабрикой
        ICreateDocument textDocumentFactory = new CreateTextDocument();
        IDocument document = textDocumentFactory.createNew(); // createNew, который возвращает новый экземпляр TextDocument

        document.Open();
        document.Exit();
        document.Save();
        document.New();
    }
}
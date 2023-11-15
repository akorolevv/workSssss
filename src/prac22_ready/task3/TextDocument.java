package prac22_ready.task3;

// Конкретные реализации методов
class TextDocument implements IDocument
{
    @Override
    public void Open() {
        System.out.println("Text document opened.");
    }

    @Override
    public void Save() {
        System.out.println("Text document saved.");
    }

    @Override
    public void New()
    {
        System.out.println("Text document created.");
    }

    @Override
    public void Exit() {
        System.out.println("Exiting text document.");
    }
}

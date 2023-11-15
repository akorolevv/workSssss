package prac22_ready.task3;
//  createNew и createOpen фабричные методы.
//  Каждый из этих методов создает новый экземпляр IDocument.

interface ICreateDocument
{
    // Абстрактный метод createNew, возвращающий новый экземпляр IDocument
    IDocument createNew();

    // Абстрактный метод createOpen, возвращающий новый экземпляр IDocument
    IDocument createOpen();
}
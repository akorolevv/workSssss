package prac22_ready.task1;

interface ComplexAbstractFactory
{
    Complex createComplex(); // Абстрактный метод создания комплексного числа
    Complex createComplex(int real, int imaginary);  // Абстрактный метод создания комплексного числа с заданными real и imaginary
}

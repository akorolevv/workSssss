package prac22_ready.task1;

class Complex // комплексное число
{
    private int real; // действительная часть
    private int imaginary; // мнимая часть

    public Complex(int real, int imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getImaginary() {
        return imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void setReal(int real) {
        this.real = real;
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}

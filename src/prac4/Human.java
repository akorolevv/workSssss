package prac4;

// Класс, описывающий голову
class Head
{
    private String eyeColor;
    private String hairColor;

    public Head(String eyeColor, String hairColor)
    {
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }

    public String getEyeColor()
    {
        return eyeColor;
    }
    public void setEyeColor(String eyecolor_new)
    {
        this.eyeColor = eyecolor_new;
    }

    public String getHairColor()
    {
        return hairColor;
    }

    public void setHairColor(String hairColor_new)
    {
        this.eyeColor = hairColor_new;
    }
}

// Класс, описывающий ногу
class Leg
{
    private int length;

    public Leg(int length)
    {
        this.length = length;
    }

    public int getLength()
    {
        return length;
    }
    public void setLength(int length)
    {
        this.length = length;
    }
}


class Hand
{
    private int fingerSize;

    public Hand(int fingerSize)
    {
        this.fingerSize = fingerSize;
    }

    public int getFingerSize()
    {
        return fingerSize;
    }

    public void setFingerSize(int size)
    {
        this.fingerSize = size;
    }
}

class Human // Human содержит в себе объекты других классов
{
    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;

    public Human(Head head, Leg leftLeg, Leg rightLeg, Hand leftHand, Hand rightHand)
    {
        this.head = head;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }

    public Head getHead()
    {
        return head;
    }

    public Leg getLeftLeg()
    {
        return leftLeg;
    }

    public Leg getRightLeg()
    {
        return rightLeg;
    }

    public Hand getLeftHand()
    {
        return leftHand;
    }

    public Hand getRightHand()
    {
        return rightHand;
    }
}





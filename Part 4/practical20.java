class Shape
{
    void Print()
    {
        System.out.println("This is Shape");
    }
}

class Rectangle extends Shape
{
    void Print2()
    {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape
{
    void Print3()
    {
        System.out.println("This is circular shape");
    }
}

class square extends Rectangle
{
    void Print4()
    {
        System.out.println("Square is a Rectangle");
    }
}
public class practical20 {
    public static void main(String[] args) {

        square s= new square();
        s.Print();
        s.Print2();
        s.Print4();
    }
}

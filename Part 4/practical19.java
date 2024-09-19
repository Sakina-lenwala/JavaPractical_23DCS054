class rectangle
{
    float length;
    float breadth;

    rectangle(float length,float breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }

    void Area()
    {
        float area=length*breadth;
        System.out.println("Area = "+ area);
    }

    void Perimeter()
    {
        float perimeter= 2*(length+breadth);
        System.out.println("Perimeter = "+ perimeter);
    }
}

class Square extends rectangle
{
    Square(float side)
    {
        super(side,side);
    }
}

public class practical19 {
    public static void main(String[] args) {

        rectangle [] r=new rectangle[2];
        r[0]=new rectangle(5.5f,2.5f);
        r[1]=new Square(5.5f);

        for (rectangle r1: r)
        {
            r1.Area();
            r1.Perimeter();
            System.out.println();
        }

    }
}

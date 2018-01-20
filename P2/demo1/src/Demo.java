
enum D
{
    A, B, C, C2;

    private D()
    {

        System.out.print("run-");
    }
}

public class Demo {
    public static void main(String[] args)
    {
        Enum enu = D.B;
    }

}


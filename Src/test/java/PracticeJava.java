
public class PracticeJava {
    public static void main(String[] args) {

        // типы данных
        byte a = 99;
        short b = 11111;
        int c = 1111111111;
        long d = 1000000000L;
        float e = 1000.99f;
        double f = 10000.99d;
        char j = 'j';

        // математические опереаторы
        System.out.println(a+c);
        System.out.println(b*a);
        System.out.println(d%b);
        System.out.println(f/e);

        //переполнение
        System.out.println((byte)(a*a));
        System.out.println((short)(b+c));
        System.out.println((int) (j+Integer.MAX_VALUE));

        // логические опретаторы + условные конструкции
        byte x=7;
        byte y=100;
        if (x<y) {while(x!=y) {
            x+=1;

        }
            System.out.println(x);
            System.out.println("x become = y");

        }
        else {
            System.out.println("y more than x");
        }

    }
}

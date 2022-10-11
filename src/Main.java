public class Main {
    public static void main(String[] args) {
        /*
        PART A

        1.
        for(int x=0;x<=30;x++)

        {
            System.out.println(x);
        }


        2.
        for(int x=30;x>=0;x--)
        {
            System.out.println(x);
        }


        3.
        for(int x=0;x<=18;x+=3 )
        {
            System.out.println(x);
        }


        4.
        for(int x=10;x>=0;x-=2)
        {
            System.out.println(x);
        }

        PART B

        5.
        String m="*";
        for (int x=1;x<=5;x++)
        {
            for (int y=1;y<=x;y++)
            {
               System.out.print(m);
            }
        System.out.println();
        }

         6.
         String m="*";
        for (int x=1;x<=5;x++)
        {
            for (int y=5;y>=x;y--)
            {
               System.out.print(m);
            }
        System.out.println();

        7.
        String m="*";
        for (int x=1;x<=5;x++)
        {
            for (int y=1;y<=5;y++)
            {
               System.out.print(m);
            }
        System.out.println();

        }

         */

        int a;
        int b;
        int c = 20;

        for (a = 0; a <= c; a++)
        {
            for (b = 0; b <= c/2; b++)
            {
                if ((b == 0 || b == c/2) && a!=0 || a==0 && b != c / 2 || a == c / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();

        }

        int i;
        int j;
    }
}
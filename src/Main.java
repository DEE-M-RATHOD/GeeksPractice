import java.io.*;
import java.nio.*;
import java.lang.Enum;

import static java.lang.Math.sqrt;

enum Beer{
    KC,LO,RO
}

public class Main {

     /*   public static void main(String [] args){*/
           /* System.out.println("H" + "a") ;
            System.out.println('H' + 'a') ;

           */
            /*int a, b=0;*/
            /*a = 1;
            *//*b=++a;*/
          /*  b = a++;*/
            /*a= a++ + 1;*/
            /*b = a++ + 1;*/
       /*     a = ++a + 1;
            b = ++a + 1;*/
      /*      a= ++a + ++a;*/
       /*     b = ++a + ++a;*/
           /* a= a++ + a++;*/
            /*b = a++ + a++;*/
        /*    a = a ++ + ++a;
       */     /*b = a++ + ++a;*/
            /*b = --a;*/
            /*b = a-- ;*/
    /*        b = --a - 1;*/
    /*        a = --a - 1;*/
     /*       a= a-- - 1;*/
       /*     b = --a - --a;*/
               /*     a = --a - --a;*/
         /*   a = a-- - a--;*/
           /* a = a--  - --a;*/
        /*    a= a--  + ++a;
*//*
            System.out.println(a++);
            System.out.println(a++);
            System.out.println(++a);

            System.out.println(a++);
            System.out.println(a++);

            System.out.println(a--);
            System.out.println(a--);

            System.out.println(--a);
            System.out.println(--a);
            System.out.println(a--);
            System.out.println("A "+ a );
            System.out.println("B "+ b );*/
           /* int i = 15;
            System.out.println(i++);
            System.out.println(i--);*/
      /*      int a=10,b=10;*/
/*
            for(int i=0;i<5;i++){

                if(++a>2 || ++b>2){
                    a++;
                }

            }
            System.out.println("a= "+a+" b="+b);*/
    int a = 1111;
      /*      static int a = 1111;
            static
            {
                a = a-- - --a;
            }
*/
        /*    {
                a = a++ + ++a;
            }*/

          public static void main(String... args)  {
               /* int x=7 , y = -3, z=0;
               *//* int a = 1111;
                {
                    a = a++ + ++a;
                }
                System.out.println(a);*//*
                z=++x  + y-- - ++y - x-- - x-- - ++y - x--;
                System.out.println(z);*/
              Beer[] bobject = Beer.values();
              for (Beer b1 : bobject)
              {
                  System.out.println(b1);
              }


              System.out.println(sqrt(16));
          }
        /*}*/
    };

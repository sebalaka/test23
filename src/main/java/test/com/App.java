package test.com;

import static java.lang.System.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*System.out.println( "Hello World!" );
        for (int i = 0; i < 10; i++) {
         //   System.out.println(i);
        float result = 2.0f/4.0f;
        System.out.println(result);

        for (int bubu = 0; bubu <10; bubu++) {

            if (bubu > 2) break;

            System.out.println(bubu);
        }
        int limit = 5;
        int[] values = new int[limit];


        values[0] = 5;
        values[1] = 6;
        values[2] = 7;
        values[3] = 8;
        values[4] = 9;
    System.out.println(values[4]);

        int[] somevalues = {3,4,5,66,8};

 System.out.println(values[4]);
        System.out.println(somevalues[4]); */

      /*  zrob tablice aby bylo w niej 100 elementow od 0 do 99
            policz z nich srednia oraz sume wszystkich */
/*
        int limit = 100;
        int[] values = new int[100];
        for (int i=0; i<100; i++)

            values = [i]+1;

            for(int i=0; i < values.lenght ; i++)
                sum = sum + values[i];

            int average = sum / values.length;

        }
        System.out.println(average);
       /*   int limit = 100;
        int[] values = new int[limit];

        int sum = 0;
        double average;

        for(int i=0; i < values.length; i++)
            sum = sum + values[i];

        average = (double)sum/values.length;
        System.out.println(average);*/

        {
            int limit = 100;
            int[] tablica = new int[limit];
            for (int i = 0; i < tablica.length; i++)
                tablica[i] = i ;

            int suma = 0;

            for (int i = 0; i < 100; i++) {
                suma = suma + tablica[i];


            }
            System.out.println(suma / 100d);


        }}}







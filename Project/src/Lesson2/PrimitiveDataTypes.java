package Lesson2;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;
        byte b3 = (byte) 150;
        System.out.println(b3);
        long b4 = 1111111111111111111L;

        float a = 3.2f;
        float b = 20;

        char c1 = 'a';
        System.out.println(c1);
        int c2 = c1;
        System.out.println(c2);
        int c3 = 11;
        char c4 = (char) c3;
        System.out.println("Cymbol: " + c4);
        char c6 = 300;
        System.out.println(c6);
        char c7 = '\u1300';
        System.out.println(c7);


        int e1 = 0b111100;
        int e2 = 074;
        int e3 = 0x3C;

        int a7 = 1_000_000;

        byte x1 = 12;
        byte x2 = 0b1100;
        byte x3 = 014;
        byte x4 = 0xC;

        System.out.println(x1 + " " + x2 + " " + x3 + " " + x4);

        short x5 = 1300;
        short x6 = 0b010100010100;
        short x7 = 0514;
        short x8 = 0x514;

        System.out.println(x5 + " "+ x6 + " " + x7 + " " + x8);

        int x9 = 0;
        int x10 = 0b0;
        int x11 = 00;
        int x12 = 0x0;

        System.out.println(x9 + " " +  x10 + " " +  x11 + " " + x12);

        long x13 = 123456789;
        long x14 = 0b0111010110111100110100010101;
        long x15 = 0726746425;
        long x16 = 0x75BCD15;

        System.out.println(x13 + " " +  x14 + " " +  x15 + " " + x16);

        float y1 = 0.1f;
        float y2 = 2;

        double y3 = 3.0;
        double y4 = 4;

        System.out.println(y1 + " " + y2 + " " + y3 + " " + y4);

        boolean y5 = true;
        boolean y6 = false;

        System.out.println(y5 + " " + y6);

        char z1 = '\u13AF';
        char z2 = 5039;
        

        System.out.println(z1 + " " + z2);




        System.out.println();
    }
}

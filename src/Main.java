import java.io.Console;

public class Main {
    public static void main(String[] args) {

        //Задание 1
        // целочисленный тип переменной
        byte varByte = 10;
        short varShort = 11;
        int varInt = 12;
        long varLong = 100_000_000;

        // тип переменной с плавающей точкой
        float varFloat = 1.56f;
        double varDouble = -123.55;

        //символьная переменная
        char varChar = 'F';

        //Логическая переменная

        boolean varBoolean = true;

        //Задание 2

        double weightBoxer1 = 78.2;
        double weightBoxer2 = 82.7;
        double totalWeight = weightBoxer2 + weightBoxer1;
        System.out.println("Общий вес боксеров " + totalWeight + " кг");
        double differenceWeight = weightBoxer2 - weightBoxer1;
        System.out.println("Разница в весе боксеров " + differenceWeight + " кг");

        //Задание 3

        int bananQuantity = 5;
        int bananWeight = bananQuantity * 80;
        int milkQuantity = 200;
        int milkWeight = milkQuantity * 105;
        int icecreamQuantity = 2;
        int icecreamWeight = icecreamQuantity * 100;
        int eggsQuantity = 4;
        int eggsWeight = eggsQuantity * 70;
        double breakfastWeight = (bananWeight + milkWeight + icecreamWeight + eggsWeight)/1000;
        System.out.println("Вес спортивного завтрака " + breakfastWeight + " кг");


    }
}
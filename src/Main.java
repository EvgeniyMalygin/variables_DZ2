import java.io.Console;

public class Main {
    public static void main(String[] args) {

        //Задание 1
        // целочисленный тип переменной
        byte varByte = 10;
        short varShort = 11;
        int varInt = 12;
        long varLong = 100_000_000L;

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

        //Задание 4

        int weight = 7; // в килограммах
        int minWeightForDay = 250; //в граммах
        int maxWeightForDay = 500; //в граммах

        double quantityDay = 7*1000/minWeightForDay; //количество дней при похудении на 250 гр в день
        System.out.println("При похудении на 250 гр в день потребуется " + quantityDay + " дней");
        quantityDay = 7*1000/maxWeightForDay; //количество дней при похудении на 500 гр в день
        System.out.println("При похудении на 500 гр в день потребуется " + quantityDay + " дней");
        double averageAmountDay = (minWeightForDay + maxWeightForDay)/2;
        quantityDay = 7*1000/averageAmountDay; //количество дней при похудении на 375 гр в день
        System.out.println("При похудении на "+ averageAmountDay + " гр в день потребуется " + quantityDay + " дней");

        //Задание 5

        int zarplataMasha = 67760;
        int zarplataDenis = 83690;
        int zarplataKristina = 76230;

        double newZarplataMasha = zarplataMasha + zarplataMasha * 0.1;
        double newZarplataDenis = zarplataDenis + zarplataDenis * 0.1;
        double newZarplataKristina = zarplataKristina + zarplataKristina * 0.1;
        System.out.println("Маша теперь получает " + newZarplataMasha + " рублей. " + "Годовой доход вырос на " +
                12*(newZarplataMasha - zarplataMasha) + " рублей");
        System.out.println("Денис теперь получает " + newZarplataDenis + " рублей. " + "Годовой доход вырос на " +
                12*(newZarplataDenis - zarplataDenis) + " рублей");
        System.out.println("Кристина теперь получает " + newZarplataKristina + " рублей. " + "Годовой доход вырос на " +
                12*(newZarplataKristina - zarplataKristina) + " рублей");
    }
}
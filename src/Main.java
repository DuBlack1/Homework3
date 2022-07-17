public class Main {
    public static void main(String[] args) {
        task5();
    }
    public static void task1 () {
        int clientOS = 1;

        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }
    public static void task2 (){
        int clientOS = 1;
        int clientDeviceYear =2014;

        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        }
        else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
        }
    }
    public static void task3 () {
        int year = 1900;

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Год является высокосным");
        }
        else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("Год является высокосным");
        }
        else {
            System.out.println("Год не является высокосным");
        }
    }
    public static void task4 () {
        int deliveryDistance = 95;
        int deliveryDay;

        if (deliveryDistance <= 20) {
            deliveryDay = 1;
        }
        else {
            deliveryDay = (int)(Math.ceil(deliveryDistance / 40)+1);
//            deliveryDay = deliveryDistance / 40;
        }

        System.out.println("Потребуется дней: " + deliveryDay);
    }
    public static void task5 () {
        int monthNumber = 12;

        switch (monthNumber) {
            case 1: case 2: case 12:
                System.out.println("Зима");
                break;
            case 3: case 4: case 5:
                System.out.println("Весна");
                break;
            case 6: case 7: case 8:
                System.out.println("Лето");
                break;
            case 9: case 10: case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println(" Такого месяца не существует");
        }
    }
}

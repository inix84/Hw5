public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1. Про операционные системы:");
        int clientOS = 0; //0 — iOS, 1 — Android
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке --->");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке --->");
        }
        System.out.println();


        System.out.println("Задача 2. Про операционные системы (хард):");
        int clientDeviceYear = 2014; // год выпуска
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке--->");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке --->");
            }
        }
        else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке--->");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке --->");
            }
        }

        System.out.println();
        System.out.println("Задача 3. Про високосный год:");
        int year = 2000; // проверяемый год
        if (year % 4 != 0) {
            System.out.println(year + " год не является високосным!");
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println(year + " год не является високосным, как на него не посмотри.");
        } else {
            System.out.println(year + " год на зло всем бедам является високосным.");
        }
        System.out.println();
        System.out.println("Задача 4. Про доставку банковских карт:");
        int deliveryDistance = 195; // дистанция до клиента
        if (deliveryDistance < 20) {
            System.out.println("Дистанция от офиса до адреса клиента составляет: " + deliveryDistance +
                    " км. Потребуется 1 день");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Дистанция от офиса до адреса клиента составляет: " + deliveryDistance +
                    " км. Потребуется 2 дня");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Дистанция от офиса до адреса клиента составляет: " + deliveryDistance +
                    " км. Потребуется 3 дня");
        } else {
            System.out.println("Дистанция от офиса до адреса клиента составляет: " + deliveryDistance +
                    " км. Доставки нет");
        }
        System.out.println();
        System.out.println("Задача 5. Про номера месяца:");
        int monthNumber = 55; // проверяемый месяц
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + "й месяц - это зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "й месяц - это весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "й месяц - это лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "й месяц - это осень");
                break;
            default:
                System.out.println("Неверно введен номер месяца.");
        }
    }
}
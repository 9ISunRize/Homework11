public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1111");
        int year = 2024;
        leapYear(year);



        System.out.println("Задача 2 ");
        int clientOSS = 1;
        int yearOS = 2013;
        softwareVersion(yearOS, clientOSS);



        System.out.println("Задача 3 ");
        var deliveryDistance = 95;
        int deliveryDay =1;
        int itog = deliveryTime(deliveryDistance, deliveryDay);
        System.out.println("Для доставки карты потребуется дней: "+itog);

    }


    public static void leapYear(int yearNum) {
        double yearDiv4 = yearNum / 4;
        if (yearDiv4 % 1 != 0.0)
            System.out.println(yearNum + " - не високосный год");
        else if (yearDiv4 % 25 == 0 && yearDiv4 % 100 != 0)
            System.out.println(yearNum + " - не високосный год");
        else System.out.println(yearNum + " - високосный год");
    }


    public static void softwareVersion(int yearOSChecking, int clientOSSChecking){
        if (clientOSSChecking == 0) {
            if (yearOSChecking > 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (yearOSChecking <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");

            }
        }
        if (clientOSSChecking == 1) {
            if (yearOSChecking > 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (yearOSChecking <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }


    }

    public static int deliveryTime( int DayNum, int Distance ) {
        Distance = 120;
        DayNum = 1;
        if (Distance >20 ){
            DayNum++;
        }
        if (Distance >60 ){
            DayNum++;
        }

        return DayNum;
    }



}


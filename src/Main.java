public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        byte a = -50;
        System.out.println("Значение переменной a с типом byte равно " + a);

        short b = 200;
        System.out.println("Значение переменной b с типом short равно " + b);

        int c = 35000;
        System.out.println("Значение переменной c с типом int равно " + c);

        long d = 2500000L;
        System.out.println("Значение переменной d с типом long равно " + d);

        float e = - 0.003f;
        System.out.println("Значение переменной e с типом float равно " + e);

        double f = 0.5;
        System.out.println("Значение переменной f с типом double равно " + f);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float one = 27.12f;
        long two = 987678965549L;
        double three = 2.786;
        short four = 569;
        short five = -159;
        short six = 27897;
        byte seven = 67;
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int LP = 23;
        int AS = 27;
        int EA = 30;
        short paper = 480;

        int students = LP + AS + EA;
        int paperForOneStudent = paper / students;

        System.out.println("На каждого ученика рассчитано " + paperForOneStudent + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte bottle = 16;
        byte time1 = 2;

        int performance = bottle / time1;

        byte time2 = 20;
        int bottle2 = performance * time2;
        System.out.println("За " + time2 + " минут машина произвела " + bottle2 + " штук бутылок");

        int time3 = 1;
        time3 = time3 * 24 * 60;
        int bottle3 = performance * time3;
        System.out.println("За " + time3 + " сутки машина произвела " + bottle3 + " штук бутылок");

        int time4 = 3;
        time4 = time4 * 24 * 60;
        int bottle4 = performance * time4;
        System.out.println("За " + time4 + " дня машина произвела " + bottle4 + " штук бутылок");

        int time5 = 1;
        time5 = time5 * 30 * 24 * 60;
        int bottle5 = performance * time5;
        System.out.println("За " + time5 + " месяц машина произвела " + bottle5 + " штук бутылок");
    }

    public static void task5 () {
        System.out.println("Задача 5");
        byte white = 2;
        byte brown = 4;

        int oneRoom = white + brown;

        short jar = 120;

        int rooms = jar / oneRoom;

        int allWhite = rooms * white;
        int allBrown = rooms * brown;

        System.out.println("В школе, где " + rooms + " классов, нужно " + allWhite + " банок белой краски и " + allBrown + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte bananas = 5;
        byte weightBananas = 80;
        int resultWightBananas = bananas * weightBananas;

        short milk = 200;
        byte weightMilk = 105;
        int resultWeightMilk = milk * weightMilk / 100;

        byte iceCream = 2;
        byte weightIceCream = 100;
        int resultWeightIceCream = iceCream * weightIceCream;

        byte eggs = 4;
        byte weightEgg = 70;
        int resultWeightEggs = eggs * weightEgg;

        int breakfast = resultWightBananas + resultWeightMilk + resultWeightIceCream + resultWeightEggs;
        float gramInKg = 1000;
        float kgBreakfast = breakfast / gramInKg;

        System.out.println("Вес спортзавтрака составляет " + breakfast + " г, или " + kgBreakfast + " кг");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        byte planKg = 7;
        short gramInKg = 1000;
        int planGram = planKg * gramInKg;

        short minusMin = 250;
        short minusMax = 500;

        int dayMin = planGram/ minusMin;
        System.out.println("Если спортсмен будет каждый день терять по " + minusMin + " г, то на похудение уйдет " + dayMin + " дней");

        int dayMax = planGram / minusMax;
        System.out.println("Если спортсмен будет каждый день терять по " + minusMax + " г, то на похудение уйдет " + dayMax + " дней");

        int average = (dayMin + dayMax) / 2;
        System.out.println("В среднем на похудение потребуется " + average + " дней");
    }
    public static void task8 () {
        System.out.println("Задача 8");

        byte monthInYear = 12;

        int salaryMashaBefore = 67760;
        int YearSalaryMashaBefore = salaryMashaBefore * monthInYear;
        double plus = 1.1;
        double salaryMashaAfter = salaryMashaBefore * plus;
        double YearSalaryMashaAfter = salaryMashaAfter * monthInYear;
        double differenceMasha = YearSalaryMashaAfter - YearSalaryMashaBefore;
        System.out.println("Маша теперь получает " + salaryMashaAfter + " рублей в месяц. Годовой доход вырос на " + differenceMasha + " рублей");

        int salaryDenisBefore = 83690;
        int YearSalaryDenisBefore = salaryDenisBefore * monthInYear;
        double salaryDenisAfter = salaryDenisBefore * plus;
        double YearSalaryDenisAfter = salaryDenisAfter * monthInYear;
        double differenceDenis = YearSalaryDenisAfter - YearSalaryDenisBefore;
        System.out.println("Денис теперь получает " + salaryDenisAfter + " рублей в месяц. Годовой доход вырос на " + differenceDenis + " рублей");

        int salaryChristinaBefore = 76230;
        int YearSalaryChristinaBefore = salaryChristinaBefore * monthInYear;
        double salaryChristinaAfter = salaryChristinaBefore * plus;
        double YearSalaryChristinaAfter = salaryChristinaAfter * monthInYear;
        double differenceChristina = YearSalaryChristinaAfter - YearSalaryChristinaBefore;
        System.out.println("Денис теперь получает " + salaryChristinaAfter + " рублей в месяц. Годовой доход вырос на " + differenceChristina + " рублей");
    }

}
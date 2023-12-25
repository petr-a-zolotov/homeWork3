public class Main {
    public static void main(String[] args) {

         System.out.println("Задание 1");
         byte A = 22;
        System.out.println("Значение переменной А с типом byte равно " + A);
        int B = 4678;
        System.out.println("Значение переменной B с типом int равно " + B);
        short C = 568;
        System.out.println("Значение переменной C с типом short равно " + C);
        long D = 40000099;
        System.out.println("Значение переменной D с типом long равно " + D);
        float E =3.787f;
        System.out.println("Значение переменной E с типом float равно " + E);
        double F = 2.98769876;
        System.out.println("Значение переменной F с типом double равно " + F);


        System.out.println("Задание 3");
        int pupils1 = 23;
        int pupils2 = 27;
        int pupils3 = 30;
        int allPupils = pupils1 + pupils2 + pupils3;
        int paper = 480;
        int paperOnePupils = paper / allPupils;
        System.out.println("На каждого ученика рассчитано " + paperOnePupils + "листов бумаги");


        System.out.println("Задание 4");
        int bottleBehind2minutes = 16;
        int bottleBehind1minutes = bottleBehind2minutes / 2;
        int bottleBehind20minutes = bottleBehind1minutes * 20;
        System.out.println("За 20 минут машина произвела " + bottleBehind20minutes + "штук бутылок");
        int bottleBehindDay = bottleBehind1minutes * 1440;
        System.out.println("За сутки машина произвела " + bottleBehindDay + "штук бутылок");
        int bottleBehind3Day = bottleBehindDay * 4320;
        System.out.println("За три дня машина произвела " + bottleBehind3Day + "штук бутылок");
        int bottleBehindMonth = bottleBehind1minutes * 43200;
        System.out.println("За месяц машина произвела " + bottleBehindMonth + "штук бутылок");

        System.out.println("Задание 5");
        int canPaint = 120;
        int canWhitePaint = 2;
        int canBrawnPaint = 4;
        int canPaintForOneclas = canBrawnPaint + canWhitePaint;
        int clas = canPaint /canPaintForOneclas;
        int allCanWhitePaint = clas * canWhitePaint;
        int allCanBrawnPaint = clas * canBrawnPaint;
        System.out.println("В школе, где " + clas +"классов, нужно " + allCanBrawnPaint + "коричневой краски и " + allCanWhitePaint + "банок белой краски");

        System.out.println("Задание 6");
        int bananas = 5;
        int weightOneBanana = 80;
        int weightBananas = bananas * weightOneBanana;
        int milk = 200;
        int weightOneMilk = 105;
        int weightMilk = weightOneMilk *2;
        int iceCream = 2;
        int weightOneIceCream =100;
        int weightIceCream = iceCream * weightOneIceCream;
        int eggs = 4;
        int weightOneEgg = 70;
        int weightEgg =eggs * weightOneEgg;
        int weightBreakfast = weightBananas + weightMilk + weightIceCream + weightEgg;
        float weightBreakfastKilogramm = weightBreakfast/1000f;
        System.out.println("Вес завтрака в граммах" + weightBreakfast + "грамм, вес завтрака в килограммах" + weightBreakfastKilogramm + "кг");

         System.out.println("Задание 7");
         int lossWeight = 7;
         float oneLossWeight = 0.250f;
         float twoLossWeight = 0.5f;
         float daysForLossWeight1 = lossWeight / oneLossWeight;
        System.out.println( "Если терять по 250 граммов в день, то потребуется" +daysForLossWeight1 + "дней");
        float daysForLossWeight2 = lossWeight / twoLossWeight;
        System.out.println( "Если терять по 500 граммов в день, то потребуется" +daysForLossWeight2 + "дней");
        float midleDays = (daysForLossWeight1 + daysForLossWeight2) / 2;
        System.out.println( "В среднем потребуется" +midleDays + "день");

        System.out.println("Задание 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        double salaryMashaAfterPromotion = salaryMasha * 0.1 + salaryMasha;
        double salaryDenisAfterPromotion = salaryDenis * 0.1 + salaryDenis;
        double salaryKristinaAfterPromotion = salaryKristina * 0.1 + salaryKristina;
        double salaryMashaBehindYear = salaryMasha * 12;
        double salaryDenisBehindYear = salaryDenis * 12;
        double salaryKristinaBehindYear = salaryKristina * 12;
        double salaryMashaBehindYearAfterPromotion = salaryMashaAfterPromotion * 12;
        double salaryDenisBehindYearAfterPromotion = salaryDenisAfterPromotion * 12;
        double salaryKristinaBehindYearAfterPromotion = salaryKristinaAfterPromotion * 12;
        double differenceSalaryMasha = salaryMashaBehindYearAfterPromotion - salaryMashaBehindYear;
        double differenceSalaryDenis = salaryDenisBehindYearAfterPromotion - salaryDenisBehindYear;
        double differenceSalaryKristina = salaryKristinaBehindYearAfterPromotion - salaryKristinaBehindYear;
         System.out.println("Маша теперь получает " + salaryMashaBehindYearAfterPromotion + "рублей. Годовой доход вырос на" + differenceSalaryMasha + "рублей");
        System.out.println("Денис теперь получает " + salaryDenisAfterPromotion + "рублей. Годовой доход вырос на" + differenceSalaryDenis + "рублей");
        System.out.println("Кристина теперь получает " + salaryKristinaAfterPromotion + "рублей. Годовой доход вырос на" + differenceSalaryKristina + "рублей");






    }

}
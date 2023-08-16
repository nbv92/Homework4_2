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

    public static void task1() {
        System.out.println("Task1");
        int sum=0;
        int mounth=1;
        while(sum<=2459000){
            sum+=15000;
            mounth+=1;
        }
        System.out.println("Месяц "+mounth+" сумма накоплений равна "+sum);
    }

    public static void task2() {
        System.out.println("Task2");
        int i = 1;
        while (i<=10){
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");
        for(i=10;i>=1;i--){
            System.out.print(i + " ");
            i--;
        }
    }

    public static void task3() {
        System.out.println("Task3");
        int people = 12000000;
        int year=1;
        int pull = 0;
        while(year<=10){
            pull = (people/1000)*9;
            people+=pull;
            System.out.println("Год "+ year + ", численность населения составляет " + people);
            year+=1;
        }
    }

    public static void task4() {
        System.out.println("Task4");
        int sum = 15000;
        int proc = 0;
        int mounth = 0;
        while(sum<=12000000){
            mounth+=1;
            proc = sum / 100 * 7;
            sum+=proc;
            System.out.println("Месяц "+ mounth + ", суммы накоплений "+ sum);
        }
    }

    public static void task5() {
        System.out.println("Task5");
        int sum = 15000;
        int proc = 0;
        int mounth = 0;
        while(sum<=12000000){
            mounth+=1;
            proc = sum / 100 * 7;
            sum+=proc;
            if (mounth%6==0) {
                System.out.println("Месяц " + mounth + ", суммы накоплений " + sum);
            }
        }
    }

    public static void task6() {
        System.out.println("Task6");
        int sum = 15000;
        int proc = 0;
        int mounth = 0;
        int year = 1;
        while(year <= 9){
            if (mounth%12==0){
                year+=1;
            }
            mounth+=1;
            proc = sum / 100 * 7;
            sum+=proc;
            if (mounth%6==0) {
                System.out.println("Месяц " + mounth + ", суммы накоплений " + sum);
            }
    }

    public static void task7() {
        System.out.println("Task7");
        int Friday =5;
        while(Friday<31){
            System.out.println("Сегодня пятница, " + Friday + "-е число. Необходимо подготовить отчет");
            Friday+=7;
        }
    }

    public static void task8() {
        System.out.println("Task8");
        int year=0;
        while(year<= 2100){
            year+=79;
            if ((year>=1800)&&(year<=2100)){
                System.out.println(year);
            }
        }
    }
}



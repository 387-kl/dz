public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int age = 15;
        if (age >= 18) {
            System.out.println("Человеку 18 или болшее лет");
        } else
            System.out.println("Возраст соверено летия еще не исполнился надо еще немного подождать");

        int agr = 10;
        if (agr <= -5) {
            System.out.println("Сегодня холдно, Надо одеть шапку");
        }
        if (agr >= 5) {
            System.out.println("Сегодня тепло, можно не одевать шапку");
        }
        int scor = 50;
        if (scor >= 60) {
            System.out.println("Придеться плотить штраф");
        } else
            System.out.println("Можно ехать спокойно");
        int ahe = 4;
        if (ahe >= 2 && ahe < 6) {
            System.out.println("Ему надо ходить в детский сад");
        }
        if (ahe >= 7 && ahe < 17) {
            System.out.println("Ему нужно ходить в школу");
        }
        if (ahe >= 18 && ahe < 21) {
            System.out.println("Ему нужно ходить в универеситет");
        }
        if (ahe >= 21) {
            System.out.println("Ему пора ходить на работу");
        }
        int ake = 7;
        if (ake <= 5) {
            System.out.println("Он не может кататься на отракционах");
        }
        if (ake >= 5 && ake < 14) {
            System.out.println("Он может кататься только в соопражениие взрослого");
        }
        if (ake >= 14) {
            System.out.println("Он может кататься без соопровождения");
        }
        int poezd = 42;
        if (poezd >= 60) {
        } else
            System.out.println("Можно сидеть");
        if (poezd >= 60 && poezd < 120) {
            System.out.println("Придеться стоять");
        }
        int one = 0;
        if (one >= 0) {
        } else
            System.out.println("Первое число");
        int two = 3;
        if (two >= 3) {
        } else
            System.out.println("Второе число");
        int three = 3;
        if (three >=3) {
        }else
            System.out.println("трете число");
    }
}
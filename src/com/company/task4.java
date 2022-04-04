package com.company;

public class task4 {
    public static void main(String[] args) {
        String значення = "Ні, NO, N, -, No";
        int опція = 2;
        switch (значення) {
            case "Так, ОК, Yes, Y, +, Ok":
                switch (опція) {
                    case 1:
                        System.out.println("Погодитись");
                        break;
                    case 2:
                        System.out.println("Погодитись");
                        break;
                    case 3:
                        System.out.println("Погодитись");
                        break;
                    case 4:
                        System.out.println("Погодитись");
                        break;
                    case 5:
                        System.out.println("Погодитись");
                        break;
                    case 6:
                        System.out.println("Погодитись");
                        break;
                    default:
                        System.out.println("Ви вказали неіснуючий символ!");
                }
                break;
            case "Ні, NO, N, -, No":
                switch (опція) {
                    case 1:
                        System.out.println("Відмовитись");
                        break;
                    case 2:
                        System.out.println("Відмовитись");
                        break;
                    case 3:
                        System.out.println("Відмовитись");
                        break;
                    case 4:
                        System.out.println("Відмовитись");
                        break;
                    case 5:
                        System.out.println("Відмовитись");
                        break;
                    default:
                        System.out.println("Ви вказали неіснуючий символ!");

                }

        }
    }
}

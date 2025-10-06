
import java.util.Scanner;

class App {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
                int choice;
                do{
                    System.out.println("\nВведите номер задачи:");
            System.out.println("ЗАДАНИЕ 1: МЕТОДЫ");
            System.out.println("1 - Сумма знаков");
            System.out.println("2 - Есть ли позитив");
            System.out.println("3 - Большая буква");
            System.out.println("4 - Делитель");
            System.out.println("5 - Многократный вызов");
            
            System.out.println("ЗАДАНИЕ 2: УСЛОВИЯ");
            System.out.println("6 - Безопасное деление");
            System.out.println("7 - Строка сравнения");
            System.out.println("8 - Тройная сумма");
            System.out.println("9 - Возраст");
            System.out.println("10 - Вывод дней недели");
            
            System.out.println("ЗАДАНИЕ 3: ЦИКЛЫ");
            System.out.println("11 - Числа наоборот");
            System.out.println("12 - Степень числа");
            System.out.println("13 - Одинаковость");
            System.out.println("14 - Левый треугольник");
            System.out.println("15 - Угадайка");
            
            System.out.println("ЗАДАНИЕ 4: МАССИВЫ");
            System.out.println("16 - Поиск последнего значения");
            System.out.println("17 - Добавление в массив");
            System.out.println("18 - Реверс");
            System.out.println("19 - Объединение");
            System.out.println("20 - Удалить негатив");
            System.out.println("0 - Выход");
            System.out.print("Ваш выбор: ");
            choice=scanner.nextInt();

            switch (choice) {
                case 1:
                    Func.sumLastNumsTest();
                    break;
            case 2:
            Func.isPositiveTest();break;
            case 3:Func.isUpperCaseTest();break;
            case 4:Func.isDivisorTest();break;
            case 5:Func.lastNumSumTest();break;
            case 6:Func.safeDivTest();break;
            case 7:Func.makeDecisionTest();
            case 8:Func.sum3Test();break;
            case 9:Func.ageTest ();break;
            case 10:Func.printDaysTest();break;
            case 11:Func.reverseListNumsTest();break;
            case 12:Func.powTest();break;
            case 13:Func.equalNumTest();break;
            case 14:Func.leftTriangleTest();break;
            case 15:Func.guessGame();break;
            case 16:Func.findLastTest();break;
            case 17:Func.addTest();break;
            case 18:Func.reverseTest();break;
            case 19:Func.concatTest();break;
            case 20:Func.deleteNegativeTest();break;
                default:System.out.println("Неверный выбор!");
                    break;
            }
            do {
                System.out.println("Решить ещё задачу? ");
            System.out.println("1 - да  0 - выйти");
            choice=scanner.nextInt();
            } while (choice!=1 && choice!=0);
            

        }while(choice!=0);
    }
    
    
}

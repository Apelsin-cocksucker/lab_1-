import java.util.Random;
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
                    sumLastNumsTest();
                    break;
            case 2:
            isPositiveTest();break;
            case 3:isUpperCaseTest();break;
            case 4:isDivisorTest();break;
            case 5:lastNumSumTest();break;
            case 6:safeDivTest();break;
            case 7:makeDecisionTest();
            case 8:sum3Test();break;
            case 9:ageTest ();break;
            case 10:printDaysTest();break;
            case 11:reverseListNumsTest();break;
            case 12:powTest();break;
            case 13:equalNumTest();break;
            case 14:leftTriangleTest();break;
            case 15:guessGame();
            case 16:findLastTest();break;
            case 17:addTest();break;
            case 18:reverseTest();break;
            case 19:concatTest();break;
            case 20:deleteNegativeTest();break;
                default:System.out.println("Неверный выбор!");
                    break;
            }
            System.out.println("Решить ещё задачу? ");
            System.out.println("1 - да  0 - выйти");
            choice=scanner.nextInt();

        }while(choice!=0);
    }
    private static int[] getArrayInput() {
        int input;
        do{
            System.out.println("Введите положительное целое число: ");
            input=scanner.nextInt();
        }while(input<0);
        int[] arr = new int[input];
        
        for (int i = 0; i < input; i++) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    public static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public static int sumLastNums (int x){
        return x%10+(x/10)%10;
    }
    public static void sumLastNumsTest(){
        
        int input;
        do{
            System.out.println("Введите целое число большее чем 9: ");
            input=scanner.nextInt();
        }while(input<10);
        System.out.println("Сумма двух последних знаков числа: "+sumLastNums (input));
    }
    public static boolean isPositive (int x){
        return x>0;
    }
    public static void isPositiveTest(){
        System.out.println("Введите целое число: ");
        int input=scanner.nextInt();
        if (isPositive(input)){
            System.out.println("Число положительное");
        }
        else{
            System.out.println("Число отрицптельное");
        }
    }
    public static boolean isUpperCase (char x){
        return x>='A' && x<='Z';
    }
    public static void isUpperCaseTest(){
        String input;
        do{
        System.out.println("Введите одну букву латинского алфавита: ");
        input=scanner.nextLine();}
        while(input.length()>1);
        if (isUpperCase(input.charAt(0))){
            System.out.println("Символ - большая буква в диапазоне от ‘A’ до ‘Z’");
        }
        else{
            System.out.println("Символ не принадлежит диапазону от 'A' до 'Z'");
        }
    }
    public static boolean isDivisor (int a, int b){
        return (a!=0 && b%a==0) || (b!=0 && a%b==0);
    }
    public static void isDivisorTest(){
        System.out.println("Введите целое число #1: ");
        int input1=scanner.nextInt();
        System.out.println("Введите целое число #2: ");
        int input2=scanner.nextInt();
        if (isDivisor(input1, input2)){
            System.out.println("Одно из этих чисел делит другоe нацело");
        }
        else{
            System.out.println("Ниодно из этих чисел не делит другоe нацело");
        }
    }
    public static int lastNumSum(int a, int b){
        return a%10+b%10;
    }
    public static void lastNumSumTest(){
        System.out.println("Введите целое число #1: ");
        int input1=scanner.nextInt();
        System.out.println("Введите целое число #2: ");
        int input2=scanner.nextInt();
        int currentSum=lastNumSum(input1, input2);
        System.out.println("Введите целое число #3: ");
        input1=scanner.nextInt();
        currentSum=lastNumSum(input1, currentSum);
        System.out.println("Введите целое число #4: ");
        input1=scanner.nextInt();
        currentSum=lastNumSum(input1, currentSum);
        System.out.println("Введите целое число #5: ");
        input1=scanner.nextInt();
        System.out.println("Сумма цифр разрфда единиц пяти чисел: "+lastNumSum(input1, currentSum));

    }
    public static double safeDiv (int x, int y){
        if (y==0){
            return 0;}
        return (double) x/y; 
    }
    public static void safeDivTest(){
        System.out.println("Введите целое число #1: ");
        int input1=scanner.nextInt();
        System.out.println("Введите целое число #2: ");
        int input2=scanner.nextInt();
        System.out.println("Результат деления чисел: "+safeDiv(input1, input2));
    }
    public static String makeDecision (int x, int y){
        if (x<y){
            return x+" < "+y; 
        }
        if (x>y){
            return x+" > "+y;
        }
        return x+" = "+y;
    }
    public static void makeDecisionTest(){
        System.out.println("Введите целое число #1: ");
        int input1=scanner.nextInt();
        System.out.println("Введите целое число #2: ");
        int input2=scanner.nextInt();
        System.out.println(makeDecision(input1, input2));
    }
    public static boolean sum3 (int x, int y, int z){
        return x+y==z || x+z==y || y+z==x;
    }
    public static void sum3Test(){
        System.out.println("Введите целое число #1: ");
        int input1=scanner.nextInt();
        System.out.println("Введите целое число #2: ");
        int input2=scanner.nextInt();
        System.out.println("Введите целое число #3: ");
        int input3=scanner.nextInt();
        if (sum3(input1, input2, input3)){
            System.out.println("2 числа образуют сумму третьего");
        }
        else{
            System.out.println("Среди трёх чисел нет суммы двух других");
        }
    } 
    public static String age (int x){
        if (x%10==1 && x!=11){
            return x+" год";
        }
        if (x%10<=4 && x%10>=2 && (x>14 || x<12)){
            return x+" года";
        }
        return x+" лет";
    }
    public static void ageTest (){
        System.out.println("Введите целое число лет: ");
        int input1=scanner.nextInt();
        System.out.println(age(input1));
    }
    public static void printDays (String x){
        switch (x) {
            case "понедельник":
            System.out.println("понедельник");
            case "вторник":
            System.out.println("вторник");
            case "среда":
            System.out.println("среда");
            case "четверг":
            System.out.println("четверг");
            case "пятница":
            System.out.println("пятница");
            case "суббота":
            System.out.println("суббота");
            case "воскресенье":
            System.out.println("воскресенье");
            default:
            System.out.println("это не день недели");
                break;
        }
    }
    public static void printDaysTest(){
        System.out.println("Введите день недели: ");
        String input1=scanner.nextLine();
        printDays(input1);
    }
    public static String reverseListNums (int x){
        String result = "";
        do  {
            result+=x+" ";
            x--;
        } while (x!=-1);
        return result;
    }
    public static void reverseListNumsTest(){
        System.out.println("Введите целое число : ");
        int input1=scanner.nextInt();
        System.out.println(reverseListNums(input1));
    }
    public static int pow (int x, int y){
        int result=1;
        for (int i=0;i<y;i++){
            result*=x;
        }
        return result;
    }
    public static void powTest(){
        System.out.println("Введите целое число #1: ");
        int input1=scanner.nextInt();
        int input2;
        do{
            System.out.println("Введите положительное целое число #2: ");
            input2=scanner.nextInt();
        }while(input2<0);
        System.out.println(input1+"^"+input2+"="+pow(input1, input2));
    } 
    public static boolean equalNum (int x){
        if (x<10){
            return true;
        }
        int number=x%10;
        do {
            x/=10;
            if (number!=x%10){
                return false;
            }
        } while (x!=0);
        return true;
    }
    public static void equalNumTest(){
        int input2;
        do{
            System.out.println("Введите положительное целое число: ");
            input2=scanner.nextInt();
        }while(input2<0);
        if (equalNum(input2)){
            System.out.println("Все знаки числа одинаковы");
        }
        else{
            System.out.println("В числе присутствуют разные цифры");
        }
    }
    public static void leftTriangle (int x){
            for (int i=1;i<=x;i++){
                for (int j=0;j<i;j++){
                System.out.print("*");
                }
                System.out.println();
            }
    }
    public static void leftTriangleTest(){
        int input2;
        do{
            System.out.println("Введите положительное целое число: ");
            input2=scanner.nextInt();
        }while(input2<0);
        leftTriangle(input2);
    }
    public static void guessGame(){
        Random random = new Random();
        int number=random.nextInt(0,10);
        int tries=0,input;
        do {
            System.out.println("Введите цифру от 0 до 9: ");
            input=scanner.nextInt();
            tries++;
            if (input==number){
                System.out.println("Вы угадали!");
            }
            else{
                System.out.println("Вы не угадали. ");
            }
        } while (input!=number);
        System.out.println("Вы отгадали число за "+ tries+" попытки");
     }
    public static int findLast (int[] arr, int x){
    for (int i=arr.length-1;i>=0;i--){
        if (arr[i]==x){
            return i;
        }
    }
    return -1;  
    }
    public static void findLastTest(){
        int[] arr=getArrayInput();
        System.out.println("Введите целое число : ");
        int input1=scanner.nextInt();
        System.out.println("Результаты поиска числа: "+findLast(arr, input1));
    }
     public static int[] add (int[] arr, int x, int pos){
        int[] newArr=new int[arr.length+1];
        int i=0;
        while(i<pos){
            newArr[i]=arr[i];
            i++;
        }
        newArr[i+1]=x;
        while(i<arr.length){
            i++;
            newArr[i+1]=arr[i];
        }
        return newArr;
     }
     public static void addTest(){
        int[] arr=getArrayInput();
        System.out.println("Введите целое число: ");
        int input1=scanner.nextInt();
        int input2;
        do{
            System.out.println("Введите номер позиции вставки числа: ");
            input2=scanner.nextInt();
        }while(input2<0 || input2>=arr.length);
        System.out.print("Итоговый массив: ");
        printArray(add(arr, input1, input2));
        
     }
      public static void reverse (int[] arr){
        int tempNum, arrLen=arr.length;
        for (int i=0;i<=arrLen/2;i++){
            tempNum=arr[i];
            arr[i]=arr[arrLen-i-1];
            arr[arrLen-i-1]=tempNum;
        }
      }
      public static void reverseTest(){
        int[] arr=getArrayInput();
        reverse(arr);
        System.out.println("Перевёрнутый массив: ");
        printArray(arr);
      }
    
    public static int[] concat (int[] arr1,int[] arr2){
        int[] newArr=new int[arr1.length+arr2.length];
        for (int i=0;i<arr1.length;i++){
            newArr[i]=arr1[i];
        }
        for (int i=0;i<arr2.length;i++){
            newArr[arr1.length+i]=arr2[i];
        }
        return newArr;
    }
    public static void concatTest(){
        System.out.println("Массив #1");
        int[] arr1=getArrayInput();
        System.out.println("Массив #2");
        int[] arr2=getArrayInput();
        System.out.println("Объединение двух массивов: ");
        printArray(concat(arr1, arr2));
    }
    public static int[] deleteNegative (int[] arr){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>=0){
                count++;
            }
        }
        int j=0;
        int[] newArr=new int[count];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>=0){
                newArr[j]=arr[i];
                j++;
            }
        }
        return newArr;
    }
    public static void deleteNegativeTest(){
        int[] arr=getArrayInput();
        System.out.println("Массив без отрицательных чисел: ");
        printArray(deleteNegative(arr));
    }
    
}

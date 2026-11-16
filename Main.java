import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double result = 0;
        
        while (true) { 
            System.out.printf("%n=== Домашняя бухгалтерия ===%n1. Добавить доход%n2. Добавить расход%n3. Показать баланс%n4. Выход%n%nВыберите действие: ");
            byte action = scan.nextByte();
            scan.nextLine();

            if(action == 1){
                System.out.print("Введите число: ");
                double debit = scan.nextDouble();

                if(debit >= 0){
                    result += debit;
                }
                else if(debit < 0){
                    System.out.println("Введите положительное число");
                }
            }
            else if(action == 2){
                System.out.print("Введите расход: ");
                double credit = scan.nextDouble();

                if(credit >= 0){
                    result -= credit;
                }
                else if(credit < 0){
                    System.out.println("Введите положительное число");
                }
            }
            else if(action == 3){
                System.out.println("Ваш баланс: " + result);
            }
            else if(action == 4){
                break;
            }
            else{
                System.out.println("Такого действия нет");
            }

            action = 0;
        }
    }
}

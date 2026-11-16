import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 0;
        boolean run = true;
        
        while (run == true) { 
            System.out.printf("%n=== Домашняя бухгалтерия ===%n1. Добавить доход%n2. Добавить расход%n3. Показать баланс%n4. Выход%n%nВыберите действие: ");
            if(scanner.hasNextByte()){
                byte action = scanner.nextByte();
                scanner.nextLine();

                switch(action){
                
                    case (1):
                        System.out.print("Введите число: ");
                        if(scanner.hasNextDouble()){
                            double income = scanner.nextDouble();
                            if(income >= 0){
                                balance += income;
                            }
                            else {
                                System.out.println("Введите положительное число");
                            }
                        } else{
                            System.out.printf("%nНужно ввести число%n");
                            scanner.nextLine();
                        }

                        break;
                    case (2):
                        System.out.print("Введите расход: ");
                        if(scanner.hasNextDouble()){
                            double expence = scanner.nextDouble();

                            if(expence >= 0){
                                balance -= expence;
                            }
                            else{
                                System.out.println("Введите положительное число");
                            }
                        } 
                        else{
                            System.out.printf("%nНужно ввести число%n");
                            scanner.nextLine();
                        }

                        break;
                    case (3):
                        System.out.printf("Ваш баланс: %.2f %n", balance);
                        break;
                    case (4):
                        run = false;
                        break;
                    default:
                        System.out.println("Такого действия нет");
                }
            }
            else{
                System.out.println("Нужно ввести число");
            }
            
            
        }
    }
}

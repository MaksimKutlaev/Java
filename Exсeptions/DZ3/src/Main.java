
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            PrintWriter printWriter = null;

            try {
                System.out.println("Введите данные в следующем формате: ФИО Дата_рождения Номер_телефона Пол");
                String userData = scanner.nextLine();

                String[] data = userData.split(" ");

                if (data.length != 4) {
                    throw new IllegalArgumentException("Ошибка: неверное количество данных.");
                }

                String fullName = data[0];
                String dateOfBirth = data[1];
                String phoneNumber = data[2];
                String gender = data[3];

                String[] fullNameParts = fullName.split(",");
                if (fullNameParts.length != 3) {
                    throw new IllegalArgumentException("Ошибка: неверный формат ФИО.");
                }
                String lastName = fullNameParts[0].trim();
                String firstName = fullNameParts[1].trim();
                String middleName = fullNameParts[2].trim();

                try {
                    LocalDate.parse(dateOfBirth, java.time.format.DateTimeFormatter.ofPattern("dd.MM.yyyy"));
                } catch (DateTimeParseException e) {
                    throw new IllegalArgumentException("Ошибка: неверный формат даты рождения.");
                }

                try {
                    Long.parseLong(phoneNumber);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Ошибка: неверный формат номера телефона.");
                }

                if (!gender.equals("f") && !gender.equals("m")) {
                    throw new IllegalArgumentException("Ошибка: неверное значение пола.");
                }

                String fileName = lastName + ".txt";
                File file = new File(fileName);
                FileWriter fileWriter = new FileWriter(file, true);
                printWriter = new PrintWriter(fileWriter);

                printWriter.println("<"+lastName+">"+"<" + firstName+">" +"<"+ middleName +">"+"<"+ dateOfBirth+">"+"<"
                        + phoneNumber+">"+"<" + gender+">");

                System.out.println("Данные успешно записаны в файл: " + fileName);

            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Ошибка при работе с файлом: " + e.getMessage());
                e.printStackTrace();
            } finally {
                if (printWriter != null) {
                    printWriter.close();
                }
                scanner.close();
            }
        }
    }

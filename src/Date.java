/*
 * Java. My first program
 * @author Aleksandr Karpushin
 * @version dated May 5, 2020
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;


public class Date {

    static String name;
    static String patronymic;
    static String surname;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> nameList = new ArrayList<String>();
        ArrayList<String> patronymicList = new ArrayList<String>();
        ArrayList<String> surnameList = new ArrayList<String>();
        /*
        ArrayList<String> listDate = new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            listDate.add(reader.readLine());
        }
        // ввод списка с клавиатуры
        */
        System.out.println("Выберите цифру 0, 1 или 2, в зависимости от того, что вы хотите сгенерировать:" + "\n" + "0 - только имя" + "\n" + "1 - имя и отчество" + "\n" + "2 - имя, отчество и фамилию");
        String a1 = reader.readLine();

        int randomName = (int) (Math.random() * 7);
        int randomPatronymic = (int) (Math.random() * 7);
        int randomSurname = (int) (Math.random() * 7);
        // writeFile(listDate);
        readName(nameList); // чтение полей и вывод на экран полей с txt
        readPatronymic(patronymicList);
        readSurname(surnameList);
        // print(nameList); //вывод на экран

        int b1 = Integer.parseInt(a1);
        if (b1 == 0) {
            System.out.println(nameList.get(randomName));
        } else if (b1 == 1) {
            System.out.println(nameList.get(randomName) + " " + patronymicList.get(randomPatronymic));
        } else if (b1 == 2) {
            System.out.println(nameList.get(randomName) + " " + patronymicList.get(randomPatronymic) + " " + surnameList.get(randomSurname));
        } else {
            System.out.println("видимо, вас устраивает свое имя");
        }
    }

    public static void print(ArrayList<String> nameList) {
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(i));
        }
    }

    public static void readName(ArrayList<String> nameList) throws Exception {
        FileReader fileReaderName = new FileReader("name.txt");
        Scanner scan = new Scanner(fileReaderName);
        while (scan.hasNextLine()) {
            nameList.add(scan.nextLine());
        }
        fileReaderName.close();

    }

    public static void readPatronymic(ArrayList<String> patronymicList) throws Exception {
        FileReader fileReaderPatronymic = new FileReader("patronymic.txt");
        Scanner scan = new Scanner(fileReaderPatronymic);
        while (scan.hasNextLine()) {
            patronymicList.add(scan.nextLine());
        }
        fileReaderPatronymic.close();

    }

    public static void readSurname(ArrayList<String> surnameList) throws Exception {
        FileReader fileReadSurname = new FileReader("surname.txt");
        Scanner scan = new Scanner(fileReadSurname);
        while (scan.hasNextLine()) {
            surnameList.add(scan.nextLine());
        }
        fileReadSurname.close();

    }
// listName.add(writeFile.write(listName.get(i) + "\n"));
    /*
    public static void readFile() throws Exception {
        FileReader readFile = new FileReader("listDate.txt");
        {
            Scanner scan = new Scanner(readFile);
            while (scan.hasNextLine()) {
                nameList.add(scan.nextLine());
            }

        }
    }
  // метод для чтения txt с генерированными именами
    */
}


package com.tugas;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        calculateBMI();
    }
    private static void calculateBMI() throws Exception {
        boolean ulang = true;
        do {
            System.out.print("Masukkan Berat Badan dalam kg: ");
            Scanner s = new Scanner(System.in);
            float weight = s.nextFloat();
            System.out.print("Masukkan Tinggi Badan dalam cm: ");
            float height = s.nextFloat();

            float bmi = (100 * 100 * weight) / (height * height);

            System.out.println("====================================");
            System.out.println("Angka BMI kamu adalah: " + bmi);
            printBMICategory(bmi);
        } while (ulang);
    }
    private static void printBMICategory(float bmi) {
        if(bmi < 16) {
            System.out.println("Status BMI Sangat Kurus");
        }else if (bmi < 18) {
            System.out.println("Status BMI Kurus");
        }else if (bmi < 24) {
            System.out.println("Status BMI Normal");
        }else if (bmi < 29) {
            System.out.println("Status BMI Gemuk");
        }else {
            System.out.println("Status BMI Terlalu Gemuk");
        }
        System.out.println("====================================");
        System.out.println("====================================");
    }
}
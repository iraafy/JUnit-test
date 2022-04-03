import java.util.*;
import java.util.Scanner;

public class SistemBank {

    float saldo;

    public SistemBank() {
        saldo = 50;
        System.out.println("===========");
        System.out.println("Sistem BANK");
        System.out.println("===========");
    }

    void Deposit(float jumlah) {
        if (jumlah <= 500) {
            saldo += jumlah;
            System.out.println("Deposit: $" + jumlah);
        } else {
            System.out.println("Deposit telah mencapai batas maksimum.");   
        }
    }

    void TarikTunai(float jumlah) {
        if (jumlah <= 100) {
            if (saldo <= jumlah) {
                System.out.println("Tarik Tunai Gagal, Saldo Tidak Mencukupi.");
            } else {
                saldo -= jumlah;
                System.out.println("Tarik Tunai $" + jumlah + " Berhasil");
            }
        } else {
            System.out.println("Tarik tunai telah mencapai batas maksimum."); 
        }
        
    }

    void display() {
        System.out.println("Sisa saldo = $" + saldo);
    }

    public static void main(String args[]) {

        SistemBank s = new SistemBank();
        Scanner scan = new Scanner(System.in);
        int inputUser = scan.nextInt();
        if (inputUser == 1) {
            s.Deposit(10);
            s.display();
        } else if (inputUser == 2) {
            s.TarikTunai(100);
            s.display();
        }
        else {
            System.out.println("Menu salah");
        }
    }
}
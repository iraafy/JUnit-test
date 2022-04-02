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
        saldo += jumlah;
        System.out.println("Deposit: $" + jumlah);
    }

    void TarikTunai(float jumlah) {
        if (saldo <= jumlah) {
            System.out.println("Tarik Tunai Gagal, Saldo Tidak Mencukupi.");
        } else {
            saldo -= jumlah;
            System.out.println("Tarik Tunai $" + jumlah + " Berhasil");
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
            s.TarikTunai(5);
            s.display();
        }
        else {
            System.out.println("Menu salah");
        }
    }
}
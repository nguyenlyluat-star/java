import java.util.Scanner;

public class Mang1chieu {
    static int[] M;
    static int N;
    static Scanner Sc;

    static void Nhap() {
        for (int i = 0; i < N; i++) {
            System.out.print("M[" + i + "] = ");
            M[i] = Sc.nextInt();
        }
    }

    static void Xuat() {
        for (int i = 0; i < N; i++)
            System.out.println("M[" + i + "] = " + M[i]);
    }

    static void Tim(int x) {
        boolean found = false;
        for (int i = 0; i < N && !found; i++) {
            if (M[i] == x)
                found = true;
        }
        if (!found)
            System.out.println("Khong tim thay phan tu x = " + x + " trong mang");
        else
            System.out.println("Tim thay x trong mang");
    }

    static void Xoa(int x) {
        for (int i = 0; i < N; i++) {
            if (M[i] == x) {
                for (int j = i; j < N - 1; j++) {
                    M[j] = M[j + 1];
                }
                N--;
                System.out.println("Da xoa phan tu " + x);
                return;
            }
        }
        System.out.println("Khong tim thay phan tu de xoa!");
    }

    static void Sapxep() {
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N - 1; j++)
                if (M[j] > M[j + 1]) {
                    int tam = M[j];
                    M[j] = M[j + 1];
                    M[j + 1] = tam;
                }
        System.out.println("Mang da duoc sap xep tang dan!");
    }

    static void Menu(int Item) {
        switch (Item) {
            case 1:
                Nhap();
                break;
            case 2:
                Xuat();
                break;
            case 3:
                System.out.print("Nhap x can tim = ");
                int x1 = Sc.nextInt();
                Tim(x1);
                break;
            case 4:
                System.out.print("Nhap x can xoa = ");
                int x2 = Sc.nextInt();
                Xoa(x2);
                break;
            case 5:
                Sapxep();
                break;
            default:
                System.out.println("Nhap sai !!!");
        }
    }
    public static void main(String[] args) {
        Sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu mang N = ");
        N = Sc.nextInt();
        M = new int[N]; // cấp phát mảng

        char c = 'y';
        while (c == 'y' || c == 'Y') {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Nhap mang:");
            System.out.println("2. Xuat mang:");
            System.out.println("3. Tim x trong mang");
            System.out.println("4. Xoa phan tu x trong mang");
            System.out.println("5. Sap xep mang");
            System.out.print("Chon chuc nang (1-5): ");
            int Item = Sc.nextInt();
            Menu(Item);

            System.out.print("Nhap ky tu 'Y/y' de tiep tuc, phim bat ky de thoat: ");
            c = Sc.next().charAt(0);
        }
        Sc.close();
    }
}

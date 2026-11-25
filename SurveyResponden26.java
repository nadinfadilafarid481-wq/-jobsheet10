import java.util.Scanner;
public class SurveyResponden26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] survey = new int[10][6];
        int i = 0, j = 0;
        double total ,rata;

        for (i = 0; i < 10; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (j = 0; j < 6; j++) {
                int jawaban;
                
                do {
                    System.out.print("Pertanyaan " + (j + 1) + " (1-5): ");
                    jawaban = sc.nextInt();
                    if (jawaban < 1 || jawaban > 5) {
                        System.out.println("Jawaban harus 1-5, ulangi!");
                    }
                } while (jawaban < 1 || jawaban > 5)
                survey[i][j] = jawaban;
                
            }
        }
        System.out.println("\nRata-rata setiap responden:");
        for (i = 0; i < 10; i++) {
            total = 0;                  
            for (j = 0; j < 6; j++) {
                total += survey[i][j];        
            }
            rata = total / 6;           
            System.out.println("Responden ke-" + (i + 1) + ": " + rata);
        }  
        System.out.println("\nRata-rata setiap pertanyaan:");
        for (j = 0; j < 6; j++) {
            total = 0;                  
            for (i = 0; i < 10; i++) {
                total += survey[i][j];         
            }
            rata = total / 10;          
            System.out.println("Pertanyaan " + (j + 1) + ": " + rata);
        }
    }
}
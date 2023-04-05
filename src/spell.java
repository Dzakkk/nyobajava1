import java.util.Scanner;

public class spell {
    public static void main(String[] args) {
    String mantra;
    Scanner sc = new Scanner(System. in);

        System.out.println("Input your spell");
    mantra = sc.nextLine();
    mantra = mantra.toLowerCase(); // Mengubah input menjadi Lower Case atau Huruf Kecil
        if (mantra.charAt(0) == 'a' && mantra.charAt(mantra.length() - 1) == 'a'){
        System.out.println("Your spell is magical");
    } // Kondisi jika huruf pertama dan terakhir adalah a
        else if (mantra.charAt(0) == 'l' && mantra.charAt(mantra.length() - 1) == 'k'){
        System.out.println("Your spell is magical");
    } // Kondisi jika huruf pertama adalah l dan huruf terakhir adalah k
        else if (mantra.charAt(0) == 'b' && mantra.charAt(2) == 'c'){
        System.out.println("Your spell is magical");
    } // Kondisi jika huruf pertama adalah b dan huruf terakhir adalah c dengan jarak 1 huruf
        else {
        System.out.println("Your spell is nonmagical");
    }
}
}


package HelloJava;

public class Main6 {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!:You passed :D");
                break;
            case 'B':
            case 'C':
                System.out.println("Good :You passed :)");
                break;
            case 'D':
                System.out.println("Not Bad :You passed :/");
                break;
            case 'F':
                System.out.println("\n" +
                        "Unfortunately You Failed :(");
                break;
        }

    }
}

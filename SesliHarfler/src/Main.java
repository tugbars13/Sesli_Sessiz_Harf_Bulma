public class Main {
    public static void main(String[] args) {
        char harf = 'U';
        switch (harf) {
            case 'A':
            case 'E':
            case 'O':
            case 'I':
            case 'U':
                System.out.println("Girdiğiniz harf seslidir");
                break;
            default:
                System.out.println("Girdiğiniz harf sessizdir");
        }
    }
}
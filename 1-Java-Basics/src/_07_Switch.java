public class _07_Switch {
    public static void main(String[] args) {
        int level = 2;
        String result =
                switch (level) {
            case 1 -> ("Easy");
            case 2 -> ("Medium");
            case 3 -> ("Hard");
            default -> ("Random level");
        };
        System.out.println(result);
    }
}

// Old Method
// switch (day) {
//    case 1:
//        System.out.println("Today is Sunday");
//        break;
//    case 2:
//        System.out.println("Today is Monday");
//        break;
//    default:
//        System.out.println("Looking forward to the Weekend");

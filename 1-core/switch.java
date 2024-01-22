// Switch Case (Latest version),  -> instead of : and break;

class Switch {
    public static void main(String[] args) {
        int day = 3;

        String result = switch (day) {
            case 2 -> "Monday";
            case 1 -> "Sunday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Not valid input";
        };
        System.out.println(result);
    }
}
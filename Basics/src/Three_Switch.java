public class Three_Switch
{
    public static void main(String[] ars)
    {
        //-----------------Switch case----------------
        System.out.println("Enter number for days of week (1 to 7):");
        int dayNumber = Integer.parseInt(System.console().readLine());

        String dayName = switch (dayNumber)
        {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid number";
        };
        //string templates
        System.out.println(STR."for day number \{dayNumber} the day is \{dayName}");

        //-------------multiple statements to be executed in one case------------------
        System.out.println("Enter sports name(Hokey, Kabbadi, Frisby):");
        String sportsName = System.console().readLine();
        switch (sportsName)
        {
            case "Hokey" -> {
                System.out.println("Hokey is india's national game.");
                System.out.println("Hokey player are cool.");
            }
            case "Kabbadi" -> {
                System.out.println("Kabbadi is not india's national game.");
                System.out.println("Kabbadi player are cool.");
            }
            case "Frisby" -> {
                System.out.println("Frisby is not india's national game.");
                System.out.println("Frisby player are cool.");
            }
            default -> System.out.println("Enter valid sports name.");
        }
    }
}
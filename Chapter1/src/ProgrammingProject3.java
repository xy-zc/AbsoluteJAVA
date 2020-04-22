public class ProgrammingProject3 {

    public static void main(String[] args) {

        String first = "zeming";
        String last = "chen";

        first = pigLatin(first);
        last = pigLatin(last);

        System.out.println("\"" + first + " " + last + "\"");

    }

    private static String pigLatin(String line) {
        String result = "";

        result = line.substring(1, 2).toUpperCase() + line.substring(2) + line.substring(0, 1) + "ay";
//        result = result.substring(0, 0).toUpperCase() + result.substring(1, result.length()) + "ay";

        return result;
    }

}

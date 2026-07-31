package View;

public class Colors {

    public static final String RESET = "\u001B[0m";
    public static final String BOLD = "\u001B[1m";
    
    //palette
    public static final String CYAN = "\u001B[36m";    //headers and menu numbers
    public static final String BLUE = "\u001B[34m";    //secondary borders
    public static final String GREEN = "\u001B[32m";   //success / active / approved
    public static final String YELLOW = "\u001B[33m";  //warnings / pending
    public static final String RED = "\u001B[31m";     //errors / exit / rejected
    public static final String GRAY = "\u001B[90m";    // table borders and muted text
    public static final String WHITE = "\u001B[37m";   // standard text highlights

    //header output
    public static void showHeader(String title) {
        String line = "═".repeat(60);
        System.out.println(CYAN + "╔" + line + "╗" + RESET);
        System.out.printf(CYAN + "║" + BOLD + " %-58s " + RESET + CYAN + "║\n" + RESET, title.toUpperCase());
        System.out.println(CYAN + "╚" + line + "╝" + RESET);
    }

    //user feedback outputs
    public static void success(String msg) {
        System.out.println(GREEN + "✔ " + msg + RESET);
    }

    public static void error(String msg) {
        System.out.println(RED + "✖ " + msg + RESET);
    }

    public static void warning(String msg) {
        System.out.println(YELLOW + "⚠ " + msg + RESET);
    }

    //divider
    public static void showDivider() {
        System.out.println(GRAY + "─".repeat(62) + RESET);
    }
}
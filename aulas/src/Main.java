import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'f';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("products:");
        System.out.printf("%s, which price is $ %.2f %n", product1, price1);
        System.out.printf("%s, which price is $ %.2f %n", product2, price2);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender: %s %n", age, code, gender );
        System.out.println();
        System.out.printf("Measure with eight decimal places: %.8f %n", measure);
        System.out.printf("Rouded (three decimal places): %.3f %n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f %n", measure);

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}
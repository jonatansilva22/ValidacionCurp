//Jonatan Eduardo Silva Fragoso
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CurpValidacion {

    private static final Logger LOG = Logger.getLogger("Validate.CurpValidacion");

    public static void main(String[] args) {

        LOG.setLevel(Level.WARNING);

        if (args.length == 0) {
            LOG.severe("No se introdujo ningun caracter para la CURP");
            System.exit(1);
        }

        String CURP = args[0];

        if (verificarCurp(CURP)) {
            System.out.printf("La CURP introducida %s es válida%n", CURP);
            LOG.info("OK");
        } else {
            System.out.printf("La CURP introducida %s no es válida%n", CURP);
            LOG.info("FAIL");
        }
    }

        public static boolean verificarCurp(String CURP) {
            boolean expression = false;

            final String CurpValida = "^[A-Z]{1}[AEIOU]{1}[A-Z]{1}[A-Z]{1}[0-9]{6}(H|M)(AS|BC|BS|CC|CL|CM|CS|CH|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS|NE)[BCDFGHJKLMNÑPQRSTVXZWY]{3}[A-Z0-9]{1}[0-9]{1}";
            expression = Pattern.matches(CurpValida,CURP);
            return expression;
    }
}
package analizadoreslexico;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jesus
 */

public class CorreoElectronico {

    public static void main(String[] args) {
        String email = "jesusmanuelariascruz29@hotmail.com";
        String regex = "^[a-zA-Z0-9]+([._]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+([.-]?[a-zA-Z0-9]+)*\\.[a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("La direccion de correo es valida.");
        } else {
            System.out.println("La direccion de correo no es válida.");
        }//Cierra else
    }//Cierra metódo main
}//Cierra clase ValidacionCorreo

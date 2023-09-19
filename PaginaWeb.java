package analizadoreslexico;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
 *
 * @author jesus
 */
public class PaginaWeb {
    public static void main(String[] args) {
        String texto = "Este es un www.texto.com de ejemplo que contiene algunas direcciones de paginas web. "
                + "Puedes encontrar URLs como https://www.ejemplo.com, http://www.otra-url.com, o incluso www.sitio-web.org."
                + " Asegúrate de buscar todas las URLs, independientemente de si comienzan con ”https://”, ”http://”, o simplemente ”www.”. "
                + "Recuerda que las URLs pueden contener letras, números y caracteres especiales como guiones y puntos. También pueden "
                + "tener www.extensiones.com como ”.html” o ”.php”. ¡Buena suerte en tu búsqueda!";

        Pattern pattern = Pattern.compile("\\b(?:https?://|www\\.)\\S+\\b");
        Matcher matcher = pattern.matcher(texto);


        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        
    }
}



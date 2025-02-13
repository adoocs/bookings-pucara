package pucara;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Otros {

    public static void pausar(int mills) {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public static boolean validarCorreo(String correo) {
        //Patron para validacion de correo
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(correo);
        return mather.find();
    }
    
    public static String fechaHora() {
        java.util.Date date = new java.util.Date();
        DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return fechaHora.format(date);
    }
}

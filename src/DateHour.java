import java.util.Locale;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;


public class DateHour {
    public static void main(String[] args) throws Exception {
     
   
//Frase a ser criada: Olá, Hoje é (data), (dia)!(bom dia || boa tarde || boa noite)!

String congrats;
Locale Brazil = new Locale ("pt", "BR");
LocalDate Today = LocalDate.now();
System.out.println(Today.getDayOfWeek().getDisplayName(TextStyle.FULL, Brazil));
String DayOfWeek= (Today.getDayOfWeek().getDisplayName(TextStyle.FULL, Brazil));
LocalDateTime dateNow = LocalDateTime.now();

if (dateNow.getHour() >=0 && dateNow.getHour() <12) {
 congrats="Bom Dia !";   
} else if (dateNow.getHour() >=12 && dateNow.getHour() <18) {
congrats= "Boa Tarde !";    
} else{
    congrats="Boa Noite!";
}

System.out.println("Olá, Hoje é " + Today + ", "+ DayOfWeek+ ". "+ congrats);

}

}

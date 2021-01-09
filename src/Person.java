import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Person {



    private static String vardas;
    private static String pavarde;
    private static int g_metai;
    private static int g_menesis;
    private static int g_diena;

    public Person(String vardas, String pavarde, int g_metai, int g_menesis, int g_diena) {

        Person.vardas = vardas;
        Person.pavarde = pavarde;
        Person.g_metai = g_metai;
        Person.g_menesis = g_menesis;
        Person.g_diena = g_diena;

    }


    public static String getVardas() {
        return vardas;
    }

    public static String getPavarde() {
        return pavarde;
    }

    public static int getG_metai() {
        return g_metai;
    }

    public static int getG_menesis() {
        return g_menesis;
    }

    public static int getG_diena() {
        return g_diena;
    }

    public static void setVardas(String vardas) {
        Person.vardas = vardas;
    }

    public static void setPavarde(String pavarde) {
        Person.pavarde = pavarde;
    }

    public static void setG_diena(int g_diena) {
        Person.g_diena = g_diena;
    }

    public static void setG_menesis(int g_menesis) {
        Person.g_menesis = g_menesis;
    }

    public static void setG_metai(int g_metai) {
        Person.g_metai = g_metai;
    }


    public static void amžius (){

        LocalDate siandien = LocalDate.now();
        LocalDate gimimoD = LocalDate.of(g_metai, g_menesis, g_diena);

        int metai = Period.between(gimimoD,siandien).getYears();
        System.out.println("Amžius: "+metai);

    }

    public static void likoD (){


        LocalDate siandien = LocalDate.now();
        LocalDate gimimoD = LocalDate.of(2021, g_menesis, g_diena);

        long dienos = ChronoUnit.DAYS.between(siandien,gimimoD);
        System.out.println("Liko dienų iki gimimo dienos: "+dienos);

    }

    public static void info (){

        System.out.println("      Informacija" );

        System.out.println("Vardas: "+getVardas());

        System.out.println("Pavardė: "+getPavarde());

        System.out.printf("Amžius: ");
        amžius();


    }

}
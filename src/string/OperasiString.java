package string;

public class OperasiString {
    public static void main(String[] args) {
        String kota = "Yogyakarta";

        System.out.println(kota);

        char[] unsikaChar = { 'U','N','I','S','K','A' };
        String unsikaString = new String(unsikaChar);
        System.out.println(unsikaString);

        System.out.println(kota.toUpperCase());
        System.out.println(kota.toLowerCase());
        System.out.println(kota.substring(5));
        System.out.println(kota.substring(0,4));
    }
}

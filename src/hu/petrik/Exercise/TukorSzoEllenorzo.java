package hu.petrik.Exercise;

import hu.petrik.Stack.Stack;

public class TukorSzoEllenorzo {

    private static String szo;
    private static Stack<Character> verem;

    public static void Run(String beolvasottSzo) {
        TukorSzoEllenorzo.szo = beolvasottSzo;
        TukorSzoEllenorzo.verem = new Stack<>();

        for (int i = 0; i < beolvasottSzo.length()-2; i++) {
            for (int j = i+2; j < beolvasottSzo.length(); j++) {
                String reszSzo = beolvasottSzo.substring(i,j+1);
                if (isTukorSzoE(reszSzo)) {
                    System.out.println(reszSzo);
                }
            }
        }

        //return isTukorSzoE(beolvasottSzo);
    }

    private static boolean isTukorSzoE(String s) {
        verem.empty();
        for (int i = 0; i < s.length()/2; i++) {
            verem.push(s.charAt(i));
        }
        int i = s.length()/2 + s.length()%2;
        while (i < s.length() && s.charAt(i) == verem.pop()) {
            i++;
        }

        return i == s.length();
    }

    public static boolean isPalindromE(String mondat) {
        String ujMondat = mondat;
        String[] irasJelek = {".", "!", "\\?", ":", "-", ",", " ", "\'", "\""};
        for (String irasJel: irasJelek) {
            ujMondat.trim();
            ujMondat.replaceAll(irasJel+"", "");
        }
        ujMondat.toUpperCase();

        return isTukorSzoE(ujMondat);
    }
}

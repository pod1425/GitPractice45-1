public class Main {
    public static void main(String[] args) {
        String s = "Hello, world!";
        String a = "Hello, world!";

        boolean result = a.equals(s);
        System.out.println(result);

        //immutable
        s = s.toUpperCase();//toate literele mari
        s = s.toLowerCase();//toate literele mici

        s = s.replace("hello", "Goodbye");//inlocuieste literele sau cuv

        char answer = s.charAt(3);// poluciti simbol po indexu
        System.out.println(answer);

        System.out.println(s);

        String string = "ABCD";

        string = string
                .toLowerCase()
                .toUpperCase()
                .replace("A", "B")
                .replace("D", "C");

        int size = string.length();
        System.out.println(size);

        for (int i = 0; i < string.length(); i++) {
            char symbol = string.charAt(i);
            System.out.println(symbol);
        }

        String a1 = "Boris";
        String a2 = "Boriz";

        String a3 = "Boriss";
        String a4 = "Boris";

        System.out.println(a1.compareTo(a2));
        System.out.println(a2.compareTo(a1));
        System.out.println(a3.compareTo(a4));//comparare

        System.out.println(a4.concat(a3));
        System.out.println(a4 + a3);

        boolean contain = a4.contains("oris");//verificare continere
        boolean ends = a4.endsWith("Z");

        System.out.println(contain);
        System.out.println(ends);

        char symbol = a4.charAt(0); //polucenie po indexu
        int index = a4.indexOf("B"); //polucenie indexu po symbolu
        System.out.println(index);

        System.out.println(a4.isEmpty());

        String repeat = a4.repeat(5); // povtoriti
        System.out.println(repeat);

        String substring = a4.substring(1, 2); // de la primul la al doile neinclus
        System.out.println(substring);
        substring = a4.substring(1); // de la primul pina la capat
        System.out.println(substring);

        String string1 = "   abc   ";
        System.out.println(string1.trim()); // sterge pina la si dupa, in dependenta





        System.out.println(a4.startsWith("B"));


    }
}

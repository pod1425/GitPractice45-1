import java.util.Arrays;

public class SplitExample {

    public static void main(String[] args) {
        int[] a = {3, 4, 5};

        System.out.println(Arrays.toString(a));

        String pushkin = "U lukamore dub zeleonii, zlataia zepi na dube ton";
        String[] array = pushkin.split(" ");
        for (int i = 0; i < args.length; i++) {
            System.out.println(array[i]);
        }

    }
}

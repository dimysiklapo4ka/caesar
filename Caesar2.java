package InitDnepr.pset2.caesar;

import java.io.IOException;

/**
 * Created by d1mys1klapo4ka on 13.03.2017.
 */
public class Caesar2 {

    public static void main(String[] args) throws IOException {

        HelpCaesar h = new HelpCaesar();
        if (args.length != 1){
            h.setStatus(1);
            h.massege(h.getStatus());
            return;
        }

        char[] a = args[0].toCharArray();
        for (int i = 0, n = a.length; i < n; i++){
            if (a[i] >= 'A' && a[i] <= 'Z' || a[i] >= 'a' && a[i] <= 'z'){
                h.setStatus(3);
                h.massege(h.getStatus());
                return;
            }
        }

        int key = Integer.parseInt(args[0]);
        if (key <= 0){
            h.setStatus(2);
            h.massege(h.getStatus());
            return;
        }

        String text = h.getText();

        char[] text1 = text.toCharArray();

        h.printCodingText(text1, key);

    }
}

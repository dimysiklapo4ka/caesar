package InitDnepr.pset2.caesar;

import java.io.IOException;

/**
 * Created by d1mys1klapo4ka on 14.03.2017.
 */
public class Caesar{

    public static void main(String[] args) throws IOException {

        Helper helpers = new Helper();
        helpers.message(helpers.getStatus());

        int key = helpers.test(args) % 26;
        //int key = 13;

        String name = helpers.getString();

        char[] name_to_char = name.toCharArray();

        for (int i = 0, n = name_to_char.length; i < n; i++){

            if(name_to_char[i] >= 'A'&& name_to_char[i] <= 'Z'){

                name_to_char[i] = (char) ((name_to_char[i] - 65 + key) % 26 + 65);
            }

            if (name_to_char[i] >= 'a'  && name_to_char[i] <= 'z' ){

                name_to_char[i] = (char) ((name_to_char[i] - 97 + key) % 26 + 97);
            }

            System.out.print(name_to_char[i]);
        }

        System.out.println();
    }
}

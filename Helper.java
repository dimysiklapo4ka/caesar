package InitDnepr.pset2.caesar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by d1mys1klapo4ka on 15.03.2017.
 */
class Helper {

    private int status = 0;

    String getString() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();
        reader.close();

        return text;
    }

    int test(String args[]){

        if (args.length != 1 ){

            setStatus(1);
        }

        int key = Integer.parseInt(args[0]);

        if (key <= 0){

            setStatus(2);
        }

        return key;
    }

     void message(int status){

        switch (status){

            case 1:{
                System.out.println("Введите аргумент командной строки.");
                break;
            }
            case 2:{
                System.out.println("Аргумент должен быть целым положительным числом.");
                break;
            }
        }
     }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

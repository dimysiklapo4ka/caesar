package InitDnepr.pset2.caesar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by d1mys1klapo4ka on 19.03.2017.
 */
class HelpCaesar {

    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    void massege(int status) {

        switch (status) {

            case 1: {
                System.out.println("Введите один аргумент командной строки.");
                break;
            }
            case 2: {
                System.out.println("В аргумент введите положительное число.");
                break;
            }
            case 3: {
                System.out.println("Введите числовое значение в аргумент командной строки.");
                break;
            }
            default:
                break;
        }
    }

    void printCodingText(char[] text1, int key){

        for (int i = 0, n = text1.length; i < n; i++) {
            if (text1[i] >= 'A' && text1[i] <= 'Z') {

                text1[i] = (char) ((text1[i] - 65 + key) % 26 + 65);
            }

            if (text1[i] >= 'a' && text1[i] <= 'z') {

                text1[i] = (char) ((text1[i] - 97 + key) % 26 + 97);
            }
            System.out.print(text1[i]);
        }
    }

    String getText() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        return text;
    }

//    void test(int key, char[] a){
//
//        for (int i = 0, n = a.length; i < n; i++){
//            if (a[i] >= 'A' && a[i] <= 'Z' || a[i] >= 'a' && a[i] <= 'z'){
//                setStatus(3);
//                return;
//            }
//        }
//
//        if (key <= 0){
//            setStatus(2);
//            return;
//        }
//    }
}

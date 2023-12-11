import java.util.*;
public class Agam {
        int l, w, h;
        String color;

        Agam(int len, int wid, int hei, String c) {
            l = len;
            w = wid;
            h = hei;
            color = c;
        }

        Agam(int len, int wid, int hei) {
            l = len;
            w = wid;
            h = hei;
            color = "Red";
        }

        Agam(int len, int wid) {
            l = len;
            w = wid;
            h = 10;
            color = "Blue";
        }

        Agam(int len) {
            l = len;
            w = 10;
            h = 10;
            color = "Green";
        }

        Agam() {
            l = 10;
            w = 10;
            h = 10;
            color = "Black";
        }

        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            String words[] = input.split("\\s+");
            Agam a;

            if (words.length == 4) {
                int l1, w1, h1;
                String c1;
                l1 = Integer.parseInt(words[0]);
                w1 = Integer.parseInt(words[1]);
                h1 = Integer.parseInt(words[2]);
                c1 = words[3];
                a = new Agam(l1, w1, h1, c1);
            } else if (words.length == 3) {
                int l1, w1, h1;
                l1 = Integer.parseInt(words[0]);
                w1 = Integer.parseInt(words[1]);
                h1 = Integer.parseInt(words[2]);
                a = new Agam(l1, w1, h1);
            } else if (words.length == 2) {
                int l1, w1;
                l1 = Integer.parseInt(words[0]);
                w1 = Integer.parseInt(words[1]);
                a = new Agam(l1, w1);
            } else if (words.length == 1) {
                int l1;
                l1 = Integer.parseInt(words[0]);
                a = new Agam(l1);
            } else {
                a = new Agam();
            }

            int v = a.vol();
            int sa = a.sa();
            System.out.println(a.color + " " + v + " " + sa);
        }

        public int vol() {
            int r1 = l * w * h;
            return r1;
        }

        public int sa() {
            int r2 = (l * w) + (w * h) + (l * h);
            int r3 = 2 * r2;
            return r3;
        }
    }

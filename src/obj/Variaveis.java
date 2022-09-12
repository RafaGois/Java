package obj;

public class Variaveis {


        public static int x;
        public int y;

    public static void main(String[] args) {
        Variaveis a = new Variaveis();
        Variaveis b = new Variaveis();
        a.y = 5;
        b.y = 6;
        a.x = 1;
        b.x = 2;
        System.out.println(a.y);
        System.out.println(b.y);
        System.out.println(a.x);
        System.out.println(b.x);
    }

}

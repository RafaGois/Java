package testes.String;

public class corteModerno {

    public static void main(String[] args) {

        String ordem = "000000000000123456";

        if (Character.compare(ordem.charAt(11),'0') == 0) {
            System.out.println(ordem.substring(12,18));
        } else {
            System.out.println( ordem.substring(11,18));
        }
    }
}

package testes.String;

public class revomerVazio {

    public static void main(String[] args) {
        String str = "Programming is easy to learn";
        String result = str.replaceAll("\\s+","");
        System.out.println(result);
    }

}

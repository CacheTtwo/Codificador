package Codificadores;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        TextoaNumero a=new TextoaNumero();
        String palabra=obj.nextLine();
        System.out.println(""+a.Palabracodigo(palabra));

    }
}

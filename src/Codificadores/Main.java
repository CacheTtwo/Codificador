package Codificadores;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Introduzca su mensaje:");
        Scanner obj=new Scanner(System.in);
        String palabra=obj.nextLine();
        System.out.println(CaesarCipher.alfabeto.length);
        System.out.println(""+CaesarCipher.Codex(palabra, 12));
    }
}

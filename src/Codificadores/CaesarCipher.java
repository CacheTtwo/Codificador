package Codificadores;

public class CaesarCipher implements Alphabet
{
    public static String Codex(String Text, int index)
    {
        String aux="";
        int strin=0;
        int loopy=0;
        boolean varSalida=false;
        do
        {
            if (loopy>=alfabeto.length)loopy=0;
            if (Text.charAt(strin) == alfabeto[loopy])
            {
                if (loopy+index>=alfabeto.length)
                {
                    aux+=alfabeto[(loopy+index)- alfabeto.length];
                    loopy=0;
                    strin++;
                }
                else {
                    aux+=alfabeto[loopy+index];
                    loopy=0;
                    strin++;}
            }
            else if (Text.charAt(strin)==' '){
                strin++;
                aux+=" ";
            }
            if (strin==Text.length())
            {varSalida=true;}
            loopy++;
        }
        while (varSalida!=true);
        return aux;
    }
}

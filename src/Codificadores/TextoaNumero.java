package Codificadores;
public class TextoaNumero implements Alphabet
{

    public static String  Palabracodigo(String Text)
    {
        int porsia=0, loopy=0;
        boolean varSalida=false;
        String Aux="";
        int strin=0;
        do
        {
            if (loopy>=65)loopy=0;
            if (abececedario[loopy]== Text.charAt(strin))
            {
                Aux+=(loopy+1)+" ";
                loopy=0;

                strin++;
            }
            if (strin==Text.length())
            {varSalida=true;}
            loopy++;


        }
        while (varSalida!=true);
        return Aux;
    }

}

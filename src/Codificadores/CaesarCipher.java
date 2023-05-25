package Codificadores;

public class CaesarCipher implements Alphabet
{
    public static String Codex(String Text, int index)
    {
        StringBuilder aux= new StringBuilder();
        int strin=0;
        int loopy=0;
        boolean varSalida=false;
        do
        {
            if (loopy>= alfabetoLowerCase.length)loopy=0;
            if (Text.charAt(strin) == alfabetoLowerCase[loopy])
            {
                if (loopy+index>= alfabetoLowerCase.length)
                {
                    aux.append(alfabetoLowerCase[(loopy + index) - alfabetoLowerCase.length]);
                    loopy=0;
                    strin++;
                }
                else {
                    aux.append(alfabetoLowerCase[loopy + index]);
                    loopy=0;
                    strin++;}
            }

            else if (Text.charAt(strin) == alfabetoUpperCase[loopy])
            {
                if (loopy+index>= alfabetoUpperCase.length)
                {
                    aux.append(alfabetoUpperCase[(loopy + index) - alfabetoUpperCase.length]);
                    loopy=0;
                    strin++;
                }
                else {
                    aux.append(alfabetoUpperCase[loopy + index]);
                    loopy=0;
                    strin++;}
            }
            else if(esCaracter(Text.charAt(strin)))
            {
                aux.append(Text.charAt(strin));
                strin++;
            }
            if (strin==Text.length())
            {varSalida=true;}
            loopy++;
        }
        while (varSalida!=true);
        return aux.toString();
    }

    public static String DeCodex(String codificado, int index)
    {
        int suma=27-index;
        return CaesarCipher.Codex(codificado,suma);


    }
    public static void DeCodexBruto(String Codificador)
    {
        for (int i=0;i<27;i++)
        {
            System.out.println(i+" "+DeCodex(Codificador, i));
        }
    }

    private  static boolean  esCaracter(char caracter) /*Metodo para simplificar la utilizacion de puntuacion en una frase
    y que mantenga coherencia */
    {
        for (int i = 0; i < alfabetoLowerCase.length; i++)
        {
            if (caracter==alfabetoLowerCase[i]||caracter==alfabetoUpperCase[i])return false;
        }

        return true;
    }


}

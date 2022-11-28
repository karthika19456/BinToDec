public class BinToDec 
{
    public static void main(String[] args)
    {
        String str = args[0];
        int decVal = 0;

        for (int i = 0, j = str.length() - 1; i < str.length() && j >= 0; i++, j--)
        {
            if (str.charAt(i) == '1') {
                decVal += Math.pow(2, j);
            }
        }
        System.out.println(decVal);
    }
}
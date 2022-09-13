import java.util.Arrays;

public class PallindromeFormation
{
    public static void main(String[] args)
    {
        System.out.println(canFormPallindrome("AAB"));
    }
    static boolean canFormPallindrome(String str)
    {
        int[] count = new int[256];
      //  Arrays.fill(count, 0);
        for(int i =0;i<str.length();i++)
        {
            count[str.charAt(i)]++;
            int odd = 0;
            for (int j =0;j<256;j++)
            {
                if((count[i]&1)==1){
                    odd++;
                }

                    if(odd>1)
                    {
                        return  false;
                    }else return  true;

            }
        }
        return  false;
    }
}

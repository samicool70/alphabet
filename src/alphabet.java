import java.util.Scanner;
public class alphabet {

    public static void main(String[] args) {

        String linein;
        String alphabet   = "abcdefghijklmnopqrstuvwxyz";
        String alphabetup = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int i,sum=0;
        Scanner datain = new Scanner(System.in);
        while(datain.hasNextLine()){
            sum++;
            linein = datain.nextLine();
            for(i=0;i<linein.length();i++){
                if((linein.charAt(i)>= 'a')&&(linein.charAt(i) <= 'z'))
                    System.out.print(alphabetup.charAt(linein.charAt(i)-'a'));
                else
                if((linein.charAt(i)>= 'A')&&(linein.charAt(i) <= 'Z'))
                    System.out.print(alphabet.charAt(linein.charAt(i)-'A'));
                else
                    System.out.print(linein.charAt(i));
            }
            System.out.print("\n");
        }
        System.out.println("\nNumber of lines:"+sum);
    }
}

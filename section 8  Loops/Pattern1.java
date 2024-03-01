/**
 * Pattern1
 */
public class Pattern1 {

    public static void main(String[] args) {

       // int count=1;
        for (int i=1; i<=5; i++) 
        {
            for( int j=1; j<=5-i+1; j++)
            { 
               System.err.print(j+" ");
              // count++;
                
            }
            System.out.println("");
        }
    }
}
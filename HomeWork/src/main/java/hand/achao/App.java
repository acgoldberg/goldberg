package hand.achao;

/**
 * Hello world!
 *
 */
public class App 
{
   	public static void main(String[] args) {
		System.out.print( "<");
		for(int i = 101;i <= 200;i++) {
            for(int j = 2;j <= (int)Math.sqrt(i);j++) {//把Math.sqrt(i)转换为int类形
                if(i % j == 0){
                    break;
                }
                if(j >= (int)Math.sqrt(i)) {
                	if(i==199)
                	System.out.print(i);
                	else System.out.print(i+",");
                }
            }   
        }
		System.out.print( ">");
	}
}

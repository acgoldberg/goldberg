package hand.achao;


import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[] ={0,45,300,900,6500,6000,8750};
		/*int a[] ={0,45,345,1245,7745,13745,22495};
		int b[] ={0,1500,4500,9000,35000,55000,80000};
		System.out.print("请输入工资:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int tax;
		for(int i=0;i<a.length-1;i++){
			if(n<b[i+1]&&n>b[i]){
				txt = n-
			}
		}*/
		//System.out.println(n);
		//System.out.print("请输入工资:");
		System.out.print("请输入工资:");
		Scanner s = new Scanner(System.in);
		
		double n = s.nextDouble();
		double tax=0;
		if(n<1500&&n>=0){
			tax = n*0.03;
		}
		else if(n<4500){
			tax = 45+(n-1500)*0.1;
		}
		else if(n<9000){
			tax = 345+ (n-4500)*0.20;
		}
		else if(n<35000){
			tax = 1245 + (n-9000)*0.25;
		}
		else if(n<55000){
			tax = 7745 + (n-35000)*0.30;
		}
		else if(n<80000){
			tax = 13745 + (n-55000)*0.35;
		}
		else{
			tax = 22495 + (n-55000)*0.35;
		}
		System.out.println("所需要缴纳的税费为:"+tax);
		
		
	}

}

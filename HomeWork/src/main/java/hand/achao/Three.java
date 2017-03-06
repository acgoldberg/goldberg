package hand.achao;


import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		int b[] ={0,0,31,59,99,129,160,190,221,252,283,314,334,365};
		int num=0;
		System.out.print("输入年月日:");
		Scanner  s = new Scanner(System.in);
		String a = s.nextLine();
		String years = (String) a.subSequence(0, a.indexOf("-"));
		int year = Integer.parseInt(years);
		
		//System.out.println("years="+years);
		String months = (String) a.subSequence(a.indexOf("-")+1,a.lastIndexOf("-"));
		//System.out.println("months="+months);
		String days = (String) a.subSequence(a.lastIndexOf("-")+1,a.length());
		//System.out.println("days="+days);
		int isyears = calyears(years);
		//System.out.println("Integer.parseInt(days)="+Integer.parseInt(days));
		//System.out.println("calyears(years)="+isyears);
		//System.out.println("b[Integer.parseInt(months)-1]="+b[Integer.parseInt(months)]);
		if(Integer.parseInt(months)>=3){
			num = b[Integer.parseInt(months)] + Integer.parseInt(days)+isyears;
		}
		else{
			num = b[Integer.parseInt(months)] + Integer.parseInt(days);
		}
		//System.out.println("num="+num);
		String nextdate=null;
		num++;
		if(isyears==1){
			b[3]++;
			if(num==366){
				year = year + 1;
				months = "1";
				days = "1";
				System.out.println("year="+year);
				System.out.println("nextdate="+year+'-'+months+'-'+days);
			}
			else{
				for(int i=0;i<b.length;i++){
					if(num>b[i]&&num<b[i+1]){
						nextdate = years+"-"+ i+"-"+(num-b[i]);
					}
				}
			}
		}
		else{
			if(num==365){
				year = year + 1;
				months = "1";
				days = "1";
				System.out.println("year="+year);
				System.out.println("nextdate="+year+'-'+months+'-'+days);
			}
			else{
				for(int i=0;i<b.length-1;i++){
					if(num>b[i]&&num<b[i+1]){
						nextdate = years+"-"+ i+"-"+(num-b[i]);
					}
				}
			}
		}
		/*if(num==365&&calyears(years)==0||num==366&&calyears(years)==1){
			years = years + 1;
			months = "1";
			days = "1";
			System.out.println("nextdate="+years+'-'+months+'-'+days);
		}
		else{
			for(int i=0;i<b.length;i++){
				if(num>b[i]&&num<b[i+1]){
					//System.out.println(num+"-"+i+"-"+(num-b[i]));
					//nextdate = years+"-"+ i+"-"+(num-b[i]+calyears(years)); 
					if(Integer.parseInt(months)>=3){
						nextdate = years+"-"+ i+"-"+(num-b[i]);
					}
					else{		
					}
				}
			}
		}*/
		System.out.println("nextdate="+nextdate);
	}
	
	public static int calyears(String years){
		int year = Integer.parseInt(years);
		if(year%4==0&&year%100!=0||year%400==0){
			return 1;
		}
		else{
			return 0;
		}
	}
}

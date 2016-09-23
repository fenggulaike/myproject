
public class fuction {

	public static int sumN(int n){
		int sum=0,m=1;
		while(m<=n&&n>1){
			if(m%2==0){
				sum = sum+(-1)*m;
			}else{
				sum = sum+m;
			}
			m++;
		}
		
		return sum;
	}
	
	public static int sumN1(int n){
		int sum=0;
		while(n>0){
			if( n %2==0){
				sum = sum+(-1)*n;
			}else{
				sum = sum+n;
			}
			n--;
		}
		return sum;
	}
	public static int jieCheng(int n){
		int jieC=1;
		while(n>0){
			jieC = jieC*n;
			n--;
		}
		return jieC;
	}
	public static int sumJieCheng (int n ){
		int sumJiec=0;
		while(n>0){
			if( n % 2==0){
				sumJiec = sumJiec+(-1)*jieCheng(n);
			}else{
				sumJiec = sumJiec+jieCheng(n);
			}
			n--;
		}
		return sumJiec;
	}
	
	public static void main(String[] args) {
		int a = sumJieCheng(4);
		System.out.println(a);
		
		
	}
}

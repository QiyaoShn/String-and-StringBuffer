package shortTime;

public class string {
	public static void main(String[] args) {
		double b;
		for(double i=2;i<5;i+=0.5) {
			b=Math.pow(10,i);
			long startTime=System.nanoTime(); 
			String t= "abc";
			for(int j=0;j<(int)b;j++) {
				t+="abc,123";
			}
			long endTime=System.nanoTime(); 
			System.out.println((endTime-startTime)+"ns"); 
		}
	}
}

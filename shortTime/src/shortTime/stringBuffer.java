package shortTime;

public class stringBuffer {
	public static void main(String[] args) {
		double a;
		for(double i=2;i<5;i+=0.5) {
			a=Math.pow(10,i);
			long startTime=System.nanoTime(); 
			StringBuffer s1 = new StringBuffer();
			for(int j=0;j<(int)a;j++) {
				s1.append("abc,123");
			}
			long endTime=System.nanoTime(); 
			System.out.println((endTime-startTime)+"ns"); 
		}
	}
}

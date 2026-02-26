package day4.Strings;

public class BufferBuilderPerformance {
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		StringBuffer buffer = new StringBuffer("java");
		for(int i=1;i<100000;i++) {
			buffer.append("DSA");
		}
		System.out.println("Buffer time:"+(System.currentTimeMillis()-startTime)+"ms");
		startTime=System.currentTimeMillis();
		StringBuilder builder = new StringBuilder("java");
		for(int i=1;i<100000;i++) {
			builder.append("DSA");
		}
		System.out.println("Buffer time:"+(System.currentTimeMillis()-startTime)+"ms");
	}

}
//by this we can say that builder is most faster than the string builder
//to calcluate the tiome we can use the metthod System.currentTimeMillis();

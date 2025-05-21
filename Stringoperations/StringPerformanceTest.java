/*Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
your answer which one is better.*/


package string;

public class StringPerformanceTest {
	 public static void main(String[] args) {
	        int iterations = 10000;
	        String text = "AIET";

	        // Test with StringBuffer
	        StringBuffer stringBuffer = new StringBuffer();
	        long startTime1 = System.nanoTime();

	        for (int i = 0; i < iterations; i++) {
	            stringBuffer.append(text);
	        }

	        long endTime1 = System.nanoTime();
	        long durationBuffer = endTime1 - startTime1;
	        System.out.println("Time taken by StringBuffer: " + durationBuffer + " nanoseconds");

	        // Test with StringBuilder
	        StringBuilder stringBuilder = new StringBuilder();
	        long startTime2 = System.nanoTime();

	        for (int i = 0; i < iterations; i++) {
	            stringBuilder.append(text);
	        }

	        long endTime2 = System.nanoTime();
	        long durationBuilder = endTime2 - startTime2;
	        System.out.println("Time taken by StringBuilder: " + durationBuilder + " nanoseconds");

	        // Comparison result
	        if (durationBuffer > durationBuilder) {
	            System.out.println("✅ StringBuilder is faster than StringBuffer.");
	        } else {
	            System.out.println("✅ StringBuffer is faster than StringBuilder.");
	        }
	    }
	}


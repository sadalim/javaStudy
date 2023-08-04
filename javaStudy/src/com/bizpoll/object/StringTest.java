package com.bizpoll.object;

public class StringTest {

	public static final String SANG_SU = "abcde";

	public static void main(String[] args) {

		for (int outLoop = 0; outLoop < 3; outLoop++) {

			String a = new String();
			StringBuffer b = new StringBuffer();
			StringBuilder c = new StringBuilder();

			long startTime = System.currentTimeMillis();

			for (int loop = 0; loop < 100000; loop++) {

				a += SANG_SU;

			}

			System.out.println("# String : [" + outLoop + "] " + ((float) (System.currentTimeMillis() - startTime) / 1000));

			startTime = System.currentTimeMillis();

			for (int loop = 0; loop < 100000; loop++) {

				b.append(SANG_SU);

			}

			System.out.println("# StringBuffer : [" + outLoop + "] " + ((float) (System.currentTimeMillis() - startTime) / 1000));

			startTime = System.currentTimeMillis();

			for (int loop = 0; loop < 100000; loop++) {

				c.append(SANG_SU);

			}

			System.out.println("# StringBuilder : [" + outLoop + "] " + ((float) (System.currentTimeMillis() - startTime) / 1000));
			
		}
	}
}

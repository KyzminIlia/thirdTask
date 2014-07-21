package com.example.thirdtask.decoder;

public class Decoder {
	public static String decode(String code) {
		StringBuilder result = new StringBuilder();
		int tetra = 0;
		int zeroCount = 0;
		int oneCount = 0;
		char[] arrayCode = code.toCharArray();
		for (int i = 0; i < arrayCode.length; i++) {
			switch (arrayCode[i]) {
			case '0':
				zeroCount++;
				tetra++;
				break;
			case '1':
				oneCount++;
				tetra++;
				break;
			}
			if (tetra == 3) {
				if (oneCount > zeroCount)
					result.append(1 + "");
				else
					result.append(0 + "");
				tetra = 0;
				oneCount = 0;
				zeroCount = 0;
			}
		}
		return result.toString();

	}
}

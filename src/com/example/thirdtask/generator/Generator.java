package com.example.thirdtask.generator;

import java.util.Random;

public class Generator {
	private StringBuilder code = new StringBuilder();

	public void generateCode() {
		Random random = new Random();
		int lenght = 0;
		do {
			lenght = random.nextInt(30);
			if (lenght % 3 == 0 && lenght != 0)
				for (int i = 0; i < lenght; i++)
					code.append(random.nextInt(2) + "");
		} while (lenght % 3 != 0 || lenght == 0);
	}

	public String getCode() {
		return code.toString();
	}
}

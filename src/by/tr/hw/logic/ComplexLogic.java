package by.tr.hw.logic;

import by.tr.hw.entity.Complex;

public class ComplexLogic {

	public Complex sum(Complex f1, Complex f2) {
		int newValid;
		int newImaginary;

		newValid = f1.getValid() + f2.getValid();
		newImaginary = f1.getImaginary() + f2.getImaginary();

		Complex result = new Complex(newValid, newImaginary);

		return result;

	}

	public Complex minus(Complex f1, Complex f2) {
		int newValid;
		int newImaginary;

		newValid = f1.getValid() - f2.getValid();
		newImaginary = f1.getImaginary() - f2.getImaginary();

		Complex result = new Complex(newValid, newImaginary);

		return result;

	}

}

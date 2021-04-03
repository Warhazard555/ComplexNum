package by.tr.hw.start;

import by.tr.hw.entity.Complex;
import by.tr.hw.logic.ComplexLogic;
import by.tr.hw.view.ComplexView;

public class Main {

	public static void main(String[] args) {

		Complex f1 = new Complex(5, -6);
		Complex f2 = new Complex(-3, 2);

		ComplexLogic logic = new ComplexLogic();
		ComplexView view = new ComplexView();
		
		Complex f3;

		f3 = logic.sum(f1, f2);
		view.printSum(f1, f2, f3);

		f3 = logic.minus(f1, f2);
		view.printMinus(f1, f2, f3);
		

	}

}

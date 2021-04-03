package by.tr.hw.entity;

public class Complex {
	private int valid;
	private int imaginary;

	public Complex() {
	}

	public Complex(int valid, int imaginary) {

		this.valid = valid;
		this.imaginary = imaginary;
	}

	public int getValid() {
		return valid;
	}

	public int getImaginary() {
		return imaginary;
	}

	public void setValid(int valid) {
		this.valid = valid;
	}

	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + imaginary;
		result = prime * result + valid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complex other = (Complex) obj;
		if (imaginary != other.imaginary)
			return false;
		if (valid != other.valid)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Complex [valid=" + valid + ", imaginary=" + imaginary + "]";
	}
	

}

package week03.math;

public class ComplexNumber {
    private double real;
    private double imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public boolean equals(ComplexNumber number) {
        return Double.compare(this.real, number.real) == 0 &&
                Double.compare(this.imag, number.imag) == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(real);
        if (imag >= 0) {
            sb.append(" + ");
        } else {
            sb.append(" - ");
        }
        sb.append(Math.abs(imag)).append("i");
        return sb.toString();
    }

    public double re() {
        return this.real;
    }

    public double imag() {
        return this.imag;
    }

    public ComplexNumber conjugate() {
        return new ComplexNumber(real, -imag);
    }

    public double abs() {
        return Math.sqrt(real * real + imag * imag);
    }

    public ComplexNumber add(ComplexNumber number) {
        return new ComplexNumber(this.real + number.real, this.imag + number.imag);
    }

    public ComplexNumber sub(ComplexNumber number) {
        return new ComplexNumber(this.real - number.real, this.imag - number.imag);
    }

    public ComplexNumber mult(ComplexNumber number) {
        double newReal = this.real * number.real - this.imag * number.imag;
        double newImag = this.real * number.imag + number.real * this.imag;
        return new ComplexNumber(newReal, newImag);
    }

}
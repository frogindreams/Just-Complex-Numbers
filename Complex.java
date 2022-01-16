class Complex {
    private int firstNumber, secondNumber;

    private Complex(int firstParameter, int secondParameter) {
        this.firstNumber = firstParameter;
        this.secondNumber = secondParameter;
    }

    private Complex(int lonelyParameter) {
        this(lonelyParameter, lonelyParameter);
    }

    @Override
    public String toString() {
        return this.firstNumber + " + " + this.secondNumber + "i";
    }

    public static void main(String[] args) {
        Complex c = new Complex(3, 6);
        System.out.println(c);
    }
}

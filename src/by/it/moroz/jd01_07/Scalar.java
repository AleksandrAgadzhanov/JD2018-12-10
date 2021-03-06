package by.it.moroz.jd01_07;

class Scalar extends Var {

    private double value;

    Scalar(double value) {
        this.value = value;
    }

    Scalar(Scalar scalar) {
        this.value = scalar.value;
    }

    Scalar(String strValue) {
        value = Double.parseDouble(strValue);
    }

    @Override
    public String toString() {
        return Double.toString(value);
        // return String.valueOf(value);
    }
}

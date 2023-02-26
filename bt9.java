package bt9;

public class bt9 {

    public class Point2D {

        private float x;
        private float y;
        Point2D p = new Point2D();

        private Point2D(float x, float y) {
            this.x = x;
            this.y = y;
        }

        private Point2D() {
            this.x = 0;
            this.y = 0;
        }

        private float getX() {
            return x;
        }

        private float getY() {
            return y;
        }
    }

    public class Triangle {

        private float width;
        private float hegth;
        Triangle t = new Triangle();

        private Triangle() {
            this.width = 0;
            this.hegth = 0;
        }

        private Triangle(float width, float hegth) {
            this.width = width;
            this.hegth = hegth;
        }

        private float getWidth() {
            return width;
        }

        private float getHegth() {
            return hegth;
        }

        private void setWidth(float width) {
            this.width = width;
        }

        private void setHegth(float hegth) {
            this.hegth = hegth;
        }

        private String ToString() {
            return "(" + this.width + ";" + this.hegth + ")";
        }
    }

    public class Fraction {

        private int numerator;
        private int denominator;

        private Fraction() {
            numerator = 0;
            denominator = 1;
        }

        private Fraction(int numerator, int denominator) {
            if (denominator == 0) {
                System.out.println(" Mau khac 0");
                numerator = 0;
                denominator = 1;
            } else {
                this.numerator = numerator;
                this.denominator = denominator;
            }
        }

        private Fraction(Fraction f) {
            this.numerator = f.numerator;
            this.denominator = f.denominator;
        }

        public Fraction add(Fraction f) {
            int numerator = f.numerator * f.denominator + f.numerator * f.denominator;
            int denominator = f.denominator * f.denominator;
            return new Fraction(numerator, denominator);
        }

        public Fraction sub(Fraction f) {
            int numerator = f.numerator * f.denominator - f.numerator * f.denominator;
            int denominator = f.denominator * f.denominator;
            return new Fraction(numerator, denominator);
        }

        public Fraction mul(Fraction f) {
            int numerator = f.numerator * f.numerator;
            int denominator = f.denominator * f.denominator;
            return new Fraction(numerator, denominator);
        }

        public Fraction div(Fraction f) {

            int l = f.numerator;
            f.numerator = f.denominator;
            f.denominator = l;

            return new Fraction(numerator, denominator);
        }

        public void reduce() {

            int a = numerator;
            int b = denominator;
            int r = a % b;
            while (r != 0) {
                a = b;
                b = r;
                r = a % b;
            }

            numerator /= b;
            denominator /= b;
        }

    }
}

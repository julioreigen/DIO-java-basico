package edu.julio.sintaxe.quintasecao;
/**
 * <h1>Calculator</h1>
 * This class is a simple calculator
 * <p>
 * <b>Note:</b> Read carefully the documentation of this class to enjoy the features offered by the author
 *
 * @author  Gleyson Sampaio, Julio Brito
 * @version 1.1     26/08/2023
 * @since   01/01/2022
 */
public class Calculator {
    /**
     * This method calculates the sum of two double values and returns the result.
     * @param a (double) - The first input value.
     * @param b (double) - The second input value.
     * @return Type: double - the result brings the sum of a and b.
     * Example Usage:
     * <pre> double result = add(3.5, 2.2);</pre>
     * <pre> System.out.println(result); // Output: 5.7</pre>
     */
    public double add(double a, double b){
        return a + b;
    }

    /**
     * This method calculates the subtraction of two double values and returns the result.
     * @param a (double) - The first input value.
     * @param b (double) - The second input value.
     * @return Type: double - the result brings the subtraction of a and b.
     * Example Usage:
     * <pre> double result = sub(3.5, 2.2);</pre>
     * <pre> System.out.println(result); // Output: 1.3</pre>
     */
    public double sub(double a, double b){
        return a - b;
    }

    /**
     * This method calculates the division of two double values and returns the result.
     * @param a (double) - The first input value.
     * @param b (double) - The second input value.
     * @return Type: double - the result brings the division of a by b.
     * Example Usage:
     * <pre> double result = div(3.5, 2.2);</pre>
     * <pre> System.out.println(result); // Output: 1.25</pre>
     */
    public double div(double a, double b){
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }

    /**
     * Multiplies two numbers.
     *
     * @param  a the first number to be multiplied
     * @param  b the second number to be multiplied
     * @return Type: double - the product of the two numbers
     * Example Usage:
     * <pre> double result = mult(3.5, 2.2);</pre>
     * <pre> System.out.println(result); // Output: 7.1</pre>
     */
    public double mult(double a, double b){
        return a * b;
    }

}

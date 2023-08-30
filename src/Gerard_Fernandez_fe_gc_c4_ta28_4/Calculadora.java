package Gerard_Fernandez_fe_gc_c4_ta28_4;

public class Calculadora {
	
	public Calculadora() {
	}
	
	public String calculateAndSetResult(String num1s, String num2s, String operator) {
        double result = 0;
        double num1=Double.valueOf(num1s);
        double num2=Double.valueOf(num2s);

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }

        return Double.toString(result);
	}
   
	
}

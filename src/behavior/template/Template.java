package behavior.template;

public abstract class Template {
	
	public Double calculateExpression(String expression){
		String[] a = expression.split("\\+|\\-");
		Double[] b = new Double[2];
		b[0] = Double.parseDouble(a[0]);
		b[1] = Double.parseDouble(a[1]);
		return calculateTwoNum(b[0],b[1]);
	}
	
	public abstract Double calculateTwoNum(Double a,Double b);
}



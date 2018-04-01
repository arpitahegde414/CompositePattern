package composite;

public class TestComposite {
	   public static void main(String[] args){
		   ArithmeticOperands e1=new NumericOperand(10);
		   ArithmeticOperands e2=new NumericOperand(20);
		   ArithmeticOperands e3=new CompositeOperand(e1,e2,"+");
		   ArithmeticOperands e4=new CompositeOperand(e3, new NumericOperand(10),"/");
		   System.out.println(e4.solve());
	   }

}

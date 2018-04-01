package composite;

public class CompositeOperand implements ArithmeticOperands {
	ArithmeticOperands left;
	ArithmeticOperands right;
	String operator;
	public CompositeOperand(ArithmeticOperands left,ArithmeticOperands right,String operator) {
		this.left=left;
		this.right=right;
		this.operator=operator;
			}
	public int solve(){
		if(this.operator=="+")
			return this.left.solve()+this.right.solve();
		else if(this.operator=="-")
			return this.left.solve()-this.right.solve();
		else if(this.operator=="*")
			return this.left.solve()*this.right.solve();
		else
			return this.left.solve()/this.right.solve();
	}
}

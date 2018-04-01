package composite;

public class NumericOperand implements ArithmeticOperands{
    int value;
    public NumericOperand(int x){
    	this.value=x;
    }
    public int solve(){
    	return this.value;
    }
}

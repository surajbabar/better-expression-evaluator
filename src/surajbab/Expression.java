
package surajbab;


public class Expression {
    private Double value;
    private Expression left;
    private Expression right;
    private Operation operation;

    public Expression(Double value) {
        this.value =value;
    }
    public Expression(Expression left, Expression right, Operation operation) {
        this.left = left;
        this.right = right;
        this.operation = operation;
    }

    public double evaluate() {
        if(value==0)
            return operation.operate(left, right);
        return value;
    }

}
                
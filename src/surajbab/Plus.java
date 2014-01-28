package surajbab;

public class Plus implements Operation {
    @Override
    public double operate(Expression left, Expression right) {
        return left.evaluate() + right.evaluate();

    }
}

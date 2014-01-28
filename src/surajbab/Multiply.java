package surajbab;

public class Multiply implements Operation {
    @Override
    public double operate(Expression left, Expression right) {
        return left.evaluate() * right.evaluate();

    }
}

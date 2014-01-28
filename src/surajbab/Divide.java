package surajbab;


public class Divide implements Operation {
    @Override
    public double operate(Expression left, Expression right) {
        return left.evaluate() / right.evaluate();

    }
}

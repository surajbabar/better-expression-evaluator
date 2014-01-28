package surajbab;


public class Power implements Operation {
    @Override
    public double operate(Expression left, Expression right) {
        return Math.pow(left.evaluate(),right.evaluate());

    }
}

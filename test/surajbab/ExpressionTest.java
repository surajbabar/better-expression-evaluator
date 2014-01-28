package surajbab;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ExpressionTest {
    public static Expression e(double n) {
        return new Expression(n);
    }

    public static Expression e(Expression l, Expression r, Operation o) {
        return new Expression(l, r, o);
    }

    @Test
    public void testExpressionOfTwoNumbersAndPlus() throws Exception {
        Expression expression = e(e(1d), e(1d), new Plus());
        assertEquals(2d, expression.evaluate());
    }

    @Test
    public void testExpressionOfTwoNumbersAndMinus() throws Exception {
        Expression expression = e(e(1d), e(1d), new Minus());
        assertEquals(0d, expression.evaluate());
    }


    @Test
    public void testExpressionOfTwoNumbersAndDivide() throws Exception {
        Expression expression = e(e(1d), e(1d), new Divide());
        assertEquals(2d, expression.evaluate());
    }


    @Test
    public void testExpressionOfTwoNumbersAndMultiply() throws Exception {
        Expression expression = e(e(1d), e(1d), new Multiply());
        assertEquals(2d, expression.evaluate());
    }


    @Test
    public void testPerformATreeOfExpression() throws Exception {
        Expression additionOf3and2 = e(e(3), e(2), new Plus());
        Expression multiplication = e(e(additionOf3and2.evaluate()), e(4), new Multiply());
        Expression finalResult = e(e(multiplication.evaluate()), (e(e(3), e(2), new Multiply())), new Plus());
        assertEquals(26d, finalResult.evaluate());
    }

}

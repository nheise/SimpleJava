package de.heisemedia.education.simplejava.variables;

import org.junit.jupiter.api.Test;

import static java.math.BigInteger.ZERO;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class IntegerTest {
    private static final Integer ONE = 1;
    private static final Integer TWO = 2;
    private static final Integer THREE = 3;

    @Test
    public void addition() {
        assertThat(ONE + TWO).isEqualTo(THREE);
        assertThat(Math.addExact(ONE, TWO)).isEqualTo(THREE);
    }

    @Test
    public void subtraction() {
        assertThat(THREE - ONE).isEqualTo(TWO);
        assertThat(Math.subtractExact(THREE, ONE)).isEqualTo(TWO);
    }

    @Test
    public void multiplication() {
        assertThat(THREE * ONE).isEqualTo(THREE);
        assertThat(Math.multiplyExact(THREE, ONE)).isEqualTo(THREE);
    }

    @Test
    public void division() throws ArithmeticException {
        assertThat(THREE / ONE).isEqualTo(THREE);
        assertThat(Math.divideExact(THREE, ONE)).isEqualTo(THREE);
        assertThatThrownBy(() -> Math.divideExact(TWO, ZERO.intValue())).isInstanceOf(ArithmeticException.class);
    }

    @Test
    public void comparing() {
        assertThat(ONE == ONE).isTrue();
        assertThat(ONE == TWO).isFalse();
        assertThat(ONE != THREE).isTrue();
    }

    @Test
    public void increment() {
        int increment = ONE;
        assertThat(increment++).isEqualTo(ONE);
        assertThat(increment).isEqualTo(TWO);
        assertThat(++increment).isEqualTo(THREE);
    }

    @Test
    public void decrement() {
        int decrement = THREE;
        assertThat(decrement--).isEqualTo(THREE);
        assertThat(decrement).isEqualTo(TWO);
        assertThat(--decrement).isEqualTo(ONE);
    }
}

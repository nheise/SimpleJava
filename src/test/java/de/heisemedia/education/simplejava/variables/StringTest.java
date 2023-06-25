package de.heisemedia.education.simplejava.variables;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {

    @Test
    public void simpleStrings() {
        final String simpleString = "A simple string";

        assertThat(simpleString).isEqualTo("A simple string");
    }

    @Test
    public void connectingStrings() {
        final String part1 = "part 1";
        final String part2 = "part 2";

        final String connectedParts = part1 + " " + part2;

        assertThat(connectedParts).isEqualTo("part 1 part 2");
    }

    @Test
    public void connectingStringsViaStringBuilder() {
        final String part1 = "part 1";
        final String part2 = "part 2";

        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(part1).append(" ").append(part2);

        final String connectedParts = stringBuilder.toString();

        assertThat(connectedParts).isEqualTo("part 1 part 2");
    }

    @Test
    public void connectingStringsViaListStream() {
        final String part1 = "part 1";
        final String part2 = "part 2";
        final String part3 = "part 3";

        final String connectedParts = Stream.of(
                part1,
                part2,
                part3
        ).collect(joining(" "));

        assertThat(connectedParts).isEqualTo("part 1 part 2 part 3");
    }

    @Test
    public void connectingStringsViaStringJoin() {
        final String part1 = "part 1";
        final String part2 = "part 2";
        final String part3 = "part 3";

        final String connectedParts = String.join(" ",
                part1,
                part2,
                part3
        );

        assertThat(connectedParts).isEqualTo("part 1 part 2 part 3");
    }
}

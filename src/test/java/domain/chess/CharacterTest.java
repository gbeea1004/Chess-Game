package domain.chess;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CharacterTest {
    @Test
    public void whitespace() {
        assertThat(Character.isWhitespace(' ')).isTrue();
        assertThat(Character.isWhitespace('\t')).isTrue();
        assertThat(Character.isWhitespace('\n')).isTrue();
        assertThat(Character.isWhitespace('a')).isFalse();
    }

    @Test
    public void identifier() {
        assertThat(Character.isJavaIdentifierStart('^')).isFalse();
        assertThat(Character.isJavaIdentifierStart('A')).isTrue();
        assertThat(Character.isJavaIdentifierStart('a')).isTrue();
        assertThat(Character.isJavaIdentifierStart('_')).isTrue();
        assertThat(Character.isJavaIdentifierStart(' ')).isFalse();
    }
}

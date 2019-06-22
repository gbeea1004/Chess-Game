package utils;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringUtilsTest {
    @Test
    public void appendNewLine() {
        assertThat(StringUtils.appendNewLine("안녕") + "난라임이야").isEqualTo("안녕" + StringUtils.NEWLINE + "난라임이야");
    }
}

package common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.Arrays;
import java.util.Objects;
@AllArgsConstructor
@Getter
public enum Browser {
    CHROME("chrome");
    private final String name;

    public static Browser browserValue(final String value) {
        return Objects.requireNonNull(Arrays.stream(
                        Browser.values()).filter(v -> v.name.equalsIgnoreCase(value))
                .findAny().orElse(null)
        );
    }
}

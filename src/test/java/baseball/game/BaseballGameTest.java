package baseball.game;

import baseball.Application;
import baseball.number.PlayerNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class BaseballGameTest {

    BaseballGame baseballGame = new BaseballGame();
    PlayerNumber playerNumber;
    Scanner scanner;

    public static InputStream getPlayerInput(String input) {
        return new ByteArrayInputStream(input.getBytes());
    }

    @ParameterizedTest
    @DisplayName("숫자가 정상적으로 입력되는지 확인")
    @ValueSource(strings = {"123","1234"})
    void chkInput(String input) {
        //Given
        InputStream in = getPlayerInput(input);
        System.setIn(in);

        org.assertj.core.api.Assertions.assertThat(baseballGame.getPlayerNumber())
                .isEqualTo(input);

    }

}
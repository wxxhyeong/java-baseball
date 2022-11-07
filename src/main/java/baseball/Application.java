package baseball;

import baseball.game.BaseballGame;
import baseball.number.PlayerNumber;
import baseball.number.TargetNumber;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("숫자 야구 게임을 시작합니다.");

        AppConfig appConfig = new AppConfig();
        BaseballGame baseballGame = appConfig.baseballGame();
        baseballGame.start();
    }
}

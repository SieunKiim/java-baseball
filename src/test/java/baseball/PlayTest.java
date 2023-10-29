package baseball;

import baseball.fake.FakeInput;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlayTest {
    FakeInput fakeInput;

    @BeforeEach
    void init(){
        fakeInput = new FakeInput();
    }

    @Test
    @DisplayName("게임 플레이")
    void play(){
        Play firstGame = new Play(fakeInput);
        firstGame.play();

    }
}

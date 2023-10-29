package baseball.fake;

import baseball.InputView;

public class FakeInput implements InputView {

    @Override
    public Integer getNumber() {
        return 234;
    }

    @Override
    public Integer getStartOrEnd() {
        return 2;
    }
}

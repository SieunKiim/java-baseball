package baseball;

public class InputViewImpl implements InputView {

    @Override
    public Integer getNumber() {
        return Util.parseToInteger(InputView.read());
    }

    @Override
    public Integer getStartOrEnd() {
        return Util.parseToInteger(InputView.read());
    }
}

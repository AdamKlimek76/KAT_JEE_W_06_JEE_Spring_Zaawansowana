package pl.coderslab.advanced.abstractclass;

public class BackAppender extends AbstractAppender {

    public void append(String valueToAppend) {
        this.value = this.value.concat(valueToAppend);
    }

}

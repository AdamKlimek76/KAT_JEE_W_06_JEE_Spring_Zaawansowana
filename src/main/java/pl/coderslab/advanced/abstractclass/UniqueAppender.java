package pl.coderslab.advanced.abstractclass;

public class UniqueAppender extends AbstractAppender {

    public void append(String valueToAppend) {
        if (!value.contains(valueToAppend)) {
            this.value = this.value.concat(valueToAppend);
        }
    }

}

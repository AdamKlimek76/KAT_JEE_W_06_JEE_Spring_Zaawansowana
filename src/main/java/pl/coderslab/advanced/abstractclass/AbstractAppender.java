package pl.coderslab.advanced.abstractclass;

public abstract class AbstractAppender {

    protected String value = "";

    public abstract void append(String valueToAppend);

    public String getValue() {
        return value;
    }

}

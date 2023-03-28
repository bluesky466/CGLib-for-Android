package leo.android.cglib.proxy;

public class ProxyException extends RuntimeException {

    private static final long serialVersionUID = 702035040596969930L;

    public ProxyException() {
        super();
    }

    public ProxyException(String msg) {
        this(msg, null);
    }

    public ProxyException(String msg, Throwable throwable) {
        super(msg, throwable);
    }

}

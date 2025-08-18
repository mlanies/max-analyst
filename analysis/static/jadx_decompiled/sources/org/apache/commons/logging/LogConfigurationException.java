package org.apache.commons.logging;

@Deprecated
/* loaded from: classes2.dex */
public class LogConfigurationException extends RuntimeException {
    protected Throwable cause;

    public LogConfigurationException() {
        this.cause = null;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public LogConfigurationException(String str) {
        super(str);
        this.cause = null;
    }

    public LogConfigurationException(Throwable th) {
        this(th == null ? null : th.toString(), th);
    }

    public LogConfigurationException(String str, Throwable th) {
        super(str + " (Caused by " + th + ")");
        this.cause = th;
    }
}

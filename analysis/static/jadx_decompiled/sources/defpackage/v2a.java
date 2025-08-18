package defpackage;

import java.io.Closeable;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class v2a implements Closeable {
    public static final Pattern b = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"", 2);
    public final yic a;

    public v2a(yic yicVar) {
        this.a = yicVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}

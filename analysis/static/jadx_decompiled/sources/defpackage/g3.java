package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class g3 {
    public static final g3 c;
    public static final g3 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (m3.o) {
            d = null;
            c = null;
        } else {
            d = new g3(false, null);
            c = new g3(true, null);
        }
    }

    public g3(boolean z, CancellationException cancellationException) {
        this.a = z;
        this.b = cancellationException;
    }
}

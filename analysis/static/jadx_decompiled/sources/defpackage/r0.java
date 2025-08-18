package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class r0 {
    public static final r0 c;
    public static final r0 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (l1.o) {
            d = null;
            c = null;
        } else {
            d = new r0(false, null);
            c = new r0(true, null);
        }
    }

    public r0(boolean z, CancellationException cancellationException) {
        this.a = z;
        this.b = cancellationException;
    }
}

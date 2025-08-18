package defpackage;

import android.os.CancellationSignal;

/* loaded from: classes.dex */
public abstract class zy1 {
    public static void a(CancellationSignal cancellationSignal) {
        cancellationSignal.cancel();
    }

    public static CancellationSignal b() {
        return new CancellationSignal();
    }
}

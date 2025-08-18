package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import one.me.sdk.media.transformer.MediaTransformException;

/* loaded from: classes2.dex */
public final class ml8 {
    public final el8 a;
    public final long b;
    public final ll8 c;
    public volatile int d;
    public volatile int e;
    public final AtomicReference f;
    public final AtomicReference g;

    public ml8(el8 el8Var) {
        this.a = el8Var;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.b = jCurrentTimeMillis;
        ll8 ll8Var = new ll8();
        ll8Var.a = jCurrentTimeMillis;
        this.c = ll8Var;
        this.d = -1;
        this.e = -1;
        this.f = new AtomicReference();
        this.g = new AtomicReference();
    }

    public final void a(MediaTransformException mediaTransformException) {
        this.g.set(mediaTransformException);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ml8.toString():java.lang.String");
    }
}

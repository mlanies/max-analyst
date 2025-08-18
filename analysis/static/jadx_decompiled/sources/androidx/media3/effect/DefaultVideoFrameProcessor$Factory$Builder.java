package androidx.media3.effect;

import defpackage.hd0;
import defpackage.id6;
import defpackage.qf4;
import defpackage.va8;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class DefaultVideoFrameProcessor$Factory$Builder {
    public ExecutorService b;
    public va8 c;
    public id6 d;
    public int e;
    public int a = 0;
    public boolean f = true;

    public qf4 build() {
        int i = this.a;
        boolean z = !this.f;
        va8 va8Var = this.c;
        if (va8Var == null) {
            va8Var = new va8(15, (byte) 0);
        }
        return new qf4(i, z, va8Var, (ScheduledExecutorService) this.b, (hd0) this.d, this.e);
    }
}

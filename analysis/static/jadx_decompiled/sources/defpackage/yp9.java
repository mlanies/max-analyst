package defpackage;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class yp9 extends ztc {
    public static final zpc d = new zpc("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.newthread-priority", 5).intValue())), false);
    public final ThreadFactory c = d;

    @Override // defpackage.ztc
    public final xtc a() {
        return new zp9(this.c);
    }
}

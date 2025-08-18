package defpackage;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class wte implements vte {
    public Long a;
    public Long b;

    public final Long a() {
        Long l = this.b;
        if (l == null) {
            return null;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
        Long l2 = this.a;
        if (l2 != null) {
            return Long.valueOf(l2.longValue() + jElapsedRealtime);
        }
        return null;
    }
}

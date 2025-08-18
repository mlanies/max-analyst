package defpackage;

import android.os.SystemClock;
import java.util.List;

/* loaded from: classes.dex */
public final class tl6 extends ek0 {
    public int g;

    @Override // defpackage.m85
    public final int b() {
        return this.g;
    }

    @Override // defpackage.m85
    public final int k() {
        return 0;
    }

    @Override // defpackage.m85
    public final Object m() {
        return null;
    }

    @Override // defpackage.m85
    public final void t(long j, long j2, long j3, List list, h78[] h78VarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (s(this.g, jElapsedRealtime)) {
            for (int i = this.b - 1; i >= 0; i--) {
                if (!s(i, jElapsedRealtime)) {
                    this.g = i;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}

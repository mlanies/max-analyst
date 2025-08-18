package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class y3f implements abe {
    public static final y3f b = new y3f();
    public final List a;

    public y3f(xz3 xz3Var) {
        this.a = Collections.singletonList(xz3Var);
    }

    @Override // defpackage.abe
    public final int g(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.abe
    public final long i(int i) {
        np8.d(i == 0);
        return 0L;
    }

    @Override // defpackage.abe
    public final List p(long j) {
        return j >= 0 ? this.a : Collections.emptyList();
    }

    @Override // defpackage.abe
    public final int u() {
        return 1;
    }

    public y3f() {
        this.a = Collections.emptyList();
    }
}

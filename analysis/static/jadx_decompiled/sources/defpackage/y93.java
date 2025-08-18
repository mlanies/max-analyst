package defpackage;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class y93 extends aa3 {
    public static aa3 g(int i) {
        return i < 0 ? aa3.b : i > 0 ? aa3.c : aa3.a;
    }

    @Override // defpackage.aa3
    public final aa3 a(int i, int i2) {
        return g(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    @Override // defpackage.aa3
    public final aa3 b(long j, long j2) {
        return g(j < j2 ? -1 : j > j2 ? 1 : 0);
    }

    @Override // defpackage.aa3
    public final aa3 c(Object obj, Object obj2, Comparator comparator) {
        return g(comparator.compare(obj, obj2));
    }

    @Override // defpackage.aa3
    public final aa3 d(boolean z, boolean z2) {
        return g(z == z2 ? 0 : z ? 1 : -1);
    }

    @Override // defpackage.aa3
    public final aa3 e(boolean z, boolean z2) {
        return g(z2 == z ? 0 : z2 ? 1 : -1);
    }

    @Override // defpackage.aa3
    public final int f() {
        return 0;
    }
}

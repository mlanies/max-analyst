package defpackage;

/* loaded from: classes.dex */
public final class hc1 implements jc1 {
    public static final hc1 a = new hc1();
    public static final long b = r7a.d;
    public static final eqe c = new eqe(t7a.h);
    public static final Integer o = Integer.valueOf(q7a.i);
    public static final jfd X = jfd.a;

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hc1);
    }

    @Override // defpackage.kfd
    public final Integer f() {
        return o;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return b;
    }

    @Override // defpackage.kfd
    public final jqe getTitle() {
        return c;
    }

    @Override // defpackage.kfd
    public final jfd getType() {
        return X;
    }

    public final int hashCode() {
        return 520811127;
    }

    @Override // defpackage.kfd, defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return r7a.m;
    }

    public final String toString() {
        return "SendToChat";
    }

    @Override // defpackage.kfd
    public final int u() {
        return 1;
    }

    @Override // defpackage.jc1
    public final int v() {
        return 2;
    }
}

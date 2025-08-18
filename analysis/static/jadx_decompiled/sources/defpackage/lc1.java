package defpackage;

/* loaded from: classes.dex */
public final class lc1 implements mc1 {
    public static final lc1 a = new lc1();
    public static final long b = r7a.c;
    public static final eqe c = new eqe(t7a.l);
    public static final b7a d = b7a.b;

    @Override // defpackage.mc1
    public final b7a a() {
        return d;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lc1);
    }

    @Override // defpackage.mc1
    public final long getItemId() {
        return b;
    }

    @Override // defpackage.mc1
    public final eqe getTitle() {
        return c;
    }

    public final int hashCode() {
        return -500105201;
    }

    public final String toString() {
        return "TryLoadLinkAgain";
    }
}

package defpackage;

/* loaded from: classes.dex */
public final class ke4 implements Comparable {
    public final boolean a;
    public final boolean b;

    public ke4(oy5 oy5Var, int i) {
        this.a = (oy5Var.o & 1) != 0;
        this.b = bf4.d(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ke4 ke4Var = (ke4) obj;
        return aa3.a.d(this.b, ke4Var.b).d(this.a, ke4Var.a).f();
    }
}

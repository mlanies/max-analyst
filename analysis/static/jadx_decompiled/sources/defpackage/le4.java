package defpackage;

/* loaded from: classes.dex */
public final class le4 implements Comparable {
    public final boolean a;
    public final boolean b;

    public le4(int i, qy5 qy5Var) {
        this.a = (qy5Var.e & 1) != 0;
        this.b = vj0.n(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        le4 le4Var = (le4) obj;
        return aa3.a.d(this.b, le4Var.b).d(this.a, le4Var.a).f();
    }
}

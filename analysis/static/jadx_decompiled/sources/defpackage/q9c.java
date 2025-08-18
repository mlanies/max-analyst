package defpackage;

/* loaded from: classes2.dex */
public final class q9c implements Comparable {
    public final e52 a;
    public final uj3 b;

    public q9c(e52 e52Var, uj3 uj3Var) {
        this.a = e52Var;
        this.b = uj3Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        q9c q9cVar = (q9c) obj;
        e52 e52Var = this.a;
        long j = e52Var != null ? e52Var.b.Y : this.b.a.c.r;
        e52 e52Var2 = q9cVar.a;
        return np8.j(e52Var2 != null ? e52Var2.b.Y : q9cVar.b.a.c.r, j);
    }
}

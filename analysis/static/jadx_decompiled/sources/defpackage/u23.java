package defpackage;

/* loaded from: classes2.dex */
public final class u23 {
    public final je7 a;
    public final je7 b;

    public u23(je7 je7Var, je7 je7Var2) {
        this.a = je7Var;
        this.b = je7Var2;
    }

    public final void a(long j, long j2) {
        hm9.m("u23", "clearChat id=%d, time=%d", Long.valueOf(j), Long.valueOf(j2));
        ((p82) this.a.getValue()).o(j, j2);
        ((cea) this.b.getValue()).d(j);
    }
}

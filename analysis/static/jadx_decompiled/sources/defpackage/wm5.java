package defpackage;

/* loaded from: classes.dex */
public final class wm5 {
    public final sy4 a;
    public final vm5 b;

    public wm5(qq9 qq9Var, n5b n5bVar) {
        if (!(n5bVar.d > 0)) {
            throw new IllegalArgumentException();
        }
        this.b = new vm5(qq9Var, n5bVar, rq9.o());
        this.a = new sy4(15, this);
    }

    public final v84 a(int i) {
        return o43.p0((byte[]) this.b.get(i), this.a, o43.Y);
    }
}

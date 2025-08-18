package defpackage;

/* loaded from: classes.dex */
public final class je4 extends xe4 implements Comparable {
    public final int X;
    public final int Y;

    public je4(int i, rze rzeVar, int i2, oe4 oe4Var, int i3) {
        super(i, rzeVar, i2);
        this.X = vj0.n(i3, oe4Var.t0) ? 1 : 0;
        this.Y = this.o.b();
    }

    @Override // defpackage.xe4
    public final int a() {
        return this.X;
    }

    @Override // defpackage.xe4
    public final /* bridge */ /* synthetic */ boolean b(xe4 xe4Var) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.Y, ((je4) obj).Y);
    }
}

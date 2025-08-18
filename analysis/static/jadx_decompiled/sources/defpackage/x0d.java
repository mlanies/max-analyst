package defpackage;

/* loaded from: classes2.dex */
public final class x0d implements y0d {
    public final int X;
    public final vfd a;
    public final c64 b;
    public final int c;
    public final long o;

    public x0d(vfd vfdVar, c64 c64Var, int i, long j, int i2) {
        this.a = vfdVar;
        this.b = c64Var;
        this.c = i;
        this.o = j;
        this.X = i2;
    }

    @Override // defpackage.y0d
    public final int a() {
        return this.X;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.o;
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.c;
    }
}

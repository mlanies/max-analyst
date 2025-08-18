package defpackage;

/* loaded from: classes2.dex */
public final class v2g implements w2g {
    public final int X = kla.h;
    public final vfd a;
    public final c64 b;
    public final long c;
    public final int o;

    public v2g(vfd vfdVar, c64 c64Var, long j, int i) {
        this.a = vfdVar;
        this.b = c64Var;
        this.c = j;
        this.o = i;
    }

    @Override // defpackage.w2g
    public final int a() {
        return this.o;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.c;
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.X;
    }
}

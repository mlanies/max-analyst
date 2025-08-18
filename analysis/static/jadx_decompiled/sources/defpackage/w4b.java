package defpackage;

/* loaded from: classes.dex */
public final class w4b extends mue {
    public static final Object j = new Object();
    public final tb8 e;
    public final boolean f;
    public final boolean g;
    public final hb8 h;
    public final long i;

    public w4b(x4b x4bVar) {
        this.e = x4bVar.R0();
        this.f = x4bVar.n1();
        this.g = x4bVar.y1();
        this.h = x4bVar.K1() ? hb8.f : null;
        this.i = oaf.S(x4bVar.A());
    }

    @Override // defpackage.mue
    public final int b(Object obj) {
        return j.equals(obj) ? 0 : -1;
    }

    @Override // defpackage.mue
    public final hue g(int i, hue hueVar, boolean z) {
        Object obj = j;
        hueVar.getClass();
        hueVar.j(obj, obj, 0, this.i, 0L, s8.g, false);
        return hueVar;
    }

    @Override // defpackage.mue
    public final int i() {
        return 1;
    }

    @Override // defpackage.mue
    public final Object m(int i) {
        return j;
    }

    @Override // defpackage.mue
    public final kue n(int i, kue kueVar, long j2) {
        kueVar.b(j, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f, this.g, this.h, 0L, this.i, 0, 0, 0L);
        return kueVar;
    }

    @Override // defpackage.mue
    public final int p() {
        return 1;
    }
}

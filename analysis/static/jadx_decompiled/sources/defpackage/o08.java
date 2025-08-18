package defpackage;

/* loaded from: classes.dex */
public final class o08 extends mue {
    public final tb8 e;

    public o08(tb8 tb8Var) {
        this.e = tb8Var;
    }

    @Override // defpackage.mue
    public final int b(Object obj) {
        return obj == m08.h ? 0 : -1;
    }

    @Override // defpackage.mue
    public final hue g(int i, hue hueVar, boolean z) {
        hueVar.j(z ? 0 : null, z ? m08.h : null, 0, -9223372036854775807L, 0L, s8.g, true);
        return hueVar;
    }

    @Override // defpackage.mue
    public final int i() {
        return 1;
    }

    @Override // defpackage.mue
    public final Object m(int i) {
        return m08.h;
    }

    @Override // defpackage.mue
    public final kue n(int i, kue kueVar, long j) {
        kueVar.b(kue.q, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        kueVar.k = true;
        return kueVar;
    }

    @Override // defpackage.mue
    public final int p() {
        return 1;
    }
}

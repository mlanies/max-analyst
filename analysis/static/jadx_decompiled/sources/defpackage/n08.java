package defpackage;

/* loaded from: classes.dex */
public final class n08 extends lue {
    public final rb8 b;

    public n08(rb8 rb8Var) {
        this.b = rb8Var;
    }

    @Override // defpackage.lue
    public final int b(Object obj) {
        return obj == l08.X ? 0 : -1;
    }

    @Override // defpackage.lue
    public final gue g(int i, gue gueVar, boolean z) {
        gueVar.h(z ? 0 : null, z ? l08.X : null, 0, -9223372036854775807L, 0L, r8.Y, true);
        return gueVar;
    }

    @Override // defpackage.lue
    public final int i() {
        return 1;
    }

    @Override // defpackage.lue
    public final Object m(int i) {
        return l08.X;
    }

    @Override // defpackage.lue
    public final jue n(int i, jue jueVar, long j) {
        jueVar.b(jue.C0, this.b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        jueVar.w0 = true;
        return jueVar;
    }

    @Override // defpackage.lue
    public final int p() {
        return 1;
    }
}

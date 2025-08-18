package defpackage;

/* loaded from: classes2.dex */
public final class t9d extends d8d {
    public final boolean X;
    public final long b;
    public final long c;
    public final long o;

    public t9d(long j, long j2, boolean z, long j3) {
        this.b = j;
        this.c = j2;
        this.o = j3;
        this.X = z;
    }

    @Override // defpackage.d8d
    public final void x() {
        au8 au8VarN = n();
        au8VarN.getClass();
        long j = this.o;
        Long lValueOf = Long.valueOf(j);
        boolean z = this.X;
        hm9.m("au8", "updateDelayedAttrs %d, %b", lValueOf, Boolean.valueOf(z));
        vlc vlcVar = ((k24) au8VarN.a).c;
        Long lValueOf2 = Long.valueOf(j);
        Boolean boolValueOf = Boolean.valueOf(z);
        long j2 = this.c;
        vlcVar.q(j2, lValueOf2, boolValueOf);
        au8VarN.f.c.remove(Long.valueOf(j2));
        n().x(n().q(j2), iu8.X);
        g6f g6fVar = new g6f(((hyc) i()).o(), this.b, this.c, this.o, this.X);
        e8d e8dVar = this.a;
        if (e8dVar == null) {
            e8dVar = null;
        }
        ome.d((ome) e8dVar.h.getValue(), g6fVar, true, 1, 4);
        e8d e8dVar2 = this.a;
        ((av0) (e8dVar2 != null ? e8dVar2 : null).c.getValue()).c(new l6f(this.b, this.c, 0));
    }
}

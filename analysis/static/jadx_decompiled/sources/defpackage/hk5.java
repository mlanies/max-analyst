package defpackage;

/* loaded from: classes2.dex */
public final class hk5 extends pk0 {
    public final pk a;
    public final ztc b;
    public final fme c;
    public final long d;

    public hk5(pk pkVar, ztc ztcVar, fme fmeVar, long j) {
        this.a = pkVar;
        this.b = ztcVar;
        this.c = fmeVar;
        this.d = j;
    }

    @Override // defpackage.pk0
    public final iqd a() {
        drd drdVarK = ((k4a) this.a).K(new tq2(this.d, 14, (byte) 0), this.b);
        long jCurrentTimeMillis = System.currentTimeMillis();
        fme fmeVar = this.c;
        fmeVar.getClass();
        return new uqd(drdVarK, new pc5(jCurrentTimeMillis), 2).j(new dme(fmeVar, 1, 0)).h(new ig5(5));
    }
}

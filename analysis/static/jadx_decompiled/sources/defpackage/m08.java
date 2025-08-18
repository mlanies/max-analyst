package defpackage;

/* loaded from: classes.dex */
public final class m08 extends s06 {
    public static final Object h = new Object();
    public final Object f;
    public final Object g;

    public m08(mue mueVar, Object obj, Object obj2) {
        super(mueVar);
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.s06, defpackage.mue
    public final int b(Object obj) {
        Object obj2;
        if (h.equals(obj) && (obj2 = this.g) != null) {
            obj = obj2;
        }
        return this.e.b(obj);
    }

    @Override // defpackage.s06, defpackage.mue
    public final hue g(int i, hue hueVar, boolean z) {
        this.e.g(i, hueVar, z);
        if (oaf.a(hueVar.b, this.g) && z) {
            hueVar.b = h;
        }
        return hueVar;
    }

    @Override // defpackage.s06, defpackage.mue
    public final Object m(int i) {
        Object objM = this.e.m(i);
        return oaf.a(objM, this.g) ? h : objM;
    }

    @Override // defpackage.s06, defpackage.mue
    public final kue n(int i, kue kueVar, long j) {
        this.e.n(i, kueVar, j);
        if (oaf.a(kueVar.a, this.f)) {
            kueVar.a = kue.q;
        }
        return kueVar;
    }
}

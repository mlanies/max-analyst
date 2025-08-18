package defpackage;

/* loaded from: classes.dex */
public final class l08 extends r06 {
    public static final Object X = new Object();
    public final Object c;
    public final Object o;

    public l08(lue lueVar, Object obj, Object obj2) {
        super(lueVar);
        this.c = obj;
        this.o = obj2;
    }

    @Override // defpackage.r06, defpackage.lue
    public final int b(Object obj) {
        Object obj2;
        if (X.equals(obj) && (obj2 = this.o) != null) {
            obj = obj2;
        }
        return this.b.b(obj);
    }

    @Override // defpackage.r06, defpackage.lue
    public final gue g(int i, gue gueVar, boolean z) {
        this.b.g(i, gueVar, z);
        if (maf.a(gueVar.b, this.o) && z) {
            gueVar.b = X;
        }
        return gueVar;
    }

    @Override // defpackage.r06, defpackage.lue
    public final Object m(int i) {
        Object objM = this.b.m(i);
        return maf.a(objM, this.o) ? X : objM;
    }

    @Override // defpackage.r06, defpackage.lue
    public final jue n(int i, jue jueVar, long j) {
        this.b.n(i, jueVar, j);
        if (maf.a(jueVar.a, this.c)) {
            jueVar.a = jue.C0;
        }
        return jueVar;
    }
}

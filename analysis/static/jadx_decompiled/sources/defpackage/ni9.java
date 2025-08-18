package defpackage;

/* loaded from: classes.dex */
public class ni9 extends pi9 implements vb7 {
    public final void a() {
        ((ni9) ((vb7) getReflected())).a();
    }

    @Override // defpackage.fq1
    public final mb7 computeReflected() {
        nec.a.getClass();
        return this;
    }

    @Override // defpackage.zb7
    public Object get() {
        mo5getGetter();
        throw null;
    }

    @Override // defpackage.zb7
    public final Object getDelegate() {
        return ((ni9) ((vb7) getReflected())).getDelegate();
    }

    @Override // defpackage.zb7
    /* renamed from: getGetter */
    public final yb7 mo5getGetter() {
        ((ni9) ((vb7) getReflected())).mo5getGetter();
        return null;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        return get();
    }

    @Override // defpackage.vb7
    public void set(Object obj) {
        a();
        throw null;
    }
}

package defpackage;

/* loaded from: classes.dex */
public abstract class fob extends iob implements zb7 {
    @Override // defpackage.fq1
    public mb7 computeReflected() {
        nec.a.getClass();
        return this;
    }

    @Override // defpackage.zb7
    public Object getDelegate() {
        return ((zb7) getReflected()).getDelegate();
    }

    public /* bridge */ /* synthetic */ xb7 getGetter() {
        mo5getGetter();
        return null;
    }

    @Override // defpackage.k56
    public Object invoke() {
        return get();
    }

    @Override // defpackage.zb7
    /* renamed from: getGetter, reason: collision with other method in class */
    public yb7 mo5getGetter() {
        ((zb7) getReflected()).mo5getGetter();
        return null;
    }
}

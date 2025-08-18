package defpackage;

/* loaded from: classes.dex */
public class hob extends iob implements ac7 {
    public hob(Class cls, String str, String str2, int i) {
        super(fq1.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // defpackage.fq1
    public final mb7 computeReflected() {
        nec.a.getClass();
        return this;
    }

    public Object get(Object obj) {
        getGetter();
        throw null;
    }

    @Override // defpackage.ac7
    public final void getGetter() {
        ((ac7) getReflected()).getGetter();
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        return get(obj);
    }
}

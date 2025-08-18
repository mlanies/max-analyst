package defpackage;

/* loaded from: classes2.dex */
public abstract class u9e extends dl {
    public final Object b;

    public u9e(String str, String str2) {
        super(str);
        this.b = str2;
    }

    @Override // defpackage.dl
    public final void d(kb7 kb7Var) {
        Object obj = this.b;
        if (obj == null || ((CharSequence) obj).length() == 0) {
            kb7Var.getClass();
            return;
        }
        kb7Var.g0(this.a);
        ((t1) kb7Var).i((String) obj);
    }

    public final String toString() {
        return this.a + " = " + this.b;
    }
}

package defpackage;

import java.lang.ref.SoftReference;

/* loaded from: classes2.dex */
public abstract class ckc implements b37 {
    public SoftReference a;

    @Override // defpackage.b37
    public final Object a(v4 v4Var) {
        SoftReference softReference = this.a;
        Object objB = softReference != null ? softReference.get() : null;
        if (objB == null) {
            objB = b(v4Var);
            this.a = objB != null ? new SoftReference(objB) : null;
        }
        return objB;
    }

    public abstract Object b(v4 v4Var);
}

package defpackage;

import android.animation.TypeEvaluator;

/* loaded from: classes2.dex */
public final class job implements TypeEvaluator {
    public sra[] a = null;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        sra[] sraVarArr = (sra[]) obj;
        sra[] sraVarArr2 = (sra[]) obj2;
        if (!m6d.a(sraVarArr, sraVarArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!m6d.a(this.a, sraVarArr)) {
            this.a = sraVarArr != null ? m6d.j(sraVarArr) : null;
        }
        sra[] sraVarArr3 = this.a;
        if (sraVarArr3 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (sraVarArr == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        int length = sraVarArr.length;
        for (int i = 0; i < length; i++) {
            if (sraVarArr2 != null) {
                sraVarArr3[i].b(sraVarArr[i], sraVarArr2[i], f);
            }
        }
        return sraVarArr3;
    }
}

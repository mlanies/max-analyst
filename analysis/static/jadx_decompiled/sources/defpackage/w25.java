package defpackage;

import java.util.Arrays;
import kotlinx.serialization.SerializationException;

/* loaded from: classes.dex */
public final class w25 implements cc7 {
    public final Enum[] a;
    public final r6d b;
    public final khe c = new khe(new es3(11, this));

    public w25(Enum[] enumArr, t25 t25Var) {
        this.a = enumArr;
        this.b = t25Var;
    }

    @Override // defpackage.cc7
    public final Object a(x8 x8Var) {
        int iQ = x8Var.q(d());
        Enum[] enumArr = this.a;
        if (iQ >= 0 && iQ < enumArr.length) {
            return enumArr[iQ];
        }
        throw new SerializationException(iQ + " is not among valid " + d().a() + " enum values, values size is " + enumArr.length);
    }

    @Override // defpackage.cc7
    public final void b(xu3 xu3Var, Object obj) {
        Enum r5 = (Enum) obj;
        Enum[] enumArr = this.a;
        int iG0 = ys.g0(enumArr, r5);
        if (iG0 != -1) {
            xu3Var.g(d(), iG0);
            return;
        }
        throw new SerializationException(r5 + " is not a valid enum " + d().a() + ", must be one of " + Arrays.toString(enumArr));
    }

    @Override // defpackage.cc7
    public final r6d d() {
        return (r6d) this.c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + d().a() + '>';
    }
}

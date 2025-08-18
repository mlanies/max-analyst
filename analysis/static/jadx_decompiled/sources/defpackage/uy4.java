package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class uy4 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ az4 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy4(az4 az4Var, Continuation continuation) {
        super(2, continuation);
        this.Z = az4Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((uy4) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        uy4 uy4Var = new uy4(this.Z, continuation);
        uy4Var.Y = obj;
        return uy4Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        on5 on5Var;
        Object objD;
        int i;
        int i2;
        int i3;
        Object[] objArr;
        qx4 qx4Var;
        tx3 tx3Var = tx3.a;
        int i4 = this.X;
        int i5 = 1;
        if (i4 == 0) {
            od2.a0(obj);
            on5Var = (on5) this.Y;
            y8 y8Var = this.Z.c;
            this.Y = on5Var;
            this.X = 1;
            cz4 cz4Var = (cz4) y8Var.a;
            cz4Var.getClass();
            kl7 kl7VarL = j1e.l();
            int i6 = 0;
            while (i6 < 9) {
                Object[] objArr2 = tpa.a[i6];
                int length = objArr2.length;
                int i7 = 0;
                while (i7 < length) {
                    Object obj2 = objArr2[i7];
                    if (obj2 instanceof String) {
                        i = i7;
                        i2 = length;
                        i3 = i6;
                        objArr = objArr2;
                        kl7VarL.add(new qx4(i6, i5, (CharSequence) obj2, null, cz4Var.c((String) obj2), 0L, 40));
                    } else {
                        i = i7;
                        i2 = length;
                        i3 = i6;
                        objArr = objArr2;
                        if (obj2 instanceof Object[]) {
                            Object[] objArr3 = (Object[]) obj2;
                            if (objArr3[0] instanceof Object[]) {
                                String str = ((String[][]) objArr3)[0][0];
                                Object[][] objArr4 = (Object[][]) objArr3;
                                int length2 = 0;
                                for (Object[] objArr5 : objArr4) {
                                    length2 += objArr5.length;
                                }
                                ArrayList arrayList = new ArrayList(length2);
                                for (Object[] objArr6 : objArr4) {
                                    d63.X(arrayList, objArr6);
                                }
                                qx4Var = new qx4(i3, i5, str, arrayList, cz4Var.c(str), 0L, 32);
                            } else {
                                String str2 = ((String[]) objArr3)[0];
                                qx4Var = new qx4(i3, i5, str2, ys.m0(objArr3), cz4Var.c(str2), 0L, 32);
                            }
                            kl7VarL.add(qx4Var);
                        }
                    }
                    i5++;
                    i7 = i + 1;
                    i6 = i3;
                    length = i2;
                    objArr2 = objArr;
                }
                i6++;
            }
            objD = j1e.d(kl7VarL);
            if (objD == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return e5f.a;
            }
            on5Var = (on5) this.Y;
            od2.a0(obj);
            objD = obj;
        }
        this.Y = null;
        this.X = 2;
        if (on5Var.a(objD, this) == tx3Var) {
            return tx3Var;
        }
        return e5f.a;
    }
}

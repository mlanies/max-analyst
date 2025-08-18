package defpackage;

import android.animation.IntEvaluator;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ksf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ byte[] Y;
    public final /* synthetic */ lsf Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ksf(lsf lsfVar, Continuation continuation, byte[] bArr) {
        super(2, continuation);
        this.Y = bArr;
        this.Z = lsfVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ksf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ksf(this.Z, continuation, this.Y);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        int iIntValue;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            lsf lsfVar = this.Z;
            byte[] bArr = this.Y;
            if (bArr != 0) {
                IntEvaluator intEvaluator = r70.F0;
                int peaksCount = lsfVar.getWaveView().getPeaksCount();
                if (bArr.length != 0) {
                    byte[] bArr2 = new byte[peaksCount];
                    for (int i2 = 0; i2 < peaksCount; i2++) {
                        if (i2 == 0 || bArr.length == 1) {
                            iIntValue = bArr[0];
                        } else if (i2 == peaksCount - 1) {
                            iIntValue = bArr[bArr.length - 1];
                        } else {
                            float length = (i2 / peaksCount) * (bArr.length - 1);
                            int i3 = (int) length;
                            int i4 = i3 + 1;
                            iIntValue = (i3 >= bArr.length - 1 || i4 >= bArr.length - 1) ? 0 : r70.F0.evaluate(length - i3, Integer.valueOf(bArr[i3]), Integer.valueOf(bArr[i4])).intValue();
                        }
                        bArr2[i2] = (byte) iIntValue;
                    }
                    bArr = bArr2;
                }
            } else {
                bArr = null;
            }
            cx7 cx7VarC = ((w9a) lsfVar.getDispatchers()).c();
            jsf jsfVar = new jsf(lsfVar, null, bArr);
            this.X = 1;
            if (j47.t0(cx7VarC, jsfVar, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}

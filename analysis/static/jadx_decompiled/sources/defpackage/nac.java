package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nac extends ffe implements a66 {
    public final /* synthetic */ je7 X;
    public final /* synthetic */ cbc Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nac(khe kheVar, cbc cbcVar, Continuation continuation) {
        super(2, continuation);
        this.X = kheVar;
        this.Y = cbcVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        nac nacVar = (nac) n(Long.valueOf(((Number) obj).longValue()), (Continuation) obj2);
        e5f e5fVar = e5f.a;
        nacVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new nac((khe) this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        p70 p70Var = (p70) this.X.getValue();
        if (p70Var != null) {
            int iA = this.Y.w().a();
            ArrayList arrayList = p70Var.a;
            double dLog10 = iA == 0 ? -45.0d : Math.log10(iA / 32768) * 20.0d;
            if (dLog10 < -45.0d) {
                dLog10 = -45.0d;
            }
            arrayList.add(Integer.valueOf((int) (((dLog10 - (-45.0d)) * 32768) / 45.0d)));
            p70Var.a();
        }
        return e5f.a;
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class uce extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ yce Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uce(yce yceVar, Continuation continuation) {
        super(2, continuation);
        this.Y = yceVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        uce uceVar = (uce) n((String) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        uceVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        uce uceVar = new uce(this.Y, continuation);
        uceVar.X = obj;
        return uceVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        q0e q0eVar;
        Object value;
        Object value2;
        Object value3;
        od2.a0(obj);
        String str = (String) this.X;
        yce yceVar = this.Y;
        int iIntValue = ((Number) yceVar.H0.getValue()).intValue();
        q0e q0eVar2 = yceVar.I0;
        if (str == null || w9e.C0(str)) {
            x77 x77Var = (x77) yceVar.M0.T0(yceVar, yce.S0[0]);
            if (x77Var != null) {
                x77Var.cancel(null);
            }
            do {
                q0eVar = yceVar.C0;
                value = q0eVar.getValue();
            } while (!q0eVar.c(value, null));
            do {
                value2 = q0eVar2.getValue();
            } while (!q0eVar2.c(value2, null));
        } else {
            rce rceVar = (rce) q0eVar2.getValue();
            if (rceVar != null && !w9e.p0(str, rceVar.k(), false)) {
                do {
                    value3 = q0eVar2.getValue();
                } while (!q0eVar2.c(value3, null));
            }
            yceVar.q(iIntValue, str.toString());
        }
        return e5f.a;
    }
}

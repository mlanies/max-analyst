package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lw extends ffe implements a66 {
    public int X;
    public final /* synthetic */ bx Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw(bx bxVar, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = bxVar;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((lw) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new lw(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object value;
        Object obj2;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        long j = this.Z;
        bx bxVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            pfc pfcVar = bxVar.k;
            this.X = 1;
            obj = bx.b(bxVar, pfcVar, j, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        if (((Number) obj).intValue() >= 0) {
            q0e q0eVar = bxVar.C;
            pv pvVar = new pv(j, true);
            do {
                value = q0eVar.getValue();
                qv qvVar = (qv) value;
                obj2 = qvVar instanceof nv ? (nv) qvVar : null;
                if (obj2 == null) {
                    obj2 = pvVar;
                }
            } while (!q0eVar.c(value, obj2));
        }
        return e5f.a;
    }
}

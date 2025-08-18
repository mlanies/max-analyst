package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zac extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cbc Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zac(cbc cbcVar, Continuation continuation) {
        super(2, continuation);
        this.Y = cbcVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((zac) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new zac(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        cbc cbcVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            if (cbcVar.v0.getValue() instanceof sac) {
                return e5fVar;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            cbcVar.u().b(new Long(jCurrentTimeMillis));
            this.X = 1;
            obj = cbc.s(cbcVar, jCurrentTimeMillis, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return e5fVar;
            }
            od2.a0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            jac jacVar = cbcVar.c;
            jacVar.getClass();
            pnf.o(jacVar.b, new eac(cbcVar.b, true));
        } else {
            this.X = 2;
            if (cbc.q(cbcVar, this) == tx3Var) {
                return tx3Var;
            }
        }
        return e5fVar;
    }
}

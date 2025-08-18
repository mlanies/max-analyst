package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class us1 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ vs1 Y;
    public final /* synthetic */ y21 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us1(vs1 vs1Var, y21 y21Var, Continuation continuation) {
        super(2, continuation);
        this.Y = vs1Var;
        this.Z = y21Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((us1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new us1(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            String str = this.Z.d;
            this.X = 1;
            obj = j47.t0(((w9a) ((kke) this.Y.a.getValue())).b(), new ss1(str, null), this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return obj;
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class yv2 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ gw2 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv2(gw2 gw2Var, Continuation continuation) {
        super(2, continuation);
        this.Z = gw2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((yv2) n((it6) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        yv2 yv2Var = new yv2(this.Z, continuation);
        yv2Var.Y = obj;
        return yv2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            it6 it6Var = (it6) this.Y;
            q0e q0eVar = this.Z.E0;
            ov2 ov2Var = new ov2(nv2.c, "", it6Var, nz4.a, false);
            this.X = 1;
            q0eVar.m(null, ov2Var);
            if (e5fVar == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}

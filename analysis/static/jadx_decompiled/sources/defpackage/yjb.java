package defpackage;

import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yjb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ zjb Y;
    public final /* synthetic */ Map Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yjb(zjb zjbVar, HashMap map, Continuation continuation) {
        super(2, continuation);
        this.Y = zjbVar;
        this.Z = map;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((yjb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new yjb(this.Y, (HashMap) this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            zjb zjbVar = this.Y;
            if (((gh3) zjbVar.Z.getValue()).f()) {
                e52 e52Var = (e52) ((jz2) ((iy2) zjbVar.c.getValue())).m(zjbVar.b).a.getValue();
                if (e52Var == null) {
                    return e5fVar;
                }
                pk pkVar = (pk) zjbVar.X.getValue();
                zjbVar.y0.set(((k4a) pkVar).l(e52Var.a, e52Var.b.a, 0, null, false, (HashMap) this.Z));
                return e5fVar;
            }
            kld kldVar = zjbVar.t0;
            Boolean bool = Boolean.TRUE;
            this.X = 1;
            if (kldVar.a(bool, this) == tx3Var) {
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

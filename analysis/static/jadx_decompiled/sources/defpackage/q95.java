package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class q95 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ t95 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q95(t95 t95Var, String str, Continuation continuation) {
        super(2, continuation);
        this.Z = str;
        this.s0 = t95Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((q95) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        q95 q95Var = new q95(this.s0, this.Z, continuation);
        q95Var.Y = obj;
        return q95Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        on5 on5Var;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            on5Var = (on5) this.Y;
            tq2 tq2Var = new tq2(sla.A1, 13);
            tq2Var.p("url", this.Z);
            ome omeVar = (ome) this.s0.b.getValue();
            this.Y = on5Var;
            this.X = 1;
            obj = omeVar.e(tq2Var, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return e5f.a;
            }
            on5Var = (on5) this.Y;
            od2.a0(obj);
        }
        this.Y = null;
        this.X = 2;
        if (on5Var.a(obj, this) == tx3Var) {
            return tx3Var;
        }
        return e5f.a;
    }
}

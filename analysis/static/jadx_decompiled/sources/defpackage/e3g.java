package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class e3g extends ffe implements a66 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ g3g s0;
    public final /* synthetic */ List t0;
    public puf u0;
    public int v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3g(int i, Object obj, Continuation continuation, g3g g3gVar, List list) {
        super(2, continuation);
        this.Y = i;
        this.Z = obj;
        this.s0 = g3gVar;
        this.t0 = list;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((e3g) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new e3g(this.Y, this.Z, continuation, this.s0, this.t0);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        puf pufVar;
        Object objA;
        int i;
        tx3 tx3Var = tx3.a;
        int i2 = this.X;
        int i3 = 1;
        if (i2 == 0) {
            od2.a0(obj);
            pufVar = (puf) this.Z;
            uc6 uc6Var = (uc6) this.s0.o.getValue();
            long j = pufVar.c;
            kk0 kk0Var = kk0.a;
            this.u0 = pufVar;
            int i4 = this.Y;
            this.v0 = i4;
            this.X = 1;
            objA = uc6Var.a(j, kk0Var, this);
            if (objA == tx3Var) {
                return tx3Var;
            }
            i = i4;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.v0;
            pufVar = this.u0;
            od2.a0(obj);
            objA = obj;
        }
        rc6 rc6Var = (rc6) objA;
        vfd vfdVar = new vfd(pufVar.c, 0, new iqe(rc6Var.a), null, null, null, cfd.a, null, null, 0, new wed(rc6Var.c, rc6Var.b), 952);
        List list = this.t0;
        if (list.size() == 1) {
            i3 = 4;
        } else if (i != 0) {
            i3 = i == y53.L(list) ? 3 : 2;
        }
        int i5 = i3;
        zxf.c.getClass();
        return new v2g(vfdVar, new c64(":settings/webapp?bot_id=" + pufVar.c), pufVar.c, i5);
    }
}

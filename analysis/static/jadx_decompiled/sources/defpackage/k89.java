package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class k89 extends ffe implements a66 {
    public v5c X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ e52 s0;
    public final /* synthetic */ l89 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k89(e52 e52Var, l89 l89Var, Continuation continuation) {
        super(2, continuation);
        this.s0 = e52Var;
        this.t0 = l89Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((k89) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        k89 k89Var = new k89(this.s0, this.t0, continuation);
        k89Var.Z = obj;
        return k89Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object objT0;
        v5c v5cVar;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var = (sx3) this.Z;
            e52 e52Var = this.s0;
            if (e52Var.y0 == null) {
                kr2 kr2Var = e52Var.B0;
                String str = e52Var.b.m0;
                kr2Var.getClass();
                e52Var.y0 = oag.t(str) ? null : ((jx8) kr2Var.f.get()).b(str);
            }
            v5c v5cVar2 = e52Var.y0;
            if (v5cVar2 == null) {
                return e5fVar;
            }
            jc6 jc6Var = this.t0.h;
            e52 e52Var2 = this.s0;
            long j = e52Var2.a;
            long j2 = e52Var2.b.l0;
            this.Z = sx3Var;
            this.X = v5cVar2;
            this.Y = 1;
            objT0 = j47.t0(((w9a) ((kke) jc6Var.a)).b(), new ic6(jc6Var, j, j2, null), this);
            if (objT0 == tx3Var) {
                return tx3Var;
            }
            v5cVar = v5cVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v5c v5cVar3 = this.X;
            od2.a0(obj);
            objT0 = obj;
            v5cVar = v5cVar3;
        }
        cu8 cu8Var = (cu8) objT0;
        if (cu8Var != null) {
            this.t0.f.invoke(Collections.singleton(v5cVar), new Long(cu8Var.b));
            q0e q0eVar = this.t0.m;
            q0eVar.m(null, bxc.a((bxc) q0eVar.getValue(), 0, false, false, new axc(this.s0.b.l0, cu8Var.k(), v5cVar), 7));
            return e5fVar;
        }
        String str2 = this.t0.i;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.s0, str2, "Chat model has reaction info, but can't find message for this reaction", null);
        }
        return e5fVar;
    }
}

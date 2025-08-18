package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class o8 extends ffe implements a66 {
    public h7b X;
    public Iterator Y;
    public int Z;
    public /* synthetic */ Object s0;
    public final /* synthetic */ h7b t0;
    public final /* synthetic */ List u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(h7b h7bVar, List list, Continuation continuation) {
        super(2, continuation);
        this.t0 = h7bVar;
        this.u0 = list;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((o8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        o8 o8Var = new o8(this.t0, this.u0, continuation);
        o8Var.s0 = obj;
        return o8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        h7b h7bVar;
        Iterator q1fVar;
        sx3 sx3Var;
        Object njcVar;
        tx3 tx3Var = tx3.a;
        int i = this.Z;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var2 = (sx3) this.s0;
            String str = (String) this.t0.c;
            List list = this.u0;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.Y, str, "invoke for ".concat(x53.n0(list, ",", "[", "]", n8.a, 24)), null);
            }
            qp4 qp4VarB = qp4.u0.b((Context) this.t0.b);
            r1f r1fVar = new r1f(l6d.a0(l6d.f0(l6d.e0(new at(2, this.u0), new k8(2)), new l(1, qp4VarB)), new k8(3)), new k8(4));
            fka fkaVarI = qp4VarB.i();
            r1f r1fVarF0 = l6d.f0(v3c.F(r1fVar, new k8(0), new l8(0, fkaVarI)), new l8(1, fkaVarI));
            h7bVar = this.t0;
            q1fVar = new q1f(r1fVarF0);
            sx3Var = sx3Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q1fVar = this.Y;
            h7bVar = this.X;
            sx3Var = (sx3) this.s0;
            od2.a0(obj);
        }
        while (q1fVar.hasNext()) {
            View view = (View) q1fVar.next();
            String str2 = (String) h7bVar.c;
            ir6 ir6Var2 = hm9.m;
            if (ir6Var2 != null && ir6Var2.c()) {
                us7 us7Var = us7.X;
                try {
                    njcVar = ((Context) h7bVar.b).getResources().getResourceName(view.getId());
                } catch (Throwable th) {
                    njcVar = new njc(th);
                }
                if (njcVar instanceof njc) {
                    njcVar = null;
                }
                ir6Var2.d(us7Var, str2, rh4.k("colorized ", (String) njcVar, "/", view.getClass().getSimpleName()), null);
            }
            this.s0 = sx3Var;
            this.X = h7bVar;
            this.Y = q1fVar;
            this.Z = 1;
            if (i24.L(this) == tx3Var) {
                return tx3Var;
            }
        }
        return e5f.a;
    }
}

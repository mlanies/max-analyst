package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ey7 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ l84 Z;
    public final /* synthetic */ int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey7(l84 l84Var, int i, Continuation continuation) {
        super(2, continuation);
        this.Z = l84Var;
        this.s0 = i;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ey7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ey7 ey7Var = new ey7(this.Z, this.s0, continuation);
        ey7Var.Y = obj;
        return ey7Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        sx3 sx3Var;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        l84 l84Var = this.Z;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var2 = (sx3) this.Y;
            bkg bkgVar = (bkg) l84Var.c;
            this.Y = sx3Var2;
            this.X = 1;
            fz6 fz6Var = (fz6) bkgVar.b;
            Object objT0 = j47.t0(((w9a) fz6Var.c).b(), new ty6(fz6Var, null), this);
            if (objT0 == tx3Var) {
                return tx3Var;
            }
            sx3Var = sx3Var2;
            obj = objT0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sx3Var = (sx3) this.Y;
            od2.a0(obj);
        }
        qjc qjcVar = (qjc) obj;
        hm9.n("l84", "onStateChanged: allMediaCountResult is " + qjcVar);
        if (qjcVar instanceof mjc) {
            hm9.l0("l84", "onStateChanged: error", ((mjc) qjcVar).a);
        } else {
            if (!(qjcVar instanceof ojc)) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.s0 != ((Number) ((ojc) qjcVar).a).intValue() && j1e.z(sx3Var)) {
                ((k56) l84Var.d).invoke();
            }
        }
        return e5f.a;
    }
}

package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;

/* loaded from: classes2.dex */
public final class u22 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChangeOwnerScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u22(Continuation continuation, ChangeOwnerScreen changeOwnerScreen) {
        super(2, continuation);
        this.Y = changeOwnerScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        u22 u22Var = (u22) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        u22Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        u22 u22Var = new u22(continuation, this.Y);
        u22Var.X = obj;
        return u22Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        qo8 qo8Var = (qo8) this.X;
        boolean z = qo8Var instanceof mo8;
        ChangeOwnerScreen changeOwnerScreen = this.Y;
        if (z) {
            bc7[] bc7VarArr = ChangeOwnerScreen.u0;
            a32 a32Var = (a32) changeOwnerScreen.Y.getValue();
            long j = ((mo8) qo8Var).a;
            boolean zN0 = changeOwnerScreen.n0();
            uj3 uj3Var = (uj3) ((ds3) a32Var.X.getValue()).c(j).a.getValue();
            String strD = uj3Var != null ? uj3Var.d() : null;
            if (strD == null) {
                strD = "";
            }
            e52 e52Var = (e52) ((jz2) ((iy2) a32Var.o.getValue())).m(a32Var.b).a.getValue();
            if (e52Var != null) {
                pnf.o(a32Var.Z, new y22(new eqe(zN0 ? yea.e0 : yea.l0), e52Var.I() ? new gqe(yea.h0, ys.m0(new Object[]{strD, e52Var.q()})) : new gqe(yea.j0, ys.m0(new Object[]{e52Var.q(), strD})), j));
            }
        } else if (qo8Var instanceof po8) {
            wha whaVar = new wha(changeOwnerScreen);
            whaVar.h(z7.B(changeOwnerScreen.getContext(), jpc.A2));
            whaVar.i();
        }
        return e5f.a;
    }
}

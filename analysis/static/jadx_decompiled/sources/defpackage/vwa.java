package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vwa extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ xwa Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwa(xwa xwaVar, Continuation continuation) {
        super(2, continuation);
        this.Z = xwaVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((vwa) n((axa) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        vwa vwaVar = new vwa(this.Z, continuation);
        vwaVar.Y = obj;
        return vwaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            axa axaVar = (axa) this.Y;
            boolean z = axaVar instanceof ywa;
            xwa xwaVar = this.Z;
            if (z) {
                if (((ywa) axaVar).a != xwaVar.i.get()) {
                    return e5fVar;
                }
                kld kldVar = xwaVar.g;
                rwa rwaVar = rwa.a;
                this.X = 1;
                if (kldVar.a(rwaVar, this) == tx3Var) {
                    return tx3Var;
                }
            } else {
                if (!(axaVar instanceof zwa)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((zwa) axaVar).a != xwaVar.i.get()) {
                    return e5fVar;
                }
                kld kldVar2 = xwaVar.g;
                swa swaVar = new swa(xwaVar.a);
                this.X = 2;
                if (kldVar2.a(swaVar, this) == tx3Var) {
                    return tx3Var;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}

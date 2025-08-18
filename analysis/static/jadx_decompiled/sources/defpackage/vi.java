package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vi extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ gj Z;
    public final /* synthetic */ gi9 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi(gj gjVar, gi9 gi9Var, Continuation continuation) {
        super(2, continuation);
        this.Z = gjVar;
        this.s0 = gi9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((vi) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        vi viVar = new vi(this.Z, this.s0, continuation);
        viVar.Y = obj;
        return viVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object njcVar;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        try {
            if (i == 0) {
                od2.a0(obj);
                gj gjVar = this.Z;
                gi9 gi9Var = this.s0;
                pk pkVar = gjVar.a;
                au auVar = new au(8, oag.E(gi9Var));
                this.X = 1;
                obj = ((k4a) pkVar).J(auVar, this);
                if (obj == tx3Var) {
                    return tx3Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
            }
            njcVar = (eu) obj;
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        if (njcVar instanceof njc) {
            return null;
        }
        return njcVar;
    }
}

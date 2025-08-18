package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class jq5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ ta3 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq5(mn5 mn5Var, ua3 ua3Var, Continuation continuation) {
        super(2, continuation);
        this.Z = mn5Var;
        this.s0 = ua3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((jq5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        jq5 jq5Var = new jq5(this.Z, (ua3) this.s0, continuation);
        jq5Var.Y = obj;
        return jq5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        ta3 ta3Var = this.s0;
        try {
            if (i == 0) {
                od2.a0(obj);
                sx3 sx3Var = (sx3) this.Y;
                mec mecVar = new mec();
                mn5 mn5Var = this.Z;
                y40 y40Var = new y40(mecVar, sx3Var, ta3Var, 6);
                this.X = 1;
                if (mn5Var.d(y40Var, this) == tx3Var) {
                    return tx3Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
            }
            return e5f.a;
        } catch (Throwable th) {
            ua3 ua3Var = (ua3) ta3Var;
            ua3Var.getClass();
            ua3Var.makeCompleting$kotlinx_coroutines_core(new lb3(th, false));
            throw th;
        }
    }
}

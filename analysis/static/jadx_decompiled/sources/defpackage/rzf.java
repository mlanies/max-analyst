package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rzf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ zzf Y;
    public final /* synthetic */ w97 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rzf(zzf zzfVar, w97 w97Var, Continuation continuation) {
        super(2, continuation);
        this.Y = zzfVar;
        this.Z = w97Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((rzf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new rzf(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            zzf zzfVar = this.Y;
            blb blbVar = (blb) zzfVar.y0.getValue();
            long jT = ((hyc) zzfVar.Z).t();
            this.X = 1;
            obj = blbVar.a(jT, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        this.Z.a(String.valueOf(((oab) obj).a));
        return e5f.a;
    }
}

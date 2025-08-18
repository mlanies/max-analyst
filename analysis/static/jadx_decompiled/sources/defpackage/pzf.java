package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pzf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ zzf Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzf(zzf zzfVar, Continuation continuation) {
        super(2, continuation);
        this.Y = zzfVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((pzf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new pzf(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        zzf zzfVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            if (!((Boolean) zzfVar.G0.getValue()).booleanValue()) {
                pnf.o(zzfVar.M0, new yyf(false));
                return e5f.a;
            }
            this.X = 1;
            obj = od2.A(zzfVar.H0, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        pnf.o(zzfVar.M0, new ezf((String) obj));
        return e5f.a;
    }
}

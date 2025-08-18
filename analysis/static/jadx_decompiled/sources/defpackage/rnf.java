package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final class rnf extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ snf Z;
    public final /* synthetic */ a66 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnf(snf snfVar, a66 a66Var, Continuation continuation) {
        super(2, continuation);
        this.Z = snfVar;
        this.s0 = a66Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((rnf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        rnf rnfVar = new rnf(this.Z, this.s0, continuation);
        rnfVar.Y = obj;
        return rnfVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        snf snfVar = this.Z;
        try {
            if (i == 0) {
                od2.a0(obj);
                sx3 sx3Var = (sx3) this.Y;
                if (!((gh3) snfVar.b.getValue()).f()) {
                    throw new TamErrorException(new gke("io.exception", "io connection error", null));
                }
                a66 a66Var = this.s0;
                this.X = 1;
                if (a66Var.invoke(sx3Var, this) == tx3Var) {
                    return tx3Var;
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
            }
        } catch (TamErrorException e) {
            kld kldVar = snfVar.c;
            Object objInvoke = snfVar.a.invoke(e);
            this.X = 2;
            if (kldVar.a(objInvoke, this) == tx3Var) {
                return tx3Var;
            }
        }
        return e5f.a;
    }
}

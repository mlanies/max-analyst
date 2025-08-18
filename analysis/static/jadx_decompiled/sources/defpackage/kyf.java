package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kyf extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ lyf Z;
    public final /* synthetic */ oyf s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyf(lyf lyfVar, oyf oyfVar, Continuation continuation) {
        super(2, continuation);
        this.Z = lyfVar;
        this.s0 = oyfVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((kyf) n((Throwable) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        kyf kyfVar = new kyf(this.Z, this.s0, continuation);
        kyfVar.Y = obj;
        return kyfVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        ga7 ea7Var;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            Throwable th = (Throwable) this.Y;
            lyf lyfVar = this.Z;
            lyfVar.getClass();
            gyf gyfVar = th instanceof gyf ? (gyf) th : null;
            if (gyfVar instanceof gyf) {
                ea7Var = new ea7(new ha7("request_denied", 0));
            } else {
                if (gyfVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                ea7Var = fa7.d;
            }
            ga7 ga7Var = ea7Var;
            y83 y83Var = (y83) lyfVar.c.getValue();
            hyf hyfVar = hyf.b;
            String str = this.s0.a;
            this.X = 1;
            if (y83Var.a(lyfVar.e, ga7Var, hyfVar, str, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}

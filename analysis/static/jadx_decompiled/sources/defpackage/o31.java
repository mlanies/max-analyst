package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class o31 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ p31 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o31(p31 p31Var, Continuation continuation) {
        super(2, continuation);
        this.Y = p31Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((o31) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new o31(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        p31 p31Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            String string = ((hyc) p31Var.a()).g.getString("user.callsToken", null);
            if (string == null || w9e.C0(string)) {
                ct1 ct1Var = (ct1) p31Var.c.getValue();
                this.X = 1;
                if (((ft1) ct1Var).a(this) == tx3Var) {
                    return tx3Var;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return ((hyc) p31Var.a()).g.getString("user.callsToken", null);
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class zn8 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ eo8 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn8(eo8 eo8Var, Continuation continuation) {
        super(2, continuation);
        this.Y = eo8Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((zn8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new zn8(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kldVar = this.Y.a;
            cn8 cn8Var = cn8.a;
            this.X = 1;
            if (kldVar.a(cn8Var, this) == tx3Var) {
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

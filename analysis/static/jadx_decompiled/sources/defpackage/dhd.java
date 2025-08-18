package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dhd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ v4 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhd(v4 v4Var, Continuation continuation) {
        super(2, continuation);
        this.Y = v4Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((dhd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new dhd(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            q6f q6fVar = (q6f) this.Y.c(q6f.class);
            this.X = 1;
            if (q6fVar.a(false, this) == tx3Var) {
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

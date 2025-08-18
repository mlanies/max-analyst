package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class u7e extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ m7e Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7e(m7e m7eVar, Continuation continuation) {
        super(2, continuation);
        this.Z = m7eVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((u7e) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        u7e u7eVar = new u7e(this.Z, continuation);
        u7eVar.Y = obj;
        return u7eVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            on5 on5Var = (on5) this.Y;
            this.X = 1;
            if (on5Var.a(this.Z, this) == tx3Var) {
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

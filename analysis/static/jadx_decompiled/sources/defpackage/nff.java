package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nff extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ sff Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nff(sff sffVar, Continuation continuation) {
        super(2, continuation);
        this.Z = sffVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((nff) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        nff nffVar = new nff(this.Z, continuation);
        nffVar.Y = obj;
        return nffVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        on5 on5Var;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            on5Var = (on5) this.Y;
            this.Y = on5Var;
            this.X = 1;
            obj = this.Z.e(this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return e5f.a;
            }
            on5Var = (on5) this.Y;
            od2.a0(obj);
        }
        this.Y = null;
        this.X = 2;
        if (on5Var.a(obj, this) == tx3Var) {
            return tx3Var;
        }
        return e5f.a;
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dr2 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ jr2 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr2(jr2 jr2Var, Continuation continuation) {
        super(2, continuation);
        this.Z = jr2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((dr2) n((e52) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        dr2 dr2Var = new dr2(this.Z, continuation);
        dr2Var.Y = obj;
        return dr2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        try {
            if (i == 0) {
                od2.a0(obj);
                k92 k92Var = ((e52) this.Y).b;
                long j = k92Var.a;
                i92 i92Var = k92Var.c;
                if (this.Z.h != j || this.Z.g != i92Var) {
                    this.Z.g = i92Var;
                    this.Z.h = j;
                    jr2 jr2Var = this.Z;
                    this.X = 1;
                    jr2Var.c(j, this);
                    if (e5fVar == tx3Var) {
                        return tx3Var;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
            }
        } catch (Throwable th) {
            hm9.p("jr2", "catch error in chatUpdateFlow.onEach", th);
        }
        return e5fVar;
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kac extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ lac Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kac(lac lacVar, Continuation continuation) {
        super(2, continuation);
        this.Z = lacVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((kac) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
        return tx3.a;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        kac kacVar = new kac(this.Z, continuation);
        kacVar.Y = obj;
        return kacVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        sx3 sx3Var;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            sx3Var = (sx3) this.Y;
            this.Y = sx3Var;
            this.X = 1;
            if (j47.x(50L, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sx3Var = (sx3) this.Y;
            od2.a0(obj);
        }
        do {
            pag.j(sx3Var.getCoroutineContext());
            lac lacVar = this.Z;
            lacVar.d.m(null, new Long((System.currentTimeMillis() - lacVar.c) + lacVar.b));
            this.Y = sx3Var;
            this.X = 2;
        } while (j47.x(50L, this) != tx3Var);
        return tx3Var;
    }
}

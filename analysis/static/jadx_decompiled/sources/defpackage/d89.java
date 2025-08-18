package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class d89 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ l89 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d89(l89 l89Var, Continuation continuation) {
        super(2, continuation);
        this.Y = l89Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((d89) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new d89(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            String str = this.Y.i;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, str, "Scrolling to first reacted message", null);
            }
            axc axcVar = ((bxc) this.Y.m.getValue()).d;
            if (axcVar != null) {
                long j = axcVar.b;
                l89 l89Var = this.Y;
                this.X = 1;
                l89.d(l89Var, j, 0L, false, 0, 14);
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
        return e5fVar;
    }
}

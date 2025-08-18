package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class b89 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ l89 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b89(l89 l89Var, Continuation continuation) {
        super(2, continuation);
        this.Y = l89Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((b89) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new b89(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            e52 e52Var = (e52) this.Y.d.getValue();
            if (e52Var == null) {
                return e5fVar;
            }
            long j = e52Var.o.a.b;
            String str = this.Y.i;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, str, ey8.h(j, "Scrolling to last mention with id="), null);
            }
            l89 l89Var = this.Y;
            this.X = 1;
            if (l89.a(l89Var, j, this) == tx3Var) {
                return tx3Var;
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

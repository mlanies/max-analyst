package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vc8 extends ffe implements a66 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ es8 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc8(Object obj, Continuation continuation, es8 es8Var) {
        super(2, continuation);
        this.X = obj;
        this.Y = es8Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((vc8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new vc8(this.X, continuation, this.Y);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        l20 l20Var = (l20) this.X;
        if ((l20Var != null ? l20Var.g : null) == null) {
            return null;
        }
        long jHashCode = l20Var.r.hashCode();
        long j = this.Y.a.b;
        c20 c20Var = l20Var.g;
        return new vm8(jHashCode, j, c20Var.a, fp3.F(l20Var), c20Var.c, c20Var.d, c20Var.b);
    }
}

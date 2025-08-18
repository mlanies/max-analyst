package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xtd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ long Z = 100;
    public final /* synthetic */ m56 s0;
    public final /* synthetic */ l17 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xtd(int i, utd utdVar, l17 l17Var, Continuation continuation) {
        super(2, continuation);
        this.Y = i;
        this.s0 = utdVar;
        this.t0 = l17Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xtd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new xtd(this.Y, (utd) this.s0, this.t0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            long j = this.Y * this.Z;
            this.X = 1;
            if (j47.x(j, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        this.s0.invoke(this.t0);
        return e5f.a;
    }
}

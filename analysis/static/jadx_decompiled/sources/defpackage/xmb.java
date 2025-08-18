package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xmb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cnb Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ boolean s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xmb(cnb cnbVar, long j, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = cnbVar;
        this.Z = j;
        this.s0 = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xmb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new xmb(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            pab pabVar = this.Y.O0;
            this.X = 1;
            if (pabVar.v(this.Z, this.s0, this) == tx3Var) {
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

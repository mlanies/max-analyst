package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bq3 extends hu3 {
    public final /* synthetic */ cq3 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq3(cq3 cq3Var, Continuation continuation) {
        super(continuation);
        this.X = cq3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.t(this);
    }
}

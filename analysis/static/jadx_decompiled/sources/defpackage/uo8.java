package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class uo8 extends hu3 {
    public final /* synthetic */ bp8 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo8(bp8 bp8Var, Continuation continuation) {
        super(continuation);
        this.X = bp8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.r(null, this);
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class yo2 extends hu3 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mq9 Z;
    public boolean o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo2(mq9 mq9Var, Continuation continuation) {
        super(continuation);
        this.Z = mq9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.c(0L, 0, null, null, false, this);
    }
}

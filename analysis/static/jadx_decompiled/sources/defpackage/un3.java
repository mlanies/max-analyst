package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class un3 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ yn3 Y;
    public int Z;
    public yn3 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un3(yn3 yn3Var, Continuation continuation) {
        super(continuation);
        this.Y = yn3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return yn3.c(this.Y, this);
    }
}

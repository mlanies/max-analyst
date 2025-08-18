package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class s97 extends hu3 {
    public w97 X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ w97 Z;
    public Object o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s97(w97 w97Var, Continuation continuation) {
        super(continuation);
        this.Z = w97Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.c(null, this);
    }
}

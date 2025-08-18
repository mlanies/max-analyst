package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class vp8 extends hu3 {
    public Object X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ xp8 Z;
    public xp8 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp8(xp8 xp8Var, Continuation continuation) {
        super(continuation);
        this.Z = xp8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return xp8.b(this.Z, this);
    }
}

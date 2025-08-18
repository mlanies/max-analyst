package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class pq5 extends hu3 {
    public mec X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ y40 Z;
    public y40 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq5(y40 y40Var, Continuation continuation) {
        super(continuation);
        this.Z = y40Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.a(null, this);
    }
}

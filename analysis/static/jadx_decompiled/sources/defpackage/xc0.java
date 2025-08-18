package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xc0 extends hu3 {
    public nl2 X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ zc0 Z;
    public zc0 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc0(zc0 zc0Var, Continuation continuation) {
        super(continuation);
        this.Z = zc0Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.a(null, this);
    }
}

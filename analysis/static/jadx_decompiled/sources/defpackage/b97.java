package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class b97 extends hu3 {
    public String X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ c97 Z;
    public c97 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b97(c97 c97Var, Continuation continuation) {
        super(continuation);
        this.Z = c97Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.a(null, this);
    }
}

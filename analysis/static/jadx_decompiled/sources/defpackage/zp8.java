package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zp8 extends hu3 {
    public Object X;
    public kl7 Y;
    public kl7 Z;
    public jq8 o;
    public /* synthetic */ Object s0;
    public final /* synthetic */ jq8 t0;
    public int u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp8(jq8 jq8Var, Continuation continuation) {
        super(continuation);
        this.t0 = jq8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.s0 = obj;
        this.u0 |= Integer.MIN_VALUE;
        return this.t0.v(null, null, this);
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fq8 extends hu3 {
    public jq8 X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ jq8 Z;
    public jq8 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq8(jq8 jq8Var, Continuation continuation) {
        super(continuation);
        this.Z = jq8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.x(this);
    }
}

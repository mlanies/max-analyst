package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class em3 extends hu3 {
    public xu4 X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ jm3 Z;
    public jm3 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em3(jm3 jm3Var, Continuation continuation) {
        super(continuation);
        this.Z = jm3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.l(this);
    }
}

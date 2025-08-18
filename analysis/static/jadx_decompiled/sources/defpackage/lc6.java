package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lc6 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ mc6 Y;
    public int Z;
    public mc6 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc6(mc6 mc6Var, Continuation continuation) {
        super(continuation);
        this.Y = mc6Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a(0L, null, 0L, null, this);
    }
}

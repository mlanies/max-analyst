package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class pda extends hu3 {
    public e52 X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ tda Z;
    public tda o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pda(tda tdaVar, Continuation continuation) {
        super(continuation);
        this.Z = tdaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.b(null, this);
    }
}

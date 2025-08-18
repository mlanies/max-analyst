package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class rda extends hu3 {
    public uj3 X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ tda Z;
    public tda o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rda(tda tdaVar, Continuation continuation) {
        super(continuation);
        this.Z = tdaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.c(null, this);
    }
}

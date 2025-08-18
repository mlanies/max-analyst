package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class caf extends hu3 {
    public final /* synthetic */ wva X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public caf(wva wvaVar, Continuation continuation) {
        super(continuation);
        this.X = wvaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.h(this);
    }
}

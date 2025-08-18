package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nfe extends hu3 {
    public final /* synthetic */ cge X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nfe(cge cgeVar, Continuation continuation) {
        super(continuation);
        this.X = cgeVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return cge.c(this.X, null, this);
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ara extends hu3 {
    public int X;
    public final /* synthetic */ tqa Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ara(tqa tqaVar, Continuation continuation) {
        super(continuation);
        this.Y = tqaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a(null, this);
    }
}

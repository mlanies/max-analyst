package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class a80 extends hu3 {
    public final /* synthetic */ b80 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a80(b80 b80Var, Continuation continuation) {
        super(continuation);
        this.X = b80Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.a(null, this);
    }
}

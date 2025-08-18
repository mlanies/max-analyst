package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class p52 extends hu3 {
    public int X;
    public final /* synthetic */ q52 Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p52(q52 q52Var, Continuation continuation) {
        super(continuation);
        this.Y = q52Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a(null, this);
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class is7 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ js7 Y;
    public int Z;
    public js7 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is7(js7 js7Var, Continuation continuation) {
        super(continuation);
        this.Y = js7Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.f(false, this);
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class e80 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ f80 Y;
    public int Z;
    public f80 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e80(f80 f80Var, Continuation continuation) {
        super(continuation);
        this.Y = f80Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a(null, null, this);
    }
}

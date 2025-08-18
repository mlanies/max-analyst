package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hbb extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ pz7 Y;
    public int Z;
    public m56 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbb(pz7 pz7Var, Continuation continuation) {
        super(continuation);
        this.Y = pz7Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.b(null, null, null, false, null, this);
    }
}

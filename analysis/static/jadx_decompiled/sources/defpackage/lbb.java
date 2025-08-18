package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lbb extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ obb Y;
    public int Z;
    public obb o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbb(obb obbVar, Continuation continuation) {
        super(continuation);
        this.Y = obbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a(this);
    }
}

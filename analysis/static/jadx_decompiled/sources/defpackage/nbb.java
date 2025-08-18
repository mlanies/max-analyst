package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nbb extends hu3 {
    public final /* synthetic */ obb X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbb(obb obbVar, Continuation continuation) {
        super(continuation);
        this.X = obbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.f(this);
    }
}

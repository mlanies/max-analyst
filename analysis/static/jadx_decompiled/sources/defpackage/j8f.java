package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class j8f extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ n8f Y;
    public int Z;
    public n8f o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8f(n8f n8fVar, Continuation continuation) {
        super(continuation);
        this.Y = n8fVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.e(null, this);
    }
}

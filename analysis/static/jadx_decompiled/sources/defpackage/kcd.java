package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kcd extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ xw Y;
    public int Z;
    public xw o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcd(xw xwVar, Continuation continuation) {
        super(continuation);
        this.Y = xwVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.b(null, this);
    }
}

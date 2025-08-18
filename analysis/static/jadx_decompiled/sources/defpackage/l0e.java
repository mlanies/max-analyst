package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class l0e extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ m0e Y;
    public int Z;
    public m0e o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0e(m0e m0eVar, Continuation continuation) {
        super(continuation);
        this.Y = m0eVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a(null, this);
    }
}

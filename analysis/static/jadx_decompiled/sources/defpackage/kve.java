package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kve extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ tve Y;
    public int Z;
    public tve o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kve(tve tveVar, Continuation continuation) {
        super(continuation);
        this.Y = tveVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.g(this);
    }
}

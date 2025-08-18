package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xi extends hu3 {
    public z6c X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ gj Z;
    public gj o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi(gj gjVar, Continuation continuation) {
        super(continuation);
        this.Z = gjVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.f(null, this);
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rca extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ uca Y;
    public int Z;
    public uca o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rca(uca ucaVar, Continuation continuation) {
        super(continuation);
        this.Y = ucaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.f(this);
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class gr extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ kr Y;
    public int Z;
    public kr o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr(kr krVar, Continuation continuation) {
        super(continuation);
        this.Y = krVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.r(this);
    }
}

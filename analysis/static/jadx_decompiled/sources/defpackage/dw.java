package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dw extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ bx Y;
    public int Z;
    public bx o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw(bx bxVar, Continuation continuation) {
        super(continuation);
        this.Y = bxVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return bx.c(this.Y, null, 0L, this);
    }
}

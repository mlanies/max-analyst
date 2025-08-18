package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class vr extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ zr Y;
    public int Z;
    public zr o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr(zr zrVar, Continuation continuation) {
        super(continuation);
        this.Y = zrVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.r(this);
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class x3d extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ y3d Y;
    public int Z;
    public y3d o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3d(y3d y3dVar, Continuation continuation) {
        super(continuation);
        this.Y = y3dVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.d(this);
    }
}

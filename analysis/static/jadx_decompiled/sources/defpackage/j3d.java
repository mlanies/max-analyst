package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class j3d extends hu3 {
    public final /* synthetic */ q3d X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3d(q3d q3dVar, Continuation continuation) {
        super(continuation);
        this.X = q3dVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.q(this);
    }
}

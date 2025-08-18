package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class n3d extends hu3 {
    public int X;
    public final /* synthetic */ l3d Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3d(l3d l3dVar, Continuation continuation) {
        super(continuation);
        this.Y = l3dVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a(null, this);
    }
}

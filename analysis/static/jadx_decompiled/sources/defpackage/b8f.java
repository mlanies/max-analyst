package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class b8f extends hu3 {
    public lec X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ c8f Z;
    public Object o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8f(c8f c8fVar, Continuation continuation) {
        super(continuation);
        this.Z = c8fVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.b(this);
    }
}

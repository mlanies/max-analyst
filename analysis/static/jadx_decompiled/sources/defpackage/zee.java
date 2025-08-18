package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zee extends hu3 {
    public long X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ afe Z;
    public afe o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zee(afe afeVar, Continuation continuation) {
        super(continuation);
        this.Z = afeVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.a(0L, this);
    }
}

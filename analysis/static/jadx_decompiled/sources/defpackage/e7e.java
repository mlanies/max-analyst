package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class e7e extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ i7e Y;
    public int Z;
    public i7e o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7e(i7e i7eVar, Continuation continuation) {
        super(continuation);
        this.Y = i7eVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return i7e.q(this.Y, null, null, this);
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class w4e extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ y4e Y;
    public int Z;
    public Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4e(y4e y4eVar, Continuation continuation) {
        super(continuation);
        this.Y = y4eVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.b(null, 0L, 0, this);
    }
}

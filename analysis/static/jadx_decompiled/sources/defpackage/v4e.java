package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class v4e extends hu3 {
    public final /* synthetic */ y4e X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4e(y4e y4eVar, Continuation continuation) {
        super(continuation);
        this.X = y4eVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.a(0L, this);
    }
}

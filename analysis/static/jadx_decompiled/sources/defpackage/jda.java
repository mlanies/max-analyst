package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jda extends hu3 {
    public final /* synthetic */ kda X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jda(kda kdaVar, Continuation continuation) {
        super(continuation);
        this.X = kdaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.a(0L, null, this);
    }
}

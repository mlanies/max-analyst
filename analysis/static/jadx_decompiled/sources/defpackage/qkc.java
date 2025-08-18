package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qkc extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ alc Y;
    public int Z;
    public alc o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkc(alc alcVar, Continuation continuation) {
        super(continuation);
        this.Y = alcVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return alc.c(this.Y, this);
    }
}

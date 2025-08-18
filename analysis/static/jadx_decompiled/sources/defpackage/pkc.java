package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pkc extends hu3 {
    public String X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ alc Z;
    public alc o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkc(alc alcVar, Continuation continuation) {
        super(continuation);
        this.Z = alcVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return alc.b(this.Z, null, this);
    }
}

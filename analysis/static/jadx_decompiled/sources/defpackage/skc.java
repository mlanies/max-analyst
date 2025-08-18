package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class skc extends hu3 {
    public String X;
    public int Y;
    public /* synthetic */ Object Z;
    public alc o;
    public final /* synthetic */ alc s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public skc(alc alcVar, Continuation continuation) {
        super(continuation);
        this.s0 = alcVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return alc.g(this.s0, null, 0, this);
    }
}

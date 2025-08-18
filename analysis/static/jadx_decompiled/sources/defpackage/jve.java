package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jve extends hu3 {
    public xi9 X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ tve Z;
    public tve o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jve(tve tveVar, Continuation continuation) {
        super(continuation);
        this.Z = tveVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.f(this);
    }
}

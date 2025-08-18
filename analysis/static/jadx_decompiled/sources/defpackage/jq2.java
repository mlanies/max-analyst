package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class jq2 extends hu3 {
    public int X;
    public final /* synthetic */ zq Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq2(zq zqVar, Continuation continuation) {
        super(continuation);
        this.Y = zqVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a(null, this);
    }
}

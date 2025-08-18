package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zfe extends hu3 {
    public int X;
    public final /* synthetic */ xfe Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfe(xfe xfeVar, Continuation continuation) {
        super(continuation);
        this.Y = xfeVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a(null, this);
    }
}

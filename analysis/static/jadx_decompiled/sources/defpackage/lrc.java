package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lrc extends hu3 {
    public wv6 X;
    public boolean Y;
    public boolean Z;
    public qrc o;
    public /* synthetic */ Object s0;
    public final /* synthetic */ qrc t0;
    public int u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lrc(qrc qrcVar, Continuation continuation) {
        super(continuation);
        this.t0 = qrcVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.s0 = obj;
        this.u0 |= Integer.MIN_VALUE;
        return qrc.a(this.t0, null, false, false, this);
    }
}

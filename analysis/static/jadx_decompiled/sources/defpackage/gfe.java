package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gfe extends hu3 {
    public d7f X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ cge Z;
    public cge o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfe(cge cgeVar, Continuation continuation) {
        super(continuation);
        this.Z = cgeVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.d(null, this);
    }
}

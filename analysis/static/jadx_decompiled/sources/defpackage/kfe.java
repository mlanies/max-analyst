package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kfe extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cge Y;
    public int Z;
    public v6f o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfe(cge cgeVar, Continuation continuation) {
        super(continuation);
        this.Y = cgeVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return cge.b(this.Y, null, this);
    }
}

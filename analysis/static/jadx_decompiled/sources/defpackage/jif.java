package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jif extends hu3 {
    public ijf X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mif Z;
    public Object o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jif(mif mifVar, Continuation continuation) {
        super(continuation);
        this.Z = mifVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return mif.e(this.Z, null, this);
    }
}

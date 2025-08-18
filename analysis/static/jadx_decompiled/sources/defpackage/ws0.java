package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ws0 extends hu3 {
    public ArrayList X;
    public long Y;
    public /* synthetic */ Object Z;
    public ix o;
    public final /* synthetic */ ix s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws0(ix ixVar, Continuation continuation) {
        super(continuation);
        this.s0 = ixVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return this.s0.f(null, this);
    }
}

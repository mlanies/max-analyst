package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gz2 extends hu3 {
    public Set X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ jz2 Z;
    public jz2 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz2(jz2 jz2Var, Continuation continuation) {
        super(continuation);
        this.Z = jz2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.t(0L, null, this);
    }
}

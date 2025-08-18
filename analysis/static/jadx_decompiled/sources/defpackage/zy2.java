package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zy2 extends hu3 {
    public List X;
    public long Y;
    public boolean Z;
    public jz2 o;
    public /* synthetic */ Object s0;
    public final /* synthetic */ jz2 t0;
    public int u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy2(jz2 jz2Var, Continuation continuation) {
        super(continuation);
        this.t0 = jz2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.s0 = obj;
        this.u0 |= Integer.MIN_VALUE;
        return this.t0.e(0L, null, this, false);
    }
}

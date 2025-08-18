package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gu8 extends hu3 {
    public List X;
    public boolean Y;
    public /* synthetic */ Object Z;
    public hu8 o;
    public final /* synthetic */ hu8 s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu8(hu8 hu8Var, Continuation continuation) {
        super(continuation);
        this.s0 = hu8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return this.s0.a(false, null, this);
    }
}

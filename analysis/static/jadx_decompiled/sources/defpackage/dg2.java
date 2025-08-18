package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class dg2 extends hu3 {
    public List X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ eg2 Z;
    public eg2 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg2(eg2 eg2Var, Continuation continuation) {
        super(continuation);
        this.Z = eg2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.a(null, this);
    }
}

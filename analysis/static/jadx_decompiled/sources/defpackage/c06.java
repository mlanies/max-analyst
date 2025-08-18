package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class c06 extends hu3 {
    public List X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ d06 Z;
    public d06 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c06(d06 d06Var, Continuation continuation) {
        super(continuation);
        this.Z = d06Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.b(0L, null, this);
    }
}

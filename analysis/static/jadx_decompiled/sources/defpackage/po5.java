package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class po5 extends hu3 {
    public int X;
    public final /* synthetic */ qn5 Y;
    public on5 Z;
    public /* synthetic */ Object o;
    public Iterator s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po5(qn5 qn5Var, Continuation continuation) {
        super(continuation);
        this.Y = qn5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.d(null, this);
    }
}

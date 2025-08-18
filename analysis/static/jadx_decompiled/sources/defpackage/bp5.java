package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class bp5 extends hu3 {
    public int X;
    public final /* synthetic */ cp5 Y;
    public Object Z;
    public /* synthetic */ Object o;
    public on5 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp5(cp5 cp5Var, Continuation continuation) {
        super(continuation);
        this.Y = cp5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.d(null, this);
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class l47 extends hu3 {
    public final /* synthetic */ a66 X;
    public final /* synthetic */ Object Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l47(Continuation continuation, lx3 lx3Var, a66 a66Var, Object obj) {
        super(lx3Var, continuation);
        this.X = a66Var;
        this.Y = obj;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.o = 2;
            od2.a0(obj);
            return obj;
        }
        this.o = 1;
        od2.a0(obj);
        a66 a66Var = this.X;
        f8.c(2, a66Var);
        return a66Var.invoke(this.Y, this);
    }
}

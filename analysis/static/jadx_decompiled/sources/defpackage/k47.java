package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class k47 extends hjc {
    public int b;
    public final /* synthetic */ a66 c;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k47(a66 a66Var, Object obj, Continuation continuation) {
        super(continuation);
        this.c = a66Var;
        this.o = obj;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.b = 2;
            od2.a0(obj);
            return obj;
        }
        this.b = 1;
        od2.a0(obj);
        a66 a66Var = this.c;
        f8.c(2, a66Var);
        return a66Var.invoke(this.o, this);
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class iqc extends hu3 implements on5 {
    public final lx3 X;
    public final int Y;
    public lx3 Z;
    public final on5 o;
    public Continuation s0;

    public iqc(on5 on5Var, lx3 lx3Var) {
        super(hz4.a, kb3.c);
        this.o = on5Var;
        this.X = lx3Var;
        this.Y = ((Number) lx3Var.fold(0, new ai0(23))).intValue();
    }

    @Override // defpackage.on5
    public final Object a(Object obj, Continuation continuation) {
        try {
            Object objR = r(continuation, obj);
            return objR == tx3.a ? objR : e5f.a;
        } catch (Throwable th) {
            this.Z = new cp4(continuation.getContext(), th);
            throw th;
        }
    }

    @Override // defpackage.gi0, defpackage.ux3
    public final ux3 getCallerFrame() {
        Continuation continuation = this.s0;
        if (continuation instanceof ux3) {
            return (ux3) continuation;
        }
        return null;
    }

    @Override // defpackage.hu3, kotlin.coroutines.Continuation
    public final lx3 getContext() {
        lx3 lx3Var = this.Z;
        return lx3Var == null ? hz4.a : lx3Var;
    }

    @Override // defpackage.gi0, defpackage.ux3
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        Throwable thA = pjc.a(obj);
        if (thA != null) {
            this.Z = new cp4(getContext(), thA);
        }
        Continuation continuation = this.s0;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        return tx3.a;
    }

    public final Object r(Continuation continuation, Object obj) {
        lx3 context = continuation.getContext();
        pag.j(context);
        lx3 lx3Var = this.Z;
        if (lx3Var != context) {
            if (lx3Var instanceof cp4) {
                throw new IllegalStateException(x9e.b0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((cp4) lx3Var).b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new bk(14, this))).intValue() != this.Y) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.X + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.Z = context;
        }
        this.s0 = continuation;
        Object objInvoke = kqc.a.invoke(this.o, obj, this);
        if (!tpa.f(objInvoke, tx3.a)) {
            this.s0 = null;
        }
        return objInvoke;
    }
}

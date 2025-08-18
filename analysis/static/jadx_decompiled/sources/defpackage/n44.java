package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class n44 extends ffe implements m56 {
    public int X;
    public final /* synthetic */ o44 Y;
    public final /* synthetic */ je5 Z;
    public final /* synthetic */ boolean s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n44(o44 o44Var, je5 je5Var, boolean z, Continuation continuation) {
        super(1, continuation);
        this.Y = o44Var;
        this.Z = je5Var;
        this.s0 = z;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        return new n44(this.Y, this.Z, this.s0, (Continuation) obj).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            o44 o44Var = this.Y;
            f44 f44Var = o44Var.g;
            je5 je5Var = this.Z;
            long j = je5Var.a;
            gi9 gi9Var = f44Var.e;
            gi9Var.a(j);
            f44 f44Var2 = new f44(f44Var.a, this.s0, gi9Var, f44Var.c, je5Var);
            this.X = 1;
            if (o44.a(o44Var, f44Var2, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}

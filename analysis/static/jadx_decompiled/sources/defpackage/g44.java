package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class g44 extends ffe implements m56 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ o44 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g44(o44 o44Var, Continuation continuation, int i) {
        super(1, continuation);
        this.X = i;
        this.Z = o44Var;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.X) {
            case 0:
                return new g44(this.Z, continuation, 0).o(e5f.a);
            case 1:
                return new g44(this.Z, continuation, 1).o(e5f.a);
            case 2:
                return new g44(this.Z, continuation, 2).o(e5f.a);
            default:
                return new g44(this.Z, continuation, 3).o(e5f.a);
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                tx3 tx3Var = tx3.a;
                int i = this.Y;
                if (i == 0) {
                    od2.a0(obj);
                    hm9.n(o44.k, "cancelAll");
                    f44 f44Var = f44.f;
                    o44 o44Var = this.Z;
                    o44Var.g = f44Var;
                    b79 b79Var = (b79) o44Var.a.getValue();
                    this.Y = 1;
                    if (((n79) b79Var).c(this) == tx3Var) {
                        return tx3Var;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od2.a0(obj);
                }
                return e5f.a;
            case 1:
                tx3 tx3Var2 = tx3.a;
                int i2 = this.Y;
                if (i2 == 0) {
                    od2.a0(obj);
                    o44 o44Var2 = this.Z;
                    f44 f44Var2 = o44Var2.g;
                    f44 f44Var3 = new f44(f44Var2.a, f44Var2.b, f44Var2.e, f44Var2.c, null);
                    this.Y = 1;
                    if (o44.a(o44Var2, f44Var3, this) == tx3Var2) {
                        return tx3Var2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od2.a0(obj);
                }
                return e5f.a;
            case 2:
                tx3 tx3Var3 = tx3.a;
                int i3 = this.Y;
                if (i3 == 0) {
                    od2.a0(obj);
                    o44 o44Var3 = this.Z;
                    f44 f44Var4 = o44Var3.g;
                    f44 f44Var5 = new f44(f44Var4.a, f44Var4.b, f44Var4.e, f44Var4.c, null);
                    this.Y = 1;
                    if (o44.a(o44Var3, f44Var5, this) == tx3Var3) {
                        return tx3Var3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od2.a0(obj);
                }
                return e5f.a;
            default:
                tx3 tx3Var4 = tx3.a;
                int i4 = this.Y;
                if (i4 == 0) {
                    od2.a0(obj);
                    o44 o44Var4 = this.Z;
                    f44 f44Var6 = new f44(false, false, o44Var4.g.e, true, null);
                    this.Y = 1;
                    if (o44.a(o44Var4, f44Var6, this) == tx3Var4) {
                        return tx3Var4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od2.a0(obj);
                }
                return e5f.a;
        }
    }
}

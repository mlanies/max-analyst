package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class d2g extends ffe implements a66 {
    public int X;
    public final /* synthetic */ i2g Y;
    public final /* synthetic */ f2g Z;
    public final /* synthetic */ v1g s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2g(v1g v1gVar, f2g f2gVar, i2g i2gVar, Continuation continuation) {
        super(2, continuation);
        this.Y = i2gVar;
        this.Z = f2gVar;
        this.s0 = v1gVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((d2g) n((e5f) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new d2g(this.s0, this.Z, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        v1g v1gVar = this.s0;
        f2g f2gVar = this.Z;
        if (i == 0) {
            od2.a0(obj);
            i2g i2gVar = this.Y;
            xbe xbeVar = new xbe(i2gVar.d == null ? wbe.c : wbe.b, i2gVar.b);
            zt0 zt0Var = f2gVar.e;
            String str = v1gVar.a;
            ja7 ja7Var = f2gVar.a;
            ja7Var.getClass();
            x97 x97Var = new x97(str, ja7Var.b(xbe.Companion.serializer(), xbeVar));
            this.X = 1;
            if (zt0Var.o(x97Var, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        f2g.e(f2gVar, v1gVar.a);
        return e5f.a;
    }
}

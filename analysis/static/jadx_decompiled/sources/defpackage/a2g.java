package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class a2g extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ r1g Z;
    public final /* synthetic */ f2g s0;
    public final /* synthetic */ v1g t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2g(r1g r1gVar, v1g v1gVar, f2g f2gVar, Continuation continuation) {
        super(2, continuation);
        this.Z = r1gVar;
        this.s0 = f2gVar;
        this.t0 = v1gVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((a2g) n((String) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        f2g f2gVar = this.s0;
        a2g a2gVar = new a2g(this.Z, this.t0, f2gVar, continuation);
        a2gVar.Y = obj;
        return a2gVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        v1g v1gVar = this.t0;
        f2g f2gVar = this.s0;
        if (i == 0) {
            od2.a0(obj);
            String str = (String) this.Y;
            r1g r1gVar = this.Z;
            u1g u1gVar = new u1g(r1gVar.b, r1gVar.c, str);
            zt0 zt0Var = f2gVar.e;
            String str2 = v1gVar.a;
            ja7 ja7Var = f2gVar.a;
            ja7Var.getClass();
            x97 x97Var = new x97(str2, ja7Var.b(u1g.Companion.serializer(), u1gVar));
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

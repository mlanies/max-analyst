package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class n0g extends ffe implements a66 {
    public int X;
    public final /* synthetic */ p0g Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0g(p0g p0gVar, Continuation continuation) {
        super(2, continuation);
        this.Y = p0gVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((n0g) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new n0g(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        p0g p0gVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            mtf mtfVar = (mtf) p0gVar.Y.getValue();
            this.X = 1;
            mtfVar.getClass();
            if (ote.j(mtfVar.a, new itf(mtfVar, p0gVar.b, p0gVar.c), this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        bc7[] bc7VarArr = p0g.z0;
        p0gVar.q();
        return e5f.a;
    }
}

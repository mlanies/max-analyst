package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class k6b extends ffe implements a66 {
    public int X;
    public final /* synthetic */ l6b Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ k56 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6b(l6b l6bVar, String str, zja zjaVar, Continuation continuation) {
        super(2, continuation);
        this.Y = l6bVar;
        this.Z = str;
        this.s0 = zjaVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((k6b) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new k6b(this.Y, this.Z, (zja) this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            l6b l6bVar = this.Y;
            ((hyc) ((q33) l6bVar.b.getValue())).m("server.port", this.Z);
            if (((hyc) ((q33) l6bVar.b.getValue())).t() != -1) {
                ((yle) l6bVar.o.getValue()).i();
            }
            cx7 cx7VarC = ((w9a) ((kke) l6bVar.c.getValue())).c();
            j6b j6bVar = new j6b((zja) this.s0, null);
            this.X = 1;
            if (j47.t0(cx7VarC, j6bVar, this) == tx3Var) {
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

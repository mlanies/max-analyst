package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dqb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ eqb Y;
    public final /* synthetic */ je5 Z;
    public final /* synthetic */ vd5 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqb(eqb eqbVar, je5 je5Var, vd5 vd5Var, Continuation continuation) {
        super(2, continuation);
        this.Y = eqbVar;
        this.Z = je5Var;
        this.s0 = vd5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((dqb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new dqb(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        String str;
        ir6 ir6Var;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            ew9 ew9Var = (ew9) this.Y.s0.getValue();
            je5 je5Var = this.Z;
            this.X = 1;
            ew9Var.getClass();
            if (ote.j(ew9Var.a, new uh(ew9Var, 15, je5Var), this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                o44 o44Var = (o44) this.Y.o.getValue();
                je5 je5Var2 = this.Z;
                boolean z = !((ri4) this.Y.b.getValue()).d();
                o44Var.getClass();
                str = o44.k;
                ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    ir6Var.d(us7.X, str, "notifyServerChatIdsDebounced", null);
                }
                o44Var.c(new n44(o44Var, je5Var2, z, null));
                return e5f.a;
            }
            od2.a0(obj);
        }
        eqb eqbVar = this.Y;
        je5 je5Var3 = this.Z;
        vd5 vd5Var = this.s0;
        this.X = 2;
        if (eqb.b(eqbVar, je5Var3, vd5Var, this) == tx3Var) {
            return tx3Var;
        }
        o44 o44Var2 = (o44) this.Y.o.getValue();
        je5 je5Var22 = this.Z;
        boolean z2 = !((ri4) this.Y.b.getValue()).d();
        o44Var2.getClass();
        str = o44.k;
        ir6Var = hm9.m;
        if (ir6Var != null) {
            ir6Var.d(us7.X, str, "notifyServerChatIdsDebounced", null);
        }
        o44Var2.c(new n44(o44Var2, je5Var22, z2, null));
        return e5f.a;
    }
}

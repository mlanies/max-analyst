package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class pj2 extends ffe implements a66 {
    public final /* synthetic */ ck2 X;
    public final /* synthetic */ int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj2(ck2 ck2Var, int i, Continuation continuation) {
        super(2, continuation);
        this.X = ck2Var;
        this.Y = i;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((pj2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new pj2(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = ck2.d1;
        ck2 ck2Var = this.X;
        sb8 sb8VarX = ck2Var.x();
        e5f e5fVar = e5f.a;
        if (sb8VarX == null) {
            return e5fVar;
        }
        int i = k8a.l;
        s35 s35Var = ck2Var.N0;
        int i2 = this.Y;
        if (i2 == i) {
            boolean z = sb8VarX instanceof jb8;
            pnf.o(s35Var, new n35(sb8VarX.j(), sb8VarX.i(), sb8VarX.x(), (z && ((jb8) sb8VarX).X) ? en4.Z : z ? en4.X : en4.c));
        } else if (i2 == k8a.m) {
            boolean z2 = sb8VarX instanceof jb8;
            pnf.o(s35Var, new n35(sb8VarX.j(), sb8VarX.i(), sb8VarX.x(), (z2 && ((jb8) sb8VarX).X) ? en4.Y : z2 ? en4.o : en4.b));
        } else {
            int i3 = k8a.j;
            s35 s35Var2 = ck2Var.O0;
            if (i2 == i3) {
                hi2 hi2Var = hi2.c;
                long j = sb8VarX.j();
                Long l = new Long(sb8VarX.i());
                hi2Var.getClass();
                pnf.o(s35Var2, hi2.Z1(j, l));
            } else if (i2 == k8a.k) {
                hi2 hi2Var2 = hi2.c;
                long j2 = sb8VarX.j();
                hi2Var2.getClass();
                wg0.k(":chats?id=" + ck2Var.b + "&type=local&message_id=" + j2, s35Var2);
            } else if (i2 == k8a.c) {
                hi2 hi2Var3 = hi2.c;
                long j3 = sb8VarX.j();
                hi2Var3.getClass();
                pnf.o(s35Var2, hi2.Z1(j3, null));
            }
        }
        return e5fVar;
    }
}

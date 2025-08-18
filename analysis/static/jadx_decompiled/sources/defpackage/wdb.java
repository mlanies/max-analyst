package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wdb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ feb Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wdb(feb febVar, long j, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = febVar;
        this.Z = j;
        this.s0 = i;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((wdb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new wdb(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        jqe eqeVar;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        boolean z = true;
        feb febVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            ea eaVar = (ea) febVar.w0.getValue();
            this.X = 1;
            obj = eaVar.a(this.s0, this.Z, febVar.c, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        pke pkeVar = (pke) obj;
        if (pkeVar != null) {
            bc7[] bc7VarArr = feb.G0;
            febVar.getClass();
            String str = pkeVar.o;
            if (str == null || str.length() == 0) {
                String str2 = pkeVar.b;
                eqeVar = (f46.U(str2) && tpa.f(str2, "io.exception")) ? new eqe(jpc.G) : (!f46.U(str2) || tpa.f(str2, "io.exception")) ? new eqe(jpc.F) : new eqe(jpc.J);
                z = false;
            } else {
                eqeVar = new iqe(str);
            }
            pnf.o(febVar.C0, new kdb(eqeVar, null));
            if (z) {
                rdb rdbVar = rdb.c;
                rdb rdbVar2 = febVar.o;
                s35 s35Var = febVar.B0;
                if (rdbVar2 == rdbVar) {
                    gfb.c.getClass();
                    pnf.o(s35Var, new c64(":profile/members?id=" + febVar.b + "&type=ADMIN"));
                } else {
                    pnf.o(s35Var, g43.b);
                }
            }
        } else {
            bc7[] bc7VarArr2 = feb.G0;
            febVar.getClass();
            rdb rdbVar3 = rdb.c;
            rdb rdbVar4 = febVar.o;
            s35 s35Var2 = febVar.B0;
            if (rdbVar4 == rdbVar3) {
                if (febVar.X) {
                    pnf.o(febVar.C0, new kdb(new eqe(vea.J0), Integer.valueOf(woc.z)));
                }
                gfb.c.getClass();
                pnf.o(s35Var2, new c64(":profile/members?id=" + febVar.b + "&type=ADMIN"));
            } else {
                pnf.o(s35Var2, g43.b);
            }
        }
        return e5f.a;
    }
}

package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes.dex */
public final class kw2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ nx2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw2(nx2 nx2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = nx2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        kw2 kw2Var = (kw2) n((ej7) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        kw2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        kw2 kw2Var = new kw2(this.Y, continuation);
        kw2Var.X = obj;
        return kw2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ej7 ej7Var = (ej7) this.X;
        String name = this.Y.getClass().getName();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, "get result for link " + ej7Var, null);
        }
        if (ej7Var instanceof pi7) {
            pnf.o(this.Y.O0, new a47(new m64(((pi7) ej7Var).a)));
        } else if (ej7Var instanceof si7) {
            pnf.o(this.Y.O0, new tla(((si7) ej7Var).a));
        } else if (ej7Var instanceof wi7) {
            pnf.o(this.Y.O0, gy2.a2(gy2.c, ((wi7) ej7Var).a));
        } else if (ej7Var instanceof ni7) {
            s35 s35Var = this.Y.O0;
            gy2 gy2Var = gy2.c;
            ni7 ni7Var = (ni7) ej7Var;
            long j = ni7Var.a;
            String str = ni7Var.o;
            String str2 = ni7Var.b;
            boolean z = ni7Var.c;
            gy2Var.getClass();
            String str3 = ":join?id=" + j + "&link=" + str + "&channel=" + z;
            if (str2 != null) {
                str3 = ((Object) str3) + "&title=" + str2;
            }
            wg0.k(str3, s35Var);
        } else if (!(ej7Var instanceof xi7)) {
            if (ej7Var instanceof yi7) {
                s35 s35Var2 = this.Y.O0;
                gy2 gy2Var2 = gy2.c;
                yi7 yi7Var = (yi7) ej7Var;
                long j2 = yi7Var.a;
                String str4 = yi7Var.b;
                gy2Var2.getClass();
                y7g y7gVar = new y7g(13);
                y7gVar.b = ":chats";
                y7gVar.D(Long.valueOf(j2), "id");
                y7gVar.D("local", "type");
                if (str4 != null) {
                    y7gVar.D(str4, ApiProtocol.PARAM_PAYLOAD);
                }
                wg0.k(y7gVar.s(), s35Var2);
            } else if (ej7Var instanceof aj7) {
                nx2 nx2Var = this.Y;
                nx2Var.o.j(((aj7) ej7Var).a, true, false, false, new x2(nx2Var, 26, ej7Var));
            } else if (tpa.f(ej7Var, qi7.a)) {
                pnf.o(this.Y.P0, new rnd(new eqe(jpc.A2)));
            } else if (ej7Var instanceof bj7) {
                s35 s35Var3 = this.Y.O0;
                gy2 gy2Var3 = gy2.c;
                long j3 = ((bj7) ej7Var).a;
                gy2Var3.getClass();
                wg0.k(":stickers/set?set_id=" + j3, s35Var3);
            }
        }
        return e5f.a;
    }
}

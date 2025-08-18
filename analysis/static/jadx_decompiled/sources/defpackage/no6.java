package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class no6 extends ffe implements a66 {
    public final /* synthetic */ String X;
    public final /* synthetic */ oo6 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no6(String str, oo6 oo6Var, Continuation continuation) {
        super(2, continuation);
        this.X = str;
        this.Y = oo6Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((no6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new no6(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        String str = this.X;
        boolean zO0 = eae.o0(str, "Custom", false);
        e5f e5fVar = e5f.a;
        oo6 oo6Var = this.Y;
        if (zO0) {
            pnf.o(oo6Var.t0, new ko6(oo6Var.Y.getString("Custom", "")));
            return e5fVar;
        }
        boolean zD = ((f5a) oo6Var.X.getValue()).d();
        p7b p7bVar = (p7b) oo6Var.q();
        p7bVar.a.c();
        p7bVar.b.c();
        p7bVar.c.c();
        p7bVar.d.c();
        p7bVar.e.c();
        ((p7b) oo6Var.q()).a.m("server.host", str);
        ((p7b) oo6Var.q()).a.m("server.port", "443");
        oo6Var.s0.setValue(oo6Var.r());
        s35 s35Var = oo6Var.t0;
        if (zD) {
            pnf.o(s35Var, lo6.a);
            o23 o23Var = oo6Var.b;
            String str2 = (String) o23Var.b;
            hm9.n(str2, "execute");
            ((av0) ((je7) o23Var.c).getValue()).d(new n23(o23Var));
            try {
                ((f5a) ((je7) o23Var.o).getValue()).g(true);
            } catch (Throwable th) {
                hm9.p(str2, "resetCache: failed", th);
            }
        }
        pnf.o(s35Var, jo6.a);
        return e5fVar;
    }
}

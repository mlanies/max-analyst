package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class i27 extends ffe implements a66 {
    public String X;
    public int Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ String s0;
    public final /* synthetic */ q27 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i27(String str, String str2, q27 q27Var, Continuation continuation) {
        super(2, continuation);
        this.Z = str;
        this.s0 = str2;
        this.t0 = q27Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((i27) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new i27(this.Z, this.s0, this.t0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        boolean zM;
        String str;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        e5f e5fVar = e5f.a;
        q27 q27Var = this.t0;
        if (i != 0) {
            if (i == 1) {
                od2.a0(obj);
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = this.X;
            od2.a0(obj);
            h80 h80Var = (h80) obj;
            pnf.o(q27Var.Y, new x17(h80Var.c, str, h80Var.o));
            return e5fVar;
        }
        od2.a0(obj);
        String str2 = this.Z + " " + this.s0;
        if ("".equals(((eaa) q27Var.w0.getValue()).a)) {
            zM = true;
        } else {
            je7 je7Var = q27Var.X;
            zM = ((zua) je7Var.getValue()).m(((zua) je7Var.getValue()).t(null, str2));
        }
        if (!zM) {
            kld kldVar = q27Var.Z;
            pt7 pt7Var = new pt7(new eqe(v0c.oneme_login_input_is_not_valid_phone_error), null);
            this.Y = 1;
            return kldVar.a(pt7Var, this) == tx3Var ? tx3Var : e5fVar;
        }
        String strB = q27Var.A0.b("", str2);
        i80 i80Var = (i80) q27Var.c.getValue();
        this.X = str2;
        this.Y = 2;
        Object objA = i80Var.a(strB, 1, this);
        if (objA == tx3Var) {
            return tx3Var;
        }
        obj = objA;
        str = str2;
        h80 h80Var2 = (h80) obj;
        pnf.o(q27Var.Y, new x17(h80Var2.c, str, h80Var2.o));
        return e5fVar;
    }
}

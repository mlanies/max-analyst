package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ue2 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ x10 Z;
    public final /* synthetic */ ye2 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue2(x10 x10Var, ye2 ye2Var, Continuation continuation) {
        super(2, continuation);
        this.Z = x10Var;
        this.s0 = ye2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ue2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ue2 ue2Var = new ue2(this.Z, this.s0, continuation);
        ue2Var.Y = obj;
        return ue2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        String strA;
        sx3 sx3Var;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        ye2 ye2Var = this.s0;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var2 = (sx3) this.Y;
            x10 x10Var = this.Z;
            if (x10Var.X) {
                String str = x10Var.a;
                strA = null;
                if (!oag.t(str) && !oag.t(str)) {
                    strA = au1.g(str, "&fn=legacy_44");
                }
            } else {
                strA = x10Var.a();
            }
            qrc qrcVar = ye2Var.o;
            this.Y = sx3Var2;
            this.X = 1;
            Object objC = qrc.c(qrcVar, strA, x10Var.X, this);
            if (objC == tx3Var) {
                return tx3Var;
            }
            obj = objC;
            sx3Var = sx3Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sx3Var = (sx3) this.Y;
            od2.a0(obj);
        }
        Uri uri = (Uri) obj;
        ne2 ne2Var = (ne2) ye2Var.z0.getAndUpdate(new oe2(0));
        boolean z = j1e.z(sx3Var);
        e5f e5fVar = e5f.a;
        if (!z) {
            return e5fVar;
        }
        kld kldVar = ye2Var.u0;
        if (uri != null && ne2Var != null) {
            kldVar.g(new jn4(uri, ne2Var.d));
        } else if (uri == null && ne2Var != null) {
            kldVar.g(new in4(ye2.u(ne2Var.d, false)));
        }
        return e5fVar;
    }
}

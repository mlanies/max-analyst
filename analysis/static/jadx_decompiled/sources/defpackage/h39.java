package defpackage;

import android.graphics.Bitmap;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final /* synthetic */ class h39 implements k56 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ h39(n59 n59Var, boolean z, MessageModel messageModel) {
        this.c = n59Var;
        this.b = z;
        this.o = messageModel;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                n59 n59Var = (n59) this.c;
                boolean z = this.b;
                MessageModel messageModel = (MessageModel) this.o;
                Object objI0 = x53.i0(n59Var.D().f.b.b());
                s5f s5fVar = objI0 instanceof s5f ? (s5f) objI0 : null;
                if (z && s5fVar != null) {
                    if (s5fVar.a != 0) {
                        String str = n59Var.A0;
                        ir6 ir6Var = hm9.m;
                        if (ir6Var != null && ir6Var.c()) {
                            ir6Var.d(us7.X, str, ey8.h(s5fVar.a, "Try scroll to unread marker, mark: "), null);
                        }
                        long j = s5fVar.a;
                        long j2 = messageModel != null ? messageModel.c : 0L;
                        l89 l89VarB = n59Var.B();
                        l89VarB.getClass();
                        l89VarB.f(j47.S(l89VarB.c, l89VarB.b, vx3.b, new h89(l89VarB, j, j2, null)));
                    }
                }
                return e5f.a;
            default:
                sif sifVar = (sif) this.c;
                Bitmap bitmap = (Bitmap) this.o;
                boolean z2 = this.b;
                fjf fjfVar = sifVar.u0;
                if (fjfVar == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                String str2 = fjfVar.p;
                ir6 ir6Var2 = hm9.m;
                if (ir6Var2 != null && ir6Var2.c()) {
                    ir6Var2.d(us7.X, str2, "setStencilBitmap, " + (bitmap != null ? ay7.J(bitmap) : null) + ", recycle_after_consume=" + z2, null);
                }
                b2e b2eVar = fjfVar.q;
                if (b2eVar == null) {
                    b2eVar = new b2e(fjfVar.o);
                    fjfVar.q = b2eVar;
                }
                String str3 = b2eVar.d;
                ir6 ir6Var3 = hm9.m;
                if (ir6Var3 != null && ir6Var3.c()) {
                    ir6Var3.d(us7.X, str3, "setBitmap, " + (bitmap != null ? ay7.J(bitmap) : null) + ", recycle_after_consume=" + z2, null);
                }
                if (bitmap != null) {
                    b2eVar.e.setStencilBitmap(bitmap, z2);
                }
                return e5f.a;
        }
    }

    public /* synthetic */ h39(sif sifVar, Bitmap bitmap, boolean z) {
        this.c = sifVar;
        this.o = bitmap;
        this.b = z;
    }
}

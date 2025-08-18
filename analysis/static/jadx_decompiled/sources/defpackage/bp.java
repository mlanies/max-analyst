package defpackage;

import android.content.Context;
import java.io.File;

/* loaded from: classes2.dex */
public final /* synthetic */ class bp implements k56 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ bp(yz0 yz0Var, je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.a = 1;
        this.c = yz0Var;
        this.b = je7Var;
        this.o = je7Var2;
        this.X = je7Var3;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ep epVar = (ep) this.o;
                return new xp4((Context) this.c, (p7b) epVar.l.getValue(), epVar.a(), (p84) this.X, (p82) ((je7) this.b).getValue());
            case 1:
                return new tz0((yz0) this.c, (je7) this.b, (je7) this.o, (je7) this.X);
            case 2:
                Context context = (Context) xcb.a.getAccessor().c(Context.class);
                p7b p7bVar = (p7b) ((m7b) this.c);
                return new yc8(context, p7bVar.a, (ge2) this.o, (je7) this.b, (je7) this.X, p7bVar.e);
            case 3:
                return new ki5((File) this.c, (li5) this.o, (mi5) this.X, (fd7) this.b);
            case 4:
                fs8 fs8Var = (fs8) this.o;
                long j = fs8Var.a;
                au8 au8Var = (au8) this.c;
                au8Var.A(j, fs8Var.c);
                iu8 iu8Var = iu8.Y;
                cu8 cu8Var = (cu8) this.X;
                au8Var.x(cu8Var, iu8Var);
                pl plVar = ((ve9) this.b).c;
                if (plVar == null) {
                    plVar = null;
                }
                au8Var.w(cu8Var, iz7.g(fs8Var.s0, (vxc) plVar.F.getValue()));
                return e5f.a;
            default:
                return new ya9((je7) this.b, (je7) this.c, (je7) this.o, (je7) this.X);
        }
    }

    public /* synthetic */ bp(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4) {
        this.a = 5;
        this.b = je7Var;
        this.c = je7Var2;
        this.o = je7Var3;
        this.X = je7Var4;
    }

    public /* synthetic */ bp(m7b m7bVar, ge2 ge2Var, je7 je7Var, je7 je7Var2) {
        this.a = 2;
        this.c = m7bVar;
        this.o = ge2Var;
        this.b = je7Var;
        this.X = je7Var2;
    }

    public /* synthetic */ bp(Context context, ep epVar, p84 p84Var, v7g v7gVar, je7 je7Var) {
        this.a = 0;
        this.c = context;
        this.o = epVar;
        this.X = p84Var;
        this.b = je7Var;
    }

    public /* synthetic */ bp(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.X = obj3;
        this.b = obj4;
    }
}

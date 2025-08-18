package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class v60 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long o;

    public /* synthetic */ v60(Object obj, Object obj2, long j, long j2, int i) {
        this.a = i;
        this.X = obj;
        this.b = obj2;
        this.c = j;
        this.o = j2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Object obj = this.b;
        Object obj2 = this.X;
        switch (this.a) {
            case 0:
                ph4 ph4Var = (ph4) obj2;
                ph4Var.getClass();
                int i = maf.a;
                h74 h74Var = ((n75) ph4Var.b).a.C0;
                ed edVarP = h74Var.P();
                h74Var.Q(edVarP, 1008, new yv3(edVarP, (String) obj, this.o, this.c));
                break;
            case 1:
                qz7 qz7Var = (qz7) obj2;
                qz7Var.getClass();
                int i2 = oaf.a;
                i74 i74Var = ((o75) qz7Var.c).a.D0;
                fd fdVarF = i74Var.F();
                i74Var.I(fdVarF, 1008, new r64(fdVarF, (String) obj, this.o, this.c, 0));
                break;
            case 2:
                Iterator it = ((List) obj2).iterator();
                while (it.hasNext()) {
                    ((vlc) obj).f(this.c, this.o, (fs8) it.next(), false);
                }
                break;
            case 3:
                aab aabVar = (aab) obj2;
                aabVar.getClass();
                int i3 = oaf.a;
                i74 i74Var2 = ((o75) aabVar.b).a.D0;
                fd fdVarF2 = i74Var2.F();
                i74Var2.I(fdVarF2, 1016, new r64(fdVarF2, (String) obj, this.o, this.c, 2));
                break;
            default:
                wva wvaVar = (wva) obj2;
                wvaVar.getClass();
                int i4 = maf.a;
                h74 h74Var2 = ((n75) wvaVar.c).a.C0;
                ed edVarP2 = h74Var2.P();
                h74Var2.Q(edVarP2, 1016, new m82(edVarP2, (String) obj, this.o, this.c));
                break;
        }
    }
}

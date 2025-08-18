package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import ru.ok.tamtam.contacts.ContactController$ContactNotFoundException;

/* loaded from: classes2.dex */
public final /* synthetic */ class vi0 implements qj3, grd {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object o;

    public /* synthetic */ vi0(zf2 zf2Var, long j, boolean z) {
        this.a = 1;
        this.o = zf2Var;
        this.b = j;
        this.c = z;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        Map map = (Map) obj;
        qy7 qy7Var = (qy7) this.o;
        qy7Var.getClass();
        boolean z = this.c;
        sn0 sn0Var = z ? (sn0) map.get(uy7.a) : (sn0) map.get(uy7.c);
        for (xi0 xi0Var : qy7Var.b.values()) {
            long j = xi0Var.b.j;
            long j2 = this.b;
            y8 y8Var = xi0Var.a;
            if (j != j2) {
                y8Var.G(sn0Var);
            } else if (z) {
                y8Var.G((sn0) map.get(uy7.b));
            } else {
                y8Var.G((sn0) map.get(uy7.o));
            }
            y8Var.I();
        }
    }

    @Override // defpackage.grd
    public void j(nqd nqdVar) throws Throwable {
        long j = this.b;
        Object obj = this.o;
        switch (this.a) {
            case 1:
                zf2 zf2Var = (zf2) obj;
                zf2Var.getClass();
                hm9.n("zf2", "loadNetworkPrevPage, messageId = " + j);
                au8 au8Var = zf2Var.r;
                cu8 cu8VarQ = au8Var.q(j);
                ArrayList arrayListL = ((k24) au8Var.a).c.l(zf2Var.a, cu8VarQ != null ? cu8VarQ.o : Long.MAX_VALUE, zf2Var.f, null, this.c);
                ArrayList arrayListB = zf2Var.u.b(arrayListL);
                Iterator it = arrayListL.iterator();
                while (it.hasNext()) {
                    zf2Var.t.e((cu8) it.next());
                }
                nqdVar.a(arrayListB);
                break;
            default:
                el3 el3Var = (el3) obj;
                el3Var.b();
                uj3 uj3VarH = el3Var.h(j, this.c);
                if (uj3VarH == null) {
                    if (!nqdVar.h()) {
                        nqdVar.onError(new ContactController$ContactNotFoundException(ey8.h(j, "contact not found: ")));
                        break;
                    }
                } else if (!nqdVar.h()) {
                    nqdVar.a(uj3VarH);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ vi0(el3 el3Var, long j) {
        this.a = 2;
        this.o = el3Var;
        this.b = j;
        this.c = false;
    }

    public /* synthetic */ vi0(qy7 qy7Var, boolean z, long j) {
        this.a = 0;
        this.o = qy7Var;
        this.c = z;
        this.b = j;
    }
}

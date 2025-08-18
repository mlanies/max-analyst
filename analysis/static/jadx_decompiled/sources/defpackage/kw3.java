package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class kw3 {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public kw3(je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
    }

    public final qy9 a(iy8 iy8Var) {
        r1a r1aVarR;
        ArrayList arrayListS;
        int i = 0;
        int i2 = 1;
        hm9.m("kw3", "convertVideo: messageUpload = %s", iy8Var);
        int i3 = iy8Var.d;
        if (i3 != 2 && i3 != 9) {
            return qy9.m(iy8Var);
        }
        mec mecVar = new mec();
        mecVar.a = iy8Var;
        if (iy8Var.e == null) {
            hy8 hy8VarA = iy8Var.a();
            i20 i20Var = new i20(1);
            iy8 iy8Var2 = (iy8) mecVar.a;
            mqb mqbVar = ((kxc) ((hp) this.a.getValue())).q().a;
            af8 af8Var = (af8) this.c.getValue();
            String str = iy8Var2.b;
            cj0 cj0Var = (cj0) af8Var;
            cj0Var.getClass();
            Object next = null;
            try {
                arrayListS = j1e.s(Uri.parse(str), cj0Var.a, cj0Var);
            } catch (Throwable th) {
                hm9.p("cj0", "getAvailableQualitiesForVideo: failed", th);
                arrayListS = null;
            }
            if (arrayListS != null) {
                Iterator it = arrayListS.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        mqb mqbVar2 = ((nqb) next).a;
                        do {
                            Object next2 = it.next();
                            mqb mqbVar3 = ((nqb) next2).a;
                            if (mqbVar2.compareTo(mqbVar3) > 0) {
                                next = next2;
                                mqbVar2 = mqbVar3;
                            }
                        } while (it.hasNext());
                    }
                }
                nqb nqbVar = (nqb) next;
                if (nqbVar != null) {
                    mqb mqbVar4 = nqbVar.a;
                    if (mqbVar4.compareTo(mqbVar) >= 0) {
                        mqbVar = mqbVar4;
                    }
                }
            }
            i20Var.a = mqbVar;
            hy8VarA.e = new ref(i20Var);
            mecVar.a = new iy8(hy8VarA);
        }
        Object obj = mecVar.a;
        ref refVar = ((iy8) obj).e;
        if (refVar == null) {
            return qy9.m(obj);
        }
        i20 i20Var2 = new i20(1);
        i20Var2.a = refVar.a;
        i20Var2.b = refVar.b;
        i20Var2.c = refVar.c;
        i20Var2.d = refVar.d;
        ref refVar2 = new ref(i20Var2);
        l7b l7bVar = new l7b(13, false);
        l7bVar.b = ((iy8) mecVar.a).b;
        l7bVar.c = refVar2;
        lef lefVar = new lef(l7bVar);
        wef wefVar = (wef) this.b.getValue();
        synchronized (wefVar) {
            hm9.m("wef", "convertVideo: %s", lefVar);
            r1aVarR = (qy9) wefVar.i.get(lefVar);
            if (r1aVarR == null) {
                s28 s28Var = new s28(new o28(wefVar.b.a(), 2, new sef(lefVar, 1)), new n2f(20), 1);
                n2f n2fVar = new n2f(18);
                kj6 kj6Var = ft.e;
                r66 r66Var = ft.d;
                f38 o28Var = new o28(new c38(new e38(s28Var, n2fVar, kj6Var, r66Var), new t28(new u24(wefVar, 9, lefVar))), 1, new vef(wefVar, i));
                xy9 xy9Var = new xy9(new xy9(new oz9(o28Var instanceof x66 ? ((x66) o28Var).d() : new hb3(i2, o28Var), kj6Var, new ypc(wefVar, 25, lefVar), r66Var), kj6Var, new vle(wefVar, 6, lefVar), 2), new vef(wefVar, i2), r66Var, 2);
                hm9.j0(1, "bufferSize");
                o84 o84Var = new o84(14);
                AtomicReference atomicReference = new AtomicReference();
                r1aVarR = new y0a(new h1a(new e1a(atomicReference, o84Var), xy9Var, atomicReference, o84Var)).r(wefVar.f);
                wefVar.i.put(lefVar, r1aVarR);
            }
        }
        return new e0a(new oz9(r1aVarR, ob6.b, ft.e, ft.d), new gd1(7, mecVar), 3);
    }
}

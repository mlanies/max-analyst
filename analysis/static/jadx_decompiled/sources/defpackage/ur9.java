package defpackage;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class ur9 {
    public final m7b a;
    public final av0 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;

    public ur9(m7b m7bVar, av0 av0Var, je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.a = m7bVar;
        this.b = av0Var;
        this.c = je7Var;
        this.d = je7Var2;
        this.e = je7Var3;
    }

    public final void a(le3 le3Var, gi9 gi9Var) {
        hm9.n("NotifConfigLogic", "onChatsAndFolders: step 1: chats");
        Map map = le3Var.c;
        xs xsVar = new xs(0);
        if (map != null) {
            xs xsVar2 = new xs(0);
            for (Map.Entry entry : map.entrySet()) {
                long jLongValue = ((Number) entry.getKey()).longValue();
                xq2 xq2Var = (xq2) entry.getValue();
                e52 e52VarZ = ((p82) this.c.getValue()).z(jLongValue);
                if (e52VarZ == null) {
                    p82 p82Var = (p82) this.c.getValue();
                    p82Var.getClass();
                    u82 u82Var = new u82();
                    u82Var.b = j92.b;
                    u82Var.a = jLongValue;
                    u82Var.l = jLongValue;
                    u82Var.c = i92.o;
                    u82Var.r0 = 2;
                    long jE = ((k24) ((c34) p82Var.l.get())).b.e(new k92(u82Var));
                    p82Var.U(jE, p82Var.X(jE));
                    e52VarZ = p82Var.h0(jE, false);
                }
                long j = e52VarZ.a;
                xsVar.add(Long.valueOf(jLongValue));
                if (!gi9Var.d(j)) {
                    p82 p82Var2 = (p82) this.c.getValue();
                    p82Var2.getClass();
                    hm9.m("p82", "changeChatConfiguration, chatId = %d, chatSettings = %s", Long.valueOf(j), xq2Var);
                    p82Var2.h(j, false, new v02(7, xq2Var));
                    xsVar2.add(Long.valueOf(j));
                }
            }
            if (!xsVar2.isEmpty()) {
                this.b.c(new vz2(xsVar2, true, false, null, null, 124));
            }
        }
        hm9.n("NotifConfigLogic", "onChatsAndFolders: step 2: folders");
        sa2 sa2Var = le3Var.e;
        if (sa2Var != null) {
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, "NotifConfigLogic", "onChatsAndFolders: step 2: folders not null " + ((ta2) this.d.getValue()), null);
            }
            ((zb2) ((ta2) this.d.getValue())).f(sa2Var.b, sa2Var.a);
        }
        if (!xsVar.isEmpty()) {
            zb2 zb2Var = (zb2) ((ta2) this.d.getValue());
            vxd vxdVar = zb2Var.H0;
            if (vxdVar != null) {
                vxdVar.cancel((CancellationException) null);
            }
            zb2Var.H0 = j47.T(zb2Var.Z, zb2Var.Y, null, new vb2(zb2Var, null), 2);
        }
        hm9.n("NotifConfigLogic", "onChatsAndFolders: post config event");
        this.b.c(new su(2));
    }

    public final void b(le3 le3Var, boolean z) {
        hm9.n("NotifConfigLogic", "onConfiguration = " + le3Var);
        hm9.n("NotifConfigLogic", "onConfiguration: step 1: hash");
        String str = le3Var.a;
        m7b m7bVar = this.a;
        if (str != null) {
            ((p7b) m7bVar).b.m("hash", str);
        }
        hm9.n("NotifConfigLogic", "onConfiguration: step 2: serverSettings");
        av0 av0Var = this.b;
        a8d a8dVar = le3Var.b;
        if (a8dVar != null) {
            z7d z7dVar = ((p7b) m7bVar).b;
            Map map = a8dVar.b;
            if (map == null) {
                map = oz4.a;
            }
            z7dVar.getClass();
            String strA = mqd.a(z7dVar.w(PmsKey.proxy, null));
            PmsKey pmsKey = PmsKey.f101proxydomains;
            nz4 nz4Var = nz4.a;
            List listH = z7dVar.h(pmsKey.name(), nz4Var);
            SharedPreferences.Editor editorEdit = z7dVar.g.edit();
            for (Map.Entry entry : map.entrySet()) {
                e3.i(editorEdit, (String) entry.getKey(), entry.getValue());
            }
            ((ji5) editorEdit).apply();
            xs xsVar = z7dVar.h;
            if (strA != null) {
                String strA2 = mqd.a(z7dVar.w(PmsKey.proxy, null));
                if (!strA.equals(strA2)) {
                    xsVar.getClass();
                    qs qsVar = new qs(xsVar);
                    while (qsVar.hasNext()) {
                        ((x7d) qsVar.next()).a(strA, strA2);
                    }
                }
            }
            if (map.containsKey("debug-mode")) {
                try {
                    ((ml0) z7dVar.i.getValue()).e(Integer.valueOf(((Number) map.get("debug-mode")).intValue()));
                } catch (Throwable th) {
                    hm9.l0(z7dVar.e, "could not parse debug mode", th);
                }
            }
            List listH2 = z7dVar.h(PmsKey.f101proxydomains.name(), nz4Var);
            if (!tpa.f(listH, listH2)) {
                xsVar.getClass();
                qs qsVar2 = new qs(xsVar);
                while (qsVar2.hasNext()) {
                    ((x7d) qsVar2.next()).b(listH, listH2);
                }
            }
            if (map.containsKey("react-errors")) {
                z7dVar.j.reset();
            }
            if (map.containsKey("saved-messages-aliases")) {
                z7dVar.k.reset();
            }
            Iterator it = z7dVar.l.iterator();
            while (it.hasNext()) {
                ((w7d) it.next()).a();
            }
            av0Var.c(new j7d());
        }
        hm9.n("NotifConfigLogic", "onConfiguration: step 3: user settings");
        gaf gafVar = le3Var.d;
        if (gafVar != null) {
            p7b p7bVar = (p7b) m7bVar;
            p7bVar.c.z(gafVar);
            if (tpa.f(gafVar.u, Boolean.FALSE)) {
                t33 t33Var = p7bVar.a;
                t33Var.m("app.pin_" + t33Var.t(), null);
            }
            ie3 ie3Var = (ie3) this.e.getValue();
            ie3Var.getClass();
            j47.T(ie3Var.b, null, null, new he3(ie3Var, null), 3);
        }
        if (z) {
            hm9.n("NotifConfigLogic", "onConfiguration: post config event");
            av0Var.c(new su(2));
        } else {
            hm9.n("NotifConfigLogic", "onConfiguration: step 5: chats settings");
            a(le3Var, vv7.a);
        }
    }
}

package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final class lad extends ol implements lme {
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lad(long j, int i) {
        super(j);
        this.o = i;
    }

    private final void u(pke pkeVar) {
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        switch (this.o) {
            case 0:
                nad nadVar = (nad) gleVar;
                ((p7b) r()).b.l("app-update-type", Long.valueOf(nadVar.X));
                if (nadVar.X != 1) {
                    if (nadVar.c != null) {
                        z7d z7dVar = ((p7b) r()).b;
                        String str = nadVar.c;
                        z7dVar.getClass();
                        String strA = mqd.a(str);
                        PmsKey pmsKey = PmsKey.proxy;
                        String strA2 = mqd.a(z7dVar.w(pmsKey, null));
                        if (!tpa.f(strA, strA2)) {
                            z7dVar.m(pmsKey.name(), strA);
                            xs xsVar = z7dVar.h;
                            xsVar.getClass();
                            qs qsVar = new qs(xsVar);
                            while (qsVar.hasNext()) {
                                ((x7d) qsVar.next()).a(strA2, strA);
                            }
                        }
                    }
                    if (nadVar.o != null) {
                        ((p7b) r()).a.m("app.location.country.code", nadVar.o);
                    }
                    z7d z7dVar2 = ((p7b) r()).b;
                    List listEmptyList = nadVar.Y == null ? Collections.emptyList() : new ArrayList(nadVar.Y);
                    z7dVar2.getClass();
                    PmsKey pmsKey2 = PmsKey.f101proxydomains;
                    List listH = z7dVar2.h(pmsKey2.name(), nz4.a);
                    if (!tpa.f(listH, listEmptyList)) {
                        SharedPreferences.Editor editorEdit = z7dVar2.g.edit();
                        e3.i(editorEdit, pmsKey2.name(), listEmptyList);
                        ((ji5) editorEdit).apply();
                        xs xsVar2 = z7dVar2.h;
                        xsVar2.getClass();
                        qs qsVar2 = new qs(xsVar2);
                        while (qsVar2.hasNext()) {
                            ((x7d) qsVar2.next()).b(listH, listEmptyList);
                        }
                    }
                    l().c(new su(this.a, 11));
                    String strF = k().f();
                    if (strF != null && strF.length() != 0 && !k().e()) {
                        pl plVar = this.c;
                        ((cu7) (plVar != null ? plVar : null).j.getValue()).q();
                        break;
                    }
                } else {
                    pl plVar2 = this.c;
                    if (plVar2 == null) {
                        plVar2 = null;
                    }
                    n6a n6aVar = (n6a) plVar2.i.getValue();
                    n6aVar.d.getClass();
                    ((t33) n6aVar.b).m("version.force.update.received", "25.8.1");
                    pl plVar3 = this.c;
                    ((n6a) (plVar3 != null ? plVar3 : null).i.getValue()).b();
                    break;
                }
                break;
            default:
                l().c(new vbd(this.a, ((ubd) gleVar).c));
                break;
        }
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        switch (this.o) {
            case 0:
                pl plVar = this.c;
                if (plVar == null) {
                    plVar = null;
                }
                oad oadVar = (oad) plVar.h.getValue();
                oadVar.getClass();
                String str = oad.f;
                hm9.n(str, "onSessionInitFail, error = " + pkeVar);
                if (!"session.state".equals(pkeVar.b)) {
                    if (!(pkeVar instanceof gke)) {
                        if ("proto.state".equals(pkeVar.b)) {
                            bc7 bc7Var = oad.e[0];
                            ((cba) ((o45) oadVar.a.get())).c(new TamErrorException(pkeVar), true);
                        }
                        bc7 bc7Var2 = oad.e[3];
                        ((yle) oadVar.d.get()).i();
                        break;
                    } else {
                        bc7[] bc7VarArr = oad.e;
                        bc7 bc7Var3 = bc7VarArr[1];
                        if (((jbd) ((hbd) oadVar.b.get())).h == 2) {
                            bc7 bc7Var4 = bc7VarArr[2];
                            k4a k4aVar = (k4a) ((pk) oadVar.c.get());
                            k4a.v(k4aVar, new lad(((p7b) k4aVar.y()).a.o(), 0));
                            break;
                        }
                    }
                } else {
                    hm9.n(str, "session state error: " + pkeVar.c + " do nothing");
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ol
    public final dle i() {
        switch (this.o) {
            case 0:
                pl plVar = this.c;
                if (plVar == null) {
                    plVar = null;
                }
                t9f t9fVarH = ((ri4) plVar.b.getValue()).h();
                pl plVar2 = this.c;
                if (plVar2 == null) {
                    plVar2 = null;
                }
                String strA = ((ri4) plVar2.b.getValue()).a();
                long jF = ((p7b) r()).a.F();
                pl plVar3 = this.c;
                if (plVar3 == null) {
                    plVar3 = null;
                }
                String str = (String) ((ti4) ((ri4) plVar3.b.getValue())).l.get();
                mad madVar = new mad(null);
                HashMap map = new HashMap();
                map.put("deviceType", t9fVarH.a);
                map.put("pushDeviceType", z7b.a(t9fVarH.j));
                map.put("appVersion", t9fVarH.b);
                map.put("buildNumber", Integer.valueOf(t9fVarH.c));
                String str2 = t9fVarH.d;
                if (str2 != null && str2.length() != 0) {
                    map.put("appKey", str2);
                }
                map.put("osVersion", t9fVarH.e);
                map.put("locale", t9fVarH.f);
                map.put("deviceLocale", t9fVarH.g);
                map.put("deviceName", t9fVarH.h);
                map.put("screen", t9fVarH.i);
                map.put("timezone", t9fVarH.k.getID());
                madVar.n("userAgent", map);
                madVar.p("deviceId", strA);
                madVar.i(jF, "clientSessionId");
                if (oag.u(str)) {
                    madVar.p("mt_instanceid", str);
                }
                return madVar;
            default:
                return new gs9((sla) null, 9);
        }
    }
}

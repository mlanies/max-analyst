package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class sl1 {
    public final a4c a;
    public final kg1 b;
    public final va8 c;
    public final kd1 d;
    public final id1 e;
    public final h7b f;
    public final imc g;
    public final vte h;

    public sl1(a4c a4cVar, kg1 kg1Var, va8 va8Var, kd1 kd1Var, id1 id1Var, h7b h7bVar, imc imcVar, vte vteVar) {
        this.a = a4cVar;
        this.b = kg1Var;
        this.c = va8Var;
        this.d = kd1Var;
        this.e = id1Var;
        this.f = h7bVar;
        this.g = imcVar;
        this.h = vteVar;
    }

    public final void a(hpd hpdVar) {
        yad yadVar = new yad(hpdVar.a);
        rpa pq9Var = new pq9();
        rpa pq9Var2 = new pq9();
        rpa pq9Var3 = new pq9();
        rpa pq9Var4 = new pq9();
        rpa pq9Var5 = new pq9();
        rpa pq9Var6 = new pq9();
        wmc wmcVar = new wmc(hpdVar.b, false);
        Boolean bool = hpdVar.c;
        if (bool != null) {
            pq9Var = new wmc(bool, false);
        }
        rpa rpaVar = pq9Var;
        List list = hpdVar.d;
        if (list != null) {
            pq9Var2 = new wmc(list, false);
        }
        rpa rpaVar2 = pq9Var2;
        List list2 = hpdVar.e;
        rpa wmcVar2 = list2 != null ? new wmc(list2, false) : pq9Var3;
        List list3 = hpdVar.f;
        rpa wmcVar3 = list3 != null ? new wmc(list3, false) : pq9Var4;
        Integer num = hpdVar.h;
        rpa wmcVar4 = num != null ? new wmc(Integer.valueOf(num.intValue()), false) : pq9Var5;
        Long lValueOf = null;
        Long l = hpdVar.g;
        if (l != null) {
            long jLongValue = l.longValue();
            Long lA = ((wte) this.h).a();
            if (lA != null) {
                lValueOf = Long.valueOf(System.currentTimeMillis() + (jLongValue - lA.longValue()));
            }
        }
        kl1 kl1VarM = this.c.m(new x30(yadVar, wmcVar, rpaVar, rpaVar2, wmcVar2, wmcVar3, wmcVar4, new wmc(hpdVar.m, false), lValueOf != null ? new wmc(Long.valueOf(lValueOf.longValue()), false) : pq9Var6, false));
        if (kl1VarM == null) {
            return;
        }
        kg1 kg1Var = this.b;
        yad yadVar2 = kl1VarM.a;
        List list4 = kl1VarM.d;
        if (list4 != null && x53.c0(list4, kg1Var.a.a)) {
            kg1Var.p(yadVar2);
        } else if (tpa.f(yadVar2, kg1Var.j)) {
            kg1Var.p(xad.a);
        }
        id1 id1Var = this.e;
        fpd fpdVar = hpdVar.l;
        if (fpdVar != null && (kg1Var.a.a() || tpa.f(kg1Var.k, yadVar2))) {
            eqa eqaVar = fpdVar.a;
            kg1Var.g(yadVar2, eqaVar.a);
            for (dg1 dg1Var : eqaVar.b) {
                id1Var.n.onStateChanged(dg1Var.b, dg1Var);
            }
        }
        id1Var.f.onRoomUpdated(new ql1(yadVar2, mqd.I(kl1VarM)));
    }

    public final void b(boolean z, bg1 bg1Var, yad yadVar) {
        pq9 pq9Var = new pq9();
        pq9 pq9Var2 = new pq9();
        pq9 pq9Var3 = new pq9();
        pq9 pq9Var4 = new pq9();
        pq9 pq9Var5 = new pq9();
        pq9 pq9Var6 = new pq9();
        pq9 pq9Var7 = new pq9();
        if (z) {
            bg1Var = null;
        }
        this.c.m(new x30(yadVar, pq9Var, pq9Var2, pq9Var3, pq9Var4, pq9Var5, pq9Var6, new wmc(bg1Var, false), pq9Var7, true));
    }

    public final void c(boolean z) throws JSONException {
        if (z) {
            om8 om8Var = new om8(27, this);
            om8 om8Var2 = new om8(28, this);
            imc imcVar = this.g;
            rod rodVar = (rod) ((k56) imcVar.c).invoke();
            if (rodVar == null) {
                om8Var2.invoke(new IllegalStateException("Signaling is not ready or released"));
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", "get-rooms");
            rodVar.j(jSONObject, new hy0(imcVar, om8Var2, om8Var, 1), new nt(imcVar, om8Var2, 6));
        }
    }

    public final void d(cbd cbdVar) {
        dbd dbdVar = dbd.a;
        Set set = cbdVar.a;
        boolean zContains = set.contains(dbdVar);
        hpd hpdVar = cbdVar.c;
        if (zContains && hpdVar != null) {
            a(hpdVar);
        }
        boolean zContains2 = set.contains(dbd.c);
        va8 va8Var = this.c;
        int i = cbdVar.b;
        if (zContains2) {
            yad yadVar = new yad(i);
            pq9 pq9Var = new pq9();
            pq9 pq9Var2 = new pq9();
            pq9 pq9Var3 = new pq9();
            pq9 pq9Var4 = new pq9();
            pq9 pq9Var5 = new pq9();
            pq9 pq9Var6 = new pq9();
            wmc wmcVar = new wmc(Boolean.valueOf(!cbdVar.d), false);
            Long lValueOf = null;
            Long l = hpdVar != null ? hpdVar.g : null;
            if (l != null) {
                long jLongValue = l.longValue();
                Long lA = ((wte) this.h).a();
                if (lA != null) {
                    lValueOf = Long.valueOf(System.currentTimeMillis() + (jLongValue - lA.longValue()));
                }
            }
            va8Var.m(new x30(yadVar, pq9Var, wmcVar, pq9Var2, pq9Var3, pq9Var4, pq9Var5, pq9Var6, new wmc(lValueOf, false), false));
        }
        set.contains(dbd.o);
        if (set.contains(dbd.b)) {
            yad yadVar2 = new yad(i);
            kg1 kg1Var = this.b;
            if (tpa.f(kg1Var.j, yadVar2)) {
                kg1Var.p(xad.a);
            }
            ((HashMap) va8Var.c).remove(yadVar2);
            ((id1) va8Var.b).f.onRoomRemoved(new pl1(yadVar2));
        }
    }

    public final void e(ipd ipdVar) {
        id1 id1Var;
        List<hpd> list = ipdVar.b;
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new yad(((hpd) it.next()).a));
        }
        Set setH0 = x53.H0(arrayList);
        va8 va8Var = this.c;
        for (yad yadVar : x53.H0(((HashMap) va8Var.c).keySet())) {
            if (!setH0.contains(yadVar)) {
                ((HashMap) va8Var.c).remove(yadVar);
                ((id1) va8Var.b).f.onRoomRemoved(new pl1(yadVar));
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            a((hpd) it2.next());
        }
        Iterator it3 = list.iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            id1Var = this.e;
            if (!zHasNext) {
                break;
            }
            hpd hpdVar = (hpd) it3.next();
            id1Var.g.a(new qz7(hpdVar.i, 8, new yad(hpdVar.a)));
        }
        for (hpd hpdVar2 : list) {
            id1Var.q.onUrlSharingInfoUpdated(new zn1(new yad(hpdVar2.a), hpdVar2.n));
        }
        for (hpd hpdVar3 : list) {
            id1Var.h.a(new ph4(hpdVar3.j, new yad(hpdVar3.a)));
        }
        for (hpd hpdVar4 : list) {
            this.d.l(hpdVar4.k, new JSONObject(), "CallSessionRoomsManager#applyMuteStates", 2, new yad(hpdVar4.a), true);
        }
        zad zadVar = ipdVar.a;
        if (zadVar instanceof xad) {
            return;
        }
        kg1 kg1Var = this.b;
        if (!tpa.f(kg1Var.k, zadVar)) {
            kg1Var.n(zadVar);
            id1Var.f.onCurrentParticipantActiveRoomChanged(new nl1(zadVar, zadVar instanceof yad ? va8Var.x((yad) zadVar) : null));
        }
        this.f.w(new w4d(15, zadVar), new ey3(this, 1, zadVar), new om8(26, this));
    }
}

package defpackage;

import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class kg1 {
    public final fg1 a;
    public final id1 b;
    public final va8 c;
    public final a4c d;
    public final xje e;
    public final HashMap f;
    public final HashMap g;
    public final LongSparseArray h;
    public bg1 i;
    public zad j;
    public zad k;

    public kg1(fg1 fg1Var, id1 id1Var, va8 va8Var, a4c a4cVar) {
        this.a = fg1Var;
        this.b = id1Var;
        this.c = va8Var;
        this.d = a4cVar;
        xje xjeVar = new xje();
        xjeVar.b = wz4.a;
        this.e = xjeVar;
        this.f = new HashMap();
        this.g = new HashMap();
        this.h = new LongSparseArray();
        xad xadVar = xad.a;
        this.j = xadVar;
        this.k = xadVar;
    }

    public final td a(dqa dqaVar, zad zadVar) {
        boolean z;
        zad zadVar2;
        fg1 fg1VarJ = j(dqaVar.a);
        HashMap map = this.f;
        HashMap map2 = this.g;
        LongSparseArray longSparseArray = this.h;
        rpa rpaVar = dqaVar.d;
        rpa rpaVar2 = dqaVar.c;
        rpa rpaVar3 = dqaVar.b;
        bg1 bg1Var = dqaVar.a;
        if (fg1VarJ == null) {
            fg1VarJ = new fg1(bg1Var, (kpa) rpaVar3.n(), (hi9) rpaVar2.n(), (ji9) rpaVar.n());
            bg1 bg1Var2 = fg1VarJ.a;
            if (bg1Var2 != null) {
                Object linkedHashMap = map.get(zadVar);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                    map.put(zadVar, linkedHashMap);
                }
                ((Map) linkedHashMap).put(bg1Var2, fg1VarJ);
                map2.put(bg1Var2, zadVar);
                long j = bg1Var2.a;
                Set linkedHashSet = (Set) longSparseArray.get(j);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    longSparseArray.put(j, linkedHashSet);
                }
                linkedHashSet.add(bg1Var2);
            }
            zadVar2 = null;
            z = true;
        } else {
            if (rpaVar3.l()) {
                fg1VarJ.e((kpa) rpaVar3.i());
            }
            if (rpaVar2.l()) {
                hi9 hi9Var = (hi9) rpaVar2.i();
                rd8 rd8Var = hi9Var.a;
                hi9 hi9Var2 = fg1VarJ.b;
                hi9Var2.a = rd8Var;
                hi9Var2.b = hi9Var.b;
                hi9Var2.c = hi9Var.c;
                hi9Var2.d = hi9Var.d;
            }
            if (rpaVar.l()) {
                ji9 ji9Var = (ji9) rpaVar.i();
                ji9 ji9Var2 = fg1VarJ.c;
                boolean z2 = ji9Var2.e;
                boolean z3 = ji9Var.e;
                if (z2 != z3 || ji9Var2.f != ji9Var.f || ji9Var2.b != ji9Var.b || ji9Var2.g != ji9Var.g || ji9Var2.c != ji9Var.c || ji9Var2.d != ji9Var.d) {
                    ji9Var2.e = z3;
                    ji9Var2.f = ji9Var.f;
                    ji9Var2.b = ji9Var.b;
                    ji9Var2.g = ji9Var.g;
                    ji9Var2.c = ji9Var.c;
                    ji9Var2.d = ji9Var.d;
                    ji9Var2.a();
                }
            }
            zad zadVar3 = (zad) map2.get(bg1Var);
            if (zadVar3 == null) {
                zadVar3 = this.k;
            }
            z = !tpa.f(zadVar3, zadVar);
            if (!tpa.f(zadVar3, zadVar)) {
                b(bg1Var, zadVar3);
                bg1 bg1Var3 = fg1VarJ.a;
                if (bg1Var3 != null) {
                    Object linkedHashMap2 = map.get(zadVar);
                    if (linkedHashMap2 == null) {
                        linkedHashMap2 = new LinkedHashMap();
                        map.put(zadVar, linkedHashMap2);
                    }
                    ((Map) linkedHashMap2).put(bg1Var3, fg1VarJ);
                    map2.put(bg1Var3, zadVar);
                    long j2 = bg1Var3.a;
                    Set linkedHashSet2 = (Set) longSparseArray.get(j2);
                    if (linkedHashSet2 == null) {
                        linkedHashSet2 = new LinkedHashSet();
                        longSparseArray.put(j2, linkedHashSet2);
                    }
                    linkedHashSet2.add(bg1Var3);
                }
            }
            zadVar2 = zadVar3;
        }
        if (bg1Var == this.i) {
            fg1VarJ.o = true;
        }
        rpa rpaVar4 = dqaVar.e;
        if (rpaVar4.l()) {
            List list = (List) rpaVar4.i();
            ArrayList arrayList = fg1VarJ.d;
            arrayList.clear();
            arrayList.addAll(list);
        }
        rpa rpaVar5 = dqaVar.f;
        if (rpaVar5.l()) {
            fg1VarJ.p = (o61) rpaVar5.i();
        }
        rpa rpaVar6 = dqaVar.g;
        if (rpaVar6.l()) {
            fg1VarJ.q = (List) rpaVar6.i();
        }
        return new td(fg1VarJ, z, zadVar2);
    }

    public final fg1 b(bg1 bg1Var, zad zadVar) {
        HashMap map = this.g;
        zad zadVar2 = (zad) map.get(bg1Var);
        if (zadVar2 == null) {
            return null;
        }
        if (!zadVar2.equals(zadVar)) {
            this.d.log("CallParticipants", "Tried to remove " + bg1Var + " from " + zadVar + " but participant is in " + zadVar2);
            return null;
        }
        long j = bg1Var.a;
        LongSparseArray longSparseArray = this.h;
        Set set = (Set) longSparseArray.get(j);
        if (set != null) {
            set.remove(bg1Var);
            if (set.isEmpty()) {
                longSparseArray.remove(j);
            }
        }
        map.remove(bg1Var);
        HashMap map2 = this.f;
        Object linkedHashMap = map2.get(zadVar);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            map2.put(zadVar, linkedHashMap);
        }
        return (fg1) ((Map) linkedHashMap).remove(bg1Var);
    }

    public final zad c(bg1 bg1Var) {
        zad zadVar = (zad) this.g.get(bg1Var);
        return zadVar == null ? tpa.f(bg1Var, this.a.a) ? this.k : xad.a : zadVar;
    }

    public final Map d(zad zadVar) {
        HashMap map = this.f;
        Object linkedHashMap = map.get(zadVar);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            map.put(zadVar, linkedHashMap);
        }
        return (Map) linkedHashMap;
    }

    public final void e(zad zadVar, List list) {
        boolean zF = tpa.f(zadVar, this.k);
        id1 id1Var = this.b;
        if (zF) {
            id1Var.a.onActiveParticipantsChanged(new vy0(list, d(this.k).values()));
        }
        id1Var.c.onCallParticipantsChanged(new mg1(list));
    }

    public final fg1 f(dqa dqaVar, zad zadVar) {
        return (fg1) x53.g0(g(zadVar, Collections.singletonList(dqaVar)));
    }

    public final ArrayList g(zad zadVar, List list) {
        List list2;
        id1 id1Var;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dqa dqaVar = (dqa) it.next();
            zad zadVarC = zadVar == null ? c(dqaVar.a) : zadVar;
            td tdVarA = a(dqaVar, zadVarC);
            fg1 fg1Var = (fg1) tdVarA.c;
            arrayList.add(fg1Var);
            if (tdVarA.b) {
                Object arrayList2 = linkedHashMap.get(zadVarC);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(zadVarC, arrayList2);
                }
                ((List) arrayList2).add(fg1Var);
            } else {
                Object arrayList3 = linkedHashMap2.get(zadVarC);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap2.put(zadVarC, arrayList3);
                }
                ((List) arrayList3).add(fg1Var);
            }
            zad zadVar2 = (zad) tdVarA.o;
            if (zadVar2 != null && !zadVar2.equals(zadVarC)) {
                Object arrayList4 = linkedHashMap3.get(zadVar2);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                    linkedHashMap3.put(zadVar2, arrayList4);
                }
                ((List) arrayList4).add(fg1Var);
            }
        }
        Iterator it2 = linkedHashMap3.keySet().iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            list2 = nz4.a;
            id1Var = this.b;
            if (!zHasNext) {
                break;
            }
            zad zadVar3 = (zad) it2.next();
            List list3 = (List) linkedHashMap3.get(zadVar3);
            if (list3 != null) {
                list2 = list3;
            }
            if (tpa.f(zadVar3, this.k)) {
                id1Var.a.onActiveParticipantsRemoved(new xy0(list2, d(this.k).values()));
            }
            id1Var.c.onCallParticipantsRemoved(new og1(list2));
        }
        for (zad zadVar4 : linkedHashMap.keySet()) {
            List list4 = (List) linkedHashMap.get(zadVar4);
            if (list4 == null) {
                list4 = list2;
            }
            if (tpa.f(zadVar4, this.k)) {
                id1Var.a.onActiveParticipantsAdded(new uy0(list4, d(this.k).values()));
            }
            id1Var.c.onCallParticipantsAdded(new lg1(zadVar4, list4));
        }
        for (zad zadVar5 : linkedHashMap2.keySet()) {
            List list5 = (List) linkedHashMap2.get(zadVar5);
            if (list5 == null) {
                list5 = list2;
            }
            e(zadVar5, list5);
        }
        return arrayList;
    }

    public final void h() {
        ArrayList arrayList = new ArrayList(d(this.k).values());
        this.e.b = wz4.a;
        this.i = null;
        this.f.clear();
        this.g.clear();
        this.h.clear();
        this.b.a.onActiveParticipantsRemoved(new xy0(arrayList, nz4.a));
        this.c.o();
    }

    public final Collection i() {
        return d(this.k).values();
    }

    public final fg1 j(bg1 bg1Var) {
        fg1 fg1Var = this.a;
        bg1 bg1Var2 = fg1Var.a;
        if (bg1Var2 != null && bg1Var2.equals(bg1Var)) {
            return fg1Var;
        }
        zad zadVar = (zad) this.g.get(bg1Var);
        if (zadVar != null) {
            return (fg1) d(zadVar).get(bg1Var);
        }
        return null;
    }

    public final boolean k(fg1 fg1Var) {
        if (fg1Var != null) {
            bg1 bg1Var = fg1Var.a;
            if ((bg1Var != null ? j(bg1Var) : null) != null) {
                return true;
            }
        }
        return false;
    }

    public final void l(bg1 bg1Var, kpa kpaVar, String str, String str2) {
        fg1 fg1VarJ = j(bg1Var);
        if (fg1VarJ == null || kpaVar == null) {
            return;
        }
        HashMap map = fg1VarJ.f;
        boolean zIsEmpty = map.isEmpty();
        map.put(kpaVar, new kpa(str, str2));
        if (Objects.equals(fg1VarJ.j, kpaVar)) {
            fg1VarJ.l = str;
            fg1VarJ.k = str2;
        }
        if (zIsEmpty && fg1VarJ.j == null) {
            zad zadVar = (zad) this.g.get(bg1Var);
            if (zadVar == null) {
                zadVar = this.k;
            }
            e(zadVar, Collections.singletonList(fg1VarJ));
        }
    }

    public final ArrayList m(zad zadVar, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bg1 bg1Var = (bg1) it.next();
            zad zadVarC = zadVar == null ? c(bg1Var) : zadVar;
            fg1 fg1VarB = b(bg1Var, zadVarC);
            if (fg1VarB != null) {
                Object arrayList = linkedHashMap.get(zadVarC);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(zadVarC, arrayList);
                }
                ((List) arrayList).add(fg1VarB);
            }
        }
        for (zad zadVar2 : linkedHashMap.keySet()) {
            List list2 = (List) linkedHashMap.get(zadVar2);
            if (list2 == null) {
                list2 = nz4.a;
            }
            boolean zF = tpa.f(zadVar2, this.k);
            id1 id1Var = this.b;
            if (zF) {
                id1Var.a.onActiveParticipantsRemoved(new xy0(list2, d(this.k).values()));
            }
            id1Var.c.onCallParticipantsRemoved(new og1(list2));
        }
        return z53.T(linkedHashMap.values());
    }

    public final void n(zad zadVar) {
        zad zadVar2 = this.k;
        this.k = zadVar;
        if (tpa.f(zadVar2, zadVar)) {
            return;
        }
        this.b.a.onActiveParticipantUpdated(new yy0(d(zadVar2).values(), d(zadVar).values(), zadVar, zadVar instanceof yad ? this.c.x((yad) zadVar) : null, this.a));
    }

    public final void o(bg1 bg1Var) {
        if (bg1Var == this.i) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        bg1 bg1Var2 = this.i;
        fg1 fg1VarJ = bg1Var2 != null ? j(bg1Var2) : null;
        if (fg1VarJ != null) {
            boolean zC = fg1VarJ.c();
            fg1VarJ.o = false;
            if (zC != fg1VarJ.c()) {
                arrayList.add(fg1VarJ);
            }
        }
        fg1 fg1VarJ2 = bg1Var != null ? j(bg1Var) : null;
        if (fg1VarJ2 != null) {
            boolean zC2 = fg1VarJ2.c();
            fg1VarJ2.o = true;
            if (zC2 != fg1VarJ2.c()) {
                arrayList.add(fg1VarJ2);
            }
        }
        e(this.k, arrayList);
        this.i = bg1Var;
    }

    public final void p(zad zadVar) {
        zad zadVar2 = this.j;
        this.j = zadVar;
        if (tpa.f(zadVar2, zadVar)) {
            return;
        }
        this.b.f.onCurrentParticipantInvitedToRoom(new ol1(this.a, zadVar, zadVar instanceof yad ? this.c.x((yad) zadVar) : null));
    }

    public final void q(ArrayList arrayList) {
        Map mapD = d(this.k);
        xje xjeVar = this.e;
        xjeVar.getClass();
        HashSet hashSet = new HashSet(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            fg1 fg1Var = (fg1) mapD.get((bg1) it.next());
            if (fg1Var != null) {
                boolean zD = fg1Var.d();
                fg1Var.n = true;
                if (zD != fg1Var.d()) {
                    arrayList2.add(fg1Var);
                }
            }
        }
        for (Object obj : (Set) xjeVar.b) {
            fg1 fg1Var2 = (fg1) mapD.get(obj);
            if (fg1Var2 != null && !hashSet.contains(obj)) {
                boolean zD2 = fg1Var2.d();
                fg1Var2.n = false;
                if (zD2 != fg1Var2.d()) {
                    arrayList2.add(fg1Var2);
                }
            }
        }
        xjeVar.b = hashSet;
        e(this.k, arrayList2);
    }

    public final int r() {
        Map map = (Map) this.f.get(this.k);
        if (map != null) {
            return map.size();
        }
        return 0;
    }
}

package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public final class lva implements ava {
    public final je7 a;
    public final je7 b;
    public final av0 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final o45 h;
    public volatile long i;
    public volatile boolean j;
    public final HashMap k = new HashMap();

    public lva(je7 je7Var, je7 je7Var2, av0 av0Var, je7 je7Var3, khe kheVar, je7 je7Var4, je7 je7Var5, o45 o45Var) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = av0Var;
        this.d = je7Var3;
        this.e = kheVar;
        this.f = je7Var4;
        this.g = je7Var5;
        this.h = o45Var;
        av0Var.d(this);
    }

    @Override // defpackage.ava
    public final void a(ArrayList arrayList) {
        hm9.n("lva", "onPhonebookUpdated");
        c();
    }

    public final void b(List list, Map map, Map map2) {
        int i = 3;
        hm9.m("lva", "onSyncSuccess: contacts=%s, phones=%s, requested=%s", Integer.valueOf(list.size()), Integer.valueOf(map.size()), Integer.valueOf(map2.size()));
        int size = list.size();
        je7 je7Var = this.f;
        if (size > 0) {
            long jT = ((p7b) ((m7b) this.d.getValue())).a.t();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                wm3 wm3Var = (wm3) it.next();
                if (wm3Var.a == jT) {
                    list.remove(wm3Var);
                    break;
                }
            }
            ((k4a) ((pk) this.b.getValue())).u((List) list.stream().map(new gl3(2)).collect(Collectors.toList()));
            ((el3) je7Var.getValue()).u(list);
        }
        boolean z = false;
        for (String str : map.keySet()) {
            HashMap map3 = this.k;
            Integer num = (Integer) map3.get(str);
            int iIntValue = num != null ? num.intValue() + 1 : 1;
            map3.put(str, Integer.valueOf(iIntValue));
            if (!z && iIntValue >= 10) {
                ((cba) this.h).c(new HandledException("Contacts sync cycle"), true);
                z = true;
            }
        }
        je7 je7Var2 = this.a;
        wlc wlcVar = ((k24) ((c34) je7Var2.getValue())).e;
        ((OneMeRoomDatabase) wlcVar.a.m()).q(new flc(map, 3, wlcVar));
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            map2.remove((String) it2.next());
        }
        hm9.m("lva", "markInvalidPhones: invalid phones: %s", Integer.valueOf(map2.size()));
        if (!map2.isEmpty()) {
            wlc wlcVar2 = ((k24) ((c34) je7Var2.getValue())).e;
            Set<String> setKeySet = map2.keySet();
            ilc ilcVar = wlcVar2.c().a;
            ilcVar.b();
            StringBuilder sb = new StringBuilder();
            sb.append("UPDATE phones SET type = ? WHERE type = ? AND phone in (");
            a14.c(sb, setKeySet.size());
            sb.append(")");
            q36 q36VarD = ilcVar.d(sb.toString());
            q36VarD.j(1, 2);
            q36VarD.j(2, 0);
            for (String str2 : setKeySet) {
                if (str2 == null) {
                    q36VarD.W(i);
                } else {
                    q36VarD.f(i, str2);
                }
                i++;
            }
            ilcVar.c();
            try {
                q36VarD.n();
                ilcVar.r();
            } finally {
                ilcVar.l();
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            wlc wlcVar3 = ((k24) ((c34) je7Var2.getValue())).e;
            Long l = (Long) entry.getValue();
            l.longValue();
            wlcVar3.getClass();
            wua wuaVar = (wua) x53.i0(wlcVar3.f(Collections.singletonList(l)));
            if (wuaVar != null) {
                arrayList.add(wuaVar);
            }
        }
        Set setY = ((el3) je7Var.getValue()).y(arrayList);
        if (!setY.isEmpty()) {
            ((ike) this.g.getValue()).f(setY);
        }
        this.c.c(new sva());
        ((ztc) this.e.getValue()).c(new kva(this, 0), 1L, TimeUnit.SECONDS);
    }

    public final void c() {
        hm9.k("lva", "sync");
        if (this.j) {
            hm9.k("lva", "sync in progress, return");
        } else {
            this.j = true;
            ((ztc) this.e.getValue()).b(new kva(this, 1));
        }
    }

    public final void d() {
        String str;
        Integer num;
        hm9.n("lva", "syncInternal");
        hm9.n("lva", "select unsynced phones");
        HashMap map = new HashMap();
        rva rvaVarC = ((k24) ((c34) this.a.getValue())).e.c();
        rvaVarC.getClass();
        xlc xlcVarA = xlc.a(1, "SELECT * FROM phones WHERE type = ?");
        xlcVarA.j(1, 0);
        ilc ilcVar = rvaVarC.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            int iN = tfg.n(cursorO, "id");
            int iN2 = tfg.n(cursorO, "phonebook_id");
            int iN3 = tfg.n(cursorO, "contact_id");
            int iN4 = tfg.n(cursorO, "phone");
            int iN5 = tfg.n(cursorO, "server_phone");
            int iN6 = tfg.n(cursorO, "email");
            int iN7 = tfg.n(cursorO, "first_name");
            int iN8 = tfg.n(cursorO, "last_name");
            int iN9 = tfg.n(cursorO, "avatar_path");
            int iN10 = tfg.n(cursorO, "type");
            String str2 = "lva";
            ArrayList arrayList = new ArrayList(cursorO.getCount());
            while (cursorO.moveToNext()) {
                arrayList.add(new xua(cursorO.getLong(iN), cursorO.getLong(iN2), cursorO.getInt(iN3), cursorO.isNull(iN4) ? null : cursorO.getString(iN4), cursorO.getLong(iN5), cursorO.isNull(iN6) ? null : cursorO.getString(iN6), cursorO.isNull(iN7) ? null : cursorO.getString(iN7), cursorO.isNull(iN8) ? null : cursorO.getString(iN8), cursorO.isNull(iN9) ? null : cursorO.getString(iN9), ey8.b(cursorO.getInt(iN10))));
            }
            cursorO.close();
            xlcVarA.n();
            ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(wlc.d((xua) it.next()));
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                wua wuaVar = (wua) it2.next();
                map.put(wuaVar.X, new pp3(wuaVar.s0, wuaVar.t0));
                if (map.size() == 100) {
                    break;
                }
            }
            if (!map.isEmpty()) {
                for (Map.Entry entry : this.k.entrySet()) {
                    if (!map.containsKey(entry.getKey()) || (num = (Integer) entry.getValue()) == null || num.intValue() < 10) {
                        str = str2;
                    } else {
                        str = str2;
                        hm9.n(str, "syncInternal: already synced, skip");
                        map.remove(entry.getKey());
                    }
                    str2 = str;
                }
            }
            String str3 = str2;
            hm9.m(str3, "syncInternal: unsyncedPhones size=%s", Integer.valueOf(map.size()));
            if (map.size() == 0) {
                this.j = false;
                hm9.n(str3, "syncInternal: everything synced, return");
            } else {
                k4a k4aVar = (k4a) ((pk) this.b.getValue());
                this.i = k4a.v(k4aVar, new oc2(((p7b) k4aVar.y()).a.o(), map, 2));
            }
        } catch (Throwable th) {
            cursorO.close();
            xlcVarA.n();
            throw th;
        }
    }

    @uae
    public void onEvent(dhe dheVar) {
        hm9.k("lva", "SyncResultEvent");
        ((ztc) this.e.getValue()).b(new do9(this, 11, dheVar));
    }

    @uae
    public void onEvent(oi0 oi0Var) {
        if (oi0Var.a == this.i) {
            hm9.m("lva", "BaseErrorEvent :%s", oi0Var);
            this.j = false;
        }
    }
}

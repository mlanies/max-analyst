package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Provider;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class die implements s24, hk8, mr4, o55, i7, Provider {
    public Object a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ die(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
    }

    public static void L(long j, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    public static void k(bg1 bg1Var, fg1 fg1Var, HashMap map) {
        map.put("participant_id", bg1Var.c());
        if (fg1Var != null) {
            if (fg1Var.b()) {
                kpa kpaVar = fg1Var.j;
                map.put("participant_accept_peer_id", kpaVar.a);
                map.put("participant_accept_peer_type", kpaVar.b);
            }
            map.put("participant_connected", Boolean.toString(fg1Var.g));
            hi9 hi9Var = fg1Var.b;
            int iOrdinal = hi9Var.a.ordinal();
            if (iOrdinal == 0) {
                map.put("participant_audio_option_state", "UNMUTE");
            } else if (iOrdinal == 1) {
                map.put("participant_audio_option_state", "MUTE");
            } else if (iOrdinal == 2 || iOrdinal == 3) {
                map.put("participant_audio_option_state", "MUTE_PERMANENT");
            }
            int iOrdinal2 = hi9Var.b.ordinal();
            if (iOrdinal2 == 0) {
                map.put("participant_video_option_state", "UNMUTE");
            } else if (iOrdinal2 == 1) {
                map.put("participant_video_option_state", "MUTE");
            } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
                map.put("participant_video_option_state", "MUTE_PERMANENT");
            }
            int iOrdinal3 = hi9Var.c.ordinal();
            if (iOrdinal3 == 0) {
                map.put("participant_screenshare_option_state", "UNMUTE");
            } else if (iOrdinal3 == 1) {
                map.put("participant_screenshare_option_state", "MUTE");
            } else if (iOrdinal3 == 2 || iOrdinal3 == 3) {
                map.put("participant_screenshare_option_state", "MUTE_PERMANENT");
            }
            ji9 ji9Var = fg1Var.c;
            map.put("participant_audio_enabled", String.valueOf(ji9Var.e));
            map.put("participant_video_enabled", String.valueOf(ji9Var.f));
            map.put("participant_screen_cast_enabled", String.valueOf(ji9Var.b));
        }
    }

    public void A(cie cieVar) {
        ilc ilcVar = (ilc) this.a;
        ilcVar.b();
        ilcVar.c();
        try {
            ((sh) this.b).C(cieVar);
            ilcVar.r();
        } finally {
            ilcVar.l();
        }
    }

    @Override // defpackage.mr4
    public void B(int i, xj8 xj8Var) {
        if (C(i, xj8Var)) {
            ((kr4) this.c).f();
        }
    }

    public boolean C(int i, xj8 xj8Var) {
        xj8 xj8VarP;
        oc3 oc3Var = (oc3) this.o;
        if (xj8Var != null) {
            xj8VarP = oc3Var.p(this.a, xj8Var);
            if (xj8VarP == null) {
                return false;
            }
        } else {
            xj8VarP = null;
        }
        oc3Var.getClass();
        gk8 gk8Var = (gk8) this.b;
        if (gk8Var.b != i || !maf.a((xj8) gk8Var.c, xj8VarP)) {
            this.b = new gk8((CopyOnWriteArrayList) oc3Var.c.d, i, xj8VarP, 0L);
        }
        kr4 kr4Var = (kr4) this.c;
        if (kr4Var.a == i && maf.a(kr4Var.b, xj8VarP)) {
            return true;
        }
        this.c = new kr4(oc3Var.d.c, i, xj8VarP);
        return true;
    }

    public pc8 D(pc8 pc8Var) {
        ((oc3) this.o).getClass();
        long j = pc8Var.e;
        long j2 = pc8Var.e;
        long j3 = pc8Var.f;
        if (j2 == j && j3 == j3) {
            return pc8Var;
        }
        return new pc8(pc8Var.a, pc8Var.b, (oy5) pc8Var.g, pc8Var.c, pc8Var.d, j2, j3);
    }

    @Override // defpackage.hk8
    public void E(int i, xj8 xj8Var, pc8 pc8Var) {
        if (C(i, xj8Var)) {
            ((gk8) this.b).c(D(pc8Var));
        }
    }

    @Override // defpackage.hk8
    public void F(int i, xj8 xj8Var, pc8 pc8Var) {
        if (C(i, xj8Var)) {
            ((gk8) this.b).m(D(pc8Var));
        }
    }

    @Override // defpackage.i7
    public boolean G(j7 j7Var, Menu menu) {
        qde qdeVarS = s(j7Var);
        qpd qpdVar = (qpd) this.o;
        Menu rr8Var = (Menu) qpdVar.get(menu);
        if (rr8Var == null) {
            rr8Var = new rr8((Context) this.b, (wq8) menu);
            qpdVar.put(menu, rr8Var);
        }
        return ((ActionMode.Callback) this.a).onPrepareActionMode(qdeVarS, rr8Var);
    }

    public eqa H(JSONArray jSONArray, zad zadVar) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("state");
            bg1 bg1VarF = f46.F(jSONObject);
            fg1 fg1Var = (fg1) this.a;
            if (bg1VarF.equals(fg1Var.a)) {
                fg1Var.q = ((hd9) this.c).h(jSONObject, zadVar);
                ArrayList arrayListY = f46.y(jSONObject);
                ArrayList arrayList3 = fg1Var.d;
                arrayList3.clear();
                arrayList3.addAll(arrayListY);
                kd1 kd1Var = (kd1) this.b;
                kd1Var.n(jSONObject, "handleConversationParticipants", kd1Var.g(zadVar, 2), true, zadVar, zadVar);
            } else if ("ACCEPTED".equals(string)) {
                arrayList.add(p(bg1VarF, jSONObject, zadVar));
            } else if ("CALLED".equals(string)) {
                arrayList.add(q(bg1VarF, jSONObject, zadVar));
            } else {
                hashSet.add(bg1VarF);
            }
            dg1 dg1VarN = ((ey1) this.o).n(jSONObject);
            if (dg1VarN != null) {
                arrayList2.add(dg1VarN);
            }
        }
        return new eqa(arrayList, arrayList2);
    }

    @Override // defpackage.mr4
    public void I(int i, xj8 xj8Var) {
        if (C(i, xj8Var)) {
            ((kr4) this.c).c();
        }
    }

    public void J(int i, yqc yqcVar) {
        SparseArray sparseArray = (SparseArray) this.b;
        fm9.j("Exactly one SampleExporter can be added for each track type.", !oaf.l(sparseArray, i));
        sparseArray.put(i, yqcVar);
    }

    @Override // defpackage.mr4
    public void K(int i, xj8 xj8Var) {
        if (C(i, xj8Var)) {
            ((kr4) this.c).b();
        }
    }

    @Override // defpackage.hk8
    public void M(int i, xj8 xj8Var, xn7 xn7Var, pc8 pc8Var) {
        if (C(i, xj8Var)) {
            ((gk8) this.b).g(xn7Var, D(pc8Var));
        }
    }

    @Override // defpackage.hk8
    public void N(int i, xj8 xj8Var, xn7 xn7Var, pc8 pc8Var) {
        if (C(i, xj8Var)) {
            ((gk8) this.b).l(xn7Var, D(pc8Var));
        }
    }

    public mk0 O(List list) {
        ArrayList arrayListN = n(list);
        if (arrayListN.size() < 2) {
            return (mk0) mqd.l(arrayListN, null);
        }
        Collections.sort(arrayListN, new v00(4));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = ((mk0) arrayListN.get(0)).c;
        int i3 = 0;
        while (true) {
            if (i3 >= arrayListN.size()) {
                break;
            }
            mk0 mk0Var = (mk0) arrayListN.get(i3);
            if (i2 == mk0Var.c) {
                arrayList.add(new Pair(mk0Var.b, Integer.valueOf(mk0Var.d)));
                i3++;
            } else if (arrayList.size() == 1) {
                return (mk0) arrayListN.get(0);
            }
        }
        HashMap map = (HashMap) this.c;
        mk0 mk0Var2 = (mk0) map.get(arrayList);
        if (mk0Var2 == null) {
            List listSubList = arrayListN.subList(0, arrayList.size());
            int i4 = 0;
            for (int i5 = 0; i5 < listSubList.size(); i5++) {
                i4 += ((mk0) listSubList.get(i5)).d;
            }
            int iNextInt = ((Random) this.o).nextInt(i4);
            int i6 = 0;
            while (true) {
                if (i >= listSubList.size()) {
                    mk0Var2 = (mk0) mqd.m(listSubList);
                    break;
                }
                mk0 mk0Var3 = (mk0) listSubList.get(i);
                i6 += mk0Var3.d;
                if (iNextInt < i6) {
                    mk0Var2 = mk0Var3;
                    break;
                }
                i++;
            }
            map.put(arrayList, mk0Var2);
        }
        return mk0Var2;
    }

    public boolean P(int i) {
        return ((i1f) ((ArrayList) this.a).get(i)).a.size() > 1;
    }

    public void Q(Uri uri) {
        this.o = null;
        if (uri != null) {
            ArrayList arrayList = new ArrayList();
            this.o = arrayList;
            arrayList.add(uri);
        }
    }

    public void R(CharSequence charSequence) {
        ((Intent) this.b).putExtra("android.intent.extra.TEXT", charSequence);
    }

    public void S() {
        ((Context) this.a).startActivity(Intent.createChooser(w(), (CharSequence) this.c));
    }

    public void T(qj3 qj3Var, qj3 qj3Var2) {
        sd7 sd7Var = (sd7) this.o;
        if (sd7Var == null || sd7Var.h()) {
            qy9 qy9VarD = ((lz) ((List) this.b).get(0)).d();
            hle hleVar = (hle) ((rm4) this.a).get();
            hleVar.getClass();
            s1a s1aVarR = qy9VarD.r(((jle) hleVar).a());
            sd7 sd7Var2 = new sd7(qj3Var, qj3Var2, ft.d);
            s1aVarR.a(sd7Var2);
            this.o = sd7Var2;
        }
    }

    @Override // defpackage.o55
    public ExecutorService a() {
        return (ExecutorService) ((khe) this.c).getValue();
    }

    @Override // defpackage.hk8
    public void b(int i, xj8 xj8Var, xn7 xn7Var, pc8 pc8Var) {
        if (C(i, xj8Var)) {
            ((gk8) this.b).e(xn7Var, D(pc8Var));
        }
    }

    @Override // defpackage.o55
    public ExecutorService c() {
        return ((iba) ((je7) this.a).getValue()).d();
    }

    @Override // defpackage.o55
    public ExecutorService d() {
        return (ExecutorService) ((khe) this.o).getValue();
    }

    @Override // defpackage.o55
    public ExecutorService e() {
        return (ExecutorService) ((khe) this.b).getValue();
    }

    @Override // defpackage.s24
    public List f(long j, vk6 vk6Var, int i, int i2, long j2, long j3) throws Throwable {
        ArrayList arrayList = new ArrayList();
        au8 au8Var = (au8) this.b;
        ge2 ge2Var = (ge2) this.a;
        e52 e52Var = (e52) this.c;
        if (i > 0) {
            long j4 = e52Var.a;
            ge2Var.getClass();
            ArrayList arrayListL = ((k24) au8Var.a).c.l(j4, j, (Set) this.o, Integer.valueOf(i), true);
            arrayList.addAll(!arrayListL.isEmpty() ? ge2Var.f.b(arrayListL) : Collections.emptyList());
        }
        if (i2 > 0) {
            long j5 = e52Var.a;
            ge2Var.getClass();
            ArrayList arrayListL2 = ((k24) au8Var.a).c.l(j5, j, (Set) this.o, Integer.valueOf(i2), false);
            arrayList.addAll(!arrayListL2.isEmpty() ? ge2Var.f.b(arrayListL2) : Collections.emptyList());
        }
        return new ArrayList(arrayList);
    }

    @Override // defpackage.mr4
    public void g(int i, xj8 xj8Var, Exception exc) {
        if (C(i, xj8Var)) {
            ((kr4) this.c).e(exc);
        }
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new o7g((Executor) ((Provider) this.a).get(), (h45) ((Provider) this.b).get(), (z77) ((Provider) this.c).get(), (fhe) ((Provider) this.o).get());
    }

    @Override // defpackage.o55
    public ExecutorService h() {
        return (ExecutorService) ((khe) this.b).getValue();
    }

    @Override // defpackage.i7
    public boolean i(j7 j7Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.a).onActionItemClicked(s(j7Var), new fr8((Context) this.b, (vde) menuItem));
    }

    @Override // defpackage.o55
    public ExecutorService j() {
        return (ExecutorService) ((khe) this.b).getValue();
    }

    @Override // defpackage.i7
    public void l(j7 j7Var) {
        ((ActionMode.Callback) this.a).onDestroyActionMode(s(j7Var));
    }

    public void m(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fp1 fp1Var = ((u41) it.next()).a;
            if (fp1Var.a == olf.b) {
                linkedHashSet.add(fp1Var.b);
            }
        }
        Iterator it2 = ((LinkedHashMap) this.c).entrySet().iterator();
        while (it2.hasNext()) {
            bg1 bg1Var = (bg1) ((Map.Entry) it2.next()).getKey();
            if (!linkedHashSet.contains(bg1Var)) {
                ((LinkedHashSet) this.o).add(bg1Var);
                it2.remove();
            }
        }
    }

    public ArrayList n(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = (HashMap) this.a;
        L(jElapsedRealtime, map);
        HashMap map2 = (HashMap) this.b;
        L(jElapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            mk0 mk0Var = (mk0) list.get(i);
            if (!map.containsKey(mk0Var.b) && !map2.containsKey(Integer.valueOf(mk0Var.c))) {
                arrayList.add(mk0Var);
            }
        }
        return arrayList;
    }

    @Override // defpackage.i7
    public boolean o(j7 j7Var, wq8 wq8Var) {
        qde qdeVarS = s(j7Var);
        qpd qpdVar = (qpd) this.o;
        Menu rr8Var = (Menu) qpdVar.get(wq8Var);
        if (rr8Var == null) {
            rr8Var = new rr8((Context) this.b, wq8Var);
            qpdVar.put(wq8Var, rr8Var);
        }
        return ((ActionMode.Callback) this.a).onCreateActionMode(qdeVarS, rr8Var);
    }

    public dqa p(bg1 bg1Var, JSONObject jSONObject, zad zadVar) {
        kd1 kd1Var = (kd1) this.b;
        hi9 hi9VarF = kd1Var.f(jSONObject, bg1Var, "createAddOrUpdateParamsForAcceptedParticipant", kd1Var.h(zadVar).a(), true);
        ji9 ji9VarO = f46.o(jSONObject);
        ArrayList arrayListY = f46.y(jSONObject);
        kpa kpaVarQ = f46.q(jSONObject);
        if (kpaVarQ == null) {
            kpaVarQ = fg1.r;
        }
        o61 o61VarK = f46.k(jSONObject);
        rpa pq9Var = new pq9();
        rpa pq9Var2 = new pq9();
        wmc wmcVar = new wmc(kpaVarQ, false);
        wmc wmcVar2 = new wmc(hi9VarF, false);
        if (ji9VarO != null) {
            pq9Var = new wmc(ji9VarO, false);
        }
        rpa rpaVar = pq9Var;
        wmc wmcVar3 = new wmc(arrayListY, false);
        if (o61VarK != null) {
            pq9Var2 = new wmc(o61VarK, false);
        }
        return new dqa(bg1Var, wmcVar, wmcVar2, rpaVar, wmcVar3, pq9Var2, new wmc(((hd9) this.c).h(jSONObject, zadVar), false));
    }

    public dqa q(bg1 bg1Var, JSONObject jSONObject, zad zadVar) {
        kd1 kd1Var = (kd1) this.b;
        hi9 hi9VarF = kd1Var.f(jSONObject, bg1Var, "createAddOrUpdateParamsForCalledParticipant", kd1Var.h(zadVar).a(), true);
        ji9 ji9VarO = f46.o(jSONObject);
        ArrayList arrayListY = f46.y(jSONObject);
        o61 o61VarK = f46.k(jSONObject);
        return new dqa(bg1Var, new pq9(), new wmc(hi9VarF, false), ji9VarO != null ? new wmc(ji9VarO, false) : new pq9(), new wmc(arrayListY, false), o61VarK != null ? new wmc(o61VarK, false) : new pq9(), new wmc(((hd9) this.c).h(jSONObject, zadVar), false));
    }

    public void r(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((qpd) this.b).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                r(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public qde s(j7 j7Var) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            qde qdeVar = (qde) arrayList.get(i);
            if (qdeVar != null && qdeVar.b == j7Var) {
                return qdeVar;
            }
        }
        qde qdeVar2 = new qde((Context) this.b, j7Var);
        arrayList.add(qdeVar2);
        return qdeVar2;
    }

    public o43 t() {
        o43 o43Var;
        ww0 ww0Var;
        iy3 iy3Var;
        boolean z;
        do {
            synchronized (this) {
                Iterator it = ((LinkedHashSet) this.o).iterator();
                o43Var = null;
                if (it.hasNext()) {
                    ww0Var = (ww0) it.next();
                    it.remove();
                } else {
                    ww0Var = null;
                }
            }
            if (ww0Var == null) {
                return null;
            }
            nw7 nw7Var = (nw7) ((jy3) this.b);
            nw7Var.getClass();
            synchronized (nw7Var) {
                try {
                    iy3Var = (iy3) nw7Var.b.M(ww0Var);
                    if (iy3Var != null) {
                        iy3 iy3Var2 = (iy3) nw7Var.c.M(ww0Var);
                        iy3Var2.getClass();
                        od2.p(iy3Var2.c == 0);
                        o43Var = iy3Var2.b;
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                nw7.d(iy3Var);
            }
        } while (o43Var == null);
        return o43Var;
    }

    @Override // defpackage.hk8
    public void u(int i, xj8 xj8Var, xn7 xn7Var, pc8 pc8Var, IOException iOException, boolean z) {
        if (C(i, xj8Var)) {
            ((gk8) this.b).j(xn7Var, D(pc8Var), iOException, z);
        }
    }

    @Override // defpackage.mr4
    public void v(int i, xj8 xj8Var) {
        if (C(i, xj8Var)) {
            ((kr4) this.c).a();
        }
    }

    public Intent w() {
        ArrayList arrayList = (ArrayList) this.o;
        Intent intent = (Intent) this.b;
        if (arrayList == null || arrayList.size() <= 1) {
            intent.setAction("android.intent.action.SEND");
            ArrayList arrayList2 = (ArrayList) this.o;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                intent.removeExtra("android.intent.extra.STREAM");
                intent.setClipData(null);
                intent.setFlags(intent.getFlags() & (-2));
            } else {
                intent.putExtra("android.intent.extra.STREAM", (Parcelable) ((ArrayList) this.o).get(0));
                ju0.E(intent, (ArrayList) this.o);
            }
        } else {
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", (ArrayList) this.o);
            ju0.E(intent, (ArrayList) this.o);
        }
        return intent;
    }

    public cie x(l7g l7gVar) {
        xlc xlcVarA = xlc.a(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        String str = l7gVar.a;
        if (str == null) {
            xlcVarA.W(1);
        } else {
            xlcVarA.f(1, str);
        }
        xlcVarA.j(2, l7gVar.b);
        ilc ilcVar = (ilc) this.a;
        ilcVar.b();
        cie cieVar = null;
        String string = null;
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            int iN = tfg.n(cursorO, "work_spec_id");
            int iN2 = tfg.n(cursorO, "generation");
            int iN3 = tfg.n(cursorO, "system_id");
            if (cursorO.moveToFirst()) {
                if (!cursorO.isNull(iN)) {
                    string = cursorO.getString(iN);
                }
                cieVar = new cie(string, cursorO.getInt(iN2), cursorO.getInt(iN3));
            }
            return cieVar;
        } finally {
            cursorO.close();
            xlcVarA.n();
        }
    }

    @Override // defpackage.mr4
    public void y(int i, xj8 xj8Var, int i2) {
        if (C(i, xj8Var)) {
            ((kr4) this.c).d(i2);
        }
    }

    public boolean z() {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.a;
            if (i >= arrayList.size()) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    i1f i1fVar = (i1f) arrayList.get(i2);
                    if (i1fVar.b != i1fVar.a.size()) {
                        return false;
                    }
                }
                return true;
            }
            if (((i1f) arrayList.get(i)).b == -1) {
                return false;
            }
            i++;
        }
    }

    public die(int i) {
        switch (i) {
            case 7:
                this.a = new u5b(10);
                this.b = new qpd(0);
                this.c = new ArrayList();
                this.o = new HashSet();
                break;
            default:
                Random random = new Random();
                this.c = new HashMap();
                this.o = random;
                this.a = new HashMap();
                this.b = new HashMap();
                break;
        }
    }

    public die(Context context, int i) {
        Activity activity;
        switch (i) {
            case 13:
                context.getClass();
                this.a = context;
                Intent action = new Intent().setAction("android.intent.action.SEND");
                this.b = action;
                action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
                action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
                action.addFlags(524288);
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                    } else if (context instanceof Activity) {
                        activity = (Activity) context;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (activity != null) {
                    ComponentName componentName = activity.getComponentName();
                    ((Intent) this.b).putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
                    ((Intent) this.b).putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
                    break;
                }
                break;
            default:
                this.c = new AtomicReference(null);
                this.o = new Handler();
                this.b = context;
                break;
        }
    }

    public die(cg cgVar, jy3 jy3Var) {
        this.a = cgVar;
        this.b = jy3Var;
        this.o = new LinkedHashSet();
        this.c = new w4d(2, this);
    }

    public die(rm4 rm4Var, ArrayList arrayList, ArrayList arrayList2) {
        this.a = rm4Var;
        this.b = arrayList;
        this.c = arrayList2;
    }
}

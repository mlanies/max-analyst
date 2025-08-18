package defpackage;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class kd1 {
    public final kg1 a;
    public final a4c b;
    public final a66 c;
    public final yb9 d;
    public final k56 e;
    public final aq7 f;
    public final LinkedHashMap g = new LinkedHashMap();
    public final LinkedHashMap h = new LinkedHashMap();
    public hi9 i = new hi9();

    public kd1(kg1 kg1Var, a4c a4cVar, bk bkVar, yb9 yb9Var, ky0 ky0Var, aq7 aq7Var) {
        this.a = kg1Var;
        this.b = a4cVar;
        this.c = bkVar;
        this.d = yb9Var;
        this.e = ky0Var;
        this.f = aq7Var;
    }

    public static rd8 a(qd8 qd8Var, rd8 rd8Var, List list, ArrayList arrayList, boolean z) {
        rd8 rd8Var2 = rd8.a;
        if (rd8Var == null) {
            return rd8Var2;
        }
        int i = jd1.$EnumSwitchMapping$0[rd8Var.ordinal()];
        return i != 1 ? (i == 2 && z) ? rd8Var2 : rd8Var : (list.contains(eg1.a) || list.contains(eg1.b)) ? rd8.b : arrayList.contains(qd8Var) ? rd8.o : rd8Var;
    }

    public static boolean d(ni9 ni9Var) {
        Object obj = ni9Var.get();
        rd8 rd8Var = rd8.c;
        if (obj == rd8Var) {
            return false;
        }
        if (ni9Var.get() == rd8.b) {
            ni9Var.set(rd8.a);
        }
        if (ni9Var.get() != rd8.o) {
            return true;
        }
        ni9Var.set(rd8Var);
        return true;
    }

    public static void e(ni9 ni9Var) {
        rd8 rd8Var = (rd8) ni9Var.get();
        if (rd8Var == rd8.c) {
            ni9Var.set(rd8.b);
        } else if (rd8Var == rd8.o) {
            ni9Var.set(rd8.a);
        }
    }

    public final void b(JSONObject jSONObject) {
        this.d.getClass();
        zad zadVarE = yb9.e(jSONObject);
        kg1 kg1Var = this.a;
        bg1 bg1Var = kg1Var.a.a;
        String strT = f8.t(jSONObject, "adminId");
        bg1 bg1VarB = strT != null ? bg1.b(strT) : null;
        String strT2 = f8.t(jSONObject, "participantId");
        bg1 bg1VarB2 = strT2 != null ? bg1.b(strT2) : null;
        boolean zOptBoolean = jSONObject.optBoolean("muteAll", false);
        oz4 oz4Var = oz4.a;
        if (bg1VarB2 != null && !bg1VarB2.equals(bg1Var)) {
            kg1Var.f(new dqa(bg1VarB2, new pq9(), new wmc(f(jSONObject, bg1VarB2, "handleMuteParticipant", jSONObject.has("muteStates") ? f46.n(jSONObject) : oz4Var, false), false), new pq9(), new pq9(), new pq9(), new pq9()), null);
            return;
        }
        if (bg1VarB != null && bg1VarB.equals(bg1Var)) {
            m(jSONObject, "handleMuteParticipant", 3, zadVarE, false);
            ArrayList arrayList = new ArrayList(kg1Var.r());
            for (bg1 bg1Var2 : kg1Var.d(zadVarE).keySet()) {
                arrayList.add(new dqa(bg1Var2, new pq9(), new wmc(f(jSONObject, bg1Var2, "handleMuteParticipant", oz4Var, false), false), new pq9(), new pq9(), new pq9(), new pq9()));
            }
            kg1Var.g(zadVarE, arrayList);
            return;
        }
        if (!zOptBoolean) {
            c(jSONObject, zadVarE, false);
            return;
        }
        c(jSONObject, zadVarE, true);
        m(jSONObject, "handleMuteParticipant", 3, zadVarE, false);
        ArrayList arrayList2 = new ArrayList(kg1Var.r());
        for (bg1 bg1Var3 : kg1Var.d(zadVarE).keySet()) {
            arrayList2.add(new dqa(bg1Var3, new pq9(), new wmc(f(jSONObject, bg1Var3, "handleMuteParticipant", oz4Var, false), false), new pq9(), new pq9(), new pq9(), new pq9()));
        }
        kg1Var.g(zadVarE, arrayList2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f3 A[PHI: r6
      0x00f3: PHI (r6v1 int) = (r6v0 int), (r6v9 int) binds: [B:47:0x00a2, B:63:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0147  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r7v12, types: [oz4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(org.json.JSONObject r24, defpackage.zad r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd1.c(org.json.JSONObject, zad, boolean):void");
    }

    public final hi9 f(JSONObject jSONObject, bg1 bg1Var, String str, Map map, boolean z) {
        HashMap linkedHashMap;
        JSONArray jSONArray;
        List list;
        kg1 kg1Var = this.a;
        fg1 fg1VarJ = bg1Var != null ? kg1Var.j(bg1Var) : null;
        boolean z2 = !map.isEmpty();
        qd8 qd8Var = qd8.o;
        qd8 qd8Var2 = qd8.c;
        qd8 qd8Var3 = qd8.b;
        qd8 qd8Var4 = qd8.a;
        a4c a4cVar = this.b;
        if (z2) {
            linkedHashMap = new HashMap(qd8.values().length);
            rd8 rd8Var = this.i.a;
            rd8 rd8Var2 = (rd8) map.get(qd8Var4);
            if (rd8Var2 != null) {
                rd8Var = rd8Var2;
            }
            linkedHashMap.put(qd8Var4, rd8Var);
            rd8 rd8Var3 = this.i.b;
            rd8 rd8Var4 = (rd8) map.get(qd8Var3);
            if (rd8Var4 != null) {
                rd8Var3 = rd8Var4;
            }
            linkedHashMap.put(qd8Var3, rd8Var3);
            rd8 rd8Var5 = this.i.c;
            rd8 rd8Var6 = (rd8) map.get(qd8Var2);
            if (rd8Var6 != null) {
                rd8Var5 = rd8Var6;
            }
            linkedHashMap.put(qd8Var2, rd8Var5);
            rd8 rd8Var7 = this.i.d;
            rd8 rd8Var8 = (rd8) map.get(qd8Var);
            if (rd8Var8 != null) {
                rd8Var7 = rd8Var8;
            }
            linkedHashMap.put(qd8Var, rd8Var7);
        } else if (tpa.f(bg1Var, kg1Var.a.a)) {
            linkedHashMap = new HashMap(qd8.values().length);
            linkedHashMap.put(qd8Var4, this.i.a);
            linkedHashMap.put(qd8Var3, this.i.b);
            linkedHashMap.put(qd8Var2, this.i.c);
            linkedHashMap.put(qd8Var, this.i.d);
        } else if ((fg1VarJ != null ? fg1VarJ.b : null) != null) {
            linkedHashMap = new HashMap(qd8.values().length);
            linkedHashMap.put(qd8Var4, fg1VarJ.b.a);
            hi9 hi9Var = fg1VarJ.b;
            linkedHashMap.put(qd8Var3, hi9Var.b);
            linkedHashMap.put(qd8Var2, hi9Var.c);
            linkedHashMap.put(qd8Var, hi9Var.d);
        } else {
            linkedHashMap = new LinkedHashMap();
            a4cVar.log("CallMediaOptionsDelegate", "createParticipantMediaOptions null participant or null media options");
        }
        if (z) {
            for (Map.Entry entry : f46.n(jSONObject).entrySet()) {
                qd8 qd8Var5 = (qd8) entry.getKey();
                rd8 rd8Var9 = (rd8) entry.getValue();
                if (rd8Var9 != null) {
                    linkedHashMap.put(qd8Var5, rd8Var9);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("unmuteOptions");
        if (jSONArrayOptJSONArray != null) {
            try {
                int length = jSONArrayOptJSONArray.length();
                int i = 0;
                while (i < length) {
                    try {
                        arrayList.add(qd8.valueOf((String) jSONArrayOptJSONArray.get(i)));
                        jSONArray = jSONArrayOptJSONArray;
                    } catch (IllegalArgumentException e) {
                        StringBuilder sb = new StringBuilder();
                        jSONArray = jSONArrayOptJSONArray;
                        sb.append("invalid MediaOption in ");
                        sb.append(str);
                        a4cVar.logException("CallMediaOptionsDelegate", sb.toString(), e);
                    }
                    i++;
                    jSONArrayOptJSONArray = jSONArray;
                }
            } catch (JSONException e2) {
                a4cVar.logException("CallMediaOptionsDelegate", str, e2);
            }
        }
        boolean zOptBoolean = jSONObject.optBoolean("unmute", false);
        boolean zHas = jSONObject.has("roles");
        List listY = nz4.a;
        if (zHas) {
            try {
                listY = f46.y(jSONObject);
            } catch (Exception unused) {
                list = fg1VarJ != null ? fg1VarJ.e : null;
                if (list != null) {
                }
            }
        } else {
            list = fg1VarJ != null ? fg1VarJ.e : null;
            if (list != null) {
                listY = list;
            }
        }
        hi9 hi9Var2 = new hi9();
        hi9Var2.a = a(qd8Var4, (rd8) linkedHashMap.get(qd8Var4), listY, arrayList, zOptBoolean);
        hi9Var2.b = a(qd8Var3, (rd8) linkedHashMap.get(qd8Var3), listY, arrayList, zOptBoolean);
        hi9Var2.c = a(qd8Var2, (rd8) linkedHashMap.get(qd8Var2), listY, arrayList, zOptBoolean);
        hi9Var2.d = a(qd8Var, (rd8) linkedHashMap.get(qd8Var), listY, arrayList, zOptBoolean);
        return hi9Var2;
    }

    public final Map g(zad zadVar, int i) {
        Map map;
        int i2 = jd1.$EnumSwitchMapping$1[au1.s(i)];
        if (i2 == 1) {
            return h(zadVar).a();
        }
        oz4 oz4Var = oz4.a;
        return (i2 == 2 && (map = (Map) this.g.get(zadVar)) != null) ? map : oz4Var;
    }

    public final hi9 h(zad zadVar) {
        LinkedHashMap linkedHashMap = this.h;
        Object hi9Var = linkedHashMap.get(zadVar);
        if (hi9Var == null) {
            hi9Var = new hi9();
            linkedHashMap.put(zadVar, hi9Var);
        }
        return (hi9) hi9Var;
    }

    public final void i(bg1 bg1Var, boolean z) {
        if (z || !tpa.f(this.a.a.a, bg1Var)) {
            return;
        }
        sq1 sq1Var = new sq1(0, 4, hi9.class, this.i, "audioState", "getAudioState()Lru/ok/android/webrtc/media_options/MediaOptionState;");
        Object obj = sq1Var.get();
        rd8 rd8Var = rd8.c;
        rd8 rd8Var2 = rd8.o;
        if (obj == rd8Var) {
            sq1Var.set(rd8Var2);
        }
        sq1 sq1Var2 = new sq1(0, 5, hi9.class, this.i, "videoState", "getVideoState()Lru/ok/android/webrtc/media_options/MediaOptionState;");
        if (sq1Var2.get() == rd8Var) {
            sq1Var2.set(rd8Var2);
        }
        sq1 sq1Var3 = new sq1(0, 6, hi9.class, this.i, "screenshareState", "getScreenshareState()Lru/ok/android/webrtc/media_options/MediaOptionState;");
        if (sq1Var3.get() == rd8Var) {
            sq1Var3.set(rd8Var2);
        }
        sq1 sq1Var4 = new sq1(0, 7, hi9.class, this.i, "movieSharingState", "getMovieSharingState()Lru/ok/android/webrtc/media_options/MediaOptionState;");
        if (sq1Var4.get() == rd8Var) {
            sq1Var4.set(rd8Var2);
        }
    }

    public final void j(ArrayList arrayList, bg1 bg1Var) {
        fg1 fg1Var = this.a.a;
        if (bg1Var.equals(fg1Var.a)) {
            ArrayList arrayList2 = fg1Var.d;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            if (arrayList.contains(eg1.b)) {
                e(new sq1(0, 8, hi9.class, this.i, "audioState", "getAudioState()Lru/ok/android/webrtc/media_options/MediaOptionState;"));
                e(new sq1(0, 9, hi9.class, this.i, "videoState", "getVideoState()Lru/ok/android/webrtc/media_options/MediaOptionState;"));
                e(new sq1(0, 10, hi9.class, this.i, "screenshareState", "getScreenshareState()Lru/ok/android/webrtc/media_options/MediaOptionState;"));
                e(new sq1(0, 11, hi9.class, this.i, "movieSharingState", "getMovieSharingState()Lru/ok/android/webrtc/media_options/MediaOptionState;"));
            }
        }
    }

    public final void k() {
        EnumMap enumMapA = this.i.a();
        this.c.invoke(w51.Q0, new vi9(enumMapA));
    }

    public final void l(Map map, JSONObject jSONObject, String str, int i, zad zadVar, boolean z) {
        hi9 hi9Var = new hi9();
        qd8 qd8Var = qd8.a;
        rd8 rd8Var = (rd8) map.get(qd8Var);
        if (rd8Var != null) {
            hi9Var.a = rd8Var;
        }
        qd8 qd8Var2 = qd8.b;
        rd8 rd8Var2 = (rd8) map.get(qd8Var2);
        if (rd8Var2 != null) {
            hi9Var.b = rd8Var2;
        }
        qd8 qd8Var3 = qd8.c;
        rd8 rd8Var3 = (rd8) map.get(qd8Var3);
        if (rd8Var3 != null) {
            hi9Var.c = rd8Var3;
        }
        qd8 qd8Var4 = qd8.o;
        rd8 rd8Var4 = (rd8) map.get(qd8Var4);
        if (rd8Var4 != null) {
            hi9Var.d = rd8Var4;
        }
        hi9 hi9VarH = h(zadVar);
        EnumMap enumMap = new EnumMap(qd8.class);
        rd8 rd8Var5 = hi9Var.a;
        if (rd8Var5 != hi9VarH.a) {
            enumMap.put((EnumMap) qd8Var, (qd8) rd8Var5);
        }
        rd8 rd8Var6 = hi9Var.b;
        if (rd8Var6 != hi9VarH.b) {
            enumMap.put((EnumMap) qd8Var2, (qd8) rd8Var6);
        }
        rd8 rd8Var7 = hi9Var.c;
        if (rd8Var7 != hi9VarH.c) {
            enumMap.put((EnumMap) qd8Var3, (qd8) rd8Var7);
        }
        rd8 rd8Var8 = hi9Var.d;
        if (rd8Var8 != hi9VarH.d) {
            enumMap.put((EnumMap) qd8Var4, (qd8) rd8Var8);
        }
        if (!enumMap.isEmpty()) {
            this.g.put(zadVar, enumMap);
            this.h.put(zadVar, hi9Var);
            if (z) {
                n(jSONObject, str, g(zadVar, i), false, zadVar, null);
            }
        }
    }

    public final void m(JSONObject jSONObject, String str, int i, zad zadVar, boolean z) {
        Map mapN;
        if (jSONObject.has("muteStates")) {
            mapN = f46.n(jSONObject);
        } else if (jSONObject.has("requestedMedia")) {
            return;
        } else {
            mapN = oz4.a;
        }
        l(mapN, jSONObject, str, i, zadVar, z);
    }

    public final void n(JSONObject jSONObject, String str, Map map, boolean z, zad zadVar, zad zadVar2) {
        if (zadVar2 == null) {
            zadVar2 = (zad) this.e.invoke();
        }
        if (zadVar.equals(zadVar2)) {
            hi9 hi9VarF = f(jSONObject, this.a.a.a, str, map, z);
            if (!hi9VarF.equals(this.i)) {
                this.i = hi9VarF;
                k();
            }
            this.g.put(zadVar, oz4.a);
        }
    }
}

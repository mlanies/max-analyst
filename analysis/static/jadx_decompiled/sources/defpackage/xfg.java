package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.hardware.camera2.CameraDevice;
import android.text.Spanned;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.google.firebase.components.DependencyCycleException;
import java.lang.reflect.Array;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* loaded from: classes.dex */
public abstract class xfg {
    public static ClassLoader a;
    public static Thread b;
    public static final o97 c = new o97("SAMPLED_TRACE", 1);
    public static final int[] d = {R.attr.state_pressed};
    public static final int[] e = {R.attr.state_focused};
    public static final int[] f = {R.attr.state_selected, R.attr.state_pressed};
    public static final int[] g = {R.attr.state_selected};
    public static boolean h;
    public static AnimatedFactoryV2Impl i;

    public static int A(Object obj) {
        return z(obj == null ? 0 : obj.hashCode());
    }

    public static g7g B(p7g p7gVar, Integer num, q8g q8gVar) {
        BacklogWorker backlogWorker;
        rla rlaVar = (rla) ((qla) new qla(BacklogWorker.class).setBackoffCriteria(mf0.b, num.longValue(), TimeUnit.SECONDS)).build();
        if (q8gVar != null && (backlogWorker = BacklogWorker.Y) != null) {
            synchronized (backlogWorker.c) {
                hm9.m("BACKLOG_WORKER", "stayAlive, isRunning = %b", Boolean.valueOf(backlogWorker.X));
                backlogWorker.o.add(q8gVar.a);
            }
        }
        h65 h65Var = h65.b;
        p7gVar.getClass();
        List listSingletonList = Collections.singletonList(rlaVar);
        s7g s7gVar = (s7g) p7gVar;
        if (listSingletonList.isEmpty()) {
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        return new g7g(s7gVar, "BACKLOG_WORKER", h65Var, listSingletonList);
    }

    public static JSONArray C(Iterable iterable) throws JSONException {
        String str;
        JSONArray jSONArray = new JSONArray();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            fbd fbdVar = (fbd) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("versionName", fbdVar.b);
            jSONObject.put("versionCode", fbdVar.a);
            jSONObject.put("environment", fbdVar.c);
            jSONObject.put("sessionUuid", fbdVar.d);
            jSONObject.put("processName", fbdVar.e);
            int i2 = fbdVar.f;
            if (i2 == 1) {
                str = "BLANK";
            } else if (i2 == 2) {
                str = "CRASH";
            } else if (i2 == 3) {
                str = "ANR";
            } else {
                if (i2 != 4) {
                    throw null;
                }
                str = "NATIVE";
            }
            jSONObject.put("status", str);
            bjd bjdVar = fbdVar.g;
            jSONObject.put("maxSeverity", bjdVar != null ? bjdVar.equals(bjd.c) ? "FATAL" : bjdVar.equals(bjd.o) ? "ERROR" : bjdVar.equals(bjd.X) ? "WARNING" : bjdVar.equals(bjd.Y) ? "NOTICE" : bjdVar.equals(bjd.Z) ? "INFO" : "DEBUG" : null);
            jSONObject.put("isInBackground", fbdVar.h);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static void D(ss0 ss0Var, byte[] bArr) {
        long j;
        int length = bArr.length;
        int i2 = 0;
        do {
            byte[] bArr2 = ss0Var.X;
            int i3 = ss0Var.Y;
            int i4 = ss0Var.Z;
            if (bArr2 != null) {
                while (i3 < i4) {
                    int i5 = i2 % length;
                    bArr2[i3] = (byte) (bArr2[i3] ^ bArr[i5]);
                    i3++;
                    i2 = i5 + 1;
                }
            }
            j = ss0Var.o;
            if (j == ss0Var.a.b) {
                throw new IllegalStateException("no more bytes".toString());
            }
        } while (ss0Var.d(j == -1 ? 0L : j + (ss0Var.Z - ss0Var.Y)) != -1);
    }

    public static final void E(y5f y5fVar) {
        y5fVar.e(eua.class, new b6a(19));
        y5fVar.e(rta.class, new b6a(20));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0093 A[Catch: all -> 0x008f, PHI: r1
      0x0093: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v14 java.lang.Thread) binds: [B:7:0x000a, B:47:0x008c] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #6 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:46:0x008a, B:61:0x00a2, B:12:0x001f, B:52:0x0092, B:53:0x0093, B:64:0x00a6, B:65:0x00a7, B:54:0x0094, B:60:0x00a1, B:59:0x009e, B:13:0x0020, B:15:0x002d, B:25:0x0046, B:26:0x004d, B:28:0x0058, B:34:0x006d, B:35:0x0074, B:43:0x0085, B:44:0x0088, B:18:0x003c), top: B:80:0x0003, inners: #2, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.ClassLoader F() {
        /*
            java.lang.Class<xfg> r0 = defpackage.xfg.class
            monitor-enter(r0)
            java.lang.ClassLoader r1 = defpackage.xfg.a     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto La7
            java.lang.Thread r1 = defpackage.xfg.b     // Catch: java.lang.Throwable -> L8f
            r2 = 0
            if (r1 != 0) goto L93
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L8f
            java.lang.Thread r1 = r1.getThread()     // Catch: java.lang.Throwable -> L8f
            java.lang.ThreadGroup r1 = r1.getThreadGroup()     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto L1d
            r1 = r2
            goto L8a
        L1d:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L8f
            int r4 = r1.activeGroupCount()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            java.lang.ThreadGroup[] r5 = new java.lang.ThreadGroup[r4]     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            r1.enumerate(r5)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            r6 = 0
            r7 = r6
        L2b:
            if (r7 >= r4) goto L43
            r8 = r5[r7]     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            java.lang.String r9 = "dynamiteLoader"
            java.lang.String r10 = r8.getName()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            if (r9 == 0) goto L3c
            goto L44
        L3c:
            int r7 = r7 + 1
            goto L2b
        L3f:
            r1 = move-exception
            goto L91
        L41:
            r1 = move-exception
            goto L83
        L43:
            r8 = r2
        L44:
            if (r8 != 0) goto L4d
            java.lang.ThreadGroup r8 = new java.lang.ThreadGroup     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            java.lang.String r4 = "dynamiteLoader"
            r8.<init>(r1, r4)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
        L4d:
            int r1 = r8.activeCount()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            java.lang.Thread[] r4 = new java.lang.Thread[r1]     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            r8.enumerate(r4)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
        L56:
            if (r6 >= r1) goto L6a
            r5 = r4[r6]     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            java.lang.String r7 = "GmsDynamite"
            java.lang.String r9 = r5.getName()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            boolean r7 = r7.equals(r9)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            if (r7 == 0) goto L67
            goto L6b
        L67:
            int r6 = r6 + 1
            goto L56
        L6a:
            r5 = r2
        L6b:
            if (r5 != 0) goto L88
            tx r1 = new tx     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L81
            java.lang.String r4 = "GmsDynamite"
            r1.<init>(r8, r4)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L81
            r1.setContextClassLoader(r2)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L7c
            r1.start()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L7c
            r5 = r1
            goto L88
        L7c:
            r4 = move-exception
            r5 = r1
            goto L85
        L7f:
            r4 = r1
            goto L85
        L81:
            r1 = move-exception
            goto L7f
        L83:
            r4 = r1
            r5 = r2
        L85:
            r4.getMessage()     // Catch: java.lang.Throwable -> L3f
        L88:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3f
            r1 = r5
        L8a:
            defpackage.xfg.b = r1     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto L93
            goto La2
        L8f:
            r1 = move-exception
            goto Lab
        L91:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3f
            throw r1     // Catch: java.lang.Throwable -> L8f
        L93:
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L8f
            java.lang.Thread r3 = defpackage.xfg.b     // Catch: java.lang.Throwable -> L9b java.lang.SecurityException -> L9d
            java.lang.ClassLoader r2 = r3.getContextClassLoader()     // Catch: java.lang.Throwable -> L9b java.lang.SecurityException -> L9d
            goto La1
        L9b:
            r2 = move-exception
            goto La5
        L9d:
            r3 = move-exception
            r3.getMessage()     // Catch: java.lang.Throwable -> L9b
        La1:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9b
        La2:
            defpackage.xfg.a = r2     // Catch: java.lang.Throwable -> L8f
            goto La7
        La5:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9b
            throw r2     // Catch: java.lang.Throwable -> L8f
        La7:
            java.lang.ClassLoader r1 = defpackage.xfg.a     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r0)
            return r1
        Lab:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xfg.F():java.lang.ClassLoader");
    }

    public static final JsonEncodingException a(r6d r6dVar) {
        return new JsonEncodingException("Value of type '" + r6dVar.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + r6dVar.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException b(String str, CharSequence charSequence, int i2) {
        StringBuilder sbO = rh4.o(str, "\nJSON input: ");
        if (charSequence.length() >= 200) {
            if (i2 == -1) {
                int length = charSequence.length() - 60;
                if (length > 0) {
                    charSequence = "....." + charSequence.subSequence(length, charSequence.length()).toString();
                }
            } else {
                int i3 = i2 - 30;
                int i4 = i2 + 30;
                String str2 = i3 <= 0 ? "" : ".....";
                String str3 = i4 >= charSequence.length() ? "" : ".....";
                StringBuilder sbL = au1.l(str2);
                if (i3 < 0) {
                    i3 = 0;
                }
                int length2 = charSequence.length();
                if (i4 > length2) {
                    i4 = length2;
                }
                sbL.append(charSequence.subSequence(i3, i4).toString());
                sbL.append(str3);
                charSequence = sbL.toString();
            }
        }
        sbO.append((Object) charSequence);
        String string = sbO.toString();
        if (i2 >= 0) {
            string = "Unexpected JSON token at offset " + i2 + ": " + string;
        }
        return new JsonDecodingException(string);
    }

    public static final void c(CharSequence charSequence, fka fkaVar) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            for (Object obj : spanned.getSpans(0, spanned.length(), kre.class)) {
                ((kre) obj).onThemeChanged(fkaVar);
            }
        }
    }

    public static ca3 d(m56... m56VarArr) {
        if (m56VarArr.length > 0) {
            return new ca3(0, m56VarArr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static int e(Comparable comparable, Comparable comparable2) {
        if (comparable != null && comparable2 != null) {
            return comparable.compareTo(comparable2);
        }
        if (comparable != null || comparable2 != null) {
            if (comparable == null && comparable2 != null) {
                return -1;
            }
            if (comparable != null && comparable2 == null) {
                return 1;
            }
        }
        return 0;
    }

    public static int f(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static CameraDevice.StateCallback g(ArrayList arrayList) {
        return arrayList.isEmpty() ? new ow1() : arrayList.size() == 1 ? (CameraDevice.StateCallback) arrayList.get(0) : new nw1(arrayList);
    }

    public static void h(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b14 b14Var : (Set) it2.next()) {
                        for (nh4 nh4Var : b14Var.a.c) {
                            if (nh4Var.c == 0) {
                                Set<b14> set = (Set) map.get(new c14(nh4Var.a, nh4Var.b == 2));
                                if (set != null) {
                                    for (b14 b14Var2 : set) {
                                        b14Var.b.add(b14Var2);
                                        b14Var2.c.add(b14Var);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    b14 b14Var3 = (b14) it4.next();
                    if (b14Var3.c.isEmpty()) {
                        hashSet2.add(b14Var3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    b14 b14Var4 = (b14) hashSet2.iterator().next();
                    hashSet2.remove(b14Var4);
                    i2++;
                    Iterator it5 = b14Var4.b.iterator();
                    while (it5.hasNext()) {
                        b14 b14Var5 = (b14) it5.next();
                        b14Var5.c.remove(b14Var4);
                        if (b14Var5.c.isEmpty()) {
                            hashSet2.add(b14Var5);
                        }
                    }
                }
                if (i2 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    b14 b14Var6 = (b14) it6.next();
                    if (!b14Var6.c.isEmpty() && !b14Var6.b.isEmpty()) {
                        arrayList2.add(b14Var6.a);
                    }
                }
                throw new DependencyCycleException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
            nb3 nb3Var = (nb3) it.next();
            b14 b14Var7 = new b14(nb3Var);
            for (lqb lqbVar : nb3Var.b) {
                boolean z = !(nb3Var.e == 0);
                c14 c14Var = new c14(lqbVar, z);
                if (!map.containsKey(c14Var)) {
                    map.put(c14Var, new HashSet());
                }
                Set set2 = (Set) map.get(c14Var);
                if (!set2.isEmpty() && !z) {
                    throw new IllegalArgumentException("Multiple components provide " + lqbVar + ".");
                }
                set2.add(b14Var7);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Serializable, long[]] */
    public static final zw5 i(Map map) {
        zw5 zw5Var = new zw5(0);
        for (Map.Entry entry : map.entrySet()) {
            pa2 pa2Var = (pa2) entry.getKey();
            Object value = entry.getValue();
            if (jz7.$EnumSwitchMapping$0[pa2Var.ordinal()] == 1) {
                zw5Var.b = (long[]) value;
            }
        }
        return zw5Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [int[], java.io.Serializable] */
    public static final zw5 j(Collection collection) {
        zw5 zw5Var = new zw5(1);
        Iterator it = collection.iterator();
        int size = collection.size();
        ?? r2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            r2[i2] = ((cv5) it.next()).a;
        }
        zw5Var.b = r2;
        return zw5Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ax5[], java.io.Serializable] */
    public static final zw5 k(List list) {
        zw5 zw5Var = new zw5(2);
        int size = list.size();
        ?? r2 = new ax5[size];
        for (int i2 = 0; i2 < size; i2++) {
            hv5 hv5Var = (hv5) list.get(i2);
            ax5 ax5Var = new ax5();
            ax5Var.a = hv5Var.a;
            ax5Var.b = hv5Var.b;
            ax5Var.c = hv5Var.c;
            String str = "";
            String str2 = hv5Var.d;
            if (str2 == null) {
                str2 = "";
            }
            ax5Var.d = str2;
            Long l = hv5Var.e;
            ax5Var.e = l != null ? l.longValue() : -1L;
            String str3 = hv5Var.g;
            if (str3 == null) {
                str3 = "";
            }
            ax5Var.f = str3;
            String str4 = hv5Var.h;
            if (str4 == null) {
                str4 = "";
            }
            ax5Var.g = str4;
            String str5 = hv5Var.f;
            if (str5 != null) {
                str = str5;
            }
            ax5Var.h = str;
            r2[i2] = ax5Var;
        }
        zw5Var.b = r2;
        return zw5Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static ArrayList l(String str) throws JSONException {
        int i2;
        bjd bjdVar;
        JSONArray jSONArray = new JSONArray(str);
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i3 = 0; i3 < length; i3++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i3);
            String string = jSONObject.getString("versionName");
            long j = jSONObject.getLong("versionCode");
            String strOptString = jSONObject.optString("environment", "");
            String str2 = strOptString.length() > 0 ? strOptString : null;
            String strOptString2 = jSONObject.optString("sessionUuid", "");
            if (strOptString2.length() <= 0) {
                strOptString2 = null;
            }
            if (strOptString2 == null) {
                strOptString2 = UUID.randomUUID().toString();
            }
            String strOptString3 = jSONObject.optString("processName", "");
            if (strOptString3.length() <= 0) {
                strOptString3 = null;
            }
            String string2 = jSONObject.getString("status");
            if (string2 == null) {
                throw new NullPointerException("Name is null");
            }
            if (string2.equals("BLANK")) {
                i2 = 1;
            } else if (string2.equals("CRASH")) {
                i2 = 2;
            } else if (string2.equals("ANR")) {
                i2 = 3;
            } else {
                if (!string2.equals("NATIVE")) {
                    throw new IllegalArgumentException("No enum constant ru.ok.tracer.session.SessionState.Status.".concat(string2));
                }
                i2 = 4;
            }
            String strOptString4 = jSONObject.optString("maxSeverity", "");
            if (strOptString4.length() <= 0) {
                strOptString4 = null;
            }
            if (strOptString4 != null) {
                int iHashCode = strOptString4.hashCode();
                bjdVar = bjd.s0;
                switch (iHashCode) {
                    case -1986360616:
                        if (strOptString4.equals("NOTICE")) {
                            bjdVar = bjd.Y;
                            break;
                        } else {
                            break;
                        }
                    case 2251950:
                        if (strOptString4.equals("INFO")) {
                            bjdVar = bjd.Z;
                            break;
                        } else {
                            break;
                        }
                    case 64921139:
                        strOptString4.equals("DEBUG");
                        break;
                    case 66247144:
                        if (strOptString4.equals("ERROR")) {
                            bjdVar = bjd.o;
                            break;
                        } else {
                            break;
                        }
                    case 66665700:
                        if (strOptString4.equals("FATAL")) {
                            bjdVar = bjd.c;
                            break;
                        } else {
                            break;
                        }
                    case 1842428796:
                        if (strOptString4.equals("WARNING")) {
                            bjdVar = bjd.X;
                            break;
                        } else {
                            break;
                        }
                }
            } else {
                bjdVar = null;
            }
            arrayList.add(new fbd(j, string, str2, strOptString2, strOptString3, i2, bjdVar, jSONObject.optBoolean("isInBackground")));
        }
        return arrayList;
    }

    public static final EnumSet m(zw5 zw5Var) {
        Object next;
        int[] iArr = (int[]) zw5Var.b;
        EnumSet enumSetNoneOf = EnumSet.noneOf(cv5.class);
        for (int i2 : iArr) {
            cv5.b.getClass();
            v25 v25Var = cv5.Y;
            v25Var.getClass();
            u1 u1Var = new u1(0, v25Var);
            while (true) {
                if (!u1Var.hasNext()) {
                    next = null;
                    break;
                }
                next = u1Var.next();
                if (((cv5) next).a == i2) {
                    break;
                }
            }
            cv5 cv5Var = (cv5) next;
            if (cv5Var == null) {
                throw new IllegalStateException(("unsupported type " + i2).toString());
            }
            enumSetNoneOf.add(cv5Var);
        }
        return enumSetNoneOf;
    }

    public static final ArrayList n(zw5 zw5Var) {
        ax5[] ax5VarArr = (ax5[]) zw5Var.b;
        ArrayList arrayList = new ArrayList(ax5VarArr.length);
        for (ax5 ax5Var : ax5VarArr) {
            long j = ax5Var.a;
            String str = ax5Var.b;
            String str2 = ax5Var.c;
            String str3 = ax5Var.d;
            String str4 = (str3 == null || str3.length() == 0) ? null : str3;
            long j2 = ax5Var.e;
            Long lValueOf = j2 == -1 ? null : Long.valueOf(j2);
            String str5 = ax5Var.f;
            String str6 = (str5 == null || str5.length() == 0) ? null : str5;
            String str7 = ax5Var.g;
            String str8 = (str7 == null || str7.length() == 0) ? null : str7;
            String str9 = ax5Var.h;
            if (str9 == null || str9.length() == 0) {
                str9 = null;
            }
            arrayList.add(new hv5(j, str, str2, str4, lValueOf, str9, str6, str8));
        }
        return arrayList;
    }

    public static int o(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return s63.i(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    public static int p(int i2, Object obj) {
        if (obj == null) {
            return i2 * 37;
        }
        if (!obj.getClass().isArray()) {
            return (i2 * 37) + obj.hashCode();
        }
        int length = Array.getLength(obj);
        for (int i3 = 0; i3 < length; i3++) {
            i2 = p(i2, Array.get(obj, i3));
        }
        return i2;
    }

    public static final void q(l0f l0fVar, String str) {
        l0fVar.t(l0fVar.b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static /* synthetic */ void r(l0f l0fVar) {
        q(l0fVar, "object");
        throw null;
    }

    public static boolean s(Throwable th) {
        return oaf.a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean t(Throwable th) {
        return oaf.a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    public static v6f u(e7f e7fVar) {
        d7f d7fVar;
        u6f u6fVar = new u6f();
        u6fVar.g = q8f.UNKNOWN;
        String str = e7fVar.b;
        mx1 mx1Var = e7fVar.a;
        p8f p8fVar = null;
        if (mx1Var == null) {
            d7fVar = null;
        } else {
            gk8 gk8Var = new gk8();
            gk8Var.d = str;
            gk8Var.a = mx1Var.b;
            gk8Var.b = mx1Var.a;
            gk8Var.c = (String) mx1Var.c;
            d7fVar = new d7f(gk8Var);
        }
        u6fVar.a = d7fVar;
        o8f o8fVar = e7fVar.i;
        if (o8fVar != null) {
            o8f o8fVar2 = new o8f();
            o8fVar2.a = o8fVar.a;
            o8fVar2.b = o8fVar.b;
            p8fVar = new p8f(o8fVar2);
        }
        u6fVar.h = p8fVar;
        u6fVar.g = e7fVar.h;
        u6fVar.b = e7fVar.c;
        u6fVar.c = e7fVar.d;
        u6fVar.d = e7fVar.e;
        u6fVar.f = e7fVar.g;
        u6fVar.e = e7fVar.f;
        u6fVar.i = e7fVar.j;
        return new v6f(u6fVar);
    }

    public static jn v(String str) throws ProtocolException, NumberFormatException {
        int i2;
        String strSubstring;
        boolean zO0 = eae.o0(str, "HTTP/1.", false);
        sob sobVar = sob.HTTP_1_0;
        if (zO0) {
            i2 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                sobVar = sob.HTTP_1_1;
            }
        } else {
            if (!eae.o0(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i2 = 4;
        }
        int i3 = i2 + 3;
        if (str.length() < i3) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i4 = Integer.parseInt(str.substring(i2, i3));
            if (str.length() <= i3) {
                strSubstring = "";
            } else {
                if (str.charAt(i3) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i2 + 4);
            }
            return new jn(i4, 21, sobVar, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static final Object w(pa2 pa2Var, gy8 gy8Var) {
        if (mk5.$EnumSwitchMapping$0[pa2Var.ordinal()] == 1) {
            return u7d.c(gy8Var);
        }
        try {
            gy8Var.z();
            return null;
        } catch (Throwable th) {
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = u7d.a.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th);
            }
            int iS = au1.s(k7d.a);
            if (iS == 0) {
                return null;
            }
            if (iS != 1) {
                throw new NoWhenBranchMatchedException();
            }
            throw th;
        }
    }

    public static t9c x(Integer num) {
        int iIntValue = num.intValue();
        for (t9c t9cVar : t9c.values()) {
            if (t9cVar.a == iIntValue) {
                return t9cVar;
            }
        }
        return t9c.UNKNOWN;
    }

    public static boolean y(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }

    public static int z(int i2) {
        return (int) (Integer.rotateLeft((int) (i2 * (-862048943)), 15) * 461845907);
    }
}

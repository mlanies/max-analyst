package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.biometric.BiometricViewModel;
import androidx.fragment.app.b;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class bwf {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;

    public bwf(a4c a4cVar, lz1 lz1Var, qz7 qz7Var, aab aabVar, ph4 ph4Var, l7b l7bVar) {
        this.a = a4cVar;
        this.b = lz1Var;
        this.c = qz7Var;
        this.d = aabVar;
        this.e = ph4Var;
        this.f = l7bVar;
    }

    public static dbd b(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1881281404) {
            if (iHashCode != -1785516855) {
                if (iHashCode != -873347853) {
                    if (iHashCode == -595928767 && str.equals("TIMEOUT")) {
                        return dbd.o;
                    }
                } else if (str.equals("ACTIVATE")) {
                    return dbd.c;
                }
            } else if (str.equals("UPDATE")) {
                return dbd.a;
            }
        } else if (str.equals("REMOVE")) {
            return dbd.b;
        }
        return null;
    }

    public static b94 c(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (i3 < 0) {
                throw new IOException(zr6.h(i3, "Invalid value size: "));
            }
            int iMin = Math.min(i3, 10485760);
            byte[] bArrCopyOf = oaf.f;
            int i4 = 0;
            while (i4 != i3) {
                int i5 = i4 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i5);
                dataInputStream.readFully(bArrCopyOf, i4, iMin);
                iMin = Math.min(i3 - i5, 10485760);
                i4 = i5;
            }
            map.put(utf, bArrCopyOf);
        }
        return new b94(map);
    }

    public static void d(b94 b94Var, DataOutputStream dataOutputStream) {
        Set<Map.Entry> setEntrySet = b94Var.b.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public cbd a(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("events");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            dbd dbdVarB = b(jSONArray.getString(i));
            if (dbdVarB != null) {
                linkedHashSet.add(dbdVarB);
            }
        }
        int i2 = jSONObject.getInt("roomId");
        boolean zOptBoolean = jSONObject.optBoolean("deactivate");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("room");
        return new cbd(linkedHashSet, i2, jSONObjectOptJSONObject != null ? l(jSONObjectOptJSONObject) : null, zOptBoolean);
    }

    public void e(a8g a8gVar, String str, String str2) {
        String string = ((b) this.a).getString(jpc.r);
        if (!(true ^ (str2 == null || str2.length() == 0))) {
            str2 = null;
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Title must be set and non-empty.");
        }
        boolean zM = f8.m(15);
        if (TextUtils.isEmpty(string) && !zM) {
            throw new IllegalArgumentException("Negative text must be set and non-empty.");
        }
        if (!TextUtils.isEmpty(string) && zM) {
            throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
        }
        ay ayVar = new ay(str, str2, string);
        je7 je7Var = (je7) this.f;
        if (a8gVar == null) {
            ((dn0) je7Var.getValue()).a(ayVar, null);
            return;
        }
        dn0 dn0Var = (dn0) je7Var.getValue();
        dn0Var.getClass();
        if ((15 & 255) == 255) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
        }
        if (Build.VERSION.SDK_INT < 30 && f8.m(15)) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
        }
        dn0Var.a(ayVar, a8gVar);
    }

    public hh2 f(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject("updates");
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            dbd dbdVarB = b(next);
            if (dbdVarB != null) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                if (jSONObject3.has("rooms")) {
                    JSONArray jSONArray = jSONObject3.getJSONArray("rooms");
                    ArrayList arrayList2 = new ArrayList();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        arrayList2.add(l(jSONArray.getJSONObject(i)));
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        hpd hpdVar = (hpd) it.next();
                        arrayList.add(new cbd(Collections.singleton(dbdVarB), hpdVar.a, hpdVar, false));
                    }
                } else {
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("roomIds");
                    ArrayList arrayList3 = new ArrayList();
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        arrayList3.add(Integer.valueOf(jSONArray2.getInt(i2)));
                    }
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new cbd(Collections.singleton(dbdVarB), ((Number) it2.next()).intValue(), null, false));
                    }
                }
            }
        }
        return new hh2(arrayList);
    }

    public ukg g(ukg ukgVar) {
        return ukgVar.j(new cs(2), new z16(6, this));
    }

    public mx0 h(String str) {
        return (mx0) ((HashMap) this.a).get(str);
    }

    public mx0 i(String str) {
        HashMap map = (HashMap) this.a;
        mx0 mx0Var = (mx0) map.get(str);
        if (mx0Var != null) {
            return mx0Var;
        }
        SparseArray sparseArray = (SparseArray) this.b;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        mx0 mx0Var2 = new mx0(iKeyAt, str, b94.c);
        map.put(str, mx0Var2);
        sparseArray.put(iKeyAt, str);
        ((SparseBooleanArray) this.d).put(iKeyAt, true);
        ((ox0) this.e).e(mx0Var2);
        return mx0Var2;
    }

    public void j(long j) {
        ox0 ox0Var;
        ox0 ox0Var2 = (ox0) this.e;
        ox0Var2.i(j);
        ox0 ox0Var3 = (ox0) this.f;
        if (ox0Var3 != null) {
            ox0Var3.i(j);
        }
        boolean zF = ox0Var2.f();
        SparseArray sparseArray = (SparseArray) this.b;
        HashMap map = (HashMap) this.a;
        if (zF || (ox0Var = (ox0) this.f) == null || !ox0Var.f()) {
            ox0Var2.k(map, sparseArray);
        } else {
            ((ox0) this.f).k(map, sparseArray);
            ox0Var2.a(map);
        }
        ox0 ox0Var4 = (ox0) this.f;
        if (ox0Var4 != null) {
            ox0Var4.l();
            this.f = null;
        }
    }

    public void k(String str) {
        HashMap map = (HashMap) this.a;
        mx0 mx0Var = (mx0) map.get(str);
        if (mx0Var != null && mx0Var.c.isEmpty() && mx0Var.d.isEmpty()) {
            map.remove(str);
            SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.d;
            int i = mx0Var.a;
            boolean z = sparseBooleanArray.get(i);
            ((ox0) this.e).c(mx0Var, z);
            SparseArray sparseArray = (SparseArray) this.b;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                ((SparseBooleanArray) this.c).put(i, true);
            }
        }
    }

    public hpd l(JSONObject jSONObject) throws JSONException {
        gpd gpdVar;
        o01 o01VarS;
        jpd jpdVar;
        jpd jpdVar2;
        gpd gpdVarF;
        int i = jSONObject.getInt("id");
        String string = jSONObject.getString("name");
        Boolean boolValueOf = jSONObject.has("active") ? Boolean.valueOf(jSONObject.optBoolean("active")) : null;
        if (jSONObject.has("countdownSec")) {
            jSONObject.optInt("countdownSec");
        }
        Long lValueOf = jSONObject.has("timeoutMs") ? Long.valueOf(jSONObject.optLong("timeoutMs")) : null;
        int iOptInt = jSONObject.optInt("participantCount");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("participantIds");
        lz1 lz1Var = (lz1) this.b;
        ArrayList arrayListA = jSONArrayOptJSONArray != null ? lz1Var.a(jSONArrayOptJSONArray) : null;
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("addParticipantIds");
        ArrayList arrayListA2 = jSONArrayOptJSONArray2 != null ? lz1Var.a(jSONArrayOptJSONArray2) : null;
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("removeParticipantIds");
        ArrayList arrayListA3 = jSONArrayOptJSONArray3 != null ? lz1Var.a(jSONArrayOptJSONArray3) : null;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("recordInfo");
        if (jSONObjectOptJSONObject != null) {
            aab aabVar = (aab) this.d;
            aabVar.getClass();
            try {
                gpdVarF = aab.f(jSONObjectOptJSONObject);
            } catch (JSONException e) {
                ((a4c) aabVar.a).logException("RecordInfoParser", "Can't parse record info", e);
                gpdVarF = null;
            }
            gpdVar = gpdVarF;
        } else {
            gpdVar = null;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("asrInfo");
        if (jSONObjectOptJSONObject2 != null) {
            ((ph4) this.e).getClass();
            o01VarS = ph4.s(jSONObjectOptJSONObject2);
        } else {
            o01VarS = null;
        }
        Map mapN = jSONObject.has("muteStates") ? f46.n(jSONObject) : oz4.a;
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("participants");
        fpd fpdVarS = jSONObjectOptJSONObject3 != null ? ((qz7) this.c).S(jSONObjectOptJSONObject3, new yad(i)) : null;
        boolean zIsNull = jSONObject.isNull("pinnedParticipantId");
        String strT = f8.t(jSONObject, "pinnedParticipantId");
        bg1 bg1VarA = (zIsNull || strT == null) ? null : bg1.a(strT);
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("urlSharingInfo");
        if (jSONObjectOptJSONObject4 != null) {
            l7b l7bVar = (l7b) this.f;
            l7bVar.getClass();
            try {
                jpdVar2 = new jpd(bg1.a(jSONObjectOptJSONObject4.getString("initiatorId")), jSONObjectOptJSONObject4.getString("sharedUrl"));
            } catch (JSONException e2) {
                ((a4c) l7bVar.b).logException("UrlSharingParser", "Can't parse url sharing", e2);
                jpdVar2 = null;
            }
            jpdVar = jpdVar2;
        } else {
            jpdVar = null;
        }
        return new hpd(i, string, boolValueOf, arrayListA, arrayListA2, arrayListA3, lValueOf, Integer.valueOf(iOptInt), gpdVar, o01VarS, mapN, fpdVarS, bg1VarA, jpdVar);
    }

    public void m(String str, String str2, Bundle bundle) {
        int i;
        String str3;
        String strEncodeToString;
        boolean zG;
        int i2;
        PackageInfo packageInfo;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        fl5 fl5Var = (fl5) this.a;
        fl5Var.a();
        bundle.putString("gmp_app_id", fl5Var.c.b);
        jjf jjfVar = (jjf) this.b;
        synchronized (jjfVar) {
            try {
                if (jjfVar.a == 0) {
                    try {
                        packageInfo = ((Context) jjfVar.c).getPackageManager().getPackageInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e) {
                        e.toString();
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        jjfVar.a = packageInfo.versionCode;
                    }
                }
                i = jjfVar.a;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((jjf) this.b).g());
        jjf jjfVar2 = (jjf) this.b;
        synchronized (jjfVar2) {
            try {
                if (((String) jjfVar2.e) == null) {
                    jjfVar2.j();
                }
                str3 = (String) jjfVar2.e;
            } finally {
            }
        }
        bundle.putString("app_ver_name", str3);
        fl5 fl5Var2 = (fl5) this.a;
        fl5Var2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(fl5Var2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str4 = ((ua0) j1e.b(((il5) ((jl5) this.f)).d())).a;
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException | ExecutionException unused2) {
        }
        bundle.putString("appid", (String) j1e.b(((il5) ((jl5) this.f)).c()));
        bundle.putString("cliv", "fcm-24.0.1");
        mj6 mj6Var = (mj6) ((gpb) this.e).get();
        ef4 ef4Var = (ef4) ((gpb) this.d).get();
        if (mj6Var == null || ef4Var == null) {
            return;
        }
        bb4 bb4Var = (bb4) mj6Var;
        synchronized (bb4Var) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            nj6 nj6Var = (nj6) bb4Var.a.get();
            synchronized (nj6Var) {
                zG = nj6Var.g(jCurrentTimeMillis);
            }
            if (zG) {
                synchronized (nj6Var) {
                    String strD = nj6Var.d(System.currentTimeMillis());
                    nj6Var.a.edit().putString("last-used-date", strD).commit();
                    nj6Var.f(strD);
                }
                i2 = 3;
            } else {
                i2 = 1;
            }
        }
        if (i2 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(au1.s(i2)));
            bundle.putString("Firebase-Client", ef4Var.a());
        }
    }

    public ukg n(String str, String str2, Bundle bundle) {
        int i;
        try {
            m(str, str2, bundle);
            goc gocVar = (goc) this.c;
            l2a l2aVar = gocVar.c;
            int iG = l2aVar.g();
            ok4 ok4Var = ok4.o;
            if (iG < 12000000) {
                return l2aVar.h() != 0 ? gocVar.a(bundle).k(ok4Var, new aab(gocVar, bundle)) : j1e.q(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            pkg pkgVarF = pkg.f(gocVar.b);
            synchronized (pkgVarF) {
                i = pkgVarF.b;
                pkgVarF.b = i + 1;
            }
            return pkgVarF.h(new ckg(i, 1, bundle, 1)).j(ok4Var, dp3.Y);
        } catch (InterruptedException | ExecutionException e) {
            return j1e.q(e);
        }
    }

    public void o() {
        ((ox0) this.e).h((HashMap) this.a);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.c;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            ((SparseArray) this.b).remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.d).clear();
    }

    public bwf(im imVar, k56 k56Var, k56 k56Var2) {
        this.a = imVar;
        this.b = k56Var;
        this.c = k56Var2;
        this.d = bwf.class.getName();
        final int i = 0;
        this.e = tu0.r(3, new k56(this) { // from class: zvf
            public final /* synthetic */ bwf b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new awf(this.b);
                    default:
                        bwf bwfVar = this.b;
                        awf awfVar = (awf) ((je7) bwfVar.e).getValue();
                        dn0 dn0Var = new dn0();
                        b bVar = (b) bwfVar.a;
                        if (bVar == null) {
                            throw new IllegalArgumentException("FragmentActivity must not be null.");
                        }
                        if (awfVar == null) {
                            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
                        }
                        n16 n16VarS = bVar.S();
                        BiometricViewModel biometricViewModel = (BiometricViewModel) new xje(bVar).b(nec.a(BiometricViewModel.class));
                        dn0Var.a = n16VarS;
                        if (biometricViewModel != null) {
                            biometricViewModel.b = awfVar;
                        }
                        return dn0Var;
                }
            }
        });
        final int i2 = 1;
        this.f = tu0.r(3, new k56(this) { // from class: zvf
            public final /* synthetic */ bwf b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new awf(this.b);
                    default:
                        bwf bwfVar = this.b;
                        awf awfVar = (awf) ((je7) bwfVar.e).getValue();
                        dn0 dn0Var = new dn0();
                        b bVar = (b) bwfVar.a;
                        if (bVar == null) {
                            throw new IllegalArgumentException("FragmentActivity must not be null.");
                        }
                        if (awfVar == null) {
                            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
                        }
                        n16 n16VarS = bVar.S();
                        BiometricViewModel biometricViewModel = (BiometricViewModel) new xje(bVar).b(nec.a(BiometricViewModel.class));
                        dn0Var.a = n16VarS;
                        if (biometricViewModel != null) {
                            biometricViewModel.b = awfVar;
                        }
                        return dn0Var;
                }
            }
        });
    }

    public bwf(e34 e34Var, File file, boolean z) {
        this.a = new HashMap();
        this.b = new SparseArray();
        this.c = new SparseBooleanArray();
        this.d = new SparseBooleanArray();
        m5d m5dVar = e34Var != null ? new m5d(e34Var) : null;
        nx0 nx0Var = new nx0(new File(file, "cached_content_index.exi"), 1);
        if (m5dVar != null && !z) {
            this.e = m5dVar;
            this.f = nx0Var;
        } else {
            int i = oaf.a;
            this.e = nx0Var;
            this.f = m5dVar;
        }
    }

    public bwf(fl5 fl5Var, jjf jjfVar, gpb gpbVar, gpb gpbVar2, jl5 jl5Var) {
        fl5Var.a();
        goc gocVar = new goc(fl5Var.a);
        this.a = fl5Var;
        this.b = jjfVar;
        this.c = gocVar;
        this.d = gpbVar;
        this.e = gpbVar2;
        this.f = jl5Var;
    }
}

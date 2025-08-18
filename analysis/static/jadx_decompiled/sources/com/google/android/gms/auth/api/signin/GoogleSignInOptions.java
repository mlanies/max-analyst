package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.ay7;
import defpackage.ky6;
import defpackage.n3;
import defpackage.nk;
import defpackage.qe6;
import defpackage.vqf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInOptions extends n3 implements nk, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final GoogleSignInOptions v0;
    public static final Scope w0;
    public static final Scope x0;
    public static final Scope y0;
    public static final ky6 z0;
    public final boolean X;
    public final boolean Y;
    public final String Z;
    public final int a;
    public final ArrayList b;
    public final Account c;
    public final boolean o;
    public final String s0;
    public final ArrayList t0;
    public final String u0;

    static {
        Scope scope = new Scope(1, "profile");
        new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        w0 = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        x0 = scope3;
        y0 = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(y0)) {
            Scope scope4 = x0;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        v0 = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, map, null);
        HashSet hashSet2 = new HashSet();
        HashMap map2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(y0)) {
            Scope scope5 = x0;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, map2, null);
        CREATOR = new vqf(7);
        z0 = new ky6(18);
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3) {
        this.a = i;
        this.b = arrayList;
        this.c = account;
        this.o = z;
        this.X = z2;
        this.Y = z3;
        this.Z = str;
        this.s0 = str2;
        this.t0 = new ArrayList(map.values());
        this.u0 = str3;
    }

    public static GoogleSignInOptions b(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public static HashMap c(List list) {
        HashMap map = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                qe6 qe6Var = (qe6) it.next();
                map.put(Integer.valueOf(qe6Var.b), qe6Var);
            }
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f A[Catch: ClassCastException -> 0x007b, TryCatch #0 {ClassCastException -> 0x007b, blocks: (B:5:0x0008, B:7:0x0018, B:10:0x0021, B:12:0x0030, B:15:0x003c, B:21:0x0049, B:23:0x004f, B:29:0x005d, B:31:0x0063, B:33:0x0069, B:35:0x006f, B:26:0x0056, B:19:0x0043), top: B:41:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056 A[Catch: ClassCastException -> 0x007b, TryCatch #0 {ClassCastException -> 0x007b, blocks: (B:5:0x0008, B:7:0x0018, B:10:0x0021, B:12:0x0030, B:15:0x003c, B:21:0x0049, B:23:0x004f, B:29:0x005d, B:31:0x0063, B:33:0x0069, B:35:0x006f, B:26:0x0056, B:19:0x0043), top: B:41:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.Z
            java.util.ArrayList r1 = r8.b
            r2 = 0
            if (r9 != 0) goto L8
            return r2
        L8:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r9 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r9     // Catch: java.lang.ClassCastException -> L7b
            java.util.ArrayList r3 = r9.b     // Catch: java.lang.ClassCastException -> L7b
            java.lang.String r4 = r9.Z     // Catch: java.lang.ClassCastException -> L7b
            android.accounts.Account r5 = r9.c     // Catch: java.lang.ClassCastException -> L7b
            java.util.ArrayList r6 = r8.t0     // Catch: java.lang.ClassCastException -> L7b
            boolean r6 = r6.isEmpty()     // Catch: java.lang.ClassCastException -> L7b
            if (r6 == 0) goto L7b
            java.util.ArrayList r6 = r9.t0     // Catch: java.lang.ClassCastException -> L7b
            boolean r6 = r6.isEmpty()     // Catch: java.lang.ClassCastException -> L7b
            if (r6 != 0) goto L21
            goto L7b
        L21:
            int r6 = r1.size()     // Catch: java.lang.ClassCastException -> L7b
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.ClassCastException -> L7b
            r7.<init>(r3)     // Catch: java.lang.ClassCastException -> L7b
            int r7 = r7.size()     // Catch: java.lang.ClassCastException -> L7b
            if (r6 != r7) goto L7b
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.ClassCastException -> L7b
            r6.<init>(r3)     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r1.containsAll(r6)     // Catch: java.lang.ClassCastException -> L7b
            if (r1 != 0) goto L3c
            goto L7b
        L3c:
            android.accounts.Account r1 = r8.c     // Catch: java.lang.ClassCastException -> L7b
            if (r1 != 0) goto L43
            if (r5 != 0) goto L7b
            goto L49
        L43:
            boolean r1 = r1.equals(r5)     // Catch: java.lang.ClassCastException -> L7b
            if (r1 == 0) goto L7b
        L49:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.ClassCastException -> L7b
            if (r1 == 0) goto L56
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.ClassCastException -> L7b
            if (r0 == 0) goto L7b
            goto L5d
        L56:
            boolean r0 = r0.equals(r4)     // Catch: java.lang.ClassCastException -> L7b
            if (r0 != 0) goto L5d
            goto L7b
        L5d:
            boolean r0 = r8.Y     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r9.Y     // Catch: java.lang.ClassCastException -> L7b
            if (r0 != r1) goto L7b
            boolean r0 = r8.o     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r9.o     // Catch: java.lang.ClassCastException -> L7b
            if (r0 != r1) goto L7b
            boolean r0 = r8.X     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r9.X     // Catch: java.lang.ClassCastException -> L7b
            if (r0 != r1) goto L7b
            java.lang.String r8 = r8.u0     // Catch: java.lang.ClassCastException -> L7b
            java.lang.String r9 = r9.u0     // Catch: java.lang.ClassCastException -> L7b
            boolean r8 = android.text.TextUtils.equals(r8, r9)     // Catch: java.lang.ClassCastException -> L7b
            if (r8 == 0) goto L7b
            r8 = 1
            return r8
        L7b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).b);
        }
        Collections.sort(arrayList);
        int iHashCode = arrayList.hashCode() + (1 * 31);
        Account account = this.c;
        int iHashCode2 = (iHashCode * 31) + (account == null ? 0 : account.hashCode());
        String str = this.Z;
        int iHashCode3 = (((((((iHashCode2 * 31) + (str == null ? 0 : str.hashCode())) * 31) + (this.Y ? 1 : 0)) * 31) + (this.o ? 1 : 0)) * 31) + (this.X ? 1 : 0);
        String str2 = this.u0;
        return (iHashCode3 * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.X(parcel, 1, 4);
        parcel.writeInt(this.a);
        ay7.S(parcel, new ArrayList(this.b), 2);
        ay7.P(parcel, 3, this.c, i);
        ay7.X(parcel, 4, 4);
        parcel.writeInt(this.o ? 1 : 0);
        ay7.X(parcel, 5, 4);
        parcel.writeInt(this.X ? 1 : 0);
        ay7.X(parcel, 6, 4);
        parcel.writeInt(this.Y ? 1 : 0);
        ay7.Q(parcel, 7, this.Z);
        ay7.Q(parcel, 8, this.s0);
        ay7.S(parcel, this.t0, 9);
        ay7.Q(parcel, 10, this.u0);
        ay7.W(parcel, iT);
    }
}

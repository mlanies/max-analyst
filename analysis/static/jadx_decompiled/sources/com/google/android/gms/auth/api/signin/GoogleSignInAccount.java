package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.ay7;
import defpackage.fp3;
import defpackage.n3;
import defpackage.vqf;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends n3 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new vqf(6);
    public final String X;
    public final Uri Y;
    public String Z;
    public final int a;
    public final String b;
    public final String c;
    public final String o;
    public final long s0;
    public final String t0;
    public final List u0;
    public final String v0;
    public final String w0;
    public final HashSet x0 = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.o = str3;
        this.X = str4;
        this.Y = uri;
        this.Z = str5;
        this.s0 = j;
        this.t0 = str6;
        this.u0 = arrayList;
        this.v0 = str7;
        this.w0 = str8;
    }

    public static GoogleSignInAccount b(String str) throws JSONException, NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        fp3.j(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.Z = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (googleSignInAccount.t0.equals(this.t0)) {
            HashSet hashSet = new HashSet(googleSignInAccount.u0);
            hashSet.addAll(googleSignInAccount.x0);
            HashSet hashSet2 = new HashSet(this.u0);
            hashSet2.addAll(this.x0);
            if (hashSet.equals(hashSet2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.t0.hashCode() + 527;
        HashSet hashSet = new HashSet(this.u0);
        hashSet.addAll(this.x0);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.X(parcel, 1, 4);
        parcel.writeInt(this.a);
        ay7.Q(parcel, 2, this.b);
        ay7.Q(parcel, 3, this.c);
        ay7.Q(parcel, 4, this.o);
        ay7.Q(parcel, 5, this.X);
        ay7.P(parcel, 6, this.Y, i);
        ay7.Q(parcel, 7, this.Z);
        ay7.X(parcel, 8, 8);
        parcel.writeLong(this.s0);
        ay7.Q(parcel, 9, this.t0);
        ay7.S(parcel, this.u0, 10);
        ay7.Q(parcel, 11, this.v0);
        ay7.Q(parcel, 12, this.w0);
        ay7.W(parcel, iT);
    }
}

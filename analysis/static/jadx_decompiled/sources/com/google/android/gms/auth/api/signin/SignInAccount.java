package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.ay7;
import defpackage.n3;
import defpackage.ufg;

/* loaded from: classes.dex */
public class SignInAccount extends n3 implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new ufg(5);
    public String a;
    public GoogleSignInAccount b;
    public String c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.Q(parcel, 4, this.a);
        ay7.P(parcel, 7, this.b, i);
        ay7.Q(parcel, 8, this.c);
        ay7.W(parcel, iT);
    }
}

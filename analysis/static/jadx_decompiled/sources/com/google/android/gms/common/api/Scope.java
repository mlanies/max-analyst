package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.ay7;
import defpackage.fp3;
import defpackage.n3;
import defpackage.vqf;

/* loaded from: classes.dex */
public final class Scope extends n3 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new vqf(15);
    public final int a;
    public final String b;

    public Scope(int i, String str) {
        fp3.k(str, "scopeUri must not be null or empty");
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.b.equals(((Scope) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.X(parcel, 1, 4);
        parcel.writeInt(this.a);
        ay7.Q(parcel, 2, this.b);
        ay7.W(parcel, iT);
    }
}

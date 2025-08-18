package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class x06 implements Parcelable {
    public static final Parcelable.Creator<x06> CREATOR = new y(5);
    public final Bundle a;

    public x06(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public x06(Parcel parcel, ClassLoader classLoader) {
        Bundle bundle = parcel.readBundle();
        this.a = bundle;
        if (classLoader == null || bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
    }
}

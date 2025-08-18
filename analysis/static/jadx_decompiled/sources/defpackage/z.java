package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class z implements Parcelable {
    public final Parcelable a;
    public static final x b = new x();
    public static final Parcelable.Creator<z> CREATOR = new y(0);

    public z() {
        this.a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }

    public z(Parcelable parcelable) {
        if (parcelable != null) {
            this.a = parcelable == b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public z(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.a = parcelable == null ? b : parcelable;
    }
}

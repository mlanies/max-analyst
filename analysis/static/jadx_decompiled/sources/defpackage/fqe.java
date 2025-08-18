package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class fqe implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new gqe(parcel.readInt(), parcel.readArrayList(Object.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new gqe[i];
    }
}

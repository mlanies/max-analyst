package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class bqe implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new cqe(parcel.readArrayList(Object.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new cqe[i];
    }
}

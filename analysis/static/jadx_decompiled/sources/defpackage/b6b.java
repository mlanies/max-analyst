package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class b6b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new c6b(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new c6b[i];
    }
}

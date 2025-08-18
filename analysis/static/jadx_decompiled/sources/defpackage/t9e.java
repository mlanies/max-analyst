package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class t9e implements Parcelable {
    public static final Parcelable.Creator<t9e> CREATOR = new etd(14);
    public final SparseArray a;

    public t9e(SparseArray sparseArray) {
        this.a = sparseArray;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = sparseArray.keyAt(i2);
            parcel.writeInt(iKeyAt);
            parcel.writeString((String) sparseArray.get(iKeyAt));
        }
    }
}

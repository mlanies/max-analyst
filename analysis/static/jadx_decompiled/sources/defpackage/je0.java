package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class je0 implements Parcelable {
    public static final Parcelable.Creator<je0> CREATOR = new d6(9);
    public final ArrayList a;
    public final ArrayList b;

    public je0(Parcel parcel) {
        this.a = parcel.createStringArrayList();
        this.b = parcel.createTypedArrayList(ie0.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeTypedList(this.b);
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class mze implements Parcelable {
    public final lze a;
    public final List b;
    public static final mze c = new mze(lze.u0, Collections.emptyList());
    public static final Parcelable.Creator<mze> CREATOR = new etd(20);

    public mze(lze lzeVar, List list) {
        this.a = lzeVar;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mze.class != obj.getClass()) {
            return false;
        }
        mze mzeVar = (mze) obj;
        if (this.a.equals(mzeVar.a)) {
            return this.b.equals(mzeVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackContainer{videoTrack=" + this.a + ", audioTracks=" + this.b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeTypedList(this.b);
    }

    public mze(Parcel parcel) {
        this.a = (lze) parcel.readParcelable(lze.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        parcel.readTypedList(arrayList, lze.CREATOR);
    }
}

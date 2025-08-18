package defpackage;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class ov4 implements Parcelable {
    public static final Parcelable.Creator<ov4> CREATOR = new f73(16);
    public final List a;
    public final List b;
    public final Rect c;
    public final boolean o;

    public ov4(ArrayList arrayList, ArrayList arrayList2, Rect rect, boolean z) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = rect;
        this.o = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ov4.class != obj.getClass()) {
            return false;
        }
        ov4 ov4Var = (ov4) obj;
        List list = ov4Var.a;
        List list2 = this.a;
        if (list2 == null ? list != null : !list2.equals(list)) {
            return false;
        }
        List list3 = ov4Var.b;
        List list4 = this.b;
        if (list4 == null ? list3 != null : !list4.equals(list3)) {
            return false;
        }
        if (this.o != ov4Var.o) {
            return false;
        }
        Rect rect = ov4Var.c;
        Rect rect2 = this.c;
        return rect2 != null ? rect2.equals(rect) : rect == null;
    }

    public final int hashCode() {
        List list = this.a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        Rect rect = this.c;
        return Boolean.valueOf(this.o).hashCode() + ((iHashCode2 + (rect != null ? rect.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.a);
        parcel.writeTypedList(this.b);
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.o ? 1 : 0);
    }

    public ov4(Parcel parcel) {
        this.a = parcel.createTypedArrayList(ee7.CREATOR);
        this.b = parcel.createTypedArrayList(e73.CREATOR);
        this.c = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.o = parcel.readInt() == 1;
    }
}

package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class o04 implements Parcelable {
    public static final Parcelable.Creator<o04> CREATOR = new f73(5);
    public final List a;
    public final List b;
    public final List c;
    public final int o;

    public o04(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        this.o = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o04)) {
            return false;
        }
        o04 o04Var = (o04) obj;
        return tpa.f(this.a, o04Var.a) && tpa.f(this.b, o04Var.b) && tpa.f(this.c, o04Var.c) && this.o == o04Var.o;
    }

    public final int hashCode() {
        return Integer.hashCode(this.o) + k7d.g(this.c, k7d.g(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "SavedState(savedPagesKeys=" + this.a + ", savedPagesValues=" + this.b + ", savedPageHistory=" + this.c + ", maxPagesToStateSave=" + this.o + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeLong(((Number) it.next()).longValue());
        }
        List list2 = this.b;
        parcel.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeBundle((Bundle) it2.next());
        }
        List list3 = this.c;
        parcel.writeInt(list3.size());
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            parcel.writeLong(((Number) it3.next()).longValue());
        }
        parcel.writeInt(this.o);
    }
}

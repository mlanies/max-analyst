package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class e6 implements Parcelable {
    public static final Parcelable.Creator<e6> CREATOR = new d6(0);
    public final String a;
    public final List b;
    public final String c;

    public e6(List list, String str) {
        this.b = list;
        this.c = str;
        this.a = (String) nd7.r(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<String> list = this.b;
        byte b = list != null ? (byte) 1 : (byte) 0;
        parcel.writeByte(b);
        if (b != 0) {
            parcel.writeInt(list.size());
            parcel.writeStringList(list);
        }
        f8.H(parcel, this.c);
    }

    public e6(Parcel parcel) {
        List<String> listEmptyList;
        if (parcel.readByte() == 1) {
            listEmptyList = new ArrayList<>(parcel.readInt());
            parcel.readStringList(listEmptyList);
        } else {
            listEmptyList = null;
        }
        listEmptyList = listEmptyList == null ? Collections.emptyList() : listEmptyList;
        this.b = listEmptyList;
        this.c = f8.x(parcel);
        this.a = (String) nd7.r(listEmptyList);
    }
}

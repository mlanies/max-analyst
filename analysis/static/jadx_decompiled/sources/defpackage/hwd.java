package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class hwd extends tvd {
    public static final Parcelable.Creator<hwd> CREATOR = new etd(7);
    public final List a;

    public hwd(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new fwd(parcel));
        }
        this.a = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            fwd fwdVar = (fwd) list.get(i2);
            parcel.writeLong(fwdVar.a);
            parcel.writeByte(fwdVar.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(fwdVar.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(fwdVar.d ? (byte) 1 : (byte) 0);
            List list2 = fwdVar.f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                dwd dwdVar = (dwd) list2.get(i3);
                parcel.writeInt(dwdVar.a);
                parcel.writeLong(dwdVar.b);
            }
            parcel.writeLong(fwdVar.e);
            parcel.writeByte(fwdVar.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(fwdVar.h);
            parcel.writeInt(fwdVar.i);
            parcel.writeInt(fwdVar.j);
            parcel.writeInt(fwdVar.k);
        }
    }

    public hwd(ArrayList arrayList) {
        this.a = Collections.unmodifiableList(arrayList);
    }
}

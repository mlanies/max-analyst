package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class iwd extends uvd {
    public static final Parcelable.Creator<iwd> CREATOR = new etd(8);
    public final List a;

    public iwd(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new gwd(parcel));
        }
        this.a = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            gwd gwdVar = (gwd) list.get(i2);
            parcel.writeLong(gwdVar.a);
            parcel.writeByte(gwdVar.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(gwdVar.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(gwdVar.d ? (byte) 1 : (byte) 0);
            List list2 = gwdVar.f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                ewd ewdVar = (ewd) list2.get(i3);
                parcel.writeInt(ewdVar.a);
                parcel.writeLong(ewdVar.b);
            }
            parcel.writeLong(gwdVar.e);
            parcel.writeByte(gwdVar.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(gwdVar.h);
            parcel.writeInt(gwdVar.i);
            parcel.writeInt(gwdVar.j);
            parcel.writeInt(gwdVar.k);
        }
    }

    public iwd(ArrayList arrayList) {
        this.a = Collections.unmodifiableList(arrayList);
    }
}

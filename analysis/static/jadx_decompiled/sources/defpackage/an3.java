package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class an3 implements Parcelable {
    public static final Parcelable.Creator<an3> CREATOR = new f73(2);
    public final wm3 a;

    public an3(wm3 wm3Var) {
        this.a = wm3Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        wm3 wm3Var = this.a;
        parcel.writeByte(wm3Var == null ? (byte) 1 : (byte) 0);
        if (wm3Var != null) {
            parcel.writeLong(wm3Var.a);
            parcel.writeLong(wm3Var.b);
            f8.H(parcel, wm3Var.c);
            f8.H(parcel, wm3Var.o);
            parcel.writeSerializable((Serializable) wm3Var.X);
            parcel.writeLong(wm3Var.Y);
            parcel.writeLong(wm3Var.Z);
            parcel.writeSerializable(wm3Var.s0);
            parcel.writeInt(au1.s(wm3Var.t0));
            parcel.writeSerializable((Serializable) wm3Var.u0);
        }
    }

    public an3(Parcel parcel) {
        if (!f8.w(parcel)) {
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            String strX = f8.x(parcel);
            String strX2 = f8.x(parcel);
            List list = (List) parcel.readSerializable();
            long j3 = parcel.readLong();
            long j4 = parcel.readLong();
            pq3 pq3Var = (pq3) parcel.readSerializable();
            int i = parcel.readInt();
            int i2 = 1;
            if (i == 1) {
                i2 = 2;
            } else if (i == 2) {
                i2 = 3;
            }
            List list2 = (List) parcel.readSerializable();
            this.a = new wm3(j, j2, strX, strX2, list, j3, j4, pq3Var, i2, list2 == null ? new ArrayList() : list2, null, null, null, null, null);
            return;
        }
        this.a = null;
    }
}

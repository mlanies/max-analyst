package defpackage;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class rdg {
    public static final /* synthetic */ int a = 0;

    static {
        rdg.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(zr6.h(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}

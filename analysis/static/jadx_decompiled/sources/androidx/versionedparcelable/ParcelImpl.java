package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.fn9;
import defpackage.kcf;
import defpackage.lcf;
import java.lang.reflect.InvocationTargetException;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new fn9(19);
    public final lcf a;

    public ParcelImpl(lcf lcfVar) {
        this.a = lcfVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        new kcf(parcel).l(this.a);
    }

    public ParcelImpl(Parcel parcel) {
        this.a = new kcf(parcel).h();
    }
}

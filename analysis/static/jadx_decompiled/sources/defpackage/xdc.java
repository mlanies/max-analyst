package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.a;

/* loaded from: classes.dex */
public final class xdc extends z {
    public static final Parcelable.Creator<xdc> CREATOR = new y(7);
    public Parcelable c;

    public xdc(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readParcelable(classLoader == null ? a.class.getClassLoader() : classLoader);
    }

    @Override // defpackage.z, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, 0);
    }
}

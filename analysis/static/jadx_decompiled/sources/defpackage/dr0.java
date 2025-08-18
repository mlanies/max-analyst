package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class dr0 extends z {
    public static final Parcelable.Creator<dr0> CREATOR = new y(2);
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final int c;
    public final int o;

    public dr0(Parcel parcel) {
        this(parcel, (ClassLoader) null);
    }

    @Override // defpackage.z, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeInt(this.Z ? 1 : 0);
    }

    public dr0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readInt();
        this.o = parcel.readInt();
        this.X = parcel.readInt() == 1;
        this.Y = parcel.readInt() == 1;
        this.Z = parcel.readInt() == 1;
    }

    public dr0(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.c = bottomSheetBehavior.L;
        this.o = bottomSheetBehavior.e;
        this.X = bottomSheetBehavior.b;
        this.Y = bottomSheetBehavior.I;
        this.Z = bottomSheetBehavior.J;
    }
}

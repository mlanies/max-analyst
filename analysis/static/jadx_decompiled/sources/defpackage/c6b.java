package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes2.dex */
public final class c6b extends View.BaseSavedState {
    public static final b6b CREATOR = new b6b();
    public final int a;
    public final boolean b;

    public c6b(Parcelable parcelable, int i, boolean z) {
        super(parcelable);
        this.a = i;
        this.b = z;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
    }

    public c6b(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
        this.b = parcel.readByte() > 0;
    }
}

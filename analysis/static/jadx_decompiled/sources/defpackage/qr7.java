package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class qr7 extends n3 {
    public static final Parcelable.Creator<qr7> CREATOR = new vqf(23);
    public final List a;
    public final boolean b;
    public final boolean c;

    public qr7(ArrayList arrayList, boolean z, boolean z2) {
        this.a = arrayList;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.S(parcel, Collections.unmodifiableList(this.a), 1);
        ay7.X(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        ay7.X(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ay7.W(parcel, iT);
    }
}

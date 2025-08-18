package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class leg extends n3 implements rjc {
    public static final Parcelable.Creator<leg> CREATOR = new vqf(8);
    public final List a;
    public final String b;

    public leg(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    @Override // defpackage.rjc
    public final Status a() {
        return this.b != null ? Status.X : Status.t0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        List<String> list = this.a;
        if (list != null) {
            int iT2 = ay7.T(parcel, 1);
            parcel.writeStringList(list);
            ay7.W(parcel, iT2);
        }
        ay7.Q(parcel, 2, this.b);
        ay7.W(parcel, iT);
    }
}

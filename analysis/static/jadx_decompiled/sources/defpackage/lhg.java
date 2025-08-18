package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;

/* loaded from: classes.dex */
public final class lhg extends n3 {
    public static final Parcelable.Creator<lhg> CREATOR = new ufg(8);
    public final LocationRequest a;

    /* JADX WARN: Removed duplicated region for block: B:100:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public lhg(com.google.android.gms.location.LocationRequest r31, java.util.ArrayList r32, boolean r33, boolean r34, boolean r35, boolean r36, long r37) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lhg.<init>(com.google.android.gms.location.LocationRequest, java.util.ArrayList, boolean, boolean, boolean, boolean, long):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lhg) {
            return s36.l(this.a, ((lhg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.P(parcel, 1, this.a, i);
        ay7.W(parcel, iT);
    }
}

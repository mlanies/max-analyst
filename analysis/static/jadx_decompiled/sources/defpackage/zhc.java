package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zhc implements Parcelable {
    public static final Parcelable.Creator<zhc> CREATOR = new e9b(13);
    public final int a;

    public zhc(int i) {
        this.a = (i & 2) != 0 ? i | 1 : i;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zhc.a(android.content.Context):int");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zhc.class != obj.getClass()) {
            return false;
        }
        return this.a == ((zhc) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}

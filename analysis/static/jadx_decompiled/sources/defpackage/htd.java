package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class htd implements c99 {
    public static final Parcelable.Creator<htd> CREATOR = new e9b(27);
    public final List a;

    public htd(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((ftd) arrayList.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((ftd) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((ftd) arrayList.get(i)).b;
                    i++;
                }
            }
        }
        np8.d(!z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || htd.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((htd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 21);
        sb.append("SlowMotion: segments=");
        sb.append(strValueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.a);
    }
}

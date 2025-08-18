package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class itd implements d99 {
    public static final Parcelable.Creator<itd> CREATOR = new e9b(28);
    public final List a;

    public itd(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((gtd) arrayList.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((gtd) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((gtd) arrayList.get(i)).b;
                    i++;
                }
            }
        }
        fm9.f(!z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || itd.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((itd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.a);
    }
}

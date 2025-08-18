package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e8b implements Parcelable {
    public static final Parcelable.Creator<e8b> CREATOR = new fn9(29);
    public final Map a;
    public final List b;
    public final qo9 c;

    public e8b(LinkedHashMap linkedHashMap, ArrayList arrayList, qo9 qo9Var) {
        this.a = linkedHashMap;
        this.b = arrayList;
        this.c = qo9Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8b)) {
            return false;
        }
        e8b e8bVar = (e8b) obj;
        return tpa.f(this.a, e8bVar.a) && tpa.f(this.b, e8bVar.b) && tpa.f(this.c, e8bVar.c);
    }

    public final int hashCode() {
        int iG = k7d.g(this.b, this.a.hashCode() * 31, 31);
        qo9 qo9Var = this.c;
        return iG + (qo9Var == null ? 0 : qo9Var.hashCode());
    }

    public final String toString() {
        return "PresetAvatarsModel(categories=" + this.a + ", avatars=" + this.b + ", selectedAvatar=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Map map = this.a;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeInt(((Number) entry.getKey()).intValue());
            parcel.writeString((String) entry.getValue());
        }
        List list = this.b;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((qo9) it.next()).writeToParcel(parcel, i);
        }
        qo9 qo9Var = this.c;
        if (qo9Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            qo9Var.writeToParcel(parcel, i);
        }
    }
}

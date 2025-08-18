package defpackage;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class yh8 implements Parcelable {
    public static final Parcelable.Creator<yh8> CREATOR = new uk7(12);
    public final ja8 a;
    public final long b;
    public MediaSession.QueueItem c;

    public yh8(MediaSession.QueueItem queueItem, ja8 ja8Var, long j) {
        if (ja8Var == null) {
            throw new IllegalArgumentException("Description cannot be null");
        }
        if (j == -1) {
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }
        this.a = ja8Var;
        this.b = j;
        this.c = queueItem;
    }

    public static ArrayList a(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) it.next();
            arrayList.add(new yh8(queueItem, ja8.a(xh8.b(queueItem)), xh8.c(queueItem)));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
        sb.append(this.a);
        sb.append(", Id=");
        return zr6.k(sb, this.b, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeLong(this.b);
    }

    public yh8(Parcel parcel) {
        this.a = ja8.CREATOR.createFromParcel(parcel);
        this.b = parcel.readLong();
    }
}

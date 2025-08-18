package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class dj6 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new ej6(parcel.readFloat());
            case 1:
                return new wn6(parcel);
            case 2:
                return new xn6(parcel);
            case 3:
                return new un6(parcel);
            case 4:
                return new vn6(parcel);
            case 5:
                return new ts6(parcel);
            case 6:
                return new us6(parcel);
            case 7:
                return new vs6(parcel);
            case 8:
                return new ws6(parcel);
            case 9:
                return new n37(parcel);
            case 10:
                return new u37(parcel);
            case 11:
                return new v37(parcel);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new ee7(parcel);
            case 13:
                vh7 vh7Var = new vh7();
                vh7Var.a = parcel.readInt();
                vh7Var.b = parcel.readInt();
                vh7Var.c = parcel.readInt() == 1;
                return vh7Var;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new ni7(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                parcel.readInt();
                return oi7.a;
            case 16:
                return new pi7(((m64) parcel.readParcelable(pi7.class.getClassLoader())).a, parcel.readString());
            case LangUtils.HASH_SEED /* 17 */:
                parcel.readInt();
                return qi7.a;
            case 18:
                parcel.readInt();
                return ri7.a;
            case 19:
                return new si7((Uri) parcel.readParcelable(si7.class.getClassLoader()));
            case 20:
                return new ti7(parcel.readString());
            case 21:
                return new ui7(parcel.readLong(), parcel.readString());
            case 22:
                parcel.readInt();
                return vi7.a;
            case 23:
                return new wi7(parcel.readLong(), parcel.readString(), parcel.readLong());
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new xi7(parcel.readLong(), parcel.readString());
            case 25:
                return new yi7(parcel.readLong(), parcel.readString(), parcel.readString());
            case 26:
                parcel.readInt();
                return zi7.a;
            case 27:
                return new aj7(parcel.readString());
            case 28:
                return new bj7(parcel.readLong());
            default:
                parcel.readInt();
                return dj7.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ej6[i];
            case 1:
                return new wn6[i];
            case 2:
                return new xn6[i];
            case 3:
                return new un6[i];
            case 4:
                return new vn6[i];
            case 5:
                return new ts6[i];
            case 6:
                return new us6[i];
            case 7:
                return new vs6[i];
            case 8:
                return new ws6[i];
            case 9:
                return new n37[i];
            case 10:
                return new u37[i];
            case 11:
                return new v37[i];
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new ee7[i];
            case 13:
                return new vh7[i];
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new ni7[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new oi7[i];
            case 16:
                return new pi7[i];
            case LangUtils.HASH_SEED /* 17 */:
                return new qi7[i];
            case 18:
                return new ri7[i];
            case 19:
                return new si7[i];
            case 20:
                return new ti7[i];
            case 21:
                return new ui7[i];
            case 22:
                return new vi7[i];
            case 23:
                return new wi7[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new xi7[i];
            case 25:
                return new yi7[i];
            case 26:
                return new zi7[i];
            case 27:
                return new aj7[i];
            case 28:
                return new bj7[i];
            default:
                return new dj7[i];
        }
    }
}

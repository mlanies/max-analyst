package defpackage;

import android.media.MediaDescription;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class uk7 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ uk7(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new dl7(parcel);
            case 1:
                return new rp7(parcel);
            case 2:
                return new up7(parcel);
            case 3:
                return new zp7(parcel.readLong(), (Uri) parcel.readParcelable(zp7.class.getClassLoader()), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readInt(), parcel.readInt(), parcel.readLong(), (Uri) parcel.readParcelable(zp7.class.getClassLoader()));
            case 4:
                return new jr7(parcel);
            case 5:
                return new oy7(parcel);
            case 6:
                k18 k18Var = new k18(parcel);
                k18Var.a = ((Integer) parcel.readValue(k18.class.getClassLoader())).intValue();
                return k18Var;
            case 7:
                return new j38(parcel);
            case 8:
                return new k38(parcel);
            case 9:
                return new p68(parcel);
            case 10:
                ja8 ja8VarA = ja8.a(MediaDescription.CREATOR.createFromParcel(parcel));
                ja8VarA.getClass();
                return ja8VarA;
            case 11:
                return new hd8(parcel);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new yh8(parcel);
            case 13:
                zh8 zh8Var = new zh8();
                zh8Var.a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return zh8Var;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                Parcelable parcelable = parcel.readParcelable(null);
                parcelable.getClass();
                return new ai8(parcelable, null);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new dn8(parcel.readInt(), (jqe) parcel.readParcelable(dn8.class.getClassLoader()), jfd.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (hfd) parcel.readParcelable(dn8.class.getClassLoader()));
            case 16:
                return new go8(parcel.readLong(), ek2.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case LangUtils.HASH_SEED /* 17 */:
                return new du8(parcel);
            case 18:
                return new ew8(parcel);
            case 19:
                return new xw8(parcel);
            case 20:
                return new e99(parcel);
            case 21:
                return new f99(parcel);
            case 22:
                return new zb9(parcel);
            case 23:
                return new ac9(parcel);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return kc9.a(parcel.readInt(), parcel.readInt());
            case 25:
                return new uc9(parcel);
            case 26:
                return new vc9(parcel);
            case 27:
                return new ae9(parcel);
            case 28:
                return new be9(parcel);
            default:
                return new rk9(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new dl7[i];
            case 1:
                return new rp7[i];
            case 2:
                return new up7[i];
            case 3:
                return new zp7[i];
            case 4:
                return new jr7[i];
            case 5:
                return new oy7[i];
            case 6:
                return new k18[i];
            case 7:
                return new j38[i];
            case 8:
                return new k38[i];
            case 9:
                return new p68[i];
            case 10:
                return new ja8[i];
            case 11:
                return new hd8[i];
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new yh8[i];
            case 13:
                return new zh8[i];
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new ai8[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new dn8[i];
            case 16:
                return new go8[i];
            case LangUtils.HASH_SEED /* 17 */:
                return new du8[i];
            case 18:
                return new ew8[i];
            case 19:
                return new xw8[i];
            case 20:
                return new e99[i];
            case 21:
                return new f99[i];
            case 22:
                return new zb9[i];
            case 23:
                return new ac9[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new kc9[i];
            case 25:
                return new uc9[i];
            case 26:
                return new vc9[i];
            case 27:
                return new ae9[i];
            case 28:
                return new be9[i];
            default:
                return new rk9[i];
        }
    }
}

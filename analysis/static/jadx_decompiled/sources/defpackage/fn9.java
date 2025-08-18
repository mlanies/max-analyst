package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class fn9 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ fn9(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                gn9 gn9Var = new gn9(parcel);
                gn9Var.a = parcel.readInt();
                return gn9Var;
            case 1:
                return new qo9(parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
            case 2:
                return new e4a(parcel);
            case 3:
                return new eaa(parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            case 4:
                return new dia(parcel.readInt());
            case 5:
                return new eia(dia.CREATOR.createFromParcel(parcel).a, parcel.readInt(), parcel.readInt());
            case 6:
                oia oiaVar = (oia) parcel.readParcelable(uia.class.getClassLoader());
                Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
                return new uia(oiaVar, (CharSequence) creator.createFromParcel(parcel), (CharSequence) creator.createFromParcel(parcel), (tia) parcel.readParcelable(uia.class.getClassLoader()), eia.CREATOR.createFromParcel(parcel), (iia) parcel.readParcelable(uia.class.getClassLoader()));
            case 7:
                parcel.readInt();
                return fia.b;
            case 8:
                parcel.readInt();
                return gia.b;
            case 9:
                parcel.readInt();
                return hia.b;
            case 10:
                return new jia(parcel.readInt(), parcel.readInt());
            case 11:
                return new kia(parcel.readInt());
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                parcel.readInt();
                return lia.a;
            case 13:
                return new mia(parcel.readInt());
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                parcel.readInt();
                return nia.a;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                parcel.readInt();
                return pia.a;
            case 16:
                parcel.readInt();
                return qia.a;
            case LangUtils.HASH_SEED /* 17 */:
                parcel.readInt();
                return ria.a;
            case 18:
                return new sia((jqe) parcel.readParcelable(sia.class.getClassLoader()));
            case 19:
                return new ParcelImpl(parcel);
            case 20:
                return new upa(parcel);
            case 21:
                return new vsa(parcel.readString(), parcel.createStringArray(), parcel.readInt());
            case 22:
                return new awa((Uri) parcel.readParcelable(Uri.class.getClassLoader()), (Uri) parcel.readParcelable(Uri.class.getClassLoader()), (nz3) parcel.readParcelable(nz3.class.getClassLoader()), (ov4) parcel.readParcelable(ov4.class.getClassLoader()), (Uri) parcel.readParcelable(Uri.class.getClassLoader()));
            case 23:
                return new cwa(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new rza(parcel);
            case 25:
                return new sza(parcel);
            case 26:
                return new i3b(parcel);
            case 27:
                return new h3b(parcel);
            case 28:
                return new x7b(parcel);
            default:
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(Integer.valueOf(parcel.readInt()), parcel.readString());
                }
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(qo9.CREATOR.createFromParcel(parcel));
                }
                return new e8b(linkedHashMap, arrayList, parcel.readInt() == 0 ? null : qo9.CREATOR.createFromParcel(parcel));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new gn9[i];
            case 1:
                return new qo9[i];
            case 2:
                return new e4a[i];
            case 3:
                return new eaa[i];
            case 4:
                return new dia[i];
            case 5:
                return new eia[i];
            case 6:
                return new uia[i];
            case 7:
                return new fia[i];
            case 8:
                return new gia[i];
            case 9:
                return new hia[i];
            case 10:
                return new jia[i];
            case 11:
                return new kia[i];
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new lia[i];
            case 13:
                return new mia[i];
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new nia[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new pia[i];
            case 16:
                return new qia[i];
            case LangUtils.HASH_SEED /* 17 */:
                return new ria[i];
            case 18:
                return new sia[i];
            case 19:
                return new ParcelImpl[i];
            case 20:
                return new upa[i];
            case 21:
                return new vsa[i];
            case 22:
                return new awa[i];
            case 23:
                return new cwa[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new rza[i];
            case 25:
                return new sza[i];
            case 26:
                return new i3b[i];
            case 27:
                return new h3b[i];
            case 28:
                return new x7b[i];
            default:
                return new e8b[i];
        }
    }
}

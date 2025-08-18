package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import java.util.ArrayList;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.util.share.ShareData;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class e9b implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ e9b(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        switch (this.a) {
            case 0:
                return new f9b(parcel);
            case 1:
                return new g9b(parcel);
            case 2:
                return new i9b(parcel);
            case 3:
                return new j9b(parcel);
            case 4:
                return hdb.valueOf(parcel.readString());
            case 5:
                return rdb.valueOf(parcel.readString());
            case 6:
                return qeb.valueOf(parcel.readString());
            case 7:
                return reb.valueOf(parcel.readString());
            case 8:
                return new bqb(parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), parcel.readString(), parcel.readLong(), rl2.CREATOR.createFromParcel(parcel));
            case 9:
                return new qqb(new nqb(mqb.values()[parcel.readInt()], parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), Byte.valueOf(parcel.readByte()).equals(1)));
            case 10:
                return new h5c(parcel.readInt(), parcel.readFloat());
            case 11:
                return new afc(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                int iD0 = br7.d0(parcel);
                Bundle bundleN = null;
                while (parcel.dataPosition() < iD0) {
                    int i2 = parcel.readInt();
                    if (((char) i2) != 2) {
                        br7.X(parcel, i2);
                    } else {
                        bundleN = br7.n(parcel, i2);
                    }
                }
                br7.s(parcel, iD0);
                return new wfc(bundleN);
            case 13:
                return new zhc(parcel.readInt());
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                int i3 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList5.add(Long.valueOf(parcel.readLong()));
                }
                int i5 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList6.add(parcel.readBundle(boc.class.getClassLoader()));
                }
                int i7 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList7.add(Long.valueOf(parcel.readLong()));
                }
                return new boc(arrayList5, arrayList6, arrayList7, parcel.readInt());
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new itc(parcel.readParcelable(itc.class.getClassLoader()));
            case 16:
                return new jtc(m34.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readParcelable(jtc.class.getClassLoader()));
            case LangUtils.HASH_SEED /* 17 */:
                return new suc(parcel.readString());
            case 18:
                return new ozc((ForegroundColorSpan) parcel.readParcelable(ozc.class.getClassLoader()), (BackgroundColorSpan) parcel.readParcelable(ozc.class.getClassLoader()));
            case 19:
                return new q4d(zp7.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (Uri) parcel.readParcelable(q4d.class.getClassLoader()), (Uri) parcel.readParcelable(q4d.class.getClassLoader()), parcel.readString(), (RectF) parcel.readParcelable(q4d.class.getClassLoader()), (Rect) parcel.readParcelable(q4d.class.getClassLoader()), (Uri) parcel.readParcelable(q4d.class.getClassLoader()));
            case 20:
                int i9 = parcel.readInt();
                jqe jqeVar = (jqe) parcel.readParcelable(fed.class.getClassLoader());
                String string = parcel.readString();
                if (string == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string.equals("LINK")) {
                    i = 1;
                } else {
                    if (!string.equals("NEUTRAL")) {
                        throw new IllegalArgumentException("No enum constant one.me.settings.SettingsAvatarBottomSheet.Button.Type.".concat(string));
                    }
                    i = 2;
                }
                return new fed(i9, i, jqeVar);
            case 21:
                parcel.readInt();
                return cfd.a;
            case 22:
                return new dfd((jqe) parcel.readParcelable(dfd.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case 23:
                return new efd(parcel.readInt() != 0, parcel.readInt() != 0);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new ffd(parcel.readInt() != 0, parcel.readInt() != 0);
            case 25:
                return new gfd((jqe) parcel.readParcelable(gfd.class.getClassLoader()));
            case 26:
                int i10 = parcel.readInt();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i11 = parcel.readInt();
                    arrayList = new ArrayList(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        arrayList.add(parcel.readParcelable(ShareData.class.getClassLoader()));
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int i13 = parcel.readInt();
                    arrayList2 = new ArrayList(i13);
                    for (int i14 = 0; i14 != i13; i14++) {
                        arrayList2.add(parcel.readParcelable(ShareData.class.getClassLoader()));
                    }
                }
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList3 = null;
                } else {
                    int i15 = parcel.readInt();
                    arrayList3 = new ArrayList(i15);
                    for (int i16 = 0; i16 != i15; i16++) {
                        arrayList3.add(parcel.readParcelable(ShareData.class.getClassLoader()));
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList4 = null;
                } else {
                    int i17 = parcel.readInt();
                    arrayList4 = new ArrayList(i17);
                    for (int i18 = 0; i18 != i17; i18++) {
                        arrayList4.add(parcel.readParcelable(ShareData.class.getClassLoader()));
                    }
                }
                return new ShareData(i10, arrayList, arrayList2, string2, arrayList3, arrayList4, parcel.readString());
            case 27:
                ArrayList arrayList8 = new ArrayList();
                parcel.readList(arrayList8, ftd.class.getClassLoader());
                return new htd(arrayList8);
            case 28:
                ArrayList arrayList9 = new ArrayList();
                parcel.readList(arrayList9, gtd.class.getClassLoader());
                return new itd(arrayList9);
            default:
                return new ftd(parcel.readLong(), parcel.readLong(), parcel.readInt());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new f9b[i];
            case 1:
                return new g9b[i];
            case 2:
                return new i9b[i];
            case 3:
                return new j9b[i];
            case 4:
                return new hdb[i];
            case 5:
                return new rdb[i];
            case 6:
                return new qeb[i];
            case 7:
                return new reb[i];
            case 8:
                return new bqb[i];
            case 9:
                return new qqb[i];
            case 10:
                return new h5c[i];
            case 11:
                return new afc[i];
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new wfc[i];
            case 13:
                return new zhc[i];
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new boc[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new itc[i];
            case 16:
                return new jtc[i];
            case LangUtils.HASH_SEED /* 17 */:
                return new suc[i];
            case 18:
                return new ozc[i];
            case 19:
                return new q4d[i];
            case 20:
                return new fed[i];
            case 21:
                return new cfd[i];
            case 22:
                return new dfd[i];
            case 23:
                return new efd[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new ffd[i];
            case 25:
                return new gfd[i];
            case 26:
                return new ShareData[i];
            case 27:
                return new htd[i];
            case 28:
                return new itd[i];
            default:
                return new ftd[i];
        }
    }
}

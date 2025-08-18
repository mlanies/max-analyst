package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class etd implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ etd(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new gtd(parcel.readLong(), parcel.readLong(), parcel.readInt());
            case 1:
                return new dud(parcel);
            case 2:
                return new eud(parcel);
            case 3:
                return new zvd(parcel);
            case 4:
                return new awd(parcel);
            case 5:
                return new bwd();
            case 6:
                return new cwd();
            case 7:
                return new hwd(parcel);
            case 8:
                return new iwd(parcel);
            case 9:
                oxd oxdVar = new oxd();
                oxdVar.a = parcel.readInt();
                oxdVar.b = parcel.readInt();
                oxdVar.o = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    int[] iArr = new int[i];
                    oxdVar.c = iArr;
                    parcel.readIntArray(iArr);
                }
                return oxdVar;
            case 10:
                pxd pxdVar = new pxd();
                pxdVar.a = parcel.readInt();
                pxdVar.b = parcel.readInt();
                int i2 = parcel.readInt();
                pxdVar.c = i2;
                if (i2 > 0) {
                    int[] iArr2 = new int[i2];
                    pxdVar.o = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i3 = parcel.readInt();
                pxdVar.X = i3;
                if (i3 > 0) {
                    int[] iArr3 = new int[i3];
                    pxdVar.Y = iArr3;
                    parcel.readIntArray(iArr3);
                }
                pxdVar.s0 = parcel.readInt() == 1;
                pxdVar.t0 = parcel.readInt() == 1;
                pxdVar.u0 = parcel.readInt() == 1;
                pxdVar.Z = parcel.readArrayList(oxd.class.getClassLoader());
                return pxdVar;
            case 11:
                return pyd.valueOf(parcel.readString());
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new w8e(parcel);
            case 13:
                return new x8e(parcel);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                SparseArray sparseArray = new SparseArray();
                int i4 = parcel.readInt();
                for (int i5 = 0; i5 < i4; i5++) {
                    sparseArray.put(parcel.readInt(), parcel.readString());
                }
                return new t9e(sparseArray);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new ipe(parcel);
            case 16:
                String string = parcel.readString();
                string.getClass();
                String string2 = parcel.readString();
                String[] strArrCreateStringArray = parcel.createStringArray();
                strArrCreateStringArray.getClass();
                return new jpe(string, string2, zw6.k(strArrCreateStringArray));
            case LangUtils.HASH_SEED /* 17 */:
                return new qte(parcel.readInt());
            case 18:
                return new xte(parcel.readLong(), parcel.readLong());
            case 19:
                return new yte(parcel.readLong(), parcel.readLong());
            case 20:
                return new mze(parcel);
            case 21:
                return new lze(parcel);
            case 22:
                return new h9f(parcel);
            case 23:
                return new i9f(parcel);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                parcel.readInt();
                return zdf.a;
            case 25:
                return new aef(xdf.valueOf(parcel.readString()));
            case 26:
                parcel.readInt();
                return mkf.a;
            case 27:
                return new nkf(mqb.valueOf(parcel.readString()));
            case 28:
                return new wqf(parcel);
            default:
                return new xqf(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new gtd[i];
            case 1:
                return new dud[i];
            case 2:
                return new eud[i];
            case 3:
                return new zvd[i];
            case 4:
                return new awd[i];
            case 5:
                return new bwd[i];
            case 6:
                return new cwd[i];
            case 7:
                return new hwd[i];
            case 8:
                return new iwd[i];
            case 9:
                return new oxd[i];
            case 10:
                return new pxd[i];
            case 11:
                return new pyd[i];
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new w8e[i];
            case 13:
                return new x8e[i];
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new t9e[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new ipe[i];
            case 16:
                return new jpe[i];
            case LangUtils.HASH_SEED /* 17 */:
                return new qte[i];
            case 18:
                return new xte[i];
            case 19:
                return new yte[i];
            case 20:
                return new mze[i];
            case 21:
                return new lze[i];
            case 22:
                return new h9f[i];
            case 23:
                return new i9f[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new zdf[i];
            case 25:
                return new aef[i];
            case 26:
                return new mkf[i];
            case 27:
                return new nkf[i];
            case 28:
                return new wqf[i];
            default:
                return new xqf[i];
        }
    }
}

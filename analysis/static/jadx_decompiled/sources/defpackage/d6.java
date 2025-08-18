package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Locale;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class d6 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ d6(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new e6(parcel);
            case 1:
                return new d8(parcel);
            case 2:
                return new w9(parcel.readInt(), parcel.readInt(), parcel.readString());
            case 3:
                return new tl(parcel);
            case 4:
                return new ul(parcel);
            case 5:
                zn znVar = new zn(parcel);
                znVar.a = parcel.readByte() != 0;
                return znVar;
            case 6:
                String string = parcel.readString();
                string.getClass();
                return new uo(parcel.readInt(), string);
            case 7:
                String string2 = parcel.readString();
                string2.getClass();
                return new vo(parcel.readInt(), string2);
            case 8:
                return new ie0(parcel);
            case 9:
                return new je0(parcel);
            case 10:
                cg0 cg0Var = new cg0();
                cg0Var.t0 = 255;
                cg0Var.v0 = -2;
                cg0Var.w0 = -2;
                cg0Var.x0 = -2;
                cg0Var.E0 = Boolean.TRUE;
                cg0Var.a = parcel.readInt();
                cg0Var.b = (Integer) parcel.readSerializable();
                cg0Var.c = (Integer) parcel.readSerializable();
                cg0Var.o = (Integer) parcel.readSerializable();
                cg0Var.X = (Integer) parcel.readSerializable();
                cg0Var.Y = (Integer) parcel.readSerializable();
                cg0Var.Z = (Integer) parcel.readSerializable();
                cg0Var.s0 = (Integer) parcel.readSerializable();
                cg0Var.t0 = parcel.readInt();
                cg0Var.u0 = parcel.readString();
                cg0Var.v0 = parcel.readInt();
                cg0Var.w0 = parcel.readInt();
                cg0Var.x0 = parcel.readInt();
                cg0Var.z0 = parcel.readString();
                cg0Var.A0 = parcel.readString();
                cg0Var.B0 = parcel.readInt();
                cg0Var.D0 = (Integer) parcel.readSerializable();
                cg0Var.F0 = (Integer) parcel.readSerializable();
                cg0Var.G0 = (Integer) parcel.readSerializable();
                cg0Var.H0 = (Integer) parcel.readSerializable();
                cg0Var.I0 = (Integer) parcel.readSerializable();
                cg0Var.J0 = (Integer) parcel.readSerializable();
                cg0Var.K0 = (Integer) parcel.readSerializable();
                cg0Var.N0 = (Integer) parcel.readSerializable();
                cg0Var.L0 = (Integer) parcel.readSerializable();
                cg0Var.M0 = (Integer) parcel.readSerializable();
                cg0Var.E0 = (Boolean) parcel.readSerializable();
                cg0Var.y0 = (Locale) parcel.readSerializable();
                cg0Var.O0 = (Boolean) parcel.readSerializable();
                return cg0Var;
            case 11:
                bk0 bk0Var = new bk0(parcel);
                bk0Var.a = parcel.readFloat();
                bk0Var.b = parcel.readFloat();
                ArrayList arrayList = new ArrayList();
                bk0Var.c = arrayList;
                parcel.readList(arrayList, Float.class.getClassLoader());
                bk0Var.o = parcel.readFloat();
                bk0Var.X = parcel.createBooleanArray()[0];
                return bk0Var;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new em0(parcel);
            case 13:
                return new fm0(parcel);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new tx0((kc9) parcel.readParcelable(kc9.class.getClassLoader()), (kc9) parcel.readParcelable(kc9.class.getClassLoader()), (v34) parcel.readParcelable(v34.class.getClassLoader()), (kc9) parcel.readParcelable(kc9.class.getClassLoader()), parcel.readInt());
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new gg1(parcel.readLong(), parcel.readInt());
            case 16:
                return new r22((up7) parcel.readParcelable(r22.class.getClassLoader()), (Uri) parcel.readParcelable(r22.class.getClassLoader()));
            case LangUtils.HASH_SEED /* 17 */:
                return new s22((up7) parcel.readParcelable(s22.class.getClassLoader()), (Uri) parcel.readParcelable(s22.class.getClassLoader()));
            case 18:
                return new t22((up7) parcel.readParcelable(t22.class.getClassLoader()), parcel.readString());
            case 19:
                return new l42(parcel);
            case 20:
                return new m42(parcel);
            case 21:
                return new n42(parcel);
            case 22:
                return new o42(parcel);
            case 23:
                return o92.valueOf(parcel.readString());
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return ih2.valueOf(parcel.readString());
            case 25:
                return kl2.valueOf(parcel.readString());
            case 26:
                return rl2.valueOf(parcel.readString());
            case 27:
                return new t43(parcel.readInt());
            case 28:
                return new e73(parcel);
            default:
                return new g73(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new e6[i];
            case 1:
                return new d8[i];
            case 2:
                return new w9[i];
            case 3:
                return new tl[i];
            case 4:
                return new ul[i];
            case 5:
                return new zn[i];
            case 6:
                return new uo[i];
            case 7:
                return new vo[i];
            case 8:
                return new ie0[i];
            case 9:
                return new je0[i];
            case 10:
                return new cg0[i];
            case 11:
                return new bk0[i];
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new em0[i];
            case 13:
                return new fm0[i];
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new tx0[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new gg1[i];
            case 16:
                return new r22[i];
            case LangUtils.HASH_SEED /* 17 */:
                return new s22[i];
            case 18:
                return new t22[i];
            case 19:
                return new l42[i];
            case 20:
                return new m42[i];
            case 21:
                return new n42[i];
            case 22:
                return new o42[i];
            case 23:
                return new o92[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new ih2[i];
            case 25:
                return new kl2[i];
            case 26:
                return new rl2[i];
            case 27:
                return new t43[i];
            case 28:
                return new e73[i];
            default:
                return new g73[i];
        }
    }
}

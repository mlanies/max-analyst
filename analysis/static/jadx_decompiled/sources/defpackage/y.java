package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class y implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return z.b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new bm(parcel, null);
            case 2:
                return new dr0(parcel, (ClassLoader) null);
            case 3:
                return new b03(parcel, null);
            case 4:
                return new tw3(parcel, null);
            case 5:
                return new x06(parcel, null);
            case 6:
                return new c18(parcel, null);
            case 7:
                return new xdc(parcel, null);
            case 8:
                return new m0d(parcel, null);
            case 9:
                return new god(parcel, (ClassLoader) null);
            case 10:
                return new npe(parcel, null);
            case 11:
                return new lwe(parcel, null);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new hof(parcel, null);
            default:
                sof sofVar = new sof(parcel, null);
                sofVar.a = parcel.readInt();
                sofVar.b = parcel.readInt();
                sofVar.c = parcel.readParcelable(null);
                return sofVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new z[i];
            case 1:
                return new bm[i];
            case 2:
                return new dr0[i];
            case 3:
                return new b03[i];
            case 4:
                return new tw3[i];
            case 5:
                return new x06[i];
            case 6:
                return new c18[i];
            case 7:
                return new xdc[i];
            case 8:
                return new m0d[i];
            case 9:
                return new god[i];
            case 10:
                return new npe[i];
            case 11:
                return new lwe[i];
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new hof[i];
            default:
                return new sof[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return z.b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new bm(parcel, classLoader);
            case 2:
                return new dr0(parcel, classLoader);
            case 3:
                return new b03(parcel, classLoader);
            case 4:
                return new tw3(parcel, classLoader);
            case 5:
                return new x06(parcel, classLoader);
            case 6:
                return new c18(parcel, classLoader);
            case 7:
                return new xdc(parcel, classLoader);
            case 8:
                return new m0d(parcel, classLoader);
            case 9:
                return new god(parcel, classLoader);
            case 10:
                return new npe(parcel, classLoader);
            case 11:
                return new lwe(parcel, classLoader);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new hof(parcel, classLoader);
            default:
                sof sofVar = new sof(parcel, classLoader);
                sofVar.a = parcel.readInt();
                sofVar.b = parcel.readInt();
                sofVar.c = parcel.readParcelable(classLoader);
                return sofVar;
        }
    }
}

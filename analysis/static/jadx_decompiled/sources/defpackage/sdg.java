package defpackage;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class sdg extends idg implements eeg {
    @Override // defpackage.idg
    public final boolean G0(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                rdg.b(parcel);
                break;
            case 4:
                rdg.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                rdg.b(parcel);
                break;
            case 7:
                rdg.b(parcel);
                break;
            case 8:
                qeg qegVar = (qeg) rdg.a(parcel, qeg.CREATOR);
                rdg.b(parcel);
                xdg xdgVar = (xdg) this;
                xdgVar.e.post(new i76((Object) xdgVar, (Object) qegVar, false, 29));
                break;
            case 9:
                rdg.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}

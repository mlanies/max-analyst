package defpackage;

import android.os.Parcel;

/* loaded from: classes2.dex */
public final class frf implements ofc {
    public final Object a;

    public /* synthetic */ frf(Object obj) {
        this.a = obj;
    }

    public void a(String str) {
        hrf hrfVar = ((grf) this.a).b;
        hrfVar.getClass();
        hrfVar.q.o("handleWebSocketClosed, reason=" + str);
        hrfVar.d();
    }

    @Override // defpackage.ofc
    public void accept(Object obj, Object obj2) {
        qne qneVar = (qne) obj2;
        bhg bhgVar = (bhg) obj;
        qr7 qr7Var = (qr7) this.a;
        fp3.g("locationSettingsRequest can't be null", qr7Var != null);
        nkg nkgVar = (nkg) bhgVar.o();
        xgg xggVar = new xgg(0, qneVar);
        Parcel parcelG0 = nkgVar.G0();
        zfg.b(parcelG0, qr7Var);
        parcelG0.writeStrongBinder(xggVar);
        parcelG0.writeString(null);
        nkgVar.H0(parcelG0, 63);
    }

    public void b() {
        hrf hrfVar = ((grf) this.a).b;
        hrfVar.q.o("handleWebSocketOpen");
        hrfVar.n.onConnected();
        sy4 sy4Var = hrfVar.m;
        if (sy4Var != null) {
            synchronized (((rod) sy4Var.b).f) {
                try {
                    rod rodVar = (rod) sy4Var.b;
                    if (rodVar.q) {
                        rodVar.t = rodVar.s;
                    }
                } finally {
                }
            }
        }
    }
}

package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class sbd extends gle {
    public String c;

    public sbd(gy8 gy8Var) {
        super(gy8Var);
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        if (str.equals(ApiProtocol.KEY_TOKEN)) {
            this.c = gy8Var.z0();
        } else {
            gy8Var.z();
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return zr6.i("{token='", oag.x(this.c), "'}");
    }
}

package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class r26 extends o26 {
    public final iv6 f;
    public final ti4 g;
    public lp7 h;
    public rfc i;

    public r26(hle hleVar, o45 o45Var, iv6 iv6Var, ti4 ti4Var) {
        super(hleVar, o45Var);
        this.f = iv6Var;
        this.g = ti4Var;
    }

    @Override // defpackage.o26
    public final void a(fef fefVar, int i, int i2) {
        super.a(fefVar, i, i2);
        Uri uriL = ((ok0) fefVar).l();
        int i3 = maf.a;
        String scheme = uriL.getScheme();
        boolean z = TextUtils.isEmpty(scheme) || "file".equals(scheme);
        o45 o45Var = this.b;
        hle hleVar = this.a;
        if (z) {
            if (this.h == null) {
                this.h = new lp7(hleVar, o45Var, this.g);
            }
            this.h.a(fefVar, i, i2);
        } else {
            if (this.i == null) {
                this.i = new rfc(hleVar, o45Var, this.f);
            }
            this.i.a(fefVar, i, i2);
        }
    }

    public final boolean b() {
        fef fefVar = this.e;
        if (fefVar == null) {
            hm9.p("r26", "You should call setVideoContent before prepare!", null);
            return false;
        }
        Uri uriL = ((ok0) fefVar).l();
        int i = maf.a;
        String scheme = uriL.getScheme();
        return (TextUtils.isEmpty(scheme) || "file".equals(scheme)) ? this.h.b() : this.i.b();
    }
}

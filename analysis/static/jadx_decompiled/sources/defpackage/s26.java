package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class s26 implements p26 {
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public pp7 j;
    public sfc k;
    public m26 a = m26.d;
    public final String b = s26.class.getName();
    public final khe f = new khe(new es3(20, this));
    public final int g = tu0.G(120 * fk4.d().getDisplayMetrics().density);
    public final int h = tu0.G(146 * fk4.d().getDisplayMetrics().density);
    public final int[] i = new int[2];

    public s26(je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.c = je7Var2;
        this.d = je7Var3;
        this.e = je7Var;
    }

    @Override // defpackage.p26
    public final m26 c() {
        return this.a;
    }

    @Override // defpackage.p26
    public final boolean d() {
        gef gefVar = this.a.a;
        if (gefVar == null) {
            hm9.p(this.b, "You should call init before prepare!", null);
            return false;
        }
        Uri uriL = gefVar.l();
        int i = oaf.a;
        String scheme = uriL.getScheme();
        if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
            pp7 pp7Var = this.j;
            if (pp7Var == null || !pp7Var.d()) {
                return false;
            }
        } else {
            sfc sfcVar = this.k;
            if (sfcVar == null || !sfcVar.d()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.p26
    public final Object e(long j, Continuation continuation) {
        gef gefVar = this.a.a;
        if (gefVar == null) {
            hm9.p(this.b, "You should call setVideoContent before extractFrame!", null);
            return null;
        }
        Uri uriL = gefVar.l();
        int i = oaf.a;
        String scheme = uriL.getScheme();
        if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
            pp7 pp7Var = this.j;
            if (pp7Var != null) {
                return pp7Var.e(j, continuation);
            }
        } else {
            sfc sfcVar = this.k;
            if (sfcVar != null) {
                return sfcVar.e(j, continuation);
            }
        }
        return null;
    }

    @Override // defpackage.p26
    public final void f(m26 m26Var) {
        gef gefVar;
        if (m26Var.equals(this.a) || (gefVar = m26Var.a) == null) {
            return;
        }
        if (m26Var.b == 0 || m26Var.c == 0) {
            int width = gefVar.getWidth();
            int height = gefVar.getHeight();
            int[] iArr = this.i;
            int i = this.g;
            if (width <= 0 || height <= 0) {
                iArr[0] = i;
                iArr[1] = i;
            } else if (width < height) {
                hm9.z(i, i, width, height, iArr);
            } else {
                int i2 = this.h;
                hm9.z(i2, i2, width, height, iArr);
            }
            this.a = new m26(gefVar, iArr[0], iArr[1]);
        } else {
            this.a = m26Var;
        }
        Uri uriL = gefVar.l();
        int i3 = oaf.a;
        String scheme = uriL.getScheme();
        if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
            if (this.j == null) {
                this.j = new pp7((kke) this.d.getValue(), (gta) this.c.getValue());
            }
            pp7 pp7Var = this.j;
            if (pp7Var != null) {
                pp7Var.a = this.a;
                return;
            }
            return;
        }
        if (this.k == null) {
            this.k = new sfc((iv6) this.f.getValue());
        }
        sfc sfcVar = this.k;
        if (sfcVar != null) {
            sfcVar.c = this.a;
        }
    }

    @Override // defpackage.p26
    public final void prepare() throws NumberFormatException {
        gef gefVar = this.a.a;
        String str = this.b;
        if (gefVar == null) {
            hm9.p(str, "You should call init before prepare!", null);
            return;
        }
        if (!d()) {
            hm9.m0(str, "Can't extract video frame", new Object[0]);
            return;
        }
        Uri uriL = gefVar.l();
        int i = oaf.a;
        String scheme = uriL.getScheme();
        if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
            pp7 pp7Var = this.j;
            if (pp7Var != null) {
                pp7Var.prepare();
                return;
            }
            return;
        }
        sfc sfcVar = this.k;
        if (sfcVar != null) {
            sfcVar.prepare();
        }
    }
}

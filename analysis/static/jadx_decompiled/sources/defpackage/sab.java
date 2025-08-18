package defpackage;

import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class sab extends ol implements lme, hua {
    public final String X;
    public final String Y;
    public final long Z;
    public final String o;
    public final a20 s0;
    public final String t0;
    public final String u0;
    public final int v0;

    public sab(long j, String str, String str2, String str3, long j2, a20 a20Var, String str4, String str5, int i) {
        super(j);
        this.o = str;
        this.X = str2;
        this.Y = str3;
        this.Z = j2;
        this.s0 = a20Var;
        this.t0 = str4;
        this.u0 = str5;
        this.v0 = i;
    }

    @Override // defpackage.hua
    public final int c() {
        return 1;
    }

    @Override // defpackage.hua
    public final void d() {
        t().d(this.a);
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        wcb wcbVar = (wcb) gleVar;
        ((p7b) r()).a.m("user.deviceAvatarPath", null);
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        ((blb) plVar.W.getValue()).b(wcbVar.c);
        av0 av0VarL = l();
        wm3 wm3Var = wcbVar.c.a;
        long j = this.a;
        av0VarL.c(new bhb(j, wm3Var));
        wm3 wm3Var2 = wcbVar.c.a;
        Long lValueOf = wm3Var2 != null ? Long.valueOf(wm3Var2.Y) : null;
        if (this.Z == 0 || lValueOf == null) {
            return;
        }
        l().c(new vab(j, lValueOf.longValue()));
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.Profile profile = new Tasks.Profile();
        profile.requestId = this.a;
        profile.photoId = this.Z;
        String str = this.o;
        if (str != null && str.length() != 0) {
            profile.firstName = str;
        }
        String str2 = this.X;
        if (str2 != null && str2.length() != 0) {
            profile.lastName = str2;
        }
        String str3 = this.Y;
        if (str3 != null && str3.length() != 0) {
            profile.photoToken = str3;
        }
        String str4 = this.t0;
        if (str4 != null && str4.length() != 0) {
            profile.description = str4;
        }
        String str5 = this.u0;
        if (str5 != null && str5.length() != 0) {
            profile.link = str5;
        }
        int i = this.v0;
        if (au1.e(i).length() != 0) {
            profile.avatarType = au1.e(i);
        }
        a20 a20Var = this.s0;
        if (a20Var != null) {
            Tasks.Rect rect = new Tasks.Rect();
            rect.left = a20Var.b;
            rect.top = a20Var.c;
            rect.right = a20Var.d;
            rect.bottom = a20Var.e;
            profile.crop = rect;
        }
        return qw8.toByteArray(profile);
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        if (!f46.U(pkeVar.b)) {
            d();
        }
        l().c(new xgb(pkeVar));
    }

    @Override // defpackage.hua
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.hua
    public final iua getType() {
        return iua.X;
    }

    @Override // defpackage.ol
    public final dle i() {
        String str = this.u0;
        return new gs9(this.v0, this.Z, this.s0, this.o, this.X, this.Y, this.t0, str);
    }
}

package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.video.fetcher.FetcherException;

/* loaded from: classes2.dex */
public final class dlf {
    public final Context b;
    public final ef7 c;
    public final gh3 d;
    public final jle e;
    public final ztc f;
    public final p7b g;
    public final pk h;
    public final fme i;
    public final ch3 j;
    public final av0 k;
    public final zi5 l;
    public final lff a = new lff();
    public final int m = 30;

    public dlf(Context context, gh3 gh3Var, ef7 ef7Var, hle hleVar, p7b p7bVar, pk pkVar, fme fmeVar, ch3 ch3Var, av0 av0Var, zi5 zi5Var) {
        this.b = context;
        this.d = gh3Var;
        this.c = ef7Var;
        jle jleVar = (jle) hleVar;
        this.f = jleVar.a();
        this.e = jleVar;
        this.g = p7bVar;
        this.h = pkVar;
        this.i = fmeVar;
        this.j = ch3Var;
        this.k = av0Var;
        this.l = zi5Var;
    }

    public final boolean a(Throwable th) {
        int i = th instanceof FetcherException ? ((FetcherException) th).a : 0;
        if (i == 1 || i == 7 || i == 6 || i == 9) {
            return true;
        }
        return !this.d.f();
    }

    public final String b(l20 l20Var) {
        long j;
        boolean zP = s5c.P(l20Var);
        if (!l20Var.i()) {
            if (zP) {
                j = 0;
            }
            return null;
        }
        j = l20Var.d.a;
        String str = l20Var.s;
        if (oag.t(str)) {
            return null;
        }
        if (pag.k(new File(str))) {
            return str;
        }
        if (j == 0) {
            return null;
        }
        File fileS = ((kk5) this.l).s(j);
        if (pag.k(fileS)) {
            return fileS.getAbsolutePath();
        }
        return null;
    }

    public final uqd c(l20 l20Var, long j, long j2) {
        hm9.m("VideoRipper", "getVideoContent chatServerId=%d, messageServerId=%d", Long.valueOf(j), Long.valueOf(j2));
        k20 k20Var = s5c.P(l20Var) ? l20Var.j.d.d : l20Var.d;
        k28 k28Var = new k28(new clf(this, k20Var, l20Var));
        k20 k20Var2 = s5c.P(l20Var) ? l20Var.j.d.d : l20Var.d;
        uqd uqdVar = new uqd(new q1a(1, new xg4(this, l20Var, j, j2, k20Var2, 2)), new n2f(24), 0);
        long j3 = this.m;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ztc ztcVarA = muc.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(ztcVarA, "scheduler is null");
        return new ib3(k28Var, 1, new rqd(new rqd(new zrd(uqdVar, j3, timeUnit, ztcVarA), new clf(this, l20Var, k20Var2), 2), new ypc(this, 26, k20Var2), 1)).h(new gte(13, k20Var));
    }
}

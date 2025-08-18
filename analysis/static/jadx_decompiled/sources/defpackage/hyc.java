package defpackage;

import android.content.Context;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class hyc extends e3 implements q33 {
    public final kld h;
    public volatile g03 i;
    public cj4 j;
    public Locale k;

    public hyc(Context context, mi5 mi5Var) {
        super(context, "user.prefs", mi5Var);
        this.h = lld.a(1, 0, 1);
    }

    public final void A(long j) {
        l("app.reset.at.time", Long.valueOf(j));
    }

    public final void B(long j) {
        l("server.timeDelta", Long.valueOf(j));
    }

    public final void C(Long l) {
        l("user.Id", l);
        this.h.g(l);
    }

    @Override // defpackage.e3
    public synchronized void c() {
        super.c();
        this.i = null;
        this.h.g(Long.valueOf(t()));
    }

    public final long n() {
        return f("server.timeDelta", 0L) + System.currentTimeMillis();
    }

    public final synchronized long o() {
        try {
            if (this.i == null) {
                this.i = new g03(new gyc(this, 1), new bqc(2, this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.i.b + ((AtomicInteger) r0.c).getAndIncrement();
    }

    public final long p() {
        return f("user.chatsLastSync", 0L);
    }

    public final String q() {
        return this.g.getString("user.deviceAvatarPath", null);
    }

    public final String r() {
        return g("user.lang", "ru");
    }

    public final long s() {
        return this.g.getLong("user.stickersLastSync", 0L);
    }

    public final long t() {
        return f("user.Id", -1L);
    }

    public final zn5 u() {
        return new zn5(this.h, new vq5(new gyc(this, 0), null));
    }

    public final Locale v() {
        if (this.k == null) {
            this.k = new Locale(r());
        }
        return this.k;
    }

    public final void w(long j) {
        if (j > p()) {
            hm9.m(this.e, "setChatsLastSync %d", Long.valueOf(j));
            l("user.chatsLastSync", Long.valueOf(j));
        }
    }

    public final void x(long j) {
        l("app.first.login.time", Long.valueOf(j));
    }

    public final void y(boolean z) {
        j("app.forceConnection", z);
    }

    public final void z(long j) {
        l("app.last.login.time", Long.valueOf(j));
    }
}

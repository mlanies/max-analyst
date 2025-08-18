package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class t06 extends oue {
    public oue e;

    public t06(oue oueVar) {
        this.e = oueVar;
    }

    @Override // defpackage.oue
    public final oue a() {
        return this.e.a();
    }

    @Override // defpackage.oue
    public final oue b() {
        return this.e.b();
    }

    @Override // defpackage.oue
    public final long c() {
        return this.e.c();
    }

    @Override // defpackage.oue
    public final oue d(long j) {
        return this.e.d(j);
    }

    @Override // defpackage.oue
    public final boolean e() {
        return this.e.e();
    }

    @Override // defpackage.oue
    public final void f() throws InterruptedIOException {
        this.e.f();
    }

    @Override // defpackage.oue
    public final oue g(long j, TimeUnit timeUnit) {
        return this.e.g(j, timeUnit);
    }

    @Override // defpackage.oue
    public final long h() {
        return this.e.h();
    }
}

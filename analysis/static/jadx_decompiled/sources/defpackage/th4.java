package defpackage;

import android.net.Uri;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import javax.inject.Provider;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiScopeException;

/* loaded from: classes2.dex */
public final class th4 implements uk {
    public final /* synthetic */ int a;
    public final vk b;
    public final a95 c;
    public final Provider d;
    public volatile boolean e;
    public final Object f;
    public final Object g;

    public th4(up6 up6Var, ax axVar, rl rlVar, Provider provider) {
        this.a = 1;
        this.b = up6Var;
        this.c = axVar;
        this.f = rlVar;
        this.d = provider;
        this.g = new ReentrantLock();
    }

    @Override // defpackage.uk
    public final Object a(yk ykVar) throws ApiInvocationException {
        switch (this.a) {
            case 0:
                jxc jxcVarC = this.c.c();
                String str = jxcVarC.a.d;
                try {
                    if (this.e || str == null) {
                        synchronized (this.g) {
                            if (this.e || str == null) {
                                c(jxcVarC, str);
                            }
                        }
                    }
                    return ((up6) this.b).a(ykVar, this.c.c().a);
                } catch (ApiInvocationException e) {
                    if (ykVar.getScopeAfter() != ll.a || !a14.A(e)) {
                        throw e;
                    }
                    a95 a95Var = this.c;
                    jxc jxcVarC2 = a95Var.c();
                    c(jxcVarC2, jxcVarC2.a.d);
                    return ((up6) this.b).a(ykVar, a95Var.c().a);
                } catch (ApiScopeException unused) {
                    a95 a95Var2 = this.c;
                    jxc jxcVarC3 = a95Var2.c();
                    c(jxcVarC3, jxcVarC3.a.d);
                    return ((up6) this.b).a(ykVar, a95Var2.c().a);
                }
            default:
                jxc jxcVarC4 = this.c.c();
                String str2 = jxcVarC4.a.d;
                try {
                    ReentrantLock reentrantLock = (ReentrantLock) this.g;
                    reentrantLock.lock();
                    try {
                        if (this.e || str2 == null) {
                            b(jxcVarC4, str2);
                        }
                        reentrantLock.unlock();
                        return ((up6) this.b).a(ykVar, this.c.c().a);
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                } catch (ApiInvocationException e2) {
                    if (ykVar.getScopeAfter() != ll.a || !a14.A(e2)) {
                        throw e2;
                    }
                    a95 a95Var3 = this.c;
                    jxc jxcVarC5 = a95Var3.c();
                    b(jxcVarC5, jxcVarC5.a.d);
                    return ((up6) this.b).a(ykVar, a95Var3.c().a);
                } catch (ApiScopeException unused2) {
                    a95 a95Var4 = this.c;
                    jxc jxcVarC6 = a95Var4.c();
                    b(jxcVarC6, jxcVarC6.a.d);
                    return ((up6) this.b).a(ykVar, a95Var4.c().a);
                }
        }
    }

    public void b(jxc jxcVar, String str) {
        ReentrantLock reentrantLock = (ReentrantLock) this.g;
        reentrantLock.lock();
        try {
            if (tpa.f(str, this.c.c().a.d) || this.e) {
                ql qlVarD = ((rl) this.f).d();
                jxc jxcVarD = jxcVar.d(Uri.parse(qlVarD.b));
                this.c.d(jxcVarD);
                d(jxcVarD, qlVarD.a);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void c(jxc jxcVar, String str) {
        synchronized (this.g) {
            try {
                if (Objects.equals(str, this.c.c().a.d)) {
                    glc glcVar = new glc(new j80(((dwe) this.f).c(), (String) this.d.get()), eu7.g);
                    eu7 eu7Var = (eu7) ((up6) this.b).a(glcVar, jxcVar.a);
                    this.c.d(jxcVar.c(eu7Var.b, eu7Var.c));
                    this.e = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(jxc jxcVar, String str) {
        ReentrantLock reentrantLock = (ReentrantLock) this.g;
        reentrantLock.lock();
        try {
            glc glcVar = new glc(new j80(str, (String) this.d.get()), eu7.g);
            eu7 eu7Var = (eu7) ((up6) this.b).a(glcVar, jxcVar.a);
            this.c.d(jxcVar.c(eu7Var.b, eu7Var.c));
            this.e = false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public th4(up6 up6Var, jt3 jt3Var, dwe dweVar, Provider provider) {
        this.a = 0;
        this.g = new Object();
        this.e = false;
        this.b = up6Var;
        this.c = jt3Var;
        this.f = dweVar;
        this.d = provider;
    }
}

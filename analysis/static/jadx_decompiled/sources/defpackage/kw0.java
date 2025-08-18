package defpackage;

import com.google.android.exoplayer2.upstream.cache.Cache$CacheException;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class kw0 {
    public final /* synthetic */ int a = 1;
    public final long b;
    public final int c;
    public long d;
    public File e;
    public OutputStream f;
    public long g;
    public long h;
    public final Object i;
    public Object j;
    public BufferedOutputStream k;

    public kw0(hw0 hw0Var) {
        hw0Var.getClass();
        this.i = hw0Var;
        this.b = 5242880L;
        this.c = 20480;
    }

    public final void a() throws IOException {
        switch (this.a) {
            case 0:
                OutputStream outputStream = this.f;
                if (outputStream == null) {
                    return;
                }
                try {
                    outputStream.flush();
                    maf.h(this.f);
                    this.f = null;
                    File file = this.e;
                    this.e = null;
                    long j = this.g;
                    rpd rpdVar = (rpd) ((hw0) this.i);
                    synchronized (rpdVar) {
                        if (file.exists()) {
                            if (j == 0) {
                                file.delete();
                                return;
                            }
                            upd updVarB = upd.b(file, j, rpdVar.c);
                            updVarB.getClass();
                            lx0 lx0VarI = rpdVar.c.i(updVarB.a);
                            lx0VarI.getClass();
                            np8.f(lx0VarI.b(updVarB.b, updVarB.c));
                            long jA = ct3.a(lx0VarI.e);
                            if (jA != -1) {
                                np8.f(updVarB.b + updVarB.c <= jA);
                            }
                            rpdVar.getClass();
                            rpdVar.b(updVarB);
                            try {
                                rpdVar.c.n();
                                rpdVar.notifyAll();
                                return;
                            } catch (IOException e) {
                                throw new Cache$CacheException(e);
                            }
                        }
                        return;
                    }
                } catch (Throwable th) {
                    maf.h(this.f);
                    this.f = null;
                    File file2 = this.e;
                    this.e = null;
                    file2.delete();
                    throw th;
                }
            default:
                OutputStream outputStream2 = this.f;
                if (outputStream2 == null) {
                    return;
                }
                try {
                    outputStream2.flush();
                    oaf.h(this.f);
                    this.f = null;
                    File file3 = this.e;
                    this.e = null;
                    long j2 = this.g;
                    spd spdVar = (spd) ((gw0) this.i);
                    synchronized (spdVar) {
                        if (file3.exists()) {
                            if (j2 == 0) {
                                file3.delete();
                                return;
                            }
                            vpd vpdVarB = vpd.b(file3, j2, -9223372036854775807L, spdVar.c);
                            vpdVarB.getClass();
                            mx0 mx0VarH = spdVar.c.h(vpdVarB.a);
                            mx0VarH.getClass();
                            fm9.k(mx0VarH.c(vpdVarB.b, vpdVarB.c));
                            long jA2 = dt3.a(mx0VarH.e);
                            if (jA2 != -1) {
                                fm9.k(vpdVarB.b + vpdVarB.c <= jA2);
                            }
                            if (spdVar.d == null) {
                                spdVar.b(vpdVarB);
                                spdVar.c.o();
                                spdVar.notifyAll();
                                return;
                            }
                            try {
                                spdVar.d.x(vpdVarB.c, file3.getName(), vpdVarB.Y);
                                spdVar.b(vpdVarB);
                                try {
                                    spdVar.c.o();
                                    spdVar.notifyAll();
                                    return;
                                } catch (IOException e2) {
                                    throw new androidx.media3.datasource.cache.Cache$CacheException(e2);
                                }
                            } catch (IOException e3) {
                                throw new androidx.media3.datasource.cache.Cache$CacheException(e3);
                            }
                        }
                        return;
                    }
                } catch (Throwable th2) {
                    oaf.h(this.f);
                    this.f = null;
                    File file4 = this.e;
                    this.e = null;
                    file4.delete();
                    throw th2;
                }
        }
    }

    public void b(z24 z24Var) {
        File fileC;
        long j = z24Var.g;
        long jMin = j == -1 ? -1L : Math.min(j - this.h, this.d);
        hw0 hw0Var = (hw0) this.i;
        String str = z24Var.h;
        int i = maf.a;
        long j2 = z24Var.f + this.h;
        rpd rpdVar = (rpd) hw0Var;
        synchronized (rpdVar) {
            try {
                rpdVar.d();
                lx0 lx0VarI = rpdVar.c.i(str);
                lx0VarI.getClass();
                np8.f(lx0VarI.b(j2, jMin));
                if (!rpdVar.a.exists()) {
                    rpd.e(rpdVar.a);
                    rpdVar.k();
                }
                re7 re7Var = rpdVar.b;
                if (jMin != -1) {
                    re7Var.a(rpdVar, jMin);
                } else {
                    re7Var.getClass();
                }
                File file = new File(rpdVar.a, Integer.toString(rpdVar.e.nextInt(10)));
                if (!file.exists()) {
                    rpd.e(file);
                }
                fileC = upd.c(file, lx0VarI.a, j2, System.currentTimeMillis());
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e = fileC;
        FileOutputStream fileOutputStream = new FileOutputStream(this.e);
        if (this.c > 0) {
            bkc bkcVar = (bkc) this.k;
            if (bkcVar == null) {
                this.k = new bkc(fileOutputStream, this.c, 0);
            } else {
                bkcVar.a(fileOutputStream);
            }
            this.f = (bkc) this.k;
        } else {
            this.f = fileOutputStream;
        }
        this.g = 0L;
    }

    public void c(a34 a34Var) {
        File fileC;
        long j = a34Var.g;
        long jMin = j != -1 ? Math.min(j - this.h, this.d) : -1L;
        gw0 gw0Var = (gw0) this.i;
        String str = a34Var.h;
        int i = oaf.a;
        long j2 = a34Var.f + this.h;
        spd spdVar = (spd) gw0Var;
        synchronized (spdVar) {
            try {
                spdVar.d();
                mx0 mx0VarH = spdVar.c.h(str);
                mx0VarH.getClass();
                fm9.k(mx0VarH.c(j2, jMin));
                if (!spdVar.a.exists()) {
                    spd.e(spdVar.a);
                    spdVar.n();
                }
                spdVar.b.c(spdVar, str, j2, jMin);
                File file = new File(spdVar.a, Integer.toString(spdVar.f.nextInt(10)));
                if (!file.exists()) {
                    spd.e(file);
                }
                fileC = vpd.c(file, mx0VarH.a, j2, System.currentTimeMillis());
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e = fileC;
        FileOutputStream fileOutputStream = new FileOutputStream(this.e);
        if (this.c > 0) {
            bkc bkcVar = (bkc) this.k;
            if (bkcVar == null) {
                this.k = new bkc(fileOutputStream, this.c, 1);
            } else {
                bkcVar.a(fileOutputStream);
            }
            this.f = (bkc) this.k;
        } else {
            this.f = fileOutputStream;
        }
        this.g = 0L;
    }

    public kw0(gw0 gw0Var) {
        gw0Var.getClass();
        this.i = gw0Var;
        this.b = 5242880L;
        this.c = 20480;
    }
}

package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.j0;

/* loaded from: classes.dex */
public final class k0 {
    final j0 a;
    final int b;
    final int c;
    long d;
    long e;

    private k0(j0 j0Var, int i, int i2) {
        this.a = j0Var;
        this.b = i;
        this.c = i2;
        Long lB = j0Var.b("timestamp_base");
        if (lB == null) {
            this.d = 0L;
        } else {
            this.d = lB.longValue();
        }
        this.e = j0Var.h();
    }

    public static k0 a(j0 j0Var) {
        return a(j0Var, 1000, 500);
    }

    public s0 b() {
        return new t0(this.a);
    }

    public u0 c() {
        return new v0(this.a, "default_session");
    }

    public boolean d(byte[] bArr, long j) {
        return a(31, bArr, true, false, j);
    }

    public long e() {
        return this.e;
    }

    public boolean f(byte[] bArr, long j) {
        return a(7, bArr, true, true, j);
    }

    public boolean g(byte[] bArr, long j) {
        return a(2, bArr, true, false, j);
    }

    public boolean h(byte[] bArr, long j) {
        return a(8, bArr, true, true, j);
    }

    public boolean i(byte[] bArr, long j) {
        return a(5, bArr, true, false, j);
    }

    public static k0 a(j0 j0Var, int i, int i2) {
        try {
            return new k0(j0Var, i, i2);
        } catch (Throwable th) {
            y0.b("MyTrackerRepository error: failed to create MyTrackerRepository instance", th);
            return null;
        }
    }

    public boolean b(long j) {
        return a(3, new byte[0], j);
    }

    public boolean c(byte[] bArr, long j) {
        return a(15, bArr, true, true, j);
    }

    public b d() {
        try {
            return this.a.f();
        } catch (Throwable th) {
            y0.b("MyTrackerRepository error: ", th);
            return null;
        }
    }

    public boolean e(byte[] bArr, long j) {
        return a(1, bArr, true, false, j);
    }

    public long f() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public boolean g() {
        ?? A;
        j0.b bVarG;
        try {
            bVarG = this.a.g();
        } catch (Exception unused) {
            A = 0;
        }
        try {
            A = bVarG.a();
            try {
                bVarG.close();
                j0.d dVarA = this.a.a("default_session");
                try {
                    A = A;
                    if (dVarA.a()) {
                        A++;
                    }
                    dVarA.close();
                } finally {
                }
            } catch (Exception unused2) {
            }
            return A != 0;
        } finally {
        }
    }

    public boolean b(byte[] bArr, long j) {
        return a(33, bArr, true, false, j);
    }

    public void c(long j) {
        try {
            this.a.a("timestamp_base", Long.valueOf(j));
            this.d = j;
        } catch (Throwable th) {
            y0.b("MyTrackerRepository error: ", th);
        }
    }

    public boolean a(byte[] bArr, long j) {
        return a(14, bArr, true, false, j);
    }

    /* JADX WARN: Not initialized variable reg: 20, insn: 0x0032: MOVE (r6 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]), block:B:12:0x0032 */
    public boolean a(long j, long j2) {
        j0.d dVar;
        j0.d dVar2;
        long j3;
        j0.d dVarA = null;
        try {
            dVarA = this.a.a("default_session");
            try {
                long jB = 0;
                try {
                    if (dVarA.a()) {
                        long jC = dVarA.c();
                        long jM = dVarA.m();
                        long jB2 = dVarA.b();
                        dVar2 = dVarA;
                        if (this.d == 0) {
                            c(jM);
                        }
                        y0.a("MyTrackerRepository: finish previous session");
                        if (j2 == 0) {
                            j3 = jC;
                            this.a.a(jC, jM - this.d, true, 0L);
                        } else {
                            j3 = jC;
                            j0 j0Var = this.a;
                            long j4 = this.d;
                            j0Var.a(j3, jM - j4, false, j2 - j4);
                        }
                        long j5 = j3;
                        long jD = this.a.d(j5);
                        y0.a("MyTrackerRepository: session timestamps count: " + jD);
                        long j6 = (long) this.c;
                        if (jD > j6) {
                            jB = this.a.b(j5, jD - j6);
                            y0.a("MyTrackerRepository: maximum count of session timestamps is exceeded, remove oldest timestamps, count: " + jB);
                        }
                        y0.a("MyTrackerRepository: start new session");
                        this.a.a(j5, j, jB2 + jB);
                    } else {
                        dVar2 = dVarA;
                        y0.a("MyTrackerRepository: insert session");
                        if (this.a.a("default_session", j) == j0.u) {
                            y0.b("MyTrackerRepository error: session insertion failed ");
                            dVar2.close();
                            return false;
                        }
                        if (this.d == 0) {
                            c(j);
                        }
                    }
                    dVar2.close();
                    return true;
                } catch (Throwable th) {
                    th = th;
                    dVarA = dVar;
                    try {
                        y0.b("MyTrackerRepository error: session insertion failed ", th);
                        if (dVarA == null) {
                            return false;
                        }
                        dVarA.close();
                        return false;
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public boolean a(int i, byte[] bArr, boolean z, boolean z2, long j) {
        long jB;
        try {
            long jA = j0.u;
            if (z2) {
                j0.b bVarA = null;
                try {
                    bVarA = this.a.a(i, bArr);
                    if (bVarA.a()) {
                        jA = bVarA.c();
                        jB = bVarA.b();
                    } else {
                        jA = jA;
                        jB = 0;
                    }
                    bVarA.close();
                } catch (Throwable th) {
                    if (bVarA != null) {
                        bVarA.close();
                    }
                    throw th;
                }
            } else {
                jB = 0;
            }
            if (jA == j0.u) {
                y0.a("MyTrackerRepository: insert " + i + " event");
                jA = this.a.a(i, bArr, z);
                if (jA != j0.u && z) {
                    this.e++;
                }
            } else {
                y0.a("MyTrackerRepository: aggregate " + i + " event");
            }
            if (jA == j0.u) {
                y0.b("MyTrackerRepository error: event insertion failed, type: " + i);
                return false;
            }
            if (this.d == 0) {
                c(j);
            }
            this.a.c(jA, j - this.d);
            long jB2 = this.a.b(jA);
            y0.a("MyTrackerRepository: event timestamps count: " + jB2);
            long j2 = (long) this.b;
            if (jB2 <= j2) {
                return true;
            }
            long jA2 = this.a.a(jA, jB2 - j2);
            this.a.d(jA, jB + jA2);
            y0.a("MyTrackerRepository: maximum count of event timestamps is exceeded, remove oldest timestamps, count: " + jA2);
            return true;
        } catch (Throwable th2) {
            y0.b("MyTrackerRepository error: event insertion failed, type: " + i, th2);
            return false;
        }
    }

    public boolean a() {
        try {
            this.a.c();
            this.a.b();
            this.a.e();
            this.a.d();
            this.a.a();
            this.e = 0L;
            j0.d dVarA = this.a.a("default_session");
            try {
                if (dVarA.a()) {
                    c(dVarA.m());
                } else {
                    c(0L);
                }
                dVarA.close();
                return true;
            } finally {
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    public void a(byte[] bArr) {
        try {
            this.a.f(14L);
            this.a.a(bArr);
        } catch (Throwable th) {
            y0.b("MyTrackerRepository error: ", th);
        }
    }

    public void a(long j) {
        try {
            this.a.a(j);
        } catch (Throwable th) {
            y0.b("MyTrackerRepository error: ", th);
        }
    }

    private boolean a(int i, byte[] bArr, long j) {
        try {
            return a(i, bArr, false, true, j);
        } catch (Throwable th) {
            y0.b("MyTrackerRepository error: event serialization failed, type: " + i, th);
            return false;
        }
    }
}

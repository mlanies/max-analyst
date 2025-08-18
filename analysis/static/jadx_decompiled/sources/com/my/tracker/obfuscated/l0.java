package com.my.tracker.obfuscated;

import android.text.TextUtils;
import com.my.tracker.MyTracker;
import com.my.tracker.obfuscated.e;
import com.my.tracker.obfuscated.o0;
import com.my.tracker.obfuscated.s0;
import com.my.tracker.obfuscated.u0;
import com.my.tracker.obfuscated.z0;
import java.util.Map;

/* loaded from: classes.dex */
public class l0 extends q0 {
    private static int a(int i) {
        if (i == 1) {
            return 12;
        }
        if (i == 2) {
            return 13;
        }
        if (i == 3) {
            return 11;
        }
        if (i == 5) {
            return 17;
        }
        if (i == 31) {
            return 39;
        }
        if (i == 33) {
            return 41;
        }
        if (i == 7) {
            return 18;
        }
        if (i == 8) {
            return 19;
        }
        if (i != 14) {
            return i != 15 ? -1 : 16;
        }
        return 14;
    }

    public static l0 b() {
        return new l0();
    }

    public static void a(r0 r0Var, z0.a aVar, l lVar) {
        lVar.a();
        int i = aVar.b;
        if (i >= 0) {
            lVar.a(1, i);
        }
        lVar.a(2, 0);
        lVar.a(3, 0);
        if (!aVar.e) {
            lVar.a(4, 0);
        }
        int i2 = aVar.c;
        if (i2 != 900) {
            lVar.a(5, i2);
        }
        int i3 = aVar.d;
        if (i3 != 0) {
            lVar.a(6, i3);
        }
        lVar.a(7, 0);
        if (!aVar.f) {
            lVar.a(8, 0);
        }
        if (!aVar.g) {
            lVar.a(9, 0);
        }
        lVar.a(11, 0);
        lVar.a(12, 0);
        lVar.a(13, 0);
        lVar.a(14, 0);
        lVar.a(15, 0);
        if (lVar.b() > 0) {
            r0Var.a(27, lVar);
        }
    }

    public synchronized byte[] b(boolean z, String str, String str2, Map map) {
        return a(8, z, str, str2, map);
    }

    public synchronized byte[] b(String str, String str2) {
        try {
            this.a.a();
            this.a.a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.a.a(2, str2);
            }
        } catch (Throwable th) {
            y0.b("Event serialization failed, type: 2", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] b(String str, String str2, long j, long j2) {
        try {
            this.a.a();
            this.a.a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.a.a(2, str2);
            }
            this.a.a(3, j2);
            this.a.a(4, j);
        } catch (Throwable th) {
            y0.b("Event serialization failed, type: 31", th);
            return null;
        }
        return this.a.c();
    }

    public static void a(r0 r0Var, e eVar, l lVar) {
        if (eVar.a.isEmpty()) {
            return;
        }
        for (e.a aVar : eVar.a) {
            lVar.a();
            lVar.a(1, aVar.a);
            lVar.a(2, aVar.b);
            r0Var.a(31, lVar);
        }
    }

    public static int a(r0 r0Var, s0 s0Var, l lVar) {
        int iA;
        int i = 0;
        try {
            s0.a aVarA = s0Var.a();
            iA = 0;
            while (aVarA.a()) {
                try {
                    try {
                        int iF = (int) aVarA.f();
                        try {
                            lVar.a();
                            s0.b bVarD = aVarA.d();
                            while (bVarD.a()) {
                                try {
                                    lVar.a(2, (int) bVarD.k());
                                } catch (Throwable th) {
                                    if (bVarD != null) {
                                        try {
                                            bVarD.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    throw th;
                                }
                            }
                            bVarD.close();
                            if (lVar.b() == 0) {
                                y0.b("Error: no timestamps for event " + iF + ", event ignored");
                            } else {
                                lVar.a(1, iF);
                                long jB = aVarA.b();
                                if (jB > 0) {
                                    lVar.a(3, (int) jB);
                                }
                                byte[] bArrL = aVarA.l();
                                if (bArrL.length > 0) {
                                    int iA2 = a(iF);
                                    if (iA2 == -1) {
                                        y0.b("Error: unrecognized eventType " + iF + ", event ignored");
                                    } else {
                                        lVar.a(iA2, bArrL);
                                    }
                                }
                                iA += r0Var.a(41, lVar);
                                i++;
                            }
                        } catch (Throwable th3) {
                            y0.b("Error: failed to pack event " + iF, th3);
                        }
                    } finally {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    y0.b("Error: failed to get stored events", th);
                    y0.a("Written: events=" + i + ", bytes=" + iA);
                    return iA;
                }
            }
            aVarA.close();
        } catch (Throwable th5) {
            th = th5;
            iA = 0;
        }
        y0.a("Written: events=" + i + ", bytes=" + iA);
        return iA;
    }

    public static int a(r0 r0Var, u0 u0Var, l lVar, l lVar2) {
        int i;
        int iA = 0;
        try {
            u0.a aVarA = u0Var.a();
            i = 0;
            while (aVarA.a()) {
                try {
                    try {
                        String strJ = aVarA.j();
                        lVar.a();
                        try {
                            u0.b bVarD = aVarA.d();
                            while (bVarD.a()) {
                                try {
                                    lVar2.a();
                                    lVar2.a(1, (int) bVarD.g());
                                    if (!bVarD.e()) {
                                        lVar2.a(2, (int) bVarD.i());
                                    }
                                    lVar.a(1, lVar2);
                                } catch (Throwable th) {
                                    if (bVarD != null) {
                                        try {
                                            bVarD.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    throw th;
                                }
                            }
                            bVarD.close();
                        } catch (Throwable th3) {
                            y0.b("Error: failed to read session " + strJ + ": ", th3);
                        }
                        if (lVar.b() == 0) {
                            y0.a("No periods for session " + strJ + ", id=" + aVarA.c() + ", session ignored");
                        } else {
                            int iB = (int) aVarA.b();
                            if (iB > 0) {
                                lVar.a(2, iB);
                            }
                            iA += r0Var.a(42, lVar);
                            i++;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        y0.b("Error: failed to get stored sessions", th);
                        y0.a("Written: sessions=" + i + ", bytes=" + iA);
                        return iA;
                    }
                } finally {
                }
            }
            aVarA.close();
        } catch (Throwable th5) {
            th = th5;
            i = 0;
        }
        y0.a("Written: sessions=" + i + ", bytes=" + iA);
        return iA;
    }

    public synchronized boolean a(r0 r0Var, long j) {
        if (j > 0) {
            try {
                r0Var.a(4, j);
            } catch (Exception e) {
                y0.a("Write timestamp send error: " + e, e);
                return false;
            }
        }
        return true;
    }

    public synchronized int a(r0 r0Var, z0.a aVar, boolean z, b1 b1Var, u uVar, long j, s0 s0Var, u0 u0Var) {
        String str;
        String str2;
        try {
            if (a(r0Var, s0Var, this.a) + a(r0Var, u0Var, this.a, this.b) == 0) {
                y0.a("No events to send");
                return 3;
            }
            r0Var.a(1, MyTracker.VERSION);
            r0Var.a(2, aVar.a);
            if (j != -1) {
                r0Var.a(3, j);
            }
            Map map = aVar.h.b;
            r0Var.a(43, map, this.b);
            if (z || map.isEmpty()) {
                str = null;
                str2 = null;
            } else {
                String str3 = (String) map.get("android_id");
                str2 = (String) map.get("mac");
                str = str3;
            }
            q0.a(r0Var, uVar.a, uVar.b, this.a, this.b);
            q0.a(r0Var, z, b1Var, this.a);
            q0.a(r0Var, str, str2, uVar, this.a, this.b);
            a(r0Var, aVar, this.a);
            a(r0Var, uVar.e, this.a);
            a();
            return 1;
        } catch (Exception e) {
            y0.a("Create packet error: " + e, e);
            a();
            return 2;
        }
    }

    public synchronized byte[] a(boolean z, String str, String str2, Map map) {
        return a(7, z, str, str2, map);
    }

    public synchronized byte[] a(long j, String str, o0.a aVar) {
        try {
            this.a.a();
            this.a.a(1, j);
            this.b.a();
            if (!TextUtils.isEmpty(str)) {
                this.b.a(1, str);
            }
            if (aVar != null) {
                this.b.a(2, aVar.a);
            }
            if (aVar != null) {
                this.b.a(3, aVar.b);
            }
            if (aVar != null) {
                this.b.a(4, aVar.c);
            }
            if (this.b.b() > 0) {
                this.a.a(2, this.b);
            }
        } catch (Throwable th) {
            y0.b("Event serialization failed, type: 1", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(String str, String str2, long j, long j2) {
        try {
            this.a.a();
            this.a.a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.a.a(2, str2);
            }
            this.a.a(3, j2);
            this.a.a(4, j);
        } catch (Throwable th) {
            y0.b("Event serialization failed, type: 14", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(String str) {
        try {
            this.a.a();
            this.a.a(1, str);
        } catch (Throwable th) {
            y0.b("Event serialization failed, type: 33", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(String str, String str2, String str3, String str4, String str5) {
        try {
            this.a.a();
            this.a.a(1, str3);
            this.a.a(2, str4);
            this.a.a(3, str);
            this.a.a(4, str2);
            if (!TextUtils.isEmpty(str5)) {
                this.b.a();
                this.b.a(1, str5);
                if (this.b.b() > 0) {
                    this.a.a(5, this.b);
                }
            }
        } catch (Throwable th) {
            y0.b("Event serialization failed, type: 5", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(String str, String str2) {
        try {
            this.a.a();
            this.a.a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.a.a(2, str2);
            }
        } catch (Throwable th) {
            y0.b("Event serialization failed, type: 15", th);
            return null;
        }
        return this.a.c();
    }

    private byte[] a(int i, boolean z, String str, String str2, Map map) {
        try {
            this.a.a();
            this.a.a(1, map, this.b);
            if (!z) {
                this.a.a(2, str);
                this.a.a(3, str2);
            }
            return this.a.c();
        } catch (Throwable th) {
            y0.b("Event serialization failed, type: " + i, th);
            return null;
        }
    }
}

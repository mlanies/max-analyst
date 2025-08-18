package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class uq6 extends qy9 {
    public static final /* synthetic */ int Z = 0;
    public final String X;
    public final ztc Y;
    public final je7 a;
    public final int b;
    public final String c;
    public final String o;

    public uq6(je7 je7Var, int i, String str, String str2, String str3, ztc ztcVar) {
        this.a = je7Var;
        this.b = i;
        this.c = str;
        this.o = str2;
        this.X = str3;
        this.Y = ztcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // defpackage.qy9
    public final void q(f2a f2aVar) {
        String strConcat;
        vq6 vq6VarB;
        long jG;
        String str;
        tq6 tq6Var;
        bk5 bk5Var = null;
        tq6 tq6Var2 = new tq6(f2aVar, this.a, this.b, this.c, this.o, this.X, this.Y.a());
        f2aVar.c(tq6Var2);
        if (tq6Var2.s0.get()) {
            return;
        }
        kq6 kq6Var = (kq6) tq6Var2.a.getValue();
        int i = tq6Var2.b;
        String str2 = tq6Var2.c;
        String str3 = tq6Var2.o;
        String str4 = tq6Var2.X;
        ek5 ek5Var = (ek5) kq6Var;
        ek5Var.getClass();
        hm9.n("ek5", "upload");
        File file = new File(str2);
        if (!file.exists()) {
            tq6Var2.b("file not found", nu0.x0);
        } else if (file.length() == 0) {
            tq6Var2.b("file is zero length", nu0.y0);
        } else {
            int iS = au1.s(i);
            if (iS == 0) {
                strConcat = "HTTP_UPLOAD_IMAGE";
            } else if (iS == 1) {
                strConcat = "HTTP_UPLOAD_AUDIO";
            } else if (iS == 2) {
                strConcat = "HTTP_UPLOAD_VIDEO";
            } else if (iS != 3) {
                if (i == 1) {
                    str = "PHOTO";
                } else if (i == 2) {
                    str = "AUDIO";
                } else if (i == 3) {
                    str = "VIDEO";
                } else if (i == 4) {
                    str = "FILE";
                } else {
                    if (i != 5) {
                        throw null;
                    }
                    str = "STICKER";
                }
                strConcat = "HTTP_UPLOAD_".concat(str);
            } else {
                strConcat = "HTTP_UPLOAD_FILE";
            }
            pad padVar = new pad();
            padVar.f = ek5Var.c.b();
            padVar.a = strConcat;
            int iS2 = au1.s(i);
            rl8 rl8Var = iS2 != 0 ? (iS2 == 1 || iS2 == 2 || iS2 == 3 || iS2 == 4) ? ek5.d : null : ek5.e;
            try {
                od3 od3Var = new od3();
                od3Var.j(null, str4);
                vq6VarB = od3Var.b();
            } catch (IllegalArgumentException unused) {
                vq6VarB = null;
            }
            if (vq6VarB == null) {
                hm9.p("ek5", "url is not valid - try to get new url from server", null);
                ek5.f(tq6Var2);
            } else {
                if (i == 5) {
                    jG = 0;
                } else {
                    jG = "upload failed";
                    try {
                        jG = i == 1 ? ek5Var.g(vq6VarB) : ek5Var.d(vq6VarB);
                    } catch (ck5 e) {
                        tq6 tq6Var3 = tq6Var2;
                        tq6Var3.b(jG, e.a);
                        tq6Var = tq6Var3;
                    } catch (IOException e2) {
                        tq6 tq6Var4 = tq6Var2;
                        String string = e2.toString();
                        eq6 eq6Var = nu0.w0;
                        if (string != null) {
                            eq6Var = new eq6(-1, "UNKNOWN_ERROR", string);
                        }
                        tq6Var4.b(jG, eq6Var);
                        tq6Var = tq6Var4;
                    }
                }
                if (jG >= 0) {
                    tq6 tq6Var5 = tq6Var2;
                    mhc mhcVarB = ek5Var.b(file, str3, vq6VarB, rl8Var, jG, padVar, tq6Var2, i);
                    b8c b8cVarB = ((u2a) ek5Var.b.getValue()).b(mhcVarB);
                    bk5 bk5Var2 = new bk5();
                    bk5Var2.b = false;
                    bk5Var2.a = b8cVarB;
                    b8cVarB.e(new zj5(ek5Var, mhcVarB, tq6Var5, padVar, file, new AtomicBoolean(), str3, vq6VarB, rl8Var, i, bk5Var2));
                    bk5Var = bk5Var2;
                    tq6Var = tq6Var5;
                    tq6Var.set(bk5Var);
                }
                hm9.p("ek5", "url expired - try to get new url from server", null);
                ek5.f(tq6Var2);
            }
        }
        tq6Var = tq6Var2;
        tq6Var.set(bk5Var);
    }
}

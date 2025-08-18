package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import ru.ok.tamtam.ExceptionHandler$HandledException;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public final class w0f {
    public final /* synthetic */ je7 a;
    public final /* synthetic */ je7 b;
    public final /* synthetic */ je7 c;
    public final /* synthetic */ je7 d;
    public final /* synthetic */ je7 e;
    public final /* synthetic */ je7 f;
    public final /* synthetic */ je7 g;

    public w0f(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, khe kheVar) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.d = je7Var4;
        this.e = kheVar;
        this.f = je7Var5;
        this.g = je7Var6;
    }

    public final void a(em5 em5Var) {
        ad adVar = (ad) this.a.getValue();
        zh3 zh3VarB = ((gh3) this.b.getValue()).b();
        boolean zD = ((ri4) this.c.getValue()).d();
        if (adVar.a().c()) {
            return;
        }
        e47 e47Var = new e47();
        e47Var.c = "NET";
        e47Var.o = (String) em5Var.e;
        int i = em5Var.d;
        if (i != 0) {
            e47Var.a(Integer.valueOf(i), "sent");
        }
        long j = em5Var.c;
        if (j != 0) {
            e47Var.a(Long.valueOf(j), "respTime");
        }
        if (em5Var.b) {
            e47Var.a(Boolean.TRUE, "error");
        }
        String str = (String) em5Var.f;
        if (!oag.t(str)) {
            e47Var.a(str, "value");
        }
        e47Var.a(Boolean.valueOf(zD), "background");
        e47Var.a(zh3VarB.a(), "conn");
        adVar.j(e47Var.c());
    }

    public final long b() {
        ((ri4) this.c.getValue()).getClass();
        return SystemClock.elapsedRealtime();
    }

    public final zh3 c() {
        return ((gh3) this.b.getValue()).b();
    }

    public final void d(String str) {
        ((cba) ((o45) this.d.getValue())).c(new HandledException(str), true);
    }

    public final void e(Throwable th) {
        ((cba) ((o45) this.d.getValue())).c(new ExceptionHandler$HandledException(null, th, 1, "ONEME-11028"), true);
    }

    public final boolean f(String str, String str2) {
        qyc qycVar = (qyc) ((cj0) ((af8) this.g.getValue())).c;
        qycVar.getClass();
        int iQ = (int) qycVar.q(PmsKey.f84minstickersize, 432);
        int iQ2 = (int) qycVar.q(PmsKey.f74maxstickersize, 512);
        ph4 ph4Var = j47.X;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
        int height = bitmapDecodeFile.getHeight();
        int width = bitmapDecodeFile.getWidth();
        if (height >= iQ && height <= iQ2 && width >= iQ && width <= iQ2) {
            return false;
        }
        Bitmap bitmapE0 = j47.e0(iQ, iQ2, bitmapDecodeFile);
        int iE = new c65(str).e(1, "Orientation");
        try {
            j47.h0(str2, bitmapE0, 100, Bitmap.CompressFormat.PNG);
            bitmapE0.recycle();
            bitmapDecodeFile.recycle();
            c65 c65Var = new c65(str2);
            c65Var.F("Orientation", String.valueOf(iE));
            c65Var.B();
            return true;
        } catch (Throwable th) {
            if (bitmapE0 != null) {
                bitmapE0.recycle();
            }
            bitmapDecodeFile.recycle();
            throw th;
        }
    }
}

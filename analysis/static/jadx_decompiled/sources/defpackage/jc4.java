package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class jc4 implements ld8 {
    public static final int g = c1c.default_notification_channel_name;
    public final Context a;
    public final av1 b;
    public final int c;
    public final NotificationManager d;
    public td e;
    public final int f;

    public jc4(er0 er0Var) {
        Context context = (Context) er0Var.d;
        this.a = context;
        this.b = (av1) er0Var.e;
        this.c = er0Var.b;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        fm9.l(notificationManager);
        this.d = notificationManager;
        this.f = vub.media3_notification_small_icon;
    }

    public final sh0 a(qh8 qh8Var, zw6 zw6Var, sh0 sh0Var, ui0 ui0Var) {
        ffc ffcVar;
        char c;
        char c2;
        int i = oaf.a;
        Context context = this.a;
        if (i >= 26) {
            NotificationManager notificationManager = this.d;
            if (notificationManager.getNotificationChannel("default_channel_id") == null) {
                hc4.a(notificationManager, "default_channel_id", context.getString(this.c));
            }
        }
        ww6 ww6Var = new ww6();
        for (int i2 = 0; i2 < zw6Var.size(); i2++) {
            c73 c73Var = (c73) zw6Var.get(i2);
            y9d y9dVar = c73Var.a;
            if (y9dVar != null && y9dVar.a == 0 && c73Var.h) {
                ww6Var.d((c73) zw6Var.get(i2));
            }
        }
        q3b q3bVarC = qh8Var.c();
        bu9 bu9Var = new bu9(context, "default_channel_id");
        getClass();
        al8 al8Var = new al8(qh8Var);
        k3b k3bVarS = q3bVarC.s();
        ffc ffcVarJ = ww6Var.j();
        int i3 = 1;
        boolean z = !oaf.c0(q3bVarC, qh8Var.e());
        ww6 ww6Var2 = new ww6();
        if (k3bVarS.b(7, 6)) {
            Bundle bundleG = zr6.g(-1, "androidx.media3.session.command.COMPACT_VIEW_INDEX");
            b73 b73Var = new b73(57413);
            b73Var.d(6);
            b73Var.b(context.getString(c1c.media3_controls_seek_to_previous_description));
            b73Var.c(bundleG);
            ww6Var2.d(b73Var.a());
            i3 = 1;
        }
        if (k3bVarS.a(i3)) {
            Bundle bundleG2 = zr6.g(-1, "androidx.media3.session.command.COMPACT_VIEW_INDEX");
            if (z) {
                b73 b73Var2 = new b73(57396);
                b73Var2.d(i3);
                b73Var2.c(bundleG2);
                b73Var2.b(context.getString(c1c.media3_controls_pause_description));
                ww6Var2.d(b73Var2.a());
            } else {
                b73 b73Var3 = new b73(57399);
                b73Var3.d(i3);
                b73Var3.c(bundleG2);
                b73Var3.b(context.getString(c1c.media3_controls_play_description));
                ww6Var2.d(b73Var3.a());
            }
        }
        if (k3bVarS.b(9, 8)) {
            Bundle bundleG3 = zr6.g(-1, "androidx.media3.session.command.COMPACT_VIEW_INDEX");
            b73 b73Var4 = new b73(57412);
            b73Var4.d(8);
            b73Var4.c(bundleG3);
            b73Var4.b(context.getString(c1c.media3_controls_seek_to_next_description));
            ww6Var2.d(b73Var4.a());
        }
        for (int i4 = 0; i4 < ffcVarJ.size(); i4++) {
            c73 c73Var2 = (c73) ffcVarJ.get(i4);
            y9d y9dVar2 = c73Var2.a;
            if (y9dVar2 != null && y9dVar2.a == 0) {
                ww6Var2.d(c73Var2);
            }
        }
        int[] iArrCopyOf = new int[3];
        int[] iArr = new int[3];
        Arrays.fill(iArrCopyOf, -1);
        Arrays.fill(iArr, -1);
        int i5 = 0;
        int i6 = 0;
        for (ffc ffcVarJ2 = ww6Var2.j(); i6 < ffcVarJ2.size(); ffcVarJ2 = ffcVar) {
            c73 c73Var3 = (c73) ffcVarJ2.get(i6);
            y9d y9dVar3 = c73Var3.a;
            int i7 = c73Var3.b;
            if (y9dVar3 != null) {
                bu9Var.a(sh0Var.k(qh8Var, c73Var3));
                ffcVar = ffcVarJ2;
            } else {
                fm9.k(i7 != -1);
                ffcVar = ffcVarJ2;
                bu9Var.a(sh0Var.l(qh8Var, IconCompat.c(context, c73Var3.d), c73Var3.f, i7));
            }
            if (i5 != 3) {
                int i8 = c73Var3.g.getInt("androidx.media3.session.command.COMPACT_VIEW_INDEX", -1);
                if (i8 < 0 || i8 >= 3) {
                    if (i7 != 7) {
                        c = 6;
                        if (i7 == 6) {
                            c2 = 0;
                        } else if (i7 == 1) {
                            iArr[1] = i6;
                        } else if (i7 == 9 || i7 == 8) {
                            iArr[2] = i6;
                        }
                    } else {
                        c = 6;
                        c2 = 0;
                    }
                    iArr[c2] = i6;
                } else {
                    i5++;
                    iArrCopyOf[i8] = i6;
                    c = 6;
                }
            } else {
                c = 6;
            }
            i6++;
        }
        if (i5 == 0) {
            int i9 = 0;
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = iArr[i10];
                if (i11 != -1) {
                    iArrCopyOf[i9] = i11;
                    i9++;
                }
            }
        }
        int i12 = 0;
        while (true) {
            if (i12 >= 3) {
                break;
            }
            if (iArrCopyOf[i12] == -1) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i12);
                break;
            }
            i12++;
        }
        al8Var.q(iArrCopyOf);
        if (q3bVarC.t1(18)) {
            gd8 gd8VarN0 = q3bVarC.N0();
            bu9Var.f(gd8VarN0.a);
            bu9Var.e(gd8VarN0.b);
            bm7 bm7VarV = qh8Var.a().v(gd8VarN0);
            if (bm7VarV != null) {
                td tdVar = this.e;
                if (tdVar != null) {
                    tdVar.p();
                }
                if (bm7VarV.isDone()) {
                    try {
                        bu9Var.k((Bitmap) fm9.C(bm7VarV));
                    } catch (CancellationException | ExecutionException e) {
                        z04.c0("Failed to load bitmap: " + e.getMessage());
                    }
                } else {
                    td tdVar2 = new td(bu9Var, 5, ui0Var);
                    this.e = tdVar2;
                    Handler handlerD = qh8Var.b().d();
                    Objects.requireNonNull(handlerD);
                    fm9.b(bm7VarV, tdVar2, new a84(handlerD, 0));
                }
            }
        }
        if (q3bVarC.t1(3) || oaf.a < 21) {
            sh0Var.m(qh8Var, 3L);
        }
        int i13 = oaf.a;
        long jCurrentTimeMillis = (i13 < 21 || !q3bVarC.b() || q3bVarC.n() || q3bVarC.y1() || q3bVarC.d().a != 1.0f) ? -9223372036854775807L : System.currentTimeMillis() - q3bVarC.b0();
        boolean z2 = jCurrentTimeMillis != -9223372036854775807L;
        if (!z2) {
            jCurrentTimeMillis = 0;
        }
        bu9Var.t(jCurrentTimeMillis);
        bu9Var.n(z2);
        bu9Var.r(z2);
        if (i13 >= 31) {
            ic4.a(bu9Var);
        }
        bu9Var.d(qh8Var.d());
        bu9Var.h(sh0Var.m(qh8Var, 3L));
        bu9Var.m();
        bu9Var.o(this.f);
        bu9Var.q(al8Var);
        bu9Var.s();
        bu9Var.l();
        bu9Var.j();
        return new sh0(bu9Var.b());
    }
}

package ru.ok.messages.services;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.work.WorkerParameters;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import defpackage.ay5;
import defpackage.bea;
import defpackage.bu9;
import defpackage.cu8;
import defpackage.e52;
import defpackage.es8;
import defpackage.gpc;
import defpackage.hu9;
import defpackage.jpc;
import defpackage.khe;
import defpackage.l20;
import defpackage.l43;
import defpackage.lwa;
import defpackage.nt9;
import defpackage.o1b;
import defpackage.o43;
import defpackage.oag;
import defpackage.s36;
import defpackage.s5c;
import defpackage.va8;
import defpackage.vw7;
import defpackage.wv6;
import defpackage.y1b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/messages/services/PipWorker;", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class PipWorker extends SdkCoroutineWorker {
    public final khe a;

    public PipWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.a = new khe(new lwa(3, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00b2 -> B:29:0x0066). Please report as a decompilation issue!!! */
    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.services.PipWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    public final Object getForegroundInfo(Continuation continuation) {
        Uri uri;
        o1b o1bVar = (o1b) this.a.getValue();
        y1b y1bVar = o1bVar.x0;
        e52 e52Var = o1bVar.H0;
        es8 es8Var = o1bVar.G0;
        l20 l20Var = o1bVar.F0;
        Bitmap underlyingBitmap = null;
        if (l20Var == null) {
            uri = null;
        } else {
            uri = Uri.parse((s5c.P(l20Var) ? o1bVar.F0.j.d.d : o1bVar.F0.d).d);
        }
        boolean z = o1bVar.K0;
        y1bVar.b.c();
        bea beaVar = y1bVar.b;
        y1bVar.c.getClass();
        bu9 bu9VarH = beaVar.h("ru.oneme.app.media", true, true);
        hu9 hu9Var = new hu9();
        hu9Var.e = null;
        hu9Var.f = ((MediaSessionCompat) y1bVar.d.getValue()).getSessionToken();
        hu9Var.e = new int[]{0};
        va8 va8Var = y1bVar.e;
        va8Var.getClass();
        Intent intent = new Intent("ru.ok.video.ACTION_VIDEO_STOP");
        PendingIntent.getBroadcast((Context) va8Var.b, 5, intent, oag.I(intent, oag.m(134217728)));
        if (uri != null) {
            o43 o43Var = (o43) s36.o().a(wv6.a(uri), null).e();
            if (o43Var != null) {
                o43Var.e0();
                l43 l43Var = (l43) o43Var.e0();
                if (l43Var instanceof CloseableStaticBitmap) {
                    underlyingBitmap = ((CloseableStaticBitmap) l43Var).getUnderlyingBitmap();
                }
            }
            if (underlyingBitmap != null) {
                bu9VarH.k(underlyingBitmap);
            }
        }
        va8 va8Var2 = y1bVar.e;
        va8Var2.getClass();
        Intent intent2 = new Intent("ru.ok.video.ACTION_VIDEO_STOP");
        bu9VarH.F.deleteIntent = PendingIntent.getBroadcast((Context) va8Var2.b, 5, intent2, oag.I(intent2, oag.m(134217728)));
        bu9VarH.i(2, z);
        bu9VarH.m();
        if (e52Var != null) {
            e52Var.k0();
            bu9VarH.f(e52Var.u0);
            if (es8Var != null) {
                va8 va8Var3 = y1bVar.e;
                long j = e52Var.a;
                cu8 cu8Var = es8Var.a;
                long j2 = cu8Var.o;
                long j3 = cu8Var.b;
                bea beaVar2 = (bea) va8Var3.c;
                beaVar2.getClass();
                vw7 vw7Var = vw7.c;
                Long lValueOf = Long.valueOf(j2);
                Long lValueOf2 = Long.valueOf(j3);
                vw7Var.getClass();
                bu9VarH.g = oag.p((Context) va8Var3.b, 5, beaVar2.k(vw7.Z1(j, lValueOf, lValueOf2)));
            }
        }
        bu9VarH.e(y1bVar.a.getText(jpc.t3));
        bu9VarH.F.icon = z ? gpc.o0 : gpc.p0;
        va8 va8Var4 = y1bVar.e;
        va8Var4.getClass();
        Intent intent3 = new Intent().setAction(z ? "ru.ok.video.ACTION_VIDEO_PAUSE" : "ru.ok.video.ACTION_VIDEO_PLAY").setPackage("one.me.android");
        bu9VarH.a(new nt9(z ? gpc.S : gpc.V, "", PendingIntent.getBroadcast((Context) va8Var4.b, 5, intent3, oag.I(intent3, oag.m(134217728)))));
        bu9VarH.q(hu9Var);
        return new ay5(5, bu9VarH.b(), 2);
    }
}

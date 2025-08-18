package defpackage;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.Looper;
import com.facebook.animated.gif.GifFrame;
import com.facebook.animated.gif.GifImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class ue {
    public int a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Cloneable h;
    public final Object i;
    public Object j;

    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Cloneable, ve[]] */
    public ue(oz7 oz7Var, a8g a8gVar, Rect rect, boolean z) {
        new Rect();
        new Rect();
        this.c = oz7Var;
        this.d = a8gVar;
        GifImage gifImage = (GifImage) a8gVar.a;
        this.e = gifImage;
        int[] iArrF = gifImage.f();
        this.g = iArrF;
        oz7Var.getClass();
        int length = iArrF.length;
        for (int i = 0; i < length; i++) {
            if (iArrF[i] < 11) {
                iArrF[i] = 100;
            }
        }
        oz7 oz7Var2 = (oz7) this.c;
        int[] iArr = (int[]) this.g;
        oz7Var2.getClass();
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
        }
        this.a = i2;
        oz7 oz7Var3 = (oz7) this.c;
        int[] iArr2 = (int[]) this.g;
        oz7Var3.getClass();
        int[] iArr3 = new int[iArr2.length];
        int length2 = iArr2.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length2; i5++) {
            iArr3[i5] = i4;
            i4 += iArr2[i5];
        }
        this.f = a((GifImage) this.e, rect);
        this.b = z;
        this.h = new ve[((GifImage) this.e).e()];
        for (int i6 = 0; i6 < ((GifImage) this.e).e(); i6++) {
            ((ve[]) this.h)[i6] = ((GifImage) this.e).g(i6);
        }
        Paint paint = new Paint();
        this.i = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static Rect a(GifImage gifImage, Rect rect) {
        return rect == null ? new Rect(0, 0, gifImage.k(), gifImage.h()) : new Rect(0, 0, Math.min(rect.width(), gifImage.k()), Math.min(rect.height(), gifImage.h()));
    }

    public a98 b(qh8 qh8Var) {
        bm7 bm7Var = (bm7) ((HashMap) this.i).get(qh8Var);
        if (bm7Var == null || !bm7Var.isDone()) {
            return null;
        }
        try {
            return (a98) fm9.C(bm7Var);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    public void c(Canvas canvas, float f, float f2, ve veVar) {
        if (veVar.e == 2) {
            int iCeil = (int) Math.ceil(veVar.c * f);
            int iCeil2 = (int) Math.ceil(veVar.d * f2);
            int iCeil3 = (int) Math.ceil(veVar.a * f);
            int iCeil4 = (int) Math.ceil(veVar.b * f2);
            canvas.drawRect(new Rect(iCeil3, iCeil4, iCeil + iCeil3, iCeil2 + iCeil4), (Paint) this.i);
        }
    }

    public void d(boolean z) {
        ArrayList arrayList;
        sh0 sh0Var;
        bj8 bj8Var = (bj8) this.c;
        synchronized (bj8Var.a) {
            arrayList = new ArrayList(bj8Var.c.values());
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (i((qh8) arrayList.get(i), false)) {
                return;
            }
        }
        int i2 = oaf.a;
        bj8 bj8Var2 = (bj8) this.c;
        if (i2 >= 24) {
            od8.a(bj8Var2, z);
        } else {
            bj8Var2.stopForeground(z || i2 < 21);
        }
        this.b = false;
        if (!z || (sh0Var = (sh0) this.j) == null) {
            return;
        }
        ((pv9) this.f).b.cancel(null, sh0Var.b);
        this.a++;
        this.j = null;
    }

    public synchronized Bitmap e(int i, int i2) {
        try {
            Bitmap bitmap = (Bitmap) this.j;
            if (bitmap != null && (bitmap.getWidth() < i || ((Bitmap) this.j).getHeight() < i2)) {
                synchronized (this) {
                    Bitmap bitmap2 = (Bitmap) this.j;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        this.j = null;
                    }
                }
            }
            if (((Bitmap) this.j) == null) {
                this.j = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            }
            ((Bitmap) this.j).eraseColor(0);
        } catch (Throwable th) {
            throw th;
        }
        return (Bitmap) this.j;
    }

    public void f(Canvas canvas, int i) {
        GifFrame gifFrameD = ((GifImage) this.e).d(i);
        try {
            if (gifFrameD.d() > 0 && gifFrameD.c() > 0) {
                g(canvas, gifFrameD);
            }
        } finally {
            gifFrameD.a();
        }
    }

    public void g(Canvas canvas, GifFrame gifFrame) {
        int iD;
        int iC;
        int iE;
        int iF;
        if (this.b) {
            float fMax = Math.max(gifFrame.d() / Math.min(gifFrame.d(), canvas.getWidth()), gifFrame.c() / Math.min(gifFrame.c(), canvas.getHeight()));
            iD = (int) (gifFrame.d() / fMax);
            iC = (int) (gifFrame.c() / fMax);
            iE = (int) (gifFrame.e() / fMax);
            iF = (int) (gifFrame.f() / fMax);
        } else {
            iD = gifFrame.d();
            iC = gifFrame.c();
            iE = gifFrame.e();
            iF = gifFrame.f();
        }
        synchronized (this) {
            Bitmap bitmapE = e(iD, iC);
            this.j = bitmapE;
            gifFrame.g(iD, iC, bitmapE);
            canvas.save();
            canvas.translate(iE, iF);
            canvas.drawBitmap((Bitmap) this.j, 0.0f, 0.0f, (Paint) null);
            canvas.restore();
        }
    }

    public void h(Canvas canvas, GifFrame gifFrame, ve veVar, ve veVar2) {
        Rect rect = (Rect) this.f;
        if (rect == null || rect.width() <= 0 || ((Rect) this.f).height() <= 0) {
            return;
        }
        float width = canvas.getWidth() / ((Rect) this.f).width();
        if (veVar2 != null) {
            c(canvas, width, width, veVar2);
        }
        int iD = gifFrame.d();
        int iC = gifFrame.c();
        Rect rect2 = new Rect(0, 0, iD, iC);
        int i = (int) (iD * width);
        int i2 = (int) (iC * width);
        int iE = (int) (gifFrame.e() * width);
        int iF = (int) (gifFrame.f() * width);
        Rect rect3 = new Rect(iE, iF, i + iE, i2 + iF);
        synchronized (this) {
            Bitmap bitmapE = e(iD, iC);
            gifFrame.g(iD, iC, bitmapE);
            canvas.drawBitmap(bitmapE, rect2, rect3, (Paint) null);
        }
    }

    public boolean i(qh8 qh8Var, boolean z) {
        a98 a98VarB = b(qh8Var);
        return a98VarB != null && (a98VarB.u() || z) && (a98VarB.getPlaybackState() == 3 || a98VarB.getPlaybackState() == 2);
    }

    public void j(qh8 qh8Var, sh0 sh0Var, boolean z) {
        int i = oaf.a;
        Notification notification = (Notification) sh0Var.c;
        if (i >= 21) {
            notification.extras.putParcelable("android.mediaSession", (MediaSession.Token) qh8Var.a.h.j.a.c.b);
        }
        this.j = sh0Var;
        int i2 = sh0Var.b;
        if (!z) {
            ((pv9) this.f).a(null, i2, notification);
            d(false);
            return;
        }
        Intent intent = (Intent) this.h;
        bj8 bj8Var = (bj8) this.c;
        nt3.b(bj8Var, intent);
        if (i >= 29) {
            laf.a(bj8Var, i2, notification, 2, "mediaPlayback");
        } else {
            bj8Var.startForeground(i2, notification);
        }
        this.b = true;
    }

    public ue(bj8 bj8Var, ld8 ld8Var, sh0 sh0Var) {
        this.c = bj8Var;
        this.d = ld8Var;
        this.e = sh0Var;
        this.f = new pv9(bj8Var);
        this.g = new a84(new Handler(Looper.getMainLooper()), 1);
        this.h = new Intent(bj8Var, bj8Var.getClass());
        this.i = new HashMap();
        this.b = false;
    }
}

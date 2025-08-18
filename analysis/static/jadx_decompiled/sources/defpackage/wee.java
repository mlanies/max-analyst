package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class wee extends pu9 {
    public SurfaceView e;
    public final vee f;

    public wee(FrameLayout frameLayout, l8b l8bVar) {
        super(frameLayout, l8bVar);
        this.f = new vee(this);
    }

    @Override // defpackage.pu9
    public final View f() {
        return this.e;
    }

    @Override // defpackage.pu9
    public final Bitmap g() {
        SurfaceView surfaceView = this.e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.e.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.e.getWidth(), this.e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        PixelCopy.request(this.e, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: uee
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                semaphore.release();
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        } catch (Throwable th) {
            handlerThread.quitSafely();
            throw th;
        }
        handlerThread.quitSafely();
        return bitmapCreateBitmap;
    }

    @Override // defpackage.pu9
    public final void j() {
    }

    @Override // defpackage.pu9
    public final void k() {
    }

    @Override // defpackage.pu9
    public final void l(see seeVar, u00 u00Var) {
        SurfaceView surfaceView = this.e;
        boolean zEquals = Objects.equals((Size) this.b, seeVar.b);
        if (surfaceView == null || !zEquals) {
            this.b = seeVar.b;
            FrameLayout frameLayout = (FrameLayout) this.c;
            frameLayout.getClass();
            ((Size) this.b).getClass();
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.e = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(((Size) this.b).getWidth(), ((Size) this.b).getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.e);
            this.e.getHolder().addCallback(this.f);
        }
        Executor executorA = ot3.a(this.e.getContext());
        seeVar.k.a(new u3c(24, u00Var), executorA);
        this.e.post(new ewc(this, seeVar, u00Var, 7));
    }

    @Override // defpackage.pu9
    public final bm7 o() {
        return dw6.c;
    }
}

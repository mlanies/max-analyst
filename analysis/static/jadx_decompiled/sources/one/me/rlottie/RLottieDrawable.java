package one.me.rlottie;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArraySet;
import android.view.View;
import com.google.gson.Gson;
import defpackage.au1;
import defpackage.do9;
import defpackage.he;
import defpackage.ho9;
import defpackage.i40;
import defpackage.il4;
import defpackage.khe;
import defpackage.ll4;
import defpackage.ml4;
import defpackage.nm9;
import defpackage.r3c;
import defpackage.s3c;
import defpackage.so0;
import defpackage.t3c;
import defpackage.to0;
import defpackage.tu0;
import defpackage.v3c;
import defpackage.vo0;
import defpackage.w4d;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import one.me.rlottie.RLottieDrawable;

/* loaded from: classes2.dex */
public class RLottieDrawable extends BitmapDrawable implements Animatable, to0, nm9 {
    public static final Handler H1 = new Handler(Looper.getMainLooper());
    public static final ThreadLocal I1 = new ThreadLocal();
    public static final ThreadLocal J1 = new ThreadLocal();
    public static final ll4 K1 = new ll4();
    public static final Rect L1 = new Rect();
    public static Gson gson;
    public static il4 lottieCacheGenerateQueue;
    public final ArraySet A0;
    public String A1;
    public int B0;
    public volatile boolean B1;
    public int C0;
    public volatile Throwable C1;
    public int D0;
    public String D1;
    public long E0;
    public final Set E1;
    public volatile boolean F0;
    public final Set F1;
    public Runnable G0;
    public final Set G1;
    public Runnable H0;
    public volatile Bitmap I0;
    public volatile Bitmap J0;
    public volatile Bitmap K0;
    public boolean L0;
    public CountDownLatch M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public int S0;
    public boolean T0;
    public float U0;
    public float V0;
    public boolean W0;
    public int X;
    public boolean X0;
    public boolean Y;
    public final RectF Y0;
    public int[] Z;
    public final RectF[] Z0;
    public final int a;
    public final Paint[] a1;
    public final int b;
    public volatile boolean b1;
    public final int[] c;
    public volatile boolean c1;
    public volatile long d1;
    public boolean e1;
    public boolean f1;
    public boolean g1;
    public File h1;
    public boolean i1;
    public Runnable j1;
    public Runnable k1;
    public View l1;
    public ho9 m1;
    public final t3c n1;
    public int o;
    public final t3c o1;
    public boolean p1;
    public final t3c q1;
    public final t3c r1;
    public int[] s0;
    public vo0 s1;
    public boolean scaleByCanvas;
    public boolean skipFrameUpdate;
    public Rect srcRect;
    public final HashMap t0;
    public int t1;
    public volatile HashMap u0;
    public boolean u1;
    public HashMap v0;
    public boolean v1;
    public boolean w0;
    public final t3c w1;
    public Runnable whenCacheDone;
    public boolean x0;
    public long x1;
    public WeakReference y0;
    public int y1;
    public View z0;
    public Bitmap z1;

    public interface DrawableLoadListener {
        default void onError(Throwable th) {
        }

        default void onLoaded(RLottieDrawable rLottieDrawable) {
        }
    }

    public interface OnAllFramesRenderedListener {
        void onAllFramesRendered(RLottieDrawable rLottieDrawable, boolean z);
    }

    public interface OnNextFrameRenderedListener {
        void onNextFrameRendered(RLottieDrawable rLottieDrawable, int i);
    }

    public RLottieDrawable(File file, int i, int i2, so0 so0Var, boolean z) {
        this(file, i, i2, so0Var, z, null, 0);
    }

    public static /* synthetic */ void a(long j, long j2) {
        if (j != 0) {
            destroy(j);
        }
        if (j2 != 0) {
            destroy(j2);
        }
    }

    public static /* synthetic */ void b(long j, long j2) {
        if (j != 0) {
            destroy(j);
        }
        if (j2 != 0) {
            destroy(j2);
        }
    }

    public static void c(RLottieDrawable rLottieDrawable) {
        Runnable runnable = rLottieDrawable.j1;
        if (runnable != null) {
            runnable.run();
            rLottieDrawable.j1 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long create(String str, String str2, int i, int i2, int[] iArr, boolean z, int[] iArr2, boolean z2, int i3);

    public static void createCacheGenQueue() {
        lottieCacheGenerateQueue = new il4("rlottie-generator-queue");
    }

    private static native long createWithJson(String str, String str2, int[] iArr, int[] iArr2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void destroy(long j);

    public static native int foo();

    public static native double getDuration(String str, String str2);

    public static native int getFrame(long j, int i, Bitmap bitmap, int i2, int i3, int i4, boolean z);

    public static native long getFramesCount(String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void replaceColors(long j, int[] iArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void setLayerColor(long j, String str, int i);

    public void addDrawableLoadListener(DrawableLoadListener drawableLoadListener) {
        this.E1.add(drawableLoadListener);
        if (this.B1) {
            drawableLoadListener.onLoaded(this);
        } else if (this.C1 != null) {
            drawableLoadListener.onError(this.C1);
        }
    }

    public void addOnAllFramesRenderedListener(OnAllFramesRenderedListener onAllFramesRenderedListener) {
        this.G1.add(onAllFramesRenderedListener);
    }

    public void addOnNextFrameRenderedListener(OnNextFrameRenderedListener onNextFrameRenderedListener) {
        this.F1.add(onNextFrameRenderedListener);
    }

    public void addParentView(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return;
        }
        this.A0.add(imageReceiver);
    }

    public void beginApplyLayerColors() {
        this.R0 = true;
    }

    public void cacheFrame(int i) {
        if (this.y1 != i || this.z1 == null) {
            if (this.z1 == null) {
                this.z1 = Bitmap.createBitmap(this.a, this.b, Bitmap.Config.ARGB_8888);
            }
            long j = this.d1;
            this.y1 = i;
            Bitmap bitmap = this.z1;
            getFrame(j, i, bitmap, this.a, this.b, bitmap.getRowBytes(), true);
        }
    }

    public boolean canLoadFrames() {
        return this.i1 ? this.s1 != null : this.d1 != 0;
    }

    public void checkCache(Runnable runnable) throws InterruptedException {
        if (this.s1 == null) {
            he.d(runnable);
            return;
        }
        this.p1 = true;
        if (lottieCacheGenerateQueue == null) {
            createCacheGenQueue();
        }
        if (this.G0 == null) {
            vo0.B++;
            il4 il4Var = lottieCacheGenerateQueue;
            s3c s3cVar = new s3c(this, runnable, 0);
            this.G0 = s3cVar;
            il4Var.b(s3cVar);
        }
    }

    public void checkCacheCancel() throws InterruptedException {
        if (this.s1 == null || lottieCacheGenerateQueue == null || this.G0 == null || !this.A0.isEmpty() || getCallback() != null) {
            return;
        }
        View view = this.l1;
        if (view == null || !view.isAttachedToWindow()) {
            Runnable runnable = this.G0;
            if (runnable != null) {
                lottieCacheGenerateQueue.a(runnable);
                vo0.c();
                this.G0 = null;
            }
            this.p1 = false;
            this.u1 = false;
        }
    }

    public void commitApplyLayerColors() {
        if (this.R0) {
            this.R0 = false;
            if (!this.b1 && this.O0) {
                if (this.S0 <= 2) {
                    this.S0 = 0;
                }
                this.F0 = false;
                this.P0 = false;
                if (!o()) {
                    this.Q0 = true;
                }
            }
            invalidateInternal();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) throws InterruptedException {
        drawInternal(canvas, getPaint(), false, 0L, 0);
    }

    public void drawFrame(Canvas canvas, int i) {
        cacheFrame(i);
        if (this.z1 != null) {
            int i2 = this.a;
            int i3 = this.b;
            Rect rect = L1;
            rect.set(0, 0, i2, i3);
            canvas.drawBitmap(this.z1, rect, getBounds(), getPaint());
        }
    }

    public void drawInBackground(Canvas canvas, float f, float f2, float f3, float f4, int i, ColorFilter colorFilter, int i2) throws InterruptedException {
        RectF[] rectFArr = this.Z0;
        RectF rectF = rectFArr[i2];
        Paint[] paintArr = this.a1;
        if (rectF == null) {
            rectFArr[i2] = new RectF();
            paintArr[i2] = new Paint(1);
            paintArr[i2].setFilterBitmap(true);
        }
        paintArr[i2].setAlpha(i);
        paintArr[i2].setColorFilter(colorFilter);
        rectFArr[i2].set(f, f2, f3 + f, f4 + f2);
        drawInternal(canvas, null, true, 0L, i2);
    }

    public void drawInternal(Canvas canvas, Paint paint, boolean z, long j, int i) throws InterruptedException {
        float f;
        float f2;
        if (!canLoadFrames() || this.N0) {
            return;
        }
        boolean z2 = true;
        if (!z) {
            z = !Looper.getMainLooper().isCurrentThread();
        }
        if (!z) {
            updateCurrentFrame(j, false);
        }
        RectF rectF = z ? this.Z0[i] : this.Y0;
        if (rectF == null) {
            rectF = this.Y0;
        }
        if (paint == null) {
            paint = z ? this.a1[i] : getPaint();
        }
        if (paint.getAlpha() == 0) {
            return;
        }
        if (!hasBitmap()) {
            RLottie.getLogger().i("!hasBitmap() " + this.A1);
        }
        if (this.I0 == null) {
            RLottie.getLogger().i("rendering bitmap is null");
        }
        if (this.f1 || this.I0 == null) {
            return;
        }
        if (z) {
            float fWidth = rectF.width() / this.a;
            float fHeight = rectF.height() / this.b;
            if (Math.abs(rectF.width() - this.a) < he.a(1.0f) && Math.abs(rectF.height() - this.b) < he.a(1.0f)) {
                z2 = false;
            }
            f = fWidth;
            f2 = fHeight;
        } else {
            rectF.set(getBounds());
            if (this.W0) {
                this.U0 = rectF.width() / this.a;
                this.V0 = rectF.height() / this.b;
                this.W0 = false;
                if (Math.abs(rectF.width() - this.a) < he.a(1.0f) && Math.abs(rectF.height() - this.b) < he.a(1.0f)) {
                    z2 = false;
                }
                this.X0 = z2;
            }
            f = this.U0;
            f2 = this.V0;
            z2 = this.X0;
        }
        try {
            if (!z2) {
                canvas.drawBitmap(this.I0, rectF.left, rectF.top, paint);
            } else if (this.scaleByCanvas) {
                this.srcRect.set(0, 0, this.I0.getWidth(), this.I0.getHeight());
                canvas.drawBitmap(this.I0, this.srcRect, rectF, paint);
            } else {
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(f, f2);
                canvas.drawBitmap(this.I0, 0.0f, 0.0f, paint);
                canvas.restore();
            }
        } catch (Exception e) {
            RLottie.getLogger().o(e);
        }
        if (!this.b1 || z) {
            return;
        }
        invalidateInternal();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RLottieDrawable)) {
            return false;
        }
        RLottieDrawable rLottieDrawable = (RLottieDrawable) obj;
        if (this.a == rLottieDrawable.a && this.b == rLottieDrawable.b && this.B0 == rLottieDrawable.B0) {
            return Objects.equals(this.D1, rLottieDrawable.D1);
        }
        return false;
    }

    public final void finalize() throws Throwable {
        try {
            recycle(false);
        } finally {
            super.finalize();
        }
    }

    public Bitmap getAnimatedBitmap() {
        if (this.I0 != null) {
            return this.I0;
        }
        if (this.J0 != null) {
            return this.J0;
        }
        return null;
    }

    public Bitmap getBackgroundBitmap() {
        return this.K0;
    }

    public int getCurrentFrame() {
        return this.S0;
    }

    public String getCurrentUrl() {
        return this.A1;
    }

    public int getCustomEndFrame() {
        return this.X;
    }

    public long getDuration() {
        int[] iArr = this.c;
        return (long) ((iArr[0] / iArr[1]) * 1000.0f);
    }

    public Bitmap getFirstFrame(Bitmap bitmap) {
        String string = ((File) this.m1.c).toString();
        ho9 ho9Var = this.m1;
        ho9Var.getClass();
        int[] iArr = (int[]) ho9Var.b;
        int i = ho9Var.a;
        int i2 = this.b;
        long jCreate = create(string, null, this.a, i2, new int[3], false, iArr, false, i);
        if (jCreate == 0) {
            return bitmap;
        }
        getFrame(jCreate, 0, bitmap, this.a, this.b, bitmap.getRowBytes(), true);
        destroy(jCreate);
        return bitmap;
    }

    public int getFramesCount() {
        return this.c[0];
    }

    public float getGeneratingCacheProgress() {
        vo0 vo0Var = this.s1;
        if (vo0Var == null) {
            return 1.0f;
        }
        if (this.G0 == null) {
            if (vo0Var.q) {
                return this.s1.g() ? 0.0f : 1.0f;
            }
            return -2.0f;
        }
        float framesCount = vo0Var.d.get() / getFramesCount();
        if (Float.isNaN(framesCount)) {
            return 0.0f;
        }
        if (Float.isInfinite(framesCount)) {
            return 1.0f;
        }
        return Math.max(Math.min(framesCount, 1.0f), 0.0f);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.b;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.a;
    }

    public long getLastFrameTime() {
        return this.E0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.a;
    }

    @Override // defpackage.to0
    public int getNextFrame(Bitmap bitmap) throws InterruptedException {
        long j = this.x1;
        if (j == 0) {
            return -1;
        }
        int i = this.T0 ? 2 : 1;
        if (getFrame(j, this.t1, bitmap, this.a, this.b, bitmap.getRowBytes(), true) != -5) {
            int i2 = this.t1 + i;
            this.t1 = i2;
            return i2 > this.c[0] ? 0 : 1;
        }
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return getNextFrame(bitmap);
    }

    public Bitmap getNextRenderingBitmap() {
        return this.J0;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public Bitmap getRenderingBitmap() {
        return this.I0;
    }

    public float getScaleX() {
        return this.U0;
    }

    public float getScaleY() {
        return this.V0;
    }

    public int getTimeBetweenFrames() {
        return this.o;
    }

    public final void h() throws InterruptedException {
        Runnable runnable = this.G0;
        if (runnable != null) {
            lottieCacheGenerateQueue.a(runnable);
            vo0.c();
            this.G0 = null;
        }
        if (hasParent() || this.J0 == null || this.H0 == null) {
            return;
        }
        this.H0 = null;
        this.J0 = null;
    }

    public boolean hasBitmap() {
        return (this.c1 || (this.I0 == null && this.J0 == null) || this.f1) ? false : true;
    }

    public boolean hasParent() {
        return (this.A0.isEmpty() && this.l1 == null && getCallback() == null) ? false : true;
    }

    public boolean hasParentViews() {
        return !this.A0.isEmpty();
    }

    public boolean hasVibrationPattern() {
        return this.v0 != null;
    }

    public int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        String str = this.D1;
        return Integer.hashCode(this.B0) + ((i + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final void i() throws InterruptedException {
        if (this.N0) {
            h();
            if (this.H0 == null && this.G0 == null && this.d1 != 0) {
                l(true);
            }
        }
        if (this.d1 == 0 && this.s1 == null) {
            m();
            return;
        }
        this.L0 = true;
        if (!hasParent()) {
            RLottie.getLogger().i("RLottieDrawable. Call stop because !hasParentView() " + this.A1);
            stop();
        }
        if (this.b1) {
            o();
        }
    }

    public void invalidateInternal() {
        if (this.c1) {
            return;
        }
        Iterator it = this.A0.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
        View view = this.l1;
        if (view != null) {
            view.invalidate();
        }
        if (getCallback() != null) {
            invalidateSelf();
        }
    }

    public boolean isApplyTransformation() {
        return this.W0;
    }

    public boolean isCacheFallbacked() {
        return false;
    }

    public boolean isForceFrameRedraw() {
        return this.Q0;
    }

    public boolean isGeneratingCache() {
        return this.G0 != null;
    }

    public boolean isHeavyDrawable() {
        return true;
    }

    public boolean isLastFrame() {
        return this.S0 == getFramesCount() - 1;
    }

    public boolean isLoadingFailed() {
        return (this.B1 || this.C1 == null) ? false : true;
    }

    public boolean isNeedScale() {
        return this.X0;
    }

    public boolean isRecycled() {
        return this.c1;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.b1;
    }

    public boolean isWaitingForNextTask() {
        return this.L0;
    }

    public final void j() {
        this.B1 = true;
        this.C1 = null;
        if (!he.b()) {
            he.d(new r3c(this, 1));
            return;
        }
        Iterator it = new ArrayList(this.E1).iterator();
        while (it.hasNext()) {
            ((DrawableLoadListener) it.next()).onLoaded(this);
        }
    }

    public final void k(File file, int[] iArr) throws IOException {
        if (gson == null) {
            gson = new Gson();
        }
        try {
            if (file != null) {
                FileReader fileReader = new FileReader(file.getAbsolutePath());
                au1.r(gson.fromJson(fileReader, v3c.class));
                try {
                    fileReader.close();
                } catch (Exception unused) {
                }
            } else {
                au1.r(gson.fromJson((String) null, v3c.class));
            }
            throw null;
        } catch (Exception e) {
            RLottie.getLogger().o(e);
            String absolutePath = file.getAbsolutePath();
            ho9 ho9Var = this.m1;
            int[] iArr2 = (int[]) ho9Var.b;
            boolean z = this.T0;
            int i = ho9Var.a;
            long jCreate = create(absolutePath, null, this.a, this.b, iArr, false, iArr2, z, i);
            if (jCreate != 0) {
                destroy(jCreate);
            }
        }
    }

    public final void l(boolean z) {
        final long j = this.d1;
        final long j2 = 0;
        this.d1 = 0L;
        if (j == 0) {
            return;
        }
        if (z) {
            final int i = 0;
            ml4.a(new Runnable() { // from class: q3c
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            RLottieDrawable.a(j, j2);
                            break;
                        default:
                            RLottieDrawable.b(j, j2);
                            break;
                    }
                }
            }, false);
        } else {
            w4d w4dVar = tu0.l.f;
            final int i2 = 1;
            ((ScheduledExecutorService) ((khe) w4dVar.b).getValue()).execute(new Runnable() { // from class: q3c
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            RLottieDrawable.a(j, j2);
                            break;
                        default:
                            RLottieDrawable.b(j, j2);
                            break;
                    }
                }
            });
        }
    }

    public final void m() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.I0);
        arrayList.add(this.K0);
        arrayList.add(this.J0);
        this.J0 = null;
        this.I0 = null;
        this.K0 = null;
        he.c(arrayList);
        if (this.j1 != null) {
            this.j1 = null;
        }
    }

    public void multiplySpeed(float f) {
        this.o *= (int) (1.0f / f);
    }

    public final void n() {
        if (!this.R0 && !this.b1 && this.O0) {
            if (this.S0 <= 2) {
                this.S0 = 0;
            }
            this.F0 = false;
            this.P0 = false;
            if (!o()) {
                this.Q0 = true;
            }
        }
        invalidateInternal();
    }

    public final boolean o() throws InterruptedException {
        if (this.H0 == null && this.J0 == null) {
            if (canLoadFrames() && !this.N0 && (this.b1 || (this.O0 && !this.P0))) {
                if (this.p1 && !this.v1) {
                    return false;
                }
                if (!this.t0.isEmpty()) {
                    this.u0.putAll(this.t0);
                    this.t0.clear();
                }
                int[] iArr = this.Z;
                if (iArr != null) {
                    this.s0 = iArr;
                    this.Z = null;
                }
                this.H0 = this.w1;
                if (this.T0 && he.b()) {
                    ml4.a(this.H0, this.M0 != null);
                } else {
                    K1.b(this.H0);
                }
                return true;
            }
            RLottie.getLogger().i("RLottieDrawable. Can't schedule next frame invalid state");
        }
        return false;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.W0 = true;
    }

    @Override // defpackage.nm9
    public void onFailed(Throwable th) {
        RLottie.getLogger().o(th);
        this.B1 = false;
        this.C1 = th;
        he.d(new do9(this, 24, th));
    }

    @Override // defpackage.nm9
    public void onFinished(String str, File file, String str2) {
        getPaint().setFlags(2);
        this.D1 = file.getAbsolutePath();
        this.h1 = file;
        if (this.i1 && lottieCacheGenerateQueue == null) {
            createCacheGenQueue();
        }
        if (this.i1) {
            this.s1 = new vo0(file, this, new so0(), this.a, this.b, !this.T0);
            ho9 ho9Var = new ho9(this);
            this.m1 = ho9Var;
            ho9Var.c = file.getAbsoluteFile();
            this.m1.getClass();
            this.d1 = create(file.getAbsolutePath(), null, this.a, this.b, this.c, this.i1, null, this.T0, 0);
            destroy(this.d1);
            this.d1 = 0L;
        } else {
            this.d1 = create(file.getAbsolutePath(), null, this.a, this.b, this.c, this.i1, null, this.T0, 0);
            if (this.d1 == 0) {
                file.delete();
            }
        }
        if (this.T0 && this.c[1] < 60) {
            this.T0 = false;
        }
        this.o = Math.max(this.T0 ? 33 : 16, (int) (1000.0f / this.c[1]));
        j();
        he.d(new r3c(this, 0));
    }

    public final void p(long j, long j2, boolean z, long j3) throws InterruptedException {
        int i;
        this.K0 = this.I0;
        this.I0 = this.J0;
        this.J0 = null;
        if (this.F0 || (this.C0 == 0 && this.B0 == 1)) {
            stop();
        }
        this.H0 = null;
        if (this.g1) {
            this.g1 = false;
        } else if (this.f1) {
            this.f1 = false;
        }
        this.P0 = true;
        this.L0 = false;
        if (RLottie.config.screenRefreshRate <= 60.0f) {
            this.E0 = j;
        } else {
            this.E0 = j - Math.min(16L, j2 - j3);
        }
        if (z && this.Q0) {
            this.P0 = false;
            this.Q0 = false;
        }
        Set set = this.F1;
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((OnNextFrameRenderedListener) it.next()).onNextFrameRendered(this, this.S0);
                it.remove();
            }
        }
        if (isLastFrame() && ((i = this.B0) == 2 || i == 1 || i == 3 || this.F0)) {
            for (OnAllFramesRenderedListener onAllFramesRenderedListener : this.G1) {
                int i2 = this.B0;
                onAllFramesRenderedListener.onAllFramesRendered(this, i2 == 2 || i2 == 1 || i2 == 3);
            }
        }
        o();
    }

    public void post(Runnable runnable) throws InterruptedException {
        if (this.T0 && he.b()) {
            ml4.a(new i40(runnable, 4), this.M0 != null);
        } else {
            K1.b(new i40(runnable, 5));
        }
    }

    @Override // defpackage.to0
    public void prepareForGenerateCache() {
        File file;
        String string = ((File) this.m1.c).toString();
        ho9 ho9Var = this.m1;
        ho9Var.getClass();
        int[] iArr = (int[]) ho9Var.b;
        int i = ho9Var.a;
        long jCreate = create(string, null, this.a, this.b, new int[3], false, iArr, false, i);
        this.x1 = jCreate;
        if (jCreate != 0 || (file = this.h1) == null) {
            return;
        }
        file.delete();
    }

    public void recycle(boolean z) throws InterruptedException, IOException {
        this.b1 = false;
        this.c1 = true;
        h();
        if (this.H0 != null || this.G0 != null || this.p1) {
            this.N0 = true;
            return;
        }
        l(z);
        vo0 vo0Var = this.s1;
        if (vo0Var != null) {
            RandomAccessFile randomAccessFile = vo0Var.u;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                vo0Var.u = null;
            }
            vo0Var.t = true;
            this.s1 = null;
        }
        m();
    }

    @Override // defpackage.to0
    public void releaseForGenerateCache() {
        long j = this.x1;
        if (j != 0) {
            destroy(j);
            this.x1 = 0L;
        }
    }

    public void removeDrawableLoadListener(DrawableLoadListener drawableLoadListener) {
        this.E1.remove(drawableLoadListener);
    }

    public void removeOnAllFramesRenderedListener(OnAllFramesRenderedListener onAllFramesRenderedListener) {
        this.G1.remove(onAllFramesRenderedListener);
    }

    public void removeOnNextFrameRenderedListener(OnNextFrameRenderedListener onNextFrameRenderedListener) {
        this.F1.remove(onNextFrameRenderedListener);
    }

    public void removeParentView(ImageReceiver imageReceiver) throws InterruptedException {
        if (imageReceiver == null) {
            return;
        }
        this.A0.remove(imageReceiver);
        checkCacheCancel();
    }

    public void replaceColors(int[] iArr) {
        this.Z = iArr;
        n();
    }

    public void resetVibrationAfterRestart(boolean z) {
        this.w0 = z;
    }

    public boolean restart() {
        return restart(false);
    }

    public void setAllowDecodeSingleFrame(boolean z) throws InterruptedException {
        this.O0 = z;
        if (z) {
            o();
        }
    }

    public void setAllowDrawFramesWhileCacheGenerating(boolean z) {
        this.v1 = z;
    }

    public void setAllowVibration(boolean z) {
        this.x0 = z;
    }

    public void setAutoRepeat(int i) {
        if (this.B0 == 2 && i == 3 && this.S0 != 0) {
            return;
        }
        this.B0 = i;
    }

    public void setAutoRepeatCount(int i) {
        this.C0 = i;
    }

    public void setAutoRepeatTimeout(long j) {
    }

    public void setCurrentFrame(int i) throws InterruptedException {
        setCurrentFrame(i, true);
    }

    public void setCurrentParentView(View view) {
        this.z0 = view;
    }

    public boolean setCustomEndFrame(int i) {
        if (this.X == i || i > this.c[0]) {
            return false;
        }
        this.X = i;
        return true;
    }

    public void setGeneratingFrame(int i) {
        this.t1 = i;
    }

    public void setInvalidateOnProgressSet(boolean z) {
        this.e1 = z;
    }

    public void setLayerColor(String str, int i) {
        this.t0.put(str, Integer.valueOf(i));
        n();
    }

    public void setMasterParent(View view) {
        this.l1 = view;
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        this.j1 = runnable;
    }

    public void setOnFinishCallback(Runnable runnable, int i) {
        if (runnable != null) {
            this.y0 = new WeakReference(runnable);
        } else if (this.y0 != null) {
            this.y0 = null;
        }
    }

    public void setOnFrameReadyRunnable(Runnable runnable) {
        this.k1 = runnable;
    }

    public void setPlayInDirectionOfCustomEndFrame(boolean z) {
        this.Y = z;
    }

    public void setProgress(float f) throws InterruptedException {
        setProgress(f, true);
    }

    public void setProgressMs(long j) throws InterruptedException {
        setCurrentFrame((int) ((Math.max(0L, j) / this.o) % this.c[0]), true, true);
    }

    public void setVibrationPattern(HashMap<Integer, Integer> map) {
        this.v0 = map;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() throws InterruptedException {
        if (!RLottie.config.isEnabled || this.b1) {
            return;
        }
        if ((this.B0 < 2 || this.D0 == 0) && this.X != this.S0) {
            this.b1 = true;
            if (this.e1) {
                this.f1 = true;
                if (this.H0 != null) {
                    this.g1 = true;
                }
            }
            o();
            invalidateInternal();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        RLottie.getLogger().i("Stop url: " + getCurrentUrl() + " class: " + hashCode());
        this.b1 = false;
    }

    public void updateCurrentFrame(long j, boolean z) throws InterruptedException {
        int i;
        Integer num;
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        long j2 = j;
        long j3 = j2 - this.E0;
        if (!z || this.T0) {
            float f = RLottie.config.screenRefreshRate;
            i = (f <= 60.0f || (z && f <= 80.0f)) ? this.o - 6 : this.o;
        } else {
            i = this.o - 16;
        }
        if (!this.b1) {
            if ((this.Q0 || (this.O0 && j3 >= i)) && this.J0 != null) {
                p(j2, j3, true, i);
                return;
            }
            return;
        }
        if (this.I0 == null && this.J0 == null) {
            o();
            return;
        }
        if (this.J0 != null) {
            if (this.I0 == null || (j3 >= i && !this.skipFrameUpdate)) {
                HashMap map = this.v0;
                if (map != null && this.z0 != null && this.x0 && (num = (Integer) map.get(Integer.valueOf(this.S0 - 1))) != null) {
                    this.z0.performHapticFeedback(num.intValue() == 1 ? 0 : 3, 2);
                }
                p(j2, j3, false, i);
            }
        }
    }

    public RLottieDrawable(File file, int i, int i2, so0 so0Var, boolean z, int[] iArr, int i3) throws IOException {
        char c;
        int[] iArr2;
        int[] iArr3 = new int[3];
        this.c = iArr3;
        this.X = -1;
        this.t0 = new HashMap();
        this.u0 = new HashMap();
        this.w0 = false;
        this.x0 = true;
        this.A0 = new ArraySet();
        this.B0 = 1;
        this.C0 = -1;
        this.U0 = 1.0f;
        this.V0 = 1.0f;
        this.Y0 = new RectF();
        this.Z0 = new RectF[2];
        this.a1 = new Paint[2];
        this.n1 = new t3c(this, 0);
        this.o1 = new t3c(this, 1);
        this.q1 = new t3c(this, 2);
        this.r1 = new t3c(this, 3);
        this.w1 = new t3c(this, 4);
        this.srcRect = new Rect();
        this.y1 = -1;
        this.A1 = null;
        this.B1 = false;
        this.C1 = null;
        this.E1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.F1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.G1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.a = i;
        this.b = i2;
        this.T0 = z;
        this.D1 = file.getAbsolutePath();
        this.i1 = so0Var != null;
        getPaint().setFlags(2);
        this.h1 = file;
        if (this.i1 && lottieCacheGenerateQueue == null) {
            createCacheGenQueue();
        }
        if (this.i1) {
            ho9 ho9Var = new ho9(this);
            this.m1 = ho9Var;
            ho9Var.c = file.getAbsoluteFile();
            ho9 ho9Var2 = this.m1;
            ho9Var2.getClass();
            ho9Var2.b = iArr;
            ho9Var2.a = i3;
            k(file, iArr3);
            if (this.T0 && iArr3[1] < 60) {
                this.T0 = false;
            }
            this.s1 = new vo0(file, this, so0Var, i, i2, !z);
            c = 1;
            iArr2 = iArr3;
        } else {
            c = 1;
            iArr2 = iArr3;
            this.d1 = create(file.getAbsolutePath(), null, i, i2, iArr3, this.i1, iArr, this.T0, i3);
            if (this.d1 == 0) {
                RLottie.getLogger().i("RLottieDrawable nativePtr == 0 " + file.getAbsolutePath() + " remove file");
                file.delete();
            }
            if (this.T0 && iArr2[1] < 60) {
                this.T0 = false;
            }
        }
        this.o = Math.max(this.T0 ? 33 : 16, (int) (1000.0f / iArr2[c]));
        j();
    }

    public void draw(Canvas canvas, Paint paint) throws InterruptedException {
        drawInternal(canvas, paint, false, 0L, 0);
    }

    public boolean restart(boolean z) throws InterruptedException {
        if (!z && ((this.B0 < 2 || this.D0 == 0) && this.C0 < 0)) {
            return false;
        }
        this.D0 = 0;
        this.B0 = 2;
        start();
        return true;
    }

    public void setCurrentFrame(int i, boolean z) throws InterruptedException {
        setCurrentFrame(i, z, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005 A[PHI: r0
      0x0005: PHI (r0v6 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0003, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setProgress(float r3, boolean r4) throws java.lang.InterruptedException {
        /*
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L7
        L5:
            r3 = r0
            goto Le
        L7:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto Le
            goto L5
        Le:
            int[] r0 = r2.c
            r1 = 0
            r0 = r0[r1]
            float r0 = (float) r0
            float r0 = r0 * r3
            int r3 = (int) r0
            r2.setCurrentFrame(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.rlottie.RLottieDrawable.setProgress(float, boolean):void");
    }

    public void setCurrentFrame(int i, boolean z, boolean z2) throws InterruptedException {
        if (i < 0 || i > this.c[0]) {
            return;
        }
        if (this.S0 != i || z2) {
            this.S0 = i;
            this.F0 = false;
            this.P0 = false;
            if (this.e1) {
                this.f1 = true;
                if (this.H0 != null) {
                    this.g1 = true;
                }
            }
            if ((!z || z2) && this.L0 && this.J0 != null) {
                this.K0 = this.J0;
                this.J0 = null;
                this.H0 = null;
                this.L0 = false;
            }
            if (!z && this.H0 == null) {
                this.M0 = new CountDownLatch(1);
            }
            if (z2 && !this.b1) {
                this.b1 = true;
            }
            if (!o()) {
                this.Q0 = true;
            } else if (!z) {
                try {
                    this.M0.await();
                } catch (Exception e) {
                    RLottie.getLogger().o(e);
                }
                this.M0 = null;
            }
            invalidateSelf();
        }
    }

    public RLottieDrawable(int i, String str, int i2, int i3) {
        this(i, str, i2, i3, true, (int[]) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x010d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RLottieDrawable(int r10, java.lang.String r11, int r12, int r13, boolean r14, int[] r15) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.rlottie.RLottieDrawable.<init>(int, java.lang.String, int, int, boolean, int[]):void");
    }

    public RLottieDrawable(String str, String str2, int i, int i2, boolean z, int[] iArr) throws InterruptedException {
        int[] iArr2 = new int[3];
        this.c = iArr2;
        this.X = -1;
        this.t0 = new HashMap();
        this.u0 = new HashMap();
        this.w0 = false;
        this.x0 = true;
        this.A0 = new ArraySet();
        this.B0 = 1;
        this.C0 = -1;
        this.U0 = 1.0f;
        this.V0 = 1.0f;
        this.Y0 = new RectF();
        this.Z0 = new RectF[2];
        this.a1 = new Paint[2];
        this.n1 = new t3c(this, 0);
        this.o1 = new t3c(this, 1);
        this.q1 = new t3c(this, 2);
        this.r1 = new t3c(this, 3);
        this.w1 = new t3c(this, 4);
        this.srcRect = new Rect();
        this.y1 = -1;
        this.A1 = null;
        this.B1 = false;
        this.C1 = null;
        this.E1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.F1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.G1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.a = i;
        this.b = i2;
        this.D1 = str2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getPaint().setFlags(2);
        this.d1 = createWithJson(str, str2, iArr2, iArr);
        this.o = Math.max(16, (int) (1000.0f / iArr2[1]));
        if (z) {
            setAllowDecodeSingleFrame(true);
        }
        j();
    }
}

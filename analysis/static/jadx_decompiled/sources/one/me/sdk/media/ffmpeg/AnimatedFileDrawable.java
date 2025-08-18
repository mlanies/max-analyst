package one.me.sdk.media.ffmpeg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import defpackage.af;
import defpackage.bf;
import defpackage.fm5;
import defpackage.he;
import defpackage.il4;
import defpackage.ml4;
import defpackage.nm9;
import defpackage.so0;
import defpackage.to0;
import defpackage.vo0;
import defpackage.ze;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import one.me.rlottie.ImageReceiver;
import one.me.rlottie.RLottieDrawable;

/* loaded from: classes2.dex */
public class AnimatedFileDrawable extends BitmapDrawable implements Animatable, to0, nm9 {
    public static final float[] I1 = new float[8];
    public static final ScheduledThreadPoolExecutor J1 = new ScheduledThreadPoolExecutor(8, new ThreadPoolExecutor.DiscardPolicy());
    public static final Rect rectTmp = new Rect();
    public boolean A0;
    public boolean B0;
    public ze B1;
    public File C0;
    public long C1;
    public final String D0;
    public Bitmap D1;
    public boolean E0;
    public long E1;
    public int F1;
    public int G1;
    public boolean H0;
    public boolean J0;
    public long K0;
    public int[] S0;
    public boolean W0;
    public Runnable X;
    public Bitmap Y;
    public volatile boolean Y0;
    public int Z;
    public volatile boolean Z0;
    public long a;
    public boolean a1;
    public int b;
    public il4 b1;
    public float c1;
    public float d1;
    public final int e1;
    public final int f1;
    public final boolean g1;
    public final so0 h1;
    public boolean ignoreNoParent;
    public boolean isWebmSticker;
    public View l1;
    public volatile long nativePtr;
    public boolean o1;
    public boolean q1;
    public vo0 r1;
    public int repeatCount;
    public Bitmap s0;
    public fm5 s1;
    public boolean skipFrameUpdate;
    public int t0;
    public int u0;
    public boolean u1;
    public Bitmap v0;
    public bf v1;
    public int w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;
    public int c = 50;
    public final int[] o = new int[6];
    public volatile long F0 = -1;
    public volatile long G0 = -1;
    public final Object I0 = new Object();
    public final RectF L0 = new RectF();
    public final BitmapShader[] M0 = new BitmapShader[3];
    public final BitmapShader[] N0 = new BitmapShader[3];
    public final BitmapShader[] O0 = new BitmapShader[3];
    public final BitmapShader[] P0 = new BitmapShader[3];
    public final ArrayList Q0 = new ArrayList();
    public final int[] R0 = new int[4];
    public final Path[] T0 = new Path[3];
    public float U0 = 1.0f;
    public float V0 = 1.0f;
    public final RectF X0 = new RectF();
    public float i1 = 1.0f;
    public final RectF[] j1 = new RectF[2];
    public final Paint[] k1 = new Paint[2];
    public final ArrayList m1 = new ArrayList();
    public final ArrayList n1 = new ArrayList();
    public boolean p1 = true;
    public final af t1 = new af(this, 0);
    public final af w1 = new af(this, 1);
    public final af x1 = new af(this, 2);
    public int y1 = 0;
    public final af z1 = new af(this, 3);
    public final ze A1 = new ze(this, 1);
    public final Set H1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    public interface OnNextFrameRenderedListener {
        void onNextFrameRendered(AnimatedFileDrawable animatedFileDrawable);
    }

    public AnimatedFileDrawable(File file, int i, int i2, so0 so0Var, String str) {
        setIsWebmSticker(true);
        this.e1 = i2;
        this.f1 = i;
        this.g1 = so0Var != null && i > 0 && i2 > 0;
        this.h1 = so0Var;
        this.D0 = str;
        if (file == null) {
            return;
        }
        d(file, so0Var);
    }

    public static void a(AnimatedFileDrawable animatedFileDrawable) {
        if (animatedFileDrawable.z1 == null && animatedFileDrawable.x0 && animatedFileDrawable.nativePtr != 0 && !animatedFileDrawable.u1) {
            destroyDecoder(animatedFileDrawable.nativePtr);
            animatedFileDrawable.nativePtr = 0L;
        }
        if (animatedFileDrawable.canLoadFrames()) {
            return;
        }
        Bitmap bitmap = animatedFileDrawable.Y;
        if (bitmap != null) {
            bitmap.recycle();
            animatedFileDrawable.Y = null;
        }
        Bitmap bitmap2 = animatedFileDrawable.v0;
        if (bitmap2 != null) {
            bitmap2.recycle();
            animatedFileDrawable.v0 = null;
        }
        il4 il4Var = animatedFileDrawable.b1;
        if (il4Var != null) {
            il4Var.a.getLooper().quit();
            animatedFileDrawable.b1 = null;
        }
        for (int i = 0; i < animatedFileDrawable.Q0.size(); i++) {
            ((Bitmap) animatedFileDrawable.Q0.get(i)).recycle();
        }
        animatedFileDrawable.Q0.clear();
        animatedFileDrawable.invalidateInternal();
    }

    public static native long createDecoder(String str, int[] iArr);

    public static native void destroyDecoder(long j);

    public static native int getFrameAtTime(long j, long j2, Bitmap bitmap, int[] iArr, int i);

    public static native int getVideoFrame(long j, Bitmap bitmap, int[] iArr, int i, boolean z, float f, float f2, boolean z2);

    public static native void prepareToSeek(long j);

    public static native void seekToMs(long j, long j2, int[] iArr, boolean z);

    public static native void stopDecoder(long j);

    public void addOnNextFrameRenderedListener(OnNextFrameRenderedListener onNextFrameRenderedListener) {
        this.H1.add(onNextFrameRenderedListener);
    }

    public void addParent(ImageReceiver imageReceiver) {
        if (imageReceiver != null && !this.n1.contains(imageReceiver)) {
            this.n1.add(imageReceiver);
            if (this.Y0) {
                e();
            }
        }
        checkCacheCancel();
    }

    public void addSecondParentView(View view) {
        if (view != null) {
            ArrayList arrayList = this.m1;
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
        }
    }

    public final void b(RectF rectF, Paint paint, Canvas canvas, float f, float f2) {
        canvas.translate(rectF.left, rectF.top);
        int i = this.o[2];
        if (i == 90) {
            canvas.rotate(90.0f);
            canvas.translate(0.0f, -rectF.width());
        } else if (i == 180) {
            canvas.rotate(180.0f);
            canvas.translate(-rectF.width(), -rectF.height());
        } else if (i == 270) {
            canvas.rotate(270.0f);
            canvas.translate(-rectF.height(), 0.0f);
        }
        canvas.scale(f, f2);
        canvas.drawBitmap(this.Y, 0.0f, 0.0f, paint);
    }

    public final void c() {
        Set set = this.H1;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((OnNextFrameRenderedListener) it.next()).onNextFrameRendered(this);
            it.remove();
        }
    }

    public boolean canLoadFrames() {
        return this.g1 ? this.r1 != null : (this.nativePtr == 0 && this.y0) ? false : true;
    }

    public void checkCacheCancel() {
        ze zeVar;
        if (this.r1 == null) {
            return;
        }
        boolean zIsEmpty = this.n1.isEmpty();
        if (zIsEmpty && this.B1 == null) {
            ze zeVar2 = new ze(this, 2);
            this.B1 = zeVar2;
            he.e(zeVar2, 600L);
        } else {
            if (zIsEmpty || (zeVar = this.B1) == null) {
                return;
            }
            he.a.removeCallbacks(zeVar);
            this.B1 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        r3.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void checkCacheExist() throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r7.g1
            if (r0 == 0) goto L5f
            vo0 r7 = r7.r1
            if (r7 == 0) goto L5f
            boolean r0 = r7.r
            if (r0 == 0) goto Ld
            goto L5f
        Ld:
            r0 = 1
            r1 = 0
            java.lang.Object r2 = r7.h     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L58
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L41
            java.io.File r4 = r7.m     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = "r"
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L41
            boolean r1 = r3.readBoolean()     // Catch: java.lang.Throwable -> L35
            r7.s = r1     // Catch: java.lang.Throwable -> L35
            int r1 = r3.readInt()     // Catch: java.lang.Throwable -> L35
            long r4 = (long) r1     // Catch: java.lang.Throwable -> L35
            r3.seek(r4)     // Catch: java.lang.Throwable -> L35
            int r1 = r3.readInt()     // Catch: java.lang.Throwable -> L35
            if (r1 > 0) goto L37
            r1 = 0
            r7.s = r1     // Catch: java.lang.Throwable -> L35
            r7.q = r0     // Catch: java.lang.Throwable -> L35
            goto L37
        L35:
            r1 = move-exception
            goto L45
        L37:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L35
            r3.close()     // Catch: java.io.IOException -> L3c
            goto L5d
        L3c:
            r1 = move-exception
            r1.printStackTrace()
            goto L5d
        L41:
            r3 = move-exception
            r6 = r3
            r3 = r1
            r1 = r6
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L35
            throw r1     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4a
        L47:
            r7 = move-exception
            r1 = r3
            goto L4d
        L4a:
            r1 = r3
            goto L58
        L4c:
            r7 = move-exception
        L4d:
            if (r1 == 0) goto L57
            r1.close()     // Catch: java.io.IOException -> L53
            goto L57
        L53:
            r0 = move-exception
            r0.printStackTrace()
        L57:
            throw r7
        L58:
            if (r1 == 0) goto L5d
            r1.close()     // Catch: java.io.IOException -> L3c
        L5d:
            r7.r = r0
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.media.ffmpeg.AnimatedFileDrawable.checkCacheExist():void");
    }

    public final void d(File file, so0 so0Var) {
        this.C0 = file;
        getPaint().setFlags(3);
        if (!this.g1) {
            this.nativePtr = createDecoder(file.getAbsolutePath(), this.o);
            this.a1 = this.nativePtr == 0 && (!this.isWebmSticker || this.y1 > 15);
            if (this.nativePtr != 0) {
                int[] iArr = this.o;
                if (iArr[0] > 3840 || iArr[1] > 3840) {
                    destroyDecoder(this.nativePtr);
                    this.nativePtr = 0L;
                }
            }
            g();
            this.y0 = true;
        }
        if (this.g1) {
            this.nativePtr = createDecoder(file.getAbsolutePath(), this.o);
            this.a1 = this.nativePtr == 0 && (!this.isWebmSticker || this.y1 > 15);
            if (this.nativePtr != 0) {
                int[] iArr2 = this.o;
                if (iArr2[0] > 3840 || iArr2[1] > 3840) {
                    destroyDecoder(this.nativePtr);
                    this.nativePtr = 0L;
                    return;
                }
            }
            this.r1 = new vo0(file, this, so0Var, this.f1, this.e1, !this.q1);
        }
    }

    public boolean decoderFailed() {
        return this.y0 && this.a1;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        drawInternal(canvas, false, System.currentTimeMillis(), 0);
    }

    public void drawFrame(Canvas canvas, int i) {
        if (this.nativePtr == 0) {
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            getNextFrame(true);
        }
        Bitmap backgroundBitmap = getBackgroundBitmap();
        if (backgroundBitmap == null) {
            backgroundBitmap = getNextFrame(true);
        }
        Rect rect = rectTmp;
        rect.set(0, 0, backgroundBitmap.getWidth(), backgroundBitmap.getHeight());
        canvas.drawBitmap(getBackgroundBitmap(), rect, getBounds(), getPaint());
    }

    public void drawInBackground(Canvas canvas, float f, float f2, float f3, float f4, int i, ColorFilter colorFilter, int i2) {
        RectF[] rectFArr = this.j1;
        RectF rectF = rectFArr[i2];
        Paint[] paintArr = this.k1;
        if (rectF == null) {
            rectFArr[i2] = new RectF();
            paintArr[i2] = new Paint();
            paintArr[i2].setFilterBitmap(true);
        }
        paintArr[i2].setAlpha(i);
        paintArr[i2].setColorFilter(colorFilter);
        rectFArr[i2].set(f, f2, f3 + f, f4 + f2);
        drawInternal(canvas, true, 0L, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void drawInternal(android.graphics.Canvas r11, boolean r12, long r13, int r15) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.media.ffmpeg.AnimatedFileDrawable.drawInternal(android.graphics.Canvas, boolean, long, int):void");
    }

    public final void e() {
        f(true, false);
    }

    public final void f(boolean z, boolean z2) throws InterruptedException {
        Runnable runnable;
        Runnable runnable2;
        if ((this.X == null || z2) && this.s0 == null && canLoadFrames() && !this.x0) {
            if (!this.Y0) {
                boolean z3 = this.z0;
                if (!z3) {
                    return;
                }
                if (z3 && this.A0) {
                    return;
                }
            }
            if ((this.n1.size() != 0 || this.ignoreNoParent) && !this.u1) {
                long jMin = 0;
                if (z && this.K0 != 0) {
                    long j = this.c;
                    jMin = Math.min(j, Math.max(0L, j - (System.currentTimeMillis() - this.K0)));
                }
                if (!this.o1) {
                    if (this.b1 == null) {
                        this.b1 = new il4("decodeQueue" + this);
                    }
                    if (z2 && (runnable = this.X) != null) {
                        this.b1.a(runnable);
                    }
                    il4 il4Var = this.b1;
                    af afVar = this.z1;
                    this.X = afVar;
                    il4Var.c(afVar, jMin);
                    return;
                }
                if (this.q1) {
                    af afVar2 = this.z1;
                    this.X = afVar2;
                    ml4.a(afVar2, false);
                    return;
                }
                if (z2 && (runnable2 = this.X) != null) {
                    J1.remove(runnable2);
                }
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = J1;
                af afVar3 = this.z1;
                this.X = afVar3;
                scheduledThreadPoolExecutor.schedule(afVar3, jMin, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            this.m1.clear();
            recycle();
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        int i;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        if (this.isWebmSticker || (i = this.e1) <= 0 || (i2 = this.f1) <= 0 || (i3 = (iArr = this.o)[0]) <= 0 || (i4 = iArr[1]) <= 0) {
            this.i1 = 1.0f;
            return;
        }
        float fMax = Math.max(i2 / i3, i / i4);
        this.i1 = fMax;
        if (fMax <= 0.0f || fMax > 0.7d) {
            this.i1 = 1.0f;
        }
    }

    public Bitmap getAnimatedBitmap() {
        Bitmap bitmap = this.Y;
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap bitmap2 = this.s0;
        if (bitmap2 != null) {
            return bitmap2;
        }
        return null;
    }

    public Bitmap getBackgroundBitmap() {
        return this.v0;
    }

    public float getCurrentProgress() {
        float f;
        int i;
        if (this.o[4] == 0) {
            return 0.0f;
        }
        if (this.G0 >= 0) {
            f = this.G0;
            i = this.o[4];
        } else {
            int[] iArr = this.o;
            f = iArr[3];
            i = iArr[4];
        }
        return f / i;
    }

    public int getCurrentProgressMs() {
        if (this.G0 >= 0) {
            return (int) this.G0;
        }
        int i = this.t0;
        return i != 0 ? i : this.Z;
    }

    public int getDurationMs() {
        return this.o[4];
    }

    public File getFilePath() {
        return this.C0;
    }

    public Bitmap getFirstFrame(Bitmap bitmap) {
        int i = this.f1;
        Bitmap bitmapCreateBitmap = bitmap == null ? Bitmap.createBitmap(i, this.e1, Bitmap.Config.ARGB_8888) : bitmap;
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        String absolutePath = this.C0.getAbsolutePath();
        int[] iArr = this.o;
        long jCreateDecoder = createDecoder(absolutePath, iArr);
        if (jCreateDecoder == 0) {
            return bitmapCreateBitmap;
        }
        if (this.D1 == null) {
            this.D1 = Bitmap.createBitmap(Math.max(1, iArr[0]), Math.max(1, iArr[1]), Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap2 = this.D1;
        getVideoFrame(jCreateDecoder, bitmap2, this.o, bitmap2.getRowBytes(), false, this.c1, this.d1, true);
        destroyDecoder(jCreateDecoder);
        bitmapCreateBitmap.eraseColor(0);
        canvas.save();
        float width = i / this.D1.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.D1, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        return bitmapCreateBitmap;
    }

    public int getFps() {
        return this.o[5];
    }

    public Bitmap getFrameAtTime(long j) {
        return getFrameAtTime(j, false);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = 0;
        if (this.y0) {
            int[] iArr = this.o;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[0] : iArr[1];
        }
        return i == 0 ? he.a(100.0f) : (int) (i * this.i1);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = 0;
        if (this.y0) {
            int[] iArr = this.o;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[1] : iArr[0];
        }
        return i == 0 ? he.a(100.0f) : (int) (i * this.i1);
    }

    public long getLastFrameTimestamp() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        int i = 0;
        if (this.y0) {
            int[] iArr = this.o;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[0] : iArr[1];
        }
        return i == 0 ? he.a(100.0f) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        int i = 0;
        if (this.y0) {
            int[] iArr = this.o;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[1] : iArr[0];
        }
        return i == 0 ? he.a(100.0f) : i;
    }

    public Bitmap getNextFrame(boolean z) {
        if (this.nativePtr == 0) {
            return this.v0;
        }
        if (this.v0 == null) {
            if (this.Q0.isEmpty()) {
                float f = this.o[0];
                float f2 = this.i1;
                this.v0 = Bitmap.createBitmap((int) (f * f2), (int) (r0[1] * f2), Bitmap.Config.ARGB_8888);
            } else {
                this.v0 = (Bitmap) this.Q0.remove(0);
            }
        }
        long j = this.nativePtr;
        Bitmap bitmap = this.v0;
        getVideoFrame(j, bitmap, this.o, bitmap.getRowBytes(), false, this.c1, this.d1, z);
        return this.v0;
    }

    public Bitmap getNextRenderingBitmap() {
        return this.s0;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int getOrientation() {
        return this.o[2];
    }

    public int getProgressMs() {
        return this.o[3];
    }

    public Bitmap getRenderingBitmap() {
        return this.Y;
    }

    public int getRenderingHeight() {
        return this.e1;
    }

    public int getRenderingWidth() {
        return this.f1;
    }

    public long getStartTime() {
        return (long) (this.c1 * 1000.0f);
    }

    public boolean hasBitmap() {
        return canLoadFrames() && !(this.Y == null && this.s0 == null);
    }

    public void invalidateInternal() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.n1;
            if (i >= arrayList.size()) {
                return;
            }
            ((ImageReceiver) arrayList.get(i)).invalidate();
            i++;
        }
    }

    public boolean isRecycled() {
        return this.Z0 || this.y1 >= 15;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.Y0;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.W0 = true;
    }

    @Override // defpackage.nm9
    public void onFailed(Throwable th) {
        WebmConfig.getLogger().j("Fail load webm by url: " + this.D0, th);
    }

    @Override // defpackage.nm9
    public void onFinished(String str, File file, String str2) {
        WebmConfig.getLogger().i("Success load webm by url: " + str);
        d(file, this.h1);
        he.d(new ze(this, 0));
    }

    @Override // defpackage.to0
    public void prepareForGenerateCache() {
        this.E1 = createDecoder(this.C0.getAbsolutePath(), this.o);
    }

    public void recycle() throws InterruptedException {
        if (!this.m1.isEmpty()) {
            this.E0 = true;
            return;
        }
        this.Y0 = false;
        this.Z0 = true;
        if (this.v1 != null) {
            vo0.c();
            RLottieDrawable.lottieCacheGenerateQueue.a(this.v1);
            this.v1 = null;
        }
        if (this.X == null) {
            if (this.nativePtr != 0) {
                destroyDecoder(this.nativePtr);
                this.nativePtr = 0L;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.Y);
            arrayList.add(this.s0);
            arrayList.add(this.v0);
            arrayList.addAll(this.Q0);
            this.Q0.clear();
            this.Y = null;
            this.s0 = null;
            this.v0 = null;
            il4 il4Var = this.b1;
            if (il4Var != null) {
                il4Var.a.getLooper().quit();
                this.b1 = null;
            }
            getPaint().setShader(null);
            he.c(arrayList);
        } else {
            this.x0 = true;
        }
        invalidateInternal();
    }

    @Override // defpackage.to0
    public void releaseForGenerateCache() {
        long j = this.E1;
        if (j != 0) {
            destroyDecoder(j);
        }
    }

    public void removeOnNextFrameRenderedListener(OnNextFrameRenderedListener onNextFrameRenderedListener) {
        this.H1.remove(onNextFrameRenderedListener);
    }

    public void removeParent(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.n1;
        arrayList.remove(imageReceiver);
        if (arrayList.isEmpty()) {
            this.repeatCount = 0;
        }
        checkCacheCancel();
    }

    public void removeSecondParentView(View view) throws InterruptedException {
        ArrayList arrayList = this.m1;
        arrayList.remove(view);
        if (arrayList.isEmpty()) {
            if (this.E0) {
                recycle();
                return;
            }
            int[] iArr = this.S0;
            if (iArr != null) {
                setRoundRadius(iArr);
            }
        }
    }

    public void replaceAnimatedBitmap(Bitmap bitmap) {
        Bitmap bitmap2 = this.Y;
        ArrayList arrayList = this.Q0;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        Bitmap bitmap3 = this.s0;
        if (bitmap3 != null) {
            arrayList.add(bitmap3);
        }
        this.Y = bitmap;
        this.s0 = null;
    }

    public void resetStream(boolean z) {
        if (this.nativePtr != 0) {
            if (z) {
                stopDecoder(this.nativePtr);
            } else {
                prepareToSeek(this.nativePtr);
            }
        }
    }

    public void seekTo(long j, boolean z) {
        seekTo(j, z, false);
    }

    public void seekToSync(long j) {
        if (this.nativePtr == 0) {
            return;
        }
        seekToMs(this.nativePtr, j, this.o, true);
    }

    public void setActualDrawRect(float f, float f2, float f3, float f4) {
        float f5 = f4 + f2;
        float f6 = f3 + f;
        RectF rectF = this.L0;
        if (rectF.left == f && rectF.top == f2 && rectF.right == f6 && rectF.bottom == f5) {
            return;
        }
        rectF.set(f, f2, f6, f5);
        this.p1 = true;
    }

    public void setAllowDecodeSingleFrame(boolean z) {
        this.z0 = z;
        if (z) {
            e();
        }
    }

    public void setInvalidateParentViewWithSecond(boolean z) {
        this.J0 = z;
    }

    public void setIsWebmSticker(boolean z) {
        this.isWebmSticker = z;
        if (z) {
            this.o1 = true;
        }
    }

    public void setLimitFps(boolean z) {
        this.q1 = z;
    }

    public void setParentView(View view) {
        if (this.l1 != null) {
            return;
        }
        this.l1 = view;
    }

    public void setRoundRadius(int[] iArr) {
        boolean zIsEmpty = this.m1.isEmpty();
        int[] iArr2 = this.R0;
        if (!zIsEmpty) {
            if (this.S0 == null) {
                this.S0 = new int[4];
            }
            int[] iArr3 = this.S0;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr3.length);
        }
        for (int i = 0; i < 4; i++) {
            if (!this.p1 && iArr[i] != iArr2[i]) {
                this.p1 = true;
            }
            iArr2[i] = iArr[i];
        }
    }

    public void setStartEndTime(long j, long j2) {
        this.c1 = j / 1000.0f;
        this.d1 = j2 / 1000.0f;
        if (j < 0 || getCurrentProgressMs() >= j) {
            return;
        }
        seekTo(j, true);
    }

    public void setUseSharedQueue(boolean z) {
        if (this.isWebmSticker) {
            return;
        }
        this.o1 = z;
    }

    public void skipNextFrame(boolean z) {
        if (this.nativePtr == 0) {
            return;
        }
        getVideoFrame(this.nativePtr, null, this.o, 0, false, this.c1, this.d1, z);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.Y0) {
            return;
        }
        if (!this.n1.isEmpty() || this.ignoreNoParent) {
            this.Y0 = true;
            e();
            he.d(this.A1);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.Y0 = false;
    }

    public void updateCurrentFrame(long j, boolean z) {
        if (!this.Y0) {
            if (this.Y0 || !this.z0 || Math.abs(j - this.a) < this.c || this.s0 == null) {
                return;
            }
            this.Q0.add(this.Y);
            this.Y = this.s0;
            this.Z = this.t0;
            for (int i = 0; i < this.P0.length; i++) {
                BitmapShader[] bitmapShaderArr = this.M0;
                BitmapShader[] bitmapShaderArr2 = this.N0;
                bitmapShaderArr[i] = bitmapShaderArr2[i];
                BitmapShader[] bitmapShaderArr3 = this.O0;
                bitmapShaderArr2[i] = bitmapShaderArr3[i];
                bitmapShaderArr3[i] = null;
            }
            this.t0 = this.u0;
            this.s0 = null;
            this.u0 = 0;
            this.a = j;
            c();
            e();
            return;
        }
        Bitmap bitmap = this.Y;
        if (bitmap == null && this.s0 == null) {
            e();
            return;
        }
        if (this.s0 == null || (bitmap != null && (Math.abs(j - this.a) < this.c || this.skipFrameUpdate || this.G0 >= 0))) {
            invalidateInternal();
            return;
        }
        this.Q0.add(this.Y);
        this.Y = this.s0;
        this.Z = this.t0;
        for (int i2 = 0; i2 < this.P0.length; i2++) {
            BitmapShader[] bitmapShaderArr4 = this.M0;
            BitmapShader[] bitmapShaderArr5 = this.N0;
            bitmapShaderArr4[i2] = bitmapShaderArr5[i2];
            BitmapShader[] bitmapShaderArr6 = this.O0;
            bitmapShaderArr5[i2] = bitmapShaderArr6[i2];
            bitmapShaderArr6[i2] = null;
        }
        this.t0 = this.u0;
        this.s0 = null;
        this.u0 = 0;
        this.a = j;
        c();
        e();
    }

    public Bitmap getFrameAtTime(long j, boolean z) {
        if (!this.y0 || this.nativePtr == 0) {
            return null;
        }
        if (!z) {
            seekToMs(this.nativePtr, j, this.o, z);
        }
        int[] iArr = this.o;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        if ((z ? getFrameAtTime(this.nativePtr, j, bitmapCreateBitmap, this.o, bitmapCreateBitmap.getRowBytes()) : getVideoFrame(this.nativePtr, bitmapCreateBitmap, this.o, bitmapCreateBitmap.getRowBytes(), true, 0.0f, 0.0f, true)) != 0) {
            return bitmapCreateBitmap;
        }
        return null;
    }

    public void seekTo(long j, boolean z, boolean z2) {
        synchronized (this.I0) {
            try {
                this.F0 = j;
                this.G0 = j;
                if (this.nativePtr != 0) {
                    prepareToSeek(this.nativePtr);
                }
                if (z2 && this.z0) {
                    this.A0 = false;
                    if (this.X == null) {
                        f(false, true);
                    } else {
                        this.B0 = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.to0
    public int getNextFrame(Bitmap bitmap) {
        int i;
        if (this.E1 == 0) {
            return -1;
        }
        Canvas canvas = new Canvas(bitmap);
        Bitmap bitmap2 = this.D1;
        int[] iArr = this.o;
        if (bitmap2 == null) {
            this.D1 = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        }
        long j = this.E1;
        Bitmap bitmap3 = this.D1;
        getVideoFrame(j, bitmap3, this.o, bitmap3.getRowBytes(), false, this.c1, this.d1, true);
        long j2 = this.C1;
        if (j2 != 0 && ((i = iArr[3]) == 0 || j2 > i)) {
            return 0;
        }
        int i2 = this.G1;
        int i3 = iArr[3];
        if (i2 == i3) {
            int i4 = this.F1 + 1;
            this.F1 = i4;
            if (i4 > 5) {
                return 0;
            }
        }
        this.G1 = i3;
        bitmap.eraseColor(0);
        canvas.save();
        float width = this.f1 / this.D1.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.D1, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        this.C1 = iArr[3];
        return 1;
    }
}

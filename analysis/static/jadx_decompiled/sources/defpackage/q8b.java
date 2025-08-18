package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class q8b extends FrameLayout {
    public final m8b A0;
    public final i61 B0;
    public final sy4 C0;
    public n8b a;
    public pu9 b;
    public final fvc c;
    public final l8b o;
    public boolean s0;
    public final ci9 t0;
    public final AtomicReference u0;
    public lw1 v0;
    public final r8b w0;
    public final fag x0;
    public yw1 y0;
    public MotionEvent z0;

    public q8b(Context context) {
        super(context, null, 0, 0);
        this.a = n8b.PERFORMANCE;
        l8b l8bVar = new l8b();
        l8bVar.h = o8b.FILL_CENTER;
        this.o = l8bVar;
        this.s0 = true;
        this.t0 = new ci9(p8b.a);
        this.u0 = new AtomicReference();
        this.w0 = new r8b(l8bVar);
        this.A0 = new m8b(this);
        this.B0 = new i61(4, this);
        this.C0 = new sy4(24, this);
        kq0.e();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, d3c.PreviewView, 0, 0);
        int[] iArr = d3c.PreviewView;
        WeakHashMap weakHashMap = zmf.a;
        umf.d(this, context, iArr, null, typedArrayObtainStyledAttributes, 0, 0);
        try {
            int integer = typedArrayObtainStyledAttributes.getInteger(d3c.PreviewView_scaleType, l8bVar.h.a);
            for (o8b o8bVar : o8b.values()) {
                if (o8bVar.a == integer) {
                    setScaleType(o8bVar);
                    int integer2 = typedArrayObtainStyledAttributes.getInteger(d3c.PreviewView_implementationMode, 0);
                    for (n8b n8bVar : n8b.values()) {
                        if (n8bVar.a == integer2) {
                            setImplementationMode(n8bVar);
                            typedArrayObtainStyledAttributes.recycle();
                            this.x0 = new fag(context, new yt8(20, this));
                            if (getBackground() == null) {
                                setBackgroundColor(lt3.a(getContext(), R.color.black));
                            }
                            fvc fvcVar = new fvc(context, null, 0, 0);
                            fvcVar.setBackgroundColor(-1);
                            fvcVar.setAlpha(0.0f);
                            fvcVar.setElevation(Float.MAX_VALUE);
                            this.c = fvcVar;
                            fvcVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static boolean c(see seeVar, n8b n8bVar) {
        boolean zEquals = seeVar.e.p().j().equals("androidx.camera.camera2.legacy");
        boolean z = (yi4.a.e(SurfaceViewStretchedQuirk.class) == null && yi4.a.e(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (zEquals || z) {
            return true;
        }
        int iOrdinal = n8bVar.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + n8bVar);
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    private eu6 getScreenFlashInternal() {
        return this.c.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i;
    }

    private void setScreenFlashUiInfo(eu6 eu6Var) {
        lw1 lw1Var = this.v0;
        if (lw1Var == null) {
            return;
        }
        cvc cvcVar = cvc.a;
        dvc dvcVar = new dvc(cvcVar, eu6Var);
        dvc dvcVarF = lw1Var.f();
        lw1Var.C.put(cvcVar, dvcVar);
        dvc dvcVarF2 = lw1Var.f();
        if (dvcVarF2 == null || dvcVarF2.equals(dvcVarF)) {
            return;
        }
        dvc dvcVarF3 = lw1Var.f();
        if (dvcVarF3 == null) {
            fu6 fu6Var = lw1Var.d;
            jw1 jw1Var = lw1.D;
            fu6Var.getClass();
            gvc gvcVar = new gvc(jw1Var);
            fu6Var.u = gvcVar;
            fu6Var.d().g(gvcVar);
            return;
        }
        fu6 fu6Var2 = lw1Var.d;
        fu6Var2.getClass();
        gvc gvcVar2 = new gvc(dvcVarF3.b);
        fu6Var2.u = gvcVar2;
        fu6Var2.d().g(gvcVar2);
        dvcVarF3.a.name();
    }

    public final void a(boolean z) {
        kq0.e();
        uof viewPort = getViewPort();
        if (this.v0 == null || viewPort == null || !isAttachedToWindow()) {
            return;
        }
        try {
            this.v0.a(getSurfaceProvider(), viewPort);
        } catch (IllegalStateException e) {
            if (!z) {
                throw e;
            }
            e.toString();
        }
    }

    public final void b() {
        Rect rect;
        Display display;
        yw1 yw1Var;
        kq0.e();
        if (this.b != null) {
            if (this.s0 && (display = getDisplay()) != null && (yw1Var = this.y0) != null) {
                int iL = yw1Var.l(display.getRotation());
                int rotation = display.getRotation();
                l8b l8bVar = this.o;
                if (l8bVar.g) {
                    l8bVar.c = iL;
                    l8bVar.e = rotation;
                }
            }
            this.b.m();
        }
        r8b r8bVar = this.w0;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        r8bVar.getClass();
        kq0.e();
        synchronized (r8bVar) {
            try {
                if (size.getWidth() == 0 || size.getHeight() == 0 || (rect = r8bVar.c) == null) {
                    r8bVar.d = null;
                } else {
                    r8bVar.d = r8bVar.b.a(size, layoutDirection, rect);
                }
            } finally {
            }
        }
        lw1 lw1Var = this.v0;
        if (lw1Var != null) {
            getSensorToViewTransform();
            lw1Var.getClass();
            kq0.e();
        }
    }

    public Bitmap getBitmap() {
        Bitmap bitmapG;
        kq0.e();
        pu9 pu9Var = this.b;
        if (pu9Var == null || (bitmapG = pu9Var.g()) == null) {
            return null;
        }
        FrameLayout frameLayout = (FrameLayout) pu9Var.c;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        l8b l8bVar = (l8b) pu9Var.d;
        if (!l8bVar.f()) {
            return bitmapG;
        }
        Matrix matrixD = l8bVar.d();
        RectF rectFE = l8bVar.e(size, layoutDirection);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmapG.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixD);
        matrix.postScale(rectFE.width() / l8bVar.a.getWidth(), rectFE.height() / l8bVar.a.getHeight());
        matrix.postTranslate(rectFE.left, rectFE.top);
        canvas.drawBitmap(bitmapG, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    public lw1 getController() {
        kq0.e();
        return this.v0;
    }

    public n8b getImplementationMode() {
        kq0.e();
        return this.a;
    }

    public v99 getMeteringPointFactory() {
        kq0.e();
        return this.w0;
    }

    public zna getOutputTransform() {
        Matrix matrixC;
        l8b l8bVar = this.o;
        kq0.e();
        try {
            matrixC = l8bVar.c(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrixC = null;
        }
        Rect rect = l8bVar.b;
        if (matrixC == null || rect == null) {
            return null;
        }
        RectF rectF = e1f.a;
        RectF rectF2 = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(e1f.a, rectF2, Matrix.ScaleToFit.FILL);
        matrixC.preConcat(matrix);
        if (this.b instanceof hre) {
            matrixC.postConcat(getMatrix());
        } else {
            getMatrix().isIdentity();
        }
        new Size(rect.width(), rect.height());
        return new zna();
    }

    public xm7 getPreviewStreamState() {
        return this.t0;
    }

    public o8b getScaleType() {
        kq0.e();
        return this.o.h;
    }

    public eu6 getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        kq0.e();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        l8b l8bVar = this.o;
        if (!l8bVar.f()) {
            return null;
        }
        Matrix matrix = new Matrix(l8bVar.d);
        matrix.postConcat(l8bVar.c(size, layoutDirection));
        return matrix;
    }

    public g8b getSurfaceProvider() {
        kq0.e();
        return this.C0;
    }

    public uof getViewPort() {
        kq0.e();
        if (getDisplay() == null) {
            return null;
        }
        int rotation = getDisplay().getRotation();
        kq0.e();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Rational rational = new Rational(getWidth(), getHeight());
        int viewPortScaleType = getViewPortScaleType();
        int layoutDirection = getLayoutDirection();
        uof uofVar = new uof();
        uofVar.a = viewPortScaleType;
        uofVar.b = rational;
        uofVar.c = rotation;
        uofVar.d = layoutDirection;
        return uofVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.A0, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.B0);
        pu9 pu9Var = this.b;
        if (pu9Var != null) {
            pu9Var.j();
        }
        a(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.B0);
        pu9 pu9Var = this.b;
        if (pu9Var != null) {
            pu9Var.k();
        }
        lw1 lw1Var = this.v0;
        if (lw1Var != null) {
            lw1Var.b();
        }
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.A0);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ad  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q8b.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.v0 != null) {
            MotionEvent motionEvent = this.z0;
            float x = motionEvent != null ? motionEvent.getX() : getWidth() / 2.0f;
            MotionEvent motionEvent2 = this.z0;
            float y = motionEvent2 != null ? motionEvent2.getY() : getHeight() / 2.0f;
            lw1 lw1Var = this.v0;
            if (lw1Var.h() && lw1Var.t) {
                lw1Var.w.i(1);
                r8b r8bVar = this.w0;
                u99 u99VarA = r8bVar.a(x, y, 0.16666667f);
                u99 u99VarA2 = r8bVar.a(x, y, 0.25f);
                bw4 bw4Var = new bw4(u99VarA);
                bw4Var.b(u99VarA2, 2);
                kq0.a(((hw1) lw1Var.m.c.B0.d).h(new bw4(bw4Var)), new qqd(7, lw1Var), ju0.k());
            }
        }
        this.z0 = null;
        return super.performClick();
    }

    public void setController(lw1 lw1Var) {
        kq0.e();
        lw1 lw1Var2 = this.v0;
        if (lw1Var2 != null && lw1Var2 != lw1Var) {
            lw1Var2.b();
            setScreenFlashUiInfo(null);
        }
        this.v0 = lw1Var;
        a(false);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(n8b n8bVar) {
        kq0.e();
        this.a = n8bVar;
    }

    public void setScaleType(o8b o8bVar) {
        kq0.e();
        this.o.h = o8bVar;
        b();
        a(false);
    }

    public void setScreenFlashOverlayColor(int i) {
        this.c.setBackgroundColor(i);
    }

    public void setScreenFlashWindow(Window window) {
        kq0.e();
        this.c.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }
}

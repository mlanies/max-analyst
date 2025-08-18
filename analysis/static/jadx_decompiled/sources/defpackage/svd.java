package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class svd extends GLSurfaceView {
    public final CopyOnWriteArrayList a;
    public final SensorManager b;
    public final Sensor c;
    public final dna o;
    public final Handler s0;
    public final xsc t0;
    public SurfaceTexture u0;
    public Surface v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;

    public svd(Context context) {
        super(context, null);
        this.a = new CopyOnWriteArrayList();
        this.s0 = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.b = sensorManager;
        Sensor defaultSensor = maf.a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        xsc xscVar = new xsc();
        this.t0 = xscVar;
        rvd rvdVar = new rvd(this, xscVar);
        View.OnTouchListener gyeVar = new gye(context, rvdVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.o = new dna(windowManager.getDefaultDisplay(), gyeVar, rvdVar);
        this.w0 = true;
        setEGLContextClientVersion(2);
        setRenderer(rvdVar);
        setOnTouchListener(gyeVar);
    }

    public final void a() {
        boolean z = this.w0 && this.x0;
        Sensor sensor = this.c;
        if (sensor == null || z == this.y0) {
            return;
        }
        dna dnaVar = this.o;
        SensorManager sensorManager = this.b;
        if (z) {
            sensorManager.registerListener(dnaVar, sensor, 0);
        } else {
            sensorManager.unregisterListener(dnaVar);
        }
        this.y0 = z;
    }

    public gx1 getCameraMotionListener() {
        return this.t0;
    }

    public tff getVideoFrameMetadataListener() {
        return this.t0;
    }

    public Surface getVideoSurface() {
        return this.v0;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.s0.post(new u3c(20, this));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.x0 = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.x0 = true;
        a();
    }

    public void setDefaultStereoMode(int i) {
        this.t0.v0 = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.w0 = z;
        a();
    }
}

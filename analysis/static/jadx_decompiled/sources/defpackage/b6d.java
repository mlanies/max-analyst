package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.PowerManager;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class b6d implements SensorEventListener {
    public static final /* synthetic */ int d = 0;
    public final SensorManager a;
    public final Sensor b;
    public final Set c = Collections.synchronizedSet(new LinkedHashSet());

    public b6d(Context context) {
        Collections.synchronizedSet(new LinkedHashSet());
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.a = sensorManager;
        this.b = sensorManager.getDefaultSensor(8);
        sensorManager.getDefaultSensor(5);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        synchronized (this.c) {
            try {
                if (sensorEvent.sensor.getType() == 8) {
                    boolean z = sensorEvent.values[0] < sensorEvent.sensor.getMaximumRange();
                    for (f40 f40Var : this.c) {
                        if (z) {
                            f40Var.getClass();
                            hm9.n("f40", "onDeviceNextToEar");
                            uh9 uh9Var = f40Var.c;
                            if (uh9Var.x) {
                                if (!f40Var.l()) {
                                    ((PowerManager.WakeLock) f40Var.t0.getValue()).acquire();
                                }
                                if (uh9Var.x) {
                                    uh9Var.m();
                                    kj6 kj6Var = ub8.a;
                                }
                            }
                        } else {
                            f40Var.n();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

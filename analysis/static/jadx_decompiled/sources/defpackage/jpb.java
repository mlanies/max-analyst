package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.PowerManager;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class jpb {
    public final khe a;
    public final khe b;
    public final khe c;
    public final khe d;
    public boolean e;
    public PowerManager.WakeLock f;
    public wmc g;
    public final LinkedHashSet h = new LinkedHashSet();

    public jpb(je7 je7Var) {
        this.a = new khe(new z30(20, je7Var));
        final int i = 0;
        this.b = new khe(new k56(this) { // from class: hpb
            public final /* synthetic */ jpb b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((SensorManager) this.b.a.getValue()).getDefaultSensor(8);
                    default:
                        return new jh7(1, this.b);
                }
            }
        });
        this.c = new khe(new z30(21, je7Var));
        final int i2 = 1;
        this.d = new khe(new k56(this) { // from class: hpb
            public final /* synthetic */ jpb b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ((SensorManager) this.b.a.getValue()).getDefaultSensor(8);
                    default:
                        return new jh7(1, this.b);
                }
            }
        });
    }

    public final void a() {
        Sensor sensor = (Sensor) this.b.getValue();
        if (sensor == null) {
            return;
        }
        try {
            this.f = ((PowerManager) this.c.getValue()).newWakeLock(32, "max:proximity_helper");
            ((SensorManager) this.a.getValue()).registerListener((SensorEventListener) this.d.getValue(), sensor, 3);
        } catch (Exception e) {
            hm9.r("ProximityHelperTag", e, e.getMessage(), new Object[0]);
        }
    }

    public final void b() {
        if (((Sensor) this.b.getValue()) == null) {
            return;
        }
        PowerManager.WakeLock wakeLock = this.f;
        try {
            ((SensorManager) this.a.getValue()).unregisterListener((SensorEventListener) this.d.getValue());
            if (wakeLock == null || !wakeLock.isHeld()) {
                return;
            }
            wakeLock.release(1);
        } catch (Exception e) {
            hm9.r("ProximityHelperTag", e, e.getMessage(), new Object[0]);
        }
    }

    public final void c() {
        Object value;
        PowerManager.WakeLock wakeLock = this.f;
        if (wakeLock == null) {
            return;
        }
        try {
            if (wakeLock.isHeld()) {
                wakeLock.release(1);
                wmc wmcVar = this.g;
                if (wmcVar != null) {
                    ir1 ir1Var = (ir1) wmcVar.a;
                    ti9 ti9Var = (ti9) ir1Var.p.getValue();
                    do {
                        value = ti9Var.getValue();
                    } while (!ti9Var.c(value, ((a11) ir1Var.b).b()));
                }
            }
        } catch (Exception e) {
            hm9.r("ProximityHelperTag", e, e.getMessage(), new Object[0]);
        }
    }
}

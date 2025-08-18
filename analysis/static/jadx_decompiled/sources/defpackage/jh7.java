package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class jh7 implements SensorEventListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jh7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(Sensor sensor, int i) {
    }

    private final void b(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        int i2 = this.a;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.a) {
            case 0:
                int type = sensorEvent.sensor.getType();
                td tdVar = (td) this.b;
                if (type == 5) {
                    if (!tdVar.b) {
                        ((q0e) tdVar.c).m(null, Float.valueOf(sensorEvent.values[0]));
                        break;
                    }
                } else if (type == 8) {
                    tdVar.b = sensorEvent.values[0] < sensorEvent.sensor.getMaximumRange();
                    break;
                }
                break;
            default:
                jpb jpbVar = (jpb) this.b;
                if (jpbVar.f != null) {
                    boolean z = ((double) sensorEvent.values[0]) < Math.min((double) sensorEvent.sensor.getMaximumRange(), 3.0d);
                    if (z != jpbVar.e) {
                        jpbVar.e = z;
                        if (!z) {
                            Iterator it = jpbVar.h.iterator();
                            while (it.hasNext()) {
                                ((ipb) it.next()).b();
                            }
                            break;
                        } else {
                            Iterator it2 = jpbVar.h.iterator();
                            while (it2.hasNext()) {
                                ((ipb) it2.next()).a();
                            }
                            break;
                        }
                    }
                }
                break;
        }
    }
}

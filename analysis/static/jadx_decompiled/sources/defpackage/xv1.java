package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class xv1 {
    public final gaa b;
    public final String c;
    public final HashMap a = new HashMap();
    public c8d d = null;

    public xv1(CameraCharacteristics cameraCharacteristics, String str) {
        this.b = new gaa(cameraCharacteristics);
        this.c = str;
    }

    public final Object a(CameraCharacteristics.Key key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return ((CameraCharacteristics) this.b.a).get(key);
        }
        synchronized (this) {
            try {
                Object obj = this.a.get(key);
                if (obj != null) {
                    return obj;
                }
                Object obj2 = ((CameraCharacteristics) this.b.a).get(key);
                if (obj2 != null) {
                    this.a.put(key, obj2);
                }
                return obj2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final c8d b() {
        if (this.d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                y7g y7gVar = new y7g(this.c);
                c8d c8dVar = new c8d();
                c8dVar.c = new HashMap();
                c8dVar.o = new HashMap();
                new HashMap();
                c8dVar.a = new fd7(streamConfigurationMap);
                c8dVar.b = y7gVar;
                this.d = c8dVar;
            } catch (AssertionError | NullPointerException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }
        return this.d;
    }
}

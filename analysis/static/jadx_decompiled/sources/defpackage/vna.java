package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* loaded from: classes.dex */
public class vna {
    public final Object a;

    public vna(Object obj) {
        this.a = obj;
    }

    public final void a(Surface surface) {
        ((OutputConfiguration) c()).addSurface(surface);
    }

    public final void b() {
        ((OutputConfiguration) c()).enableSurfaceSharing();
    }

    public Object c() {
        Object obj = this.a;
        c54.k(obj instanceof una);
        return ((una) obj).a;
    }

    public final Surface d() {
        return ((OutputConfiguration) c()).getSurface();
    }

    public void e(long j) {
        ((una) this.a).b = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vna)) {
            return false;
        }
        return Objects.equals(this.a, ((vna) obj).a);
    }

    public void f(int i) {
    }

    public final void g(String str) {
        ((OutputConfiguration) c()).setPhysicalCameraId(str);
    }

    public void h(long j) {
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

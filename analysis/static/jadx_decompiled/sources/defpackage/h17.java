package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import java.util.Objects;

/* loaded from: classes.dex */
public class h17 {
    public final InputConfiguration a;

    public h17(Object obj) {
        this.a = (InputConfiguration) obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h17)) {
            return false;
        }
        return Objects.equals(this.a, ((h17) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}

package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* loaded from: classes.dex */
public final class una {
    public final OutputConfiguration a;
    public long b = 1;

    public una(OutputConfiguration outputConfiguration) {
        this.a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof una)) {
            return false;
        }
        una unaVar = (una) obj;
        return Objects.equals(this.a, unaVar.a) && this.b == unaVar.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 31;
        return Long.hashCode(this.b) ^ ((iHashCode << 5) - iHashCode);
    }
}

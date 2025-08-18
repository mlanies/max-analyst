package defpackage;

import android.view.DisplayCutout;
import java.util.Objects;

/* loaded from: classes.dex */
public final class tl4 {
    public final DisplayCutout a;

    public tl4(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tl4.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((tl4) obj).a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}

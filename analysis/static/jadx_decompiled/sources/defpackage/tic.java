package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class tic {
    public final Resources a;
    public final Resources.Theme b;

    public tic(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tic.class != obj.getClass()) {
            return false;
        }
        tic ticVar = (tic) obj;
        return this.a.equals(ticVar.a) && Objects.equals(this.b, ticVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
